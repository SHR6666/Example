package day15;

public class Test1 {
    public static void main(String[] args) {
        TestRun run0 = new TestRun();
        TestRun run1 = new TestRun();

        Thread t0 = new Thread(run0);
        Thread t1 = new Thread(run1);

        t0.setPriority(1); //�����̵߳����ȼ�
        t0.setPriority(10);

        t0.start();
        t1.start();

        System.out.println(t0.getName());  //����ڴ����߳�ʱû��ָ�����ƣ�ϵͳ��Ĭ�����ƣ�ͨ��getName��ȡ
        System.out.println(t1.getName());
        System.out.println("-------------------1");
        System.out.println("-------------------2");

        System.out.println(t1.isAlive());  //�жϵ�ǰ�߳��Ƿ���

        t1.stop();    //ǿ���߳��������ڽ���

        try {
            t0.join();  //�൱�ڰ�run�����Ĵ�����뵽���λ��ִ��
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-------------------3");
    }
}

class TestRun implements Runnable{
    int count = 0;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Runnalbe���߳����еĴ��룺");
        for (int i = 0; i < 5; i++){

//            try {
//                Thread.sleep(1000);  //��ǰ�߳�˯��1000���룬�൱��1��
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            //�൱������߳�ÿ��1000msִ��һ��
//            if (i % 2 == 0){
//                Thread.yield();  //�߳��ò�
//            }

            count++;
            System.out.println("����Runnalbe���̵߳��߼�����" + count);
        }
    }
}
