package day09;

public class Person {
    String name;
    static int age;

    static TextPerson tp = new TextPerson();

    public Person(){
        this.name = "����";
        System.out.println("ִ�е��ǹ��췽��");
    }

    //�Ǿ�̬�Ĵ����
    {
        System.out.println("ִ�е��ǷǾ�̬�����1");
    }
    {
        System.out.println("ִ�е��ǷǾ�̬�����2");
    }
    {
        System.out.println("ִ�е��ǷǾ�̬�����3");
    }

    //��̬�����
    static{
        //����ֻ��ʹ�þ�̬static���ε����Ժͷ���
        age = 1;
        showAge();
        System.out.println("====ִ�е��Ǿ�̬�����=====");
  //      tp.name = "";
        tp.age = 1;
    }

    public static void showAge(){
        System.out.println(age);
    }
    public void text() {
        System.out.println("����Person��text����");
    }
}
