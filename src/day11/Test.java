package day11;
/**
 * java�еķ���ֻ�ڱ�������Ч
 */

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("sss");
        list.add(true);

        //����ֻ���ڼ����д��ַ���
        List<String> l = new ArrayList<String>();
        l.add("www");
        l.add("HHH");

        A<String> a1 = new A<String>();
        a1.setKey("5555");
        String s = a1.getKey();

        A<Integer> a2 = new A<Integer>();
        a2.setKey(2);
        Integer i = a2.getKey();

        A a3 =new A();   //�����ָ���������൱��ָ����һ��Object����
//        A<Object> a3 =new A<Object>();
        a3.setKey(new Object());
        Object obj = a3.getKey();

        //ͬ�����࣬������ͬ����new����ʱ����ָ���˲�ͬ���������͡�����Щ�����ܻ��ำֵ
    }
}

/**
 * �˴��ķ��� T ��������ȡ�� �� A B V
 * һ��ʹ��T����Ϊtype
 * @param <T>
 */
class A<T>{
    private T key;

    public void setKey(T key){
        this.key = key;
    }

    public T getKey() {
        return this.key;
    }
}