package day09;

public class TextPerson {
    int age;
    final String NAME = ""; //����final�����������ֵ
    final static String NAME1 = ""; //final staticһ�����α�������ȫ�ֳ���
    //������������Լ��ʹ�ô�д������������������ƣ����¸� _ ��д

    public void test() {

    }

    public static void main(String[] args) {
        final int i = 0;  //ֻ�ܸ�ֵһ��
//        i = 1;
    }

    class To extends TextPerson{
        @Override
        public void test() {
            super.test();
        }
    }

}
