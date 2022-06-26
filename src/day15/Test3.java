package day15;

/**
 * 生产者与消费者
 */
public class Test3 {
    public static void main(String[] args) {
        Clerk c = new Clerk();
        //生产者
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (c){
                    while (true){   //无限循环代表无限生产的次数
                        if (c.produceNum == 0){  //判断产品的产品数，并开始生产
                            System.out.println("产品为0，开始生产");
                            while(c.produceNum < 4){
                                c.produceNum++;  //增加产品
                                System.out.println("储存" + c.produceNum);
                            }
                            System.out.println("产品为"+ c.produceNum +"，结束生产");

                            c.notify(); //唤醒消费者线程
                        }else {
                            try {
                                c.wait(); //生产者线程等待
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }, "生产者").start();

        //消费者
        new Thread(() -> {
            synchronized (c){
                while (true){   //无限循环代表无限生产的次数
                    if (c.produceNum == 4){  //判断产品的产品数为4，开始消费
                        System.out.println("产品为4，开始消费");
                        while(c.produceNum > 0){
                            c.produceNum--; //消费产品
                            System.out.println("储存" + c.produceNum);
                        }
                        System.out.println("产品为"+ c.produceNum +"，结束消费");

                        c.notify(); //唤醒生产者线程
                    }else {
                        try {
                            c.wait(); //消费者线程等待
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "消费者").start();
    }
}

class Clerk{
    public static int produceNum = 0;
}
