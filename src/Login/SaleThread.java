package Login;

/**
 * 利用线程模拟 3 个窗口同时进行同一航班的航空售票，假定共有 150 张机票。
 * 要求：实现 Runnable 接口的类命名为 SaleThread
 */
class SaleThread implements Runnable {
    int tickets=150;
    public synchronized int saleTickets(){
        if(tickets>0){
            System.out.println(Thread.currentThread().getName()+"售机票第"+tickets--+"张");
        }
        return tickets;
    }
    public void run(){
        while(tickets>0){
            saleTickets();
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
            }
        }
    }

    public void start() {
        new Thread(this,"窗口1").start();
        new Thread(this,"窗口2").start();
        new Thread(this,"窗口3").start();
    }
}
