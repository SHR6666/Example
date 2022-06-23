package day14;

public class Student extends Person implements Study, Move{
    public Student(){
        System.out.println("���õ���public Student()");
    }
    public Student(String school){
        this.school = school;
        System.out.println("���õ���public Student(String school)");
    }
    private Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("���õ���private Student(String name, int age)");
    }

    public String school;
    private String privateFile;

    public void showInfo(){
        System.out.println("ѧУ�ǣ�" + this.school);
    }

    @Override
    public void studyInfo() {
        System.out.println("ѧϰ������ѧ��֪ʶ");
    }

    @Override
    public void moveType() {
        System.out.println("�����г���ѧ");
    }

    private void test(String name){
        System.out.println("����˽�з���");
    }

    public String getSchool(){
        return this.school;
    }

    public void setInfo(String name, String school){
        this.name = name;
        this.school = school;
        System.out.println("����setInfo(String name, String school)����");
    }

    public void setInfo(int age){
        System.out.println("����setInfo(int age)����");
    }
}
