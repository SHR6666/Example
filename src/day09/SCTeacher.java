package day09;

/**
 * ����һ���ᳪ���������ʦ����
 */
public class SCTeacher extends Person1 implements Cooking, Sing{
    String course; //�̵Ŀ�Ŀ
    public void setInfo(){
        super.age = 17;
        super.name = "������";
        super.sex = 1;

        this.course = "��ѧ";
    }
    @Override
    public void showInfo() {
        System.out.println("�ᳪ���������ʦ����Ϣ�ǣ�");
        System.out.println(super.age);
        System.out.println(super.name);
        System.out.println(super.sex);
        System.out.println(this.course);
    }

    @Override
    public void fly() {
        System.out.println(super.name + "��ʦ���ֵĳ����ǳ���");
    }

    @Override
    public void singing() {
        System.out.println(super.name+"��ʦ�ó���������");
    }
}
