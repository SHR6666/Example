package day15;

/**
 * ͨ��ʵ��Runnable��ʽʵ�ֶ��߳�
 */
public class TestRunnable implements Runnable{
    int count = 0;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Runnalbe���߳����еĴ��룺");
        for (int i = 0; i < 5; i++){
            count++;
            System.out.println("����Runnalbe���̵߳��߼�����" + count);
        }
    }
}
