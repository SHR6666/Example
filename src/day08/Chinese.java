package day08;

public class Chinese {
    public Chinese() {
        Chinese.count += 1;
    }
    //使用static可以只输入一次国籍
    static String country;
    public static int count; //计数
    String name;
    int age;

    public static void text() {
        System.out.println("这是一个静态方法");
    }
    public static void showCount(){
        System.out.println("总共new了" + Chinese.count + "个对象");
    }
}
