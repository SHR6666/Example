package day11;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/**
 * 此为注解方法
 */
public class Test4 {
    public static void main(String[] args) {
        new TestB().test1();      //已标注为过时方法

        @SuppressWarnings("rawtypes")      //可用来抑制警告
        List list = new ArrayList();

    }
}

    class TestA {
        public void test() {

        }
    }

class TestB extends TestA {
    @TestAAnn(id=10, desc="姓名")      //只可给属性做注解，不可给方法做注解
    String name;

    @Override
    public void test() {
        super.test();
    }

    // @Deprecated用于表示程序已过时
    @Deprecated
    public void test1() {

    }
}

@Target(ElementType.FIELD)  //这个注解类是给其它类做注解
@Retention(RetentionPolicy.RUNTIME)    //定义注解的生命周期
@Deprecated
@interface TestAAnn{
    public int id() default 0;

    public String desc() default "";
}
