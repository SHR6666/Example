package day11;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/**
 * ��Ϊע�ⷽ��
 */
public class Test4 {
    public static void main(String[] args) {
        new TestB().test1();      //�ѱ�עΪ��ʱ����

        @SuppressWarnings("rawtypes")      //���������ƾ���
        List list = new ArrayList();

    }
}

    class TestA {
        public void test() {

        }
    }

class TestB extends TestA {
    @TestAAnn(id=10, desc="����")      //ֻ�ɸ�������ע�⣬���ɸ�������ע��
    String name;

    @Override
    public void test() {
        super.test();
    }

    // @Deprecated���ڱ�ʾ�����ѹ�ʱ
    @Deprecated
    public void test1() {

    }
}

@Target(ElementType.FIELD)  //���ע�����Ǹ���������ע��
@Retention(RetentionPolicy.RUNTIME)    //����ע�����������
@Deprecated
@interface TestAAnn{
    public int id() default 0;

    public String desc() default "";
}
