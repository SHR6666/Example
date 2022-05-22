package day09;

public class TextPerson {
    int age;
    final String NAME = ""; //用了final必须给常量赋值
    final static String NAME1 = ""; //final static一起修饰变量，叫全局常量
    //常量定义名称约定使用大写，如果多个单词组成名称，用下杠 _ 编写

    public void test() {

    }

    public static void main(String[] args) {
        final int i = 0;  //只能赋值一次
//        i = 1;
    }

    class To extends TextPerson{
        @Override
        public void test() {
            super.test();
        }
    }

}
