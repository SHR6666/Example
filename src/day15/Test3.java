package day15;

/**
 * ��������������
 */
public class Test3 {
    public static void main(String[] args) {
        Clerk c = new Clerk();
        //������
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (c){
                    while (true){   //����ѭ���������������Ĵ���
                        if (c.produceNum == 0){  //�жϲ�Ʒ�Ĳ�Ʒ��������ʼ����
                            System.out.println("��ƷΪ0����ʼ����");
                            while(c.produceNum < 4){
                                c.produceNum++;  //���Ӳ�Ʒ
                                System.out.println("����" + c.produceNum);
                            }
                            System.out.println("��ƷΪ"+ c.produceNum +"����������");

                            c.notify(); //�����������߳�
                        }else {
                            try {
                                c.wait(); //�������̵߳ȴ�
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }, "������").start();

        //������
        new Thread(() -> {
            synchronized (c){
                while (true){   //����ѭ���������������Ĵ���
                    if (c.produceNum == 4){  //�жϲ�Ʒ�Ĳ�Ʒ��Ϊ4����ʼ����
                        System.out.println("��ƷΪ4����ʼ����");
                        while(c.produceNum > 0){
                            c.produceNum--; //���Ѳ�Ʒ
                            System.out.println("����" + c.produceNum);
                        }
                        System.out.println("��ƷΪ"+ c.produceNum +"����������");

                        c.notify(); //�����������߳�
                    }else {
                        try {
                            c.wait(); //�������̵߳ȴ�
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "������").start();
    }
}

class Clerk{
    public static int produceNum = 0;
}
