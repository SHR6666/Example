package day11;

public class Test1 {
    public static void main(String[] args) {
        B1<Object> b1 = new B1<Object>();
        B1<String> b2 = new B1<String>();
        B1<Integer> b3 = new B1<Integer>();

//        B2<String> b4 = new B2<String>();
    }
}

interface Id<T>{
    T text(T t);

}

/**
 * δ����ʵ��ʱ���뷺�͵Ķ�����ͬ�����������ʱ����Ҫ�����͵�����һ���������
 * @param <T>
 */
class B1<T> implements Id<T>{

    @Override
    public T text(T t) {
        return t;
    }
}

/**
 * �����֭һƷ��ӿ�ʱָ��������������
 * �����ʵ�ֽӿ����з�����λ������ѷ����滻��ʵ�ʵľ�����������
 */
class B2 implements Id<String>{

    @Override
    public String text(String s) {
        return null;
    }
}

class Cc {
    public<T> void test(T s){
        T t = s;
    }

    public<T> String test1(String s){
        return s;
    }

    public void test2(String... strs){

    }
}


