package day11;

/**
 * ���ͷ���
 */
public class Test1 {
    public static void main(String[] args) {
//        B1<Object> b1 = new B1<Object>();
//        B1<String> b2 = new B1<String>();
//        B1<Integer> b3 = new B1<Integer>();

//        B2<String> b4 = new B2<String>();

        Cc<Object> c = new Cc<Object>();
        c.test("���ľ�����cnm");
        //���ͷ����ڵ���֮ǰû�й̶�����������
        //�ڵ���ʱ������Ĳ�����ʲô���ͣ��ͻ�ѷ��͸ĳ�ʲô����
        //Ҳ����˵�����ͷ������ڵ���ʱȷ�����;�����������
        Integer i = c.test1(2);   //���ݵĲ�����Integer�����;͹̶���Integer������ֵ����Integer
        Boolean b = c.test1(true);//���ݵĲ�����Boolean�����;͹̶���Boolean������ֵ����Boolean

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

class Cc<E> {
    private E e;
    /**
     * �޷���ֵ�ķ���
     * @param s
     * @param <T>
     */
    public<T> void test(T s){
        //�����ϵķ��ͣ���������ͨ������ʹ��
            System.out.println(this.e);

        T t = s;
    }

    public<T> T test1(T i){
        return i;
    }

    /**
     * �β�Ϊ�ɱ�����ķ���
     * @param strs
     */
    public void test2(String... strs){
        for (String s:
             strs) {
            System.out.println(s);
        }
    }

    public static<T> void test3(T t){
        //�ھ�̬�����в���ʹ���ඨ�巺��
        System.out.println(t);
    }
}


