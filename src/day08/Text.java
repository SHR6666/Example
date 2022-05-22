package day08;

public class Text {
//    #include<sudio.h>
//    int main(void)
//    {
//        printf("Hello World");
//        return 0;
//    }
    public static void main(String[] args) {
//        int i = 10;
//        long l = i;

//        long l = 10;
//        int i = (int) l;

//        Student s = new Student();
//        Person p = s;   //从子类到父类可以自动进行转换

//        Person p = new Person();
//        Student s = (Student) p;  //从父类到子类的类型必须强制转换

//        Text t = new Text();
//        Person p1 = new Person();
//        Person p1 = t;  //无继承关系的引用类型间转换是非法的

        //Object是所有类的最高父类

//        String s = "Hello";
//        Object obj = s;   //从子类到父类的类型转换可自动进行，因为Object是所有类的顶级父类
//        System.out.println(obj);

//        Object obj = "Hello";
//        String s = (String) obj;    //从父类到子类的类型必须强制转换
//        System.out.println(s);

//        Text t = new Text();
//        t.method(new Person());
//        t.method(new Student());

//        int i = 3;
//        System.out.println(i == 3);

//        Person p1 = new Person();
//        Person p2 = new Person();
////        p1 = p2;
//        System.out.println(p1 == p2);  //只有指向一个对象时，==才返回true
//        System.out.println(p1.equals(p2));  //与上面一个效果

//        int a = 3, b = 4;
//        if(a < b){
//            System.out.println("java是最美的语言");
//        }
//        System.out.println();
//
//          String s1 = new String("abc");
//          String s2 = new String("abc");
//          System.out.println(s1 == s2);

//        Order o1 = new Order(123, "a001");
//        Order o2 = new Order(123, "a001");
//        System.out.println(o1.equals(o2));

//        MyDate date = new MyDate(2030, 5, 27);
//        MyDate date2 = new MyDate(2030,5,27);
//        System.out.println(date.equals(date2));

//        Integer i = new Integer(111);
//        Integer i = new Integer("111");
//        Integer i = new Integer("abc");  //这样编译运行有错
//        System.out.println(i);

//        Integer i = new Integer(111);   //装箱
//        int i0 = i.intValue();     //拆箱
//
//        Integer i1 = 113;  //自动装箱
//        int i2 = i1;        //自动拆箱
//        System.out.println(i0);
//
////        boolean b = new Boolean("false").booleanValue();
//        boolean b = new Boolean("false");  //自动拆箱
//        Boolean b1 = true;   //自动装箱
//        System.out.println(b);

//        int i = Integer.parseInt("123");
//        float f = Float.parseFloat("0.40");
//        boolean b = Boolean.parseBoolean("false");
//
//        String list = String.valueOf(i);   //把i重新转换为字符串
//        String fl = String.valueOf(f);
//        String bo = String.valueOf(true);

//        MyDate m = new MyDate(2030, 12, 12);
//        System.out.println(m.toString());
//        System.out.println(m);

//        Chinese.country = "中国";
//        Chinese c = new Chinese();
//        c.name = "xx";
//        c.age = 11;
//
//        Chinese c1 = new Chinese();
//        c1.name = "xx";
//        c1.age = 11;
//
//        Chinese c2 = new Chinese();
//        c2.name = "xx";
//        c2.age = 11;
//        //有没有办法只写一次国籍,让所有的对象都使用相同的国籍
//        System.out.println(c.country);
//        System.out.println(c1.country);
//        System.out.println(c2.country);

//        String s = null;
////        if (s != null && !s.equals("")){
////            //在未来的开发中可能会多次使用这一判断，那么在大量次数的基础上看，大量重复的基础就很多
////            //所以要把这样的代码抽取到工具类做成一个方法
////        }
//
//        System.out.println(Utils.isEmpty(s));

//        Chinese c1 = new Chinese();
//        System.out.println(Chinese.count);
//        Chinese c2 = new Chinese();
//        System.out.println(Chinese.count);
//        Chinese c3 = new Chinese();
//        System.out.println(Chinese.count);
//        Chinese c4 = new Chinese();
//        System.out.println(Chinese.count);
//        Chinese c5 = new Chinese();
//        System.out.println(Chinese.count);
//        Chinese c6 = new Chinese();
//        System.out.println(Chinese.count);
//
//        Chinese.showCount();

        //饿汉式使用
//        Single s = new Single();  //因其私有，无法调用
//        Single s = Single.getInstance();  //这样方可调用

        //懒汉式使用
        Single s = Single.getInstance();   //相当于new Single1替换了（private static Single1 s1 = null;）中null的位置
    }
    public void method(Person e){
        if (e instanceof Student){
            Student s = (Student) e;
            s.getSchool();
        }else{
            e.text();
        }
    }
}
