package day11;
/**
 * java中的泛形只在编译中生效
 */

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("sss");
        list.add(true);

        //需求，只能在集合中存字符串
        List<String> l = new ArrayList<String>();
        l.add("www");
        l.add("HHH");

        A<String> a1 = new A<String>();
        a1.setKey("5555");
        String s = a1.getKey();

        A<Integer> a2 = new A<Integer>();
        a2.setKey(2);
        Integer i = a2.getKey();

        A a3 =new A();   //如果不指定泛型则相当于指定了一个Object泛型
//        A<Object> a3 =new A<Object>();
        a3.setKey(new Object());
        Object obj = a3.getKey();

        //同样的类，但是在同样的new对象时泛型指定了不同的数据类型。，这些对象不能互相赋值
    }
}

/**
 * 此处的泛型 T 可以任意取名 ， A B V
 * 一般使用T，意为type
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