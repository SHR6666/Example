package day15;

public class Test1 {
    public static void main(String[] args) {
        TestRun run0 = new TestRun();
        TestRun run1 = new TestRun();

        Thread t0 = new Thread(run0);
        Thread t1 = new Thread(run1);

        t0.setPriority(1); //设置线程的优先级
        t0.setPriority(10);

        t0.start();
        t1.start();

        System.out.println(t0.getName());  //如果在创建线程时没有指定名称，系统会默认名称，通过getName获取
        System.out.println(t1.getName());
        System.out.println("-------------------1");
        System.out.println("-------------------2");

        System.out.println(t1.isAlive());  //判断当前线程是否存活

        t1.stop();    //强制线程生命周期结束

        try {
            t0.join();  //相当于把run方法的代码插入到这个位置执行
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
        System.out.println(Thread.currentThread().getName() + "Runnalbe多线程运行的代码：");
        for (int i = 0; i < 5; i++){

//            try {
//                Thread.sleep(1000);  //当前线程睡眠1000毫秒，相当于1秒
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            //相当于这个线程每隔1000ms执行一次
//            if (i % 2 == 0){
//                Thread.yield();  //线程让步
//            }

            count++;
            System.out.println("这是Runnalbe多线程的逻辑代码" + count);
        }
    }
}
