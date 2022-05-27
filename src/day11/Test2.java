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
        public void test(List<?> list) {   //test������Ҫһ��list���ϵĲ�������ȷ��list���ϵ��״����ʲô��������
        }

        public void test1(List<? extends C1> list){  //list������Ԫ������������C1��������

        }
        public void test2(List<? super C1> list){}   //list������Ԫ������������C1��������

        public void test3(List<? extends IA> list){}   //list������Ԫ������������IA��ʵ����
    }

class A1 { }

class B3 extends A1 {}

class C1 extends B3{}

class D1 extends C1{}

interface IA{}

class IAImpl implements IA{}