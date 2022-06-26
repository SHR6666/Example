package day15;

public class Test2 {
    public static void main(String[] args) {
        //�����˻�����
        Account a = new Account();
        Account a1 = new Account();

        //������̶߳���
        User u_wechat = new User(a, 2000);
        User u_zhifubao = new User(a, 2000);

        Thread wechat = new Thread(u_wechat, "΢��");
        Thread zhifubao = new Thread(u_zhifubao, "֧����");

        wechat.start();
        zhifubao.start();
    }
}

class Account{
    public static int money = 3000;

    /**
     * ���ж��˻�Ǯ������
     * ���̵߳�������������������⣬�̹߳���һ����Դʱ��һ���̣߳�һ���߳���ִ�з���û�����ʱ����һ���߳̾Ϳ�ʼִ���������
     * ���˼·����һ���߳�����ִ����һ����������һ���߳���ִ��
     * ͨ��synchronizedͬ���������
     * ����ֱ���ڷ����ϼ���synchronized�ؼ��֡�
     * * @param m
     */
    public synchronized void drawing(int m){
        String name = Thread.currentThread().getName();
        if (money < m){
            System.out.println(name + "�������˻����㣺" + money);
        }else {
            System.out.println(name + "�������˻�ԭ�н�" + money);
            System.out.println(name + "������ȡ���" + m);

            System.out.println(name + "������ȡ�������ԭ��" + money + "-" + "ȡ����" + m);
            money = money - m;
            System.out.println(name + "������ȡ���Ľ�" + money);
        }
    }

    public synchronized void drawing1(int m){
        String name = Thread.currentThread().getName();
        if (money < m){
            System.out.println(name + "�������˻����㣺" + money);
        }else {
            System.out.println(name + "�������˻�ԭ�н�" + money);
            System.out.println(name + "������ȡ���" + m);

            System.out.println(name + "������ȡ�������ԭ��" + money + "-" + "ȡ����" + m);
            money = money - m;
            System.out.println(name + "������ȡ���Ľ�" + money);
        }
    }

    /**
     * ��̬������ͬ�����������еĶ�����ͬһ����
     * @param m
     */
    public static synchronized void drawing2(int m){
        String name = Thread.currentThread().getName();
        if (money < m){
            System.out.println(name + "�������˻����㣺" + money);
        }else {
            System.out.println(name + "�������˻�ԭ�н�" + money);
            System.out.println(name + "������ȡ���" + m);

            System.out.println(name + "������ȡ�������ԭ��" + money + "-" + "ȡ����" + m);
            money = money - m;
            System.out.println(name + "������ȡ���Ľ�" + money);
        }
    }

    /**
     *�Դ�������ͬ����
     * @param m
     */
    public void drawing3(int m){
        synchronized(this) {  //��ʾ��ǰ����Ĵ�������ͬ����
            String name = Thread.currentThread().getName();
            if (money < m) {
                System.out.println(name + "�������˻����㣺" + money);
            } else {
                System.out.println(name + "�������˻�ԭ�н�" + money);
                System.out.println(name + "������ȡ���" + m);

                System.out.println(name + "������ȡ�������ԭ��" + money + "-" + "ȡ����" + m);
                money = money - m;
                System.out.println(name + "������ȡ���Ľ�" + money);
            }
        }
    }
    public void drawing4(int m){
        synchronized(this) {  //��ʾ��ǰ����Ĵ�������ͬ����
            String name = Thread.currentThread().getName();
            if (money < m) {
                System.out.println(name + "�������˻����㣺" + money);
            } else {
                System.out.println(name + "�������˻�ԭ�н�" + money);
                System.out.println(name + "������ȡ���" + m);

                System.out.println(name + "������ȡ�������ԭ��" + money + "-" + "ȡ����" + m);
                money = money - m;
                System.out.println(name + "������ȡ���Ľ�" + money);
            }
        }
    }
    public void drawing5(int m, Account a){
        synchronized(this) {  //��ʾ��ǰ����Ĵ�������ͬ����
            String name = Thread.currentThread().getName();

            //�����΢�Ų����ģ��Ȳ�ִ�У���֧����������֧����������΢���ٲ���
            if (name.equals("΢��")){
                try {
                    a.wait(); //��ǰ���̣߳�����ȴ�״̬
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (money < m) {
                System.out.println(name + "�������˻����㣺" + money);
            } else {
                System.out.println(name + "�������˻�ԭ�н�" + money);
                System.out.println(name + "������ȡ���" + m);

                System.out.println(name + "������ȡ�������ԭ��" + money + "-" + "ȡ����" + m);
                money = money - m;
                System.out.println(name + "������ȡ���Ľ�" + money);
            }
            if (name.equals("֧����")){
                try {
                    a.notify();  //���ѵ�ǰ���ȼ���ߵ��̣߳��������״̬
//                    a.notifyAll(); //���ѵ�ǰ�����̣߳��������״̬
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
//        if (Thread.currentThread().getName().equals("΢��")){
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