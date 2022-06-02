package Login;

/**
 * �����߳�ģ�� 3 ������ͬʱ����ͬһ����ĺ�����Ʊ���ٶ����� 150 �Ż�Ʊ��
 * Ҫ��ʵ�� Runnable �ӿڵ�������Ϊ SaleThread
 */
class SaleThread implements Runnable {
    int tickets=150;
    public synchronized int saleTickets(){
        if(tickets>0){
            System.out.println(Thread.currentThread().getName()+"�ۻ�Ʊ��"+tickets--+"��");
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
        new Thread(this,"����1").start();
        new Thread(this,"����2").start();
        new Thread(this,"����3").start();
    }
}
