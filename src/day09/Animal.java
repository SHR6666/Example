package day09;

public abstract class Animal {
    public abstract void test();  //ֻҪ������һ�����󷽷�����ͱ�����һ��������
    public abstract void move();
}
class Dog extends Animal {

    @Override
    public void test() {

    }

    @Override
    public void move() {
        System.out.println("��");
    }
}
class fish extends Animal {
    @Override
    public void test() {

    }

    @Override
    public void move() {
        System.out.println("��");
    }

    abstract class Bird extends Animal {
        public abstract void test() ;  //ֻҪ������һ�����󷽷�����ͱ�����һ��������
        @Override
        public void move() {

        }
    }
}