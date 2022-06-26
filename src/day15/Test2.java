package day15;

public class Test2 {
    public static void main(String[] args) {
        //定义账户对象
        Account a = new Account();
        Account a1 = new Account();

        //定义多线程对象
        User u_wechat = new User(a, 2000);
        User u_zhifubao = new User(a, 2000);

        Thread wechat = new Thread(u_wechat, "微信");
        Thread zhifubao = new Thread(u_zhifubao, "支付宝");

        wechat.start();
        zhifubao.start();
    }
}

class Account{
    public static int money = 3000;

    /**
     * 提款，判断账户钱够不够
     * 多线程调用这个方法，就有问题，线程共享一个资源时，一个线程，一个线程在执行方法没有完毕时，另一个线程就开始执行这个方法
     * 解决思路，当一个线程整体执行完一个方法，另一个线程再执行
     * 通过synchronized同步锁来完成
     * 可以直接在方法上加上synchronized关键字。
     * * @param m
     */
    public synchronized void drawing(int m){
        String name = Thread.currentThread().getName();
        if (money < m){
            System.out.println(name + "操作，账户金额不足：" + money);
        }else {
            System.out.println(name + "操作，账户原有金额：" + money);
            System.out.println(name + "操作，取款金额：" + m);

            System.out.println(name + "操作，取款操作：原金额：" + money + "-" + "取款金额" + m);
            money = money - m;
            System.out.println(name + "操作，取款后的金额：" + money);
        }
    }

    public synchronized void drawing1(int m){
        String name = Thread.currentThread().getName();
        if (money < m){
            System.out.println(name + "操作，账户金额不足：" + money);
        }else {
            System.out.println(name + "操作，账户原有金额：" + money);
            System.out.println(name + "操作，取款金额：" + m);

            System.out.println(name + "操作，取款操作：原金额：" + money + "-" + "取款金额" + m);
            money = money - m;
            System.out.println(name + "操作，取款后的金额：" + money);
        }
    }

    /**
     * 静态方法加同步锁，对所有的对象都是同一个锁
     * @param m
     */
    public static synchronized void drawing2(int m){
        String name = Thread.currentThread().getName();
        if (money < m){
            System.out.println(name + "操作，账户金额不足：" + money);
        }else {
            System.out.println(name + "操作，账户原有金额：" + money);
            System.out.println(name + "操作，取款金额：" + m);

            System.out.println(name + "操作，取款操作：原金额：" + money + "-" + "取款金额" + m);
            money = money - m;
            System.out.println(name + "操作，取款后的金额：" + money);
        }
    }

    /**
     *对代码块加入同步锁
     * @param m
     */
    public void drawing3(int m){
        synchronized(this) {  //表示当前对象的代码块加了同步锁
            String name = Thread.currentThread().getName();
            if (money < m) {
                System.out.println(name + "操作，账户金额不足：" + money);
            } else {
                System.out.println(name + "操作，账户原有金额：" + money);
                System.out.println(name + "操作，取款金额：" + m);

                System.out.println(name + "操作，取款操作：原金额：" + money + "-" + "取款金额" + m);
                money = money - m;
                System.out.println(name + "操作，取款后的金额：" + money);
            }
        }
    }
    public void drawing4(int m){
        synchronized(this) {  //表示当前对象的代码块加了同步锁
            String name = Thread.currentThread().getName();
            if (money < m) {
                System.out.println(name + "操作，账户金额不足：" + money);
            } else {
                System.out.println(name + "操作，账户原有金额：" + money);
                System.out.println(name + "操作，取款金额：" + m);

                System.out.println(name + "操作，取款操作：原金额：" + money + "-" + "取款金额" + m);
                money = money - m;
                System.out.println(name + "操作，取款后的金额：" + money);
            }
        }
    }
    public void drawing5(int m, Account a){
        synchronized(this) {  //表示当前对象的代码块加了同步锁
            String name = Thread.currentThread().getName();

            //如果是微信操作的，先不执行，等支付宝操作，支付宝操作完微信再操作
            if (name.equals("微信")){
                try {
                    a.wait(); //当前的线程，进入等待状态
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (money < m) {
                System.out.println(name + "操作，账户金额不足：" + money);
            } else {
                System.out.println(name + "操作，账户原有金额：" + money);
                System.out.println(name + "操作，取款金额：" + m);

                System.out.println(name + "操作，取款操作：原金额：" + money + "-" + "取款金额" + m);
                money = money - m;
                System.out.println(name + "操作，取款后的金额：" + money);
            }
            if (name.equals("支付宝")){
                try {
                    a.notify();  //唤醒当前优先级最高的线程，进入就绪状态
//                    a.notifyAll(); //唤醒当前所有线程，进入就绪状态
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}

class User implements Runnable{
    Account account;
    int money;
    public User(Account account, int money){
        this.account = account;
        this.money = money;
    }
    @Override
    public void run() {
//        account.drawing(money);
//        if (Thread.currentThread().getName().equals("微信")){
////            account.drawing(money);
//            account.drawing3(money);
//        }else {
////            account.drawing1(money);
//            account.drawing4(money);
//        }

//        account.drawing2(money);
//        account.drawing3(money);

        account.drawing5(money, account);
    }
}