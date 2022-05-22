package day09;

public class Person {
    String name;
    static int age;

    static TextPerson tp = new TextPerson();

    public Person(){
        this.name = "张三";
        System.out.println("执行的是构造方法");
    }

    //非静态的代码块
    {
        System.out.println("执行的是非静态代码块1");
    }
    {
        System.out.println("执行的是非静态代码块2");
    }
    {
        System.out.println("执行的是非静态代码块3");
    }

    //静态代码块
    static{
        //这里只能使用静态static修饰的属性和方法
        age = 1;
        showAge();
        System.out.println("====执行的是静态代码块=====");
  //      tp.name = "";
        tp.age = 1;
    }

    public static void showAge(){
        System.out.println(age);
    }
    public void text() {
        System.out.println("这是Person的text方法");
    }
}
