package day07;

public class Person {
    int age;
    String name;
    int sex;

    public void showInfo(){
        System.out.println("以下是Person类的showInfo重写");
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.sex);
    }
}
