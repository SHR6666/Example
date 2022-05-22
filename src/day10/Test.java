package day10;

public class Test {
    public static void main(String[] args) {
//        String[] s = new String[]{"a", "b", "c"};
//
//        for(int i = 0; i < 4; i++){  //输出0.1.3三个下标
//            //java.lang.ArrayIndexOutOfBoundsException 数组越界
//            System.out.println(s[i]);
//        }

//        A a = null;  //这里，引用对象a没有指向任何对象，指向是null，什么都没有，自然没有i的值
//        //java.lang.ArrayIndexOutOfBoundsException就会报空指针异常
//        System.out.println(a.i);

//        int i = 0;
//        try {   //用try{}来括住有可能出异常的代码段，并进行异常捕获
//            System.out.println("1");
//            System.out.println(3 / i);   //报java.lang.ArithmeticException即运算异常
//            System.out.println("2");
//        }catch (Exception e){//当不知是何种异常时，就使用异常的父类Exception
////            e.printStackTrace();
////            System.out.println(e.getMessage());
//            System.out.println("3");
//        }finally {   //这个finally可以不写，它是捕获异常体系中最终一段会执行的部分，为了学习IO操作和JDBC会接触
//            System.out.println("4");
//        }
//
//        System.out.println("ok");

        String[] strs = new String[]{"a", "b"};
        A a = null;
        try { //为了防止程序可能出现的异常
            //在捕获异常的代码块中（try{}里的代码），如果前面的代码有异常就不会执行后面的
            System.out.println(strs[2]);
            System.out.println(a.i);   //a指向空指针
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
