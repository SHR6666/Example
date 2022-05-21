package day09;

public abstract class Animal {
    public abstract void test();  //只要类中有一个抽象方法，类就必须是一个抽象类
    public abstract void move();
}
class Dog extends Animal {

    @Override
    public void test() {

    }

    @Override
    public void move() {
        System.out.println("跑");
    }
}
class fish extends Animal {
    @Override
    public void test() {

    }

    @Override
    public void move() {
        System.out.println("游");
    }

    abstract class Bird extends Animal {
        public abstract void test() ;  //只要类中有一个抽象方法，类就必须是一个抽象类
        @Override
        public void move() {

        }
    }
}