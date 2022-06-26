package day15;

/**
 * 通过实现Runnable方式实现多线程
 */
public class TestRunnable implements Runnable{
    int count = 0;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Runnalbe多线程运行的代码：");
        for (int i = 0; i < 5; i++){
            count++;
            System.out.println("这是Runnalbe多线程的逻辑代码" + count);
        }
    }
}
