package day11;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        Dd d = new Dd();
        List<String> l1 = new ArrayList<String>();
        d.test(l1);

        List<Integer> l2 = new ArrayList<Integer>();
        d.test(l2);

        List<C1> lc = new ArrayList<C1>();
        d.test1(lc);

        List<D1> ld = new ArrayList<D1>();
        d.test1(ld);

        d.test2(lc);
        List<A1> la = new ArrayList<A1>();
        d.test2(la);

        List<IAImpl> lia = new ArrayList<IAImpl>();
        d.test3(lia);
    }
}
    class Dd {
        public void test(List<?> list) {   //test方法需要一个list集合的参数，不确定list集合到底存的是什么数据类型
        }

        public void test1(List<? extends C1> list){  //list参数的元素数据类型是C1及其子类

        }
        public void test2(List<? super C1> list){}   //list参数的元素数据类型是C1及其子类

        public void test3(List<? extends IA> list){}   //list参数的元素数据类型是IA的实现类
    }

class A1 { }

class B3 extends A1 {}

class C1 extends B3{}

class D1 extends C1{}

interface IA{}

class IAImpl implements IA{}