package day07;

/**
 * ͨ��extends�ķ�ʽ�̳и�����룬��PersonΪ����
 * ����Ĺ��Դ���̳��Ը���
 */

public class Student extends Person{
    String school;
    int age;

//    public void showInfo() {
//        System.out.println(this.age);
//        System.out.println(this.name);
//        System.out.println(this.sex);
//        System.out.println(this.school);
//    }


    @Override
    public void showInfo() {

        System.out.println("������Student���Person���showInfo��д");
        System.out.println(age);
        System.out.println(name);
        System.out.println(sex);
    }

//    @Override
//    public void showInfo(int age, String name, int sex){
//        System.out.println(age);
//        System.out.println(name);
//        System.out.println(sex);
//    }

    public static void main(String[] args) {
//        Student stu = new Student();
//        stu.showInfo();

//        Person person = new Person();
//        Student s = new Student();
//        //�������������
//        Person e = new Student();   //����Person�����ö������ָ�������ʵ��

//        Student s = new Student();
//        s.school = "xxx";
//        Person e = new Student();   //����Person�����ö������ָ�������ʵ��
////        e.school = "xxx";  �����У��������ڱ���ʱȷ��������ʱeΪPerson���ͣ�û��school��Ա����������������

//        Student s = new Student();
//        s.showInfo();
//
//        Person person = new Person();
//        person.showInfo();
//
//        Person e = new Student();
//        e.showInfo();    //�˵��õ���Student���showInfo����

        Student s = new Student();
        Person p = new Person();
        System.out.println(s instanceof Person);
        System.out.println(p instanceof Person);
        System.out.println(p instanceof Student);

        Person e = new Student();
        Object o =new Student();
        Person e1 = e;
        System.out.println(e instanceof Student);
    }
}
