package day10;

/**
 * 抛出异常测试
 */
public class Test1 {
    public static void main(String[] args) {
//        B b = new B();
//        try {
//            b.test();
//        } catch (Exception e) {
////            throw new RuntimeException(e);
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }

        B b = new B();
        try {
//            b.test1(151);
            b.test2(-100);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
class B{
    int i;
    public void test() throws NullPointerException{    //可以在throws在代码这抛出异常，在调用方法去捕获
        B b = null;
        System.out.println(b.i);
    }

    int age;
    public void test1(int age) throws Exception {
        if (age >= 0 && age <= 150){
            this.age = age;
            System.out.println("年龄是：" + this.age);
        }else {
            throw new Exception("年龄不在0到150之间");
        }
    }

    public void test2(int age) throws MyException {
        if (age >= 0 && age <= 150){
            this.age = age;
            System.out.println("年龄是：" + this.age);
        }else {
            throw new MyException("年龄不在0到150之间");
        }
    }
}

class C extends B{
    @Override
    public void test() throws NullPointerException {
//        public void test() throws Exception \\重写方法不能抛出比被重写方法更大的异常类型
        super.test();
    }
}

class MyException extends Exception {
    public MyException(String msg){
        super(msg);
    }
}
