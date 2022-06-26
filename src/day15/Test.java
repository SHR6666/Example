package day15;

public class Test {
    public static void main(String[] args) {
//        Thread t0 = new TestThread();  //继承Thread类的线程
//        t0.start();  //启动线程,开始run方法中的代码
//
//        Thread t1 = new TestThread();
//        t1.start();

//        Thread t3 = new Thread(new TestRunnable());
//        t3.start();

        Runnable run = new TestRunnable();
        Thread t4 = new Thread(run, "t-1");
        t4.start();
        Thread t5 = new Thread(run, "t-2");
        t5.start();

        System.out.println("-------------------1");
        System.out.println("-------------------2");
        System.out.println("-------------------3");
    }
}
