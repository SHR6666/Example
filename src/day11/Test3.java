package day11;

public class Test3 {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        spring.showInfo();

        Season summer = Season.SUMMER;
        summer.showInfo();

        Season spring1 = Season.SPRING;
        System.out.println(spring.equals(spring1));
        spring1.test();
    }
}
enum Season implements ITest{     //ö������
    SPRING("����", "��ů����"),  //�˴��൱���ǵ����вι���private Season (String name, String desc)
    SUMMER("����", "��������"),
    AUTUMN("����", "�����ˬ"),
    WINTER("����", "ǧ�����");
    private final String name;
    private final String desc;

    private Season (String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public void showInfo(){
        System.out.println(this.name + "��" + this.desc);
    }

    @Override
    public void test() {
        System.out.println("����ʵ�ֵ�ITest�ӿڵ�test����");
    }
}

interface ITest{
    void test();
}
