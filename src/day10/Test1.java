package day10;

/**
 * �׳��쳣����
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
    public void test() throws NullPointerException{    //������throws�ڴ������׳��쳣���ڵ��÷���ȥ����
        B b = null;
        System.out.println(b.i);
    }

    int age;
    public void test1(int age) throws Exception {
        if (age >= 0 && age <= 150){
            this.age = age;
            System.out.println("�����ǣ�" + this.age);
        }else {
            throw new Exception("���䲻��0��150֮��");
        }
    }

    public void test2(int age) throws MyException {
        if (age >= 0 && age <= 150){
            this.age = age;
            System.out.println("�����ǣ�" + this.age);
        }else {
            throw new MyException("���䲻��0��150֮��");
        }
    }
}

class C extends B{
    @Override
    public void test() throws NullPointerException {
//        public void test() throws Exception \\��д���������׳��ȱ���д����������쳣����
        super.test();
    }
}

class MyException extends Exception {
    public MyException(String msg){
        super(msg);
    }
}
