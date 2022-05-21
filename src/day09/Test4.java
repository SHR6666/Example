package day09;

public class Test4 {
    /**
     * ������A��ͬʱ�����B����C�ķ�����������д
     * ����ʵ���ڲ�����ʵ�ֱ���Ķ��ؼ̳У�����ͬʱ�̳ж����
     *
     *
     */

    public static void main(String[] args) {
        A a = new A();
        a.testB();
        a.testC();
    }
}
class A {
    public void testB(){
        new InnerB().testB();
    }

    public void testC(){
        new InnerC().testC();
    }


    private class InnerB extends B{
        @Override
        public void testB() {
            System.out.println("������д֮���testB����");
        }
    }
    private class InnerC extends C{
        @Override
        public void testC() {
            System.out.println("������д֮���testC����");
        }
    }
}

class B{
    public void testB(){

    }
}

class C{
    public void testC(){

    }
}
