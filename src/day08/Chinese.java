package day08;

public class Chinese {
    public Chinese() {
        Chinese.count += 1;
    }
    //ʹ��static����ֻ����һ�ι���
    static String country;
    public static int count; //����
    String name;
    int age;

    public static void text() {
        System.out.println("����һ����̬����");
    }
    public static void showCount(){
        System.out.println("�ܹ�new��" + Chinese.count + "������");
    }
}
