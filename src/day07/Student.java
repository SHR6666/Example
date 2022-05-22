package day07;

/**
 * 通过extends的方式继承父类代码，即Person为父类
 * 子类的共性代码继承自父类
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

        System.out.println("以下是Student类对Person类的showInfo重写");
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
//        //以上是正常情况
//        Person e = new Student();   //父类Person的引用对象可以指向子类的实例

//        Student s = new Student();
//        s.school = "xxx";
//        Person e = new Student();   //父类Person的引用对象可以指向子类的实例
////        e.school = "xxx";  不可行，属性是在编译时确定，编译时e为Person类型，没有school成员变量，因而编译错误

//        Student s = new Student();
//        s.showInfo();
//
//        Person person = new Person();
//        person.showInfo();
//
//        Person e = new Student();
//        e.showInfo();    //此调用的是Student类的showInfo方法

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
