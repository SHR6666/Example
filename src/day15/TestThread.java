package day15;

public class TestThread extends Thread{
    @Override
    public void run() {
        System.out.println("���߳����еĴ��룺");
        for (int i = 0; i < 5; i++){
            System.out.println("���Ƕ��̵߳��߼�����" + i);
        }
    }
}
