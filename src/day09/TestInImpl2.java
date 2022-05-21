package day09;

import day07.Person;

/**
 * 如果一个类，继承父类，又实现接口
 * 那么先继承，再实现
 */
public class TestInImpl2 extends Person implements TestIn, TestIn1 {
    @Override
    public void test() {

    }

    @Override
    public void test1() {

    }
}
