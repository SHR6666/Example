package day06;
import day06.Person;  //同一包下的类可以不写
public class Text {
    public static void main(String[] args) {
//        Old.Person p = new Old.Person();
// //       p.age = 200;  此变量已经无法调用
//        p.setAge(-200);
//        p.printAge();
//        Person5 p5 = new Person5();
//        p5.showInfo();

//        Person5 p5 = new Person5(2, "lisi");
//        p5.showInfo();

//        Person6 p6 = new Person6();
//        System.out.println(p6.age);

//        Person6 p6 = new Person6(12, "张三");
//        System.out.println(p6.age+" "+p6.name);
//
//        Point point = new Point(6,7,8);
//        point.setPoint(6,7,8);
//
//        new Person6();
//        new Person6(1);
//        new Person6("s");

        Person7 p7 = new Person7();
        p7.setName("wangwu");
        p7.setSex(0);
        p7.setAge(12);
        System.out.println(p7.getName());
        System.out.println(p7.getSex());
        System.out.println(p7.getAge());
    }
}
