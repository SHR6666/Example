package day10;

public class Test {
    public static void main(String[] args) {
//        String[] s = new String[]{"a", "b", "c"};
//
//        for(int i = 0; i < 4; i++){  //���0.1.3�����±�
//            //java.lang.ArrayIndexOutOfBoundsException ����Խ��
//            System.out.println(s[i]);
//        }

//        A a = null;  //������ö���aû��ָ���κζ���ָ����null��ʲô��û�У���Ȼû��i��ֵ
//        //java.lang.ArrayIndexOutOfBoundsException�ͻᱨ��ָ���쳣
//        System.out.println(a.i);

//        int i = 0;
//        try {   //��try{}����ס�п��ܳ��쳣�Ĵ���Σ��������쳣����
//            System.out.println("1");
//            System.out.println(3 / i);   //��java.lang.ArithmeticException�������쳣
//            System.out.println("2");
//        }catch (Exception e){//����֪�Ǻ����쳣ʱ����ʹ���쳣�ĸ���Exception
////            e.printStackTrace();
////            System.out.println(e.getMessage());
//            System.out.println("3");
//        }finally {   //���finally���Բ�д�����ǲ����쳣��ϵ������һ�λ�ִ�еĲ��֣�Ϊ��ѧϰIO������JDBC��Ӵ�
//            System.out.println("4");
//        }
//
//        System.out.println("ok");

        String[] strs = new String[]{"a", "b"};
        A a = null;
        try { //Ϊ�˷�ֹ������ܳ��ֵ��쳣
            //�ڲ����쳣�Ĵ�����У�try{}��Ĵ��룩�����ǰ��Ĵ������쳣�Ͳ���ִ�к����
            System.out.println(strs[2]);
            System.out.println(a.i);   //aָ���ָ��
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (NullPointerException e1){
            System.out.println(e1.getMessage());
            e1.printStackTrace();
        }
        System.out.println("=======");
    }
}
class A{
    int i;
}
