package day06;

public class Person6 {
    /**
     * 构造器的重载，就是为了方便调用方可以灵活地创建出不同需求的对象
     *
     */
    public Person6(){}
    public Person6(int a){}
    public Person6(String n){}

    public Person6(int a, String n){
        age = 18;
        age = a;
        name = n;
    }
    int age;
    String name;
}
