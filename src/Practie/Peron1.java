package Practie;

public class Peron1 {
    //分别定义name，age，school和major。
    String name;
    int age;
    String school;
    String major;
    //给各属性值进行重载
    public Peron1(String n, int a){
        name = n;
        age = a;
        return;
    }
    public Peron1(String n, int a, String s){
        age =  a;
        name = n;
        school = s;
        return;
    }
    public Peron1(String n, int a, String s, String m){
        age =  a;
        name = n;
        school = s;
        major = m;
        return;
    }

    public static void main(String[] args) {
        Peron1 p0 = new Peron1("zhangsan", 50);
        Peron1 p1 = new Peron1("lisi", 12, "brother");
        Peron1 p2 = new Peron1("wangwu", 17, "university", "Big brother");
        System.out.println();
    }
}
