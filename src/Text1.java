/**
 * 通过测试类显示学生个人信息
 */
public class Text1 {
    public static void main(String[] args) {
//        Student stu = new Student();
//        stu.name   = "小明";
//        stu.age    = 10;
//        stu.course = "语言、数学、英语";
//        stu.hobby  = "敲代码、排球、街舞、学习政治";
//        stu.showInfo();
//        System.out.println(" ");

        /**
         * 实例化Teacher类
         */
//        Teacher teacher = new Teacher();
//        teacher.name = "毛先生";
//        teacher.career = "历史";
//        teacher.teach = "政治、历史";
//        teacher.schoolAge = 83;
//        teacher.showInfo();

        /**
         * 实例化Text1中的其它类
         */
//        Text1 t1 = new Text1();
//        int area = t1.getArea(2, 3);
//        System.out.println(area);
//            //此处上与下同
//        int a = 2;
//        int b = 3;
//        System.out.println(a * b);

 //   }

 //   public int getArea(int x, int y){
 //       return x * y;

 //       Person2 person2 = new Person2();
 //       person2.name = "小明";
 //       person2.age = 15;
 //       person2.sex = 1;    //0为男，1为女
 //       person2.study();
 //       person2.addAge(2);
 //       person2.showAge();


        CircleArea o = new CircleArea();
        System.out.println("半径为5.2的圆面积为："+o.area(5));

        //另一种方法
        double area = new CircleArea().area(5);
        System.out.println("半径为5.2的圆面积为："+ area);

        Text1 t1 = new Text1();
        t1.mOl(2);
        t1.mOl(2,3);
        t1.mOl("强大");

        Text1 t2 = new Text1();
        t2.max(5,200);
        t2.max(1.5,0.7);
        t2.max(3,5,1.3);

    }

 //   public int getArea(int x, int y) {
 //       return x * y;
 //   }
//
 //   //多个相同名称的方法如果想在同一个类中共存，那么这些同名方法一定是参数的个数或者参数的数据类型不一样
 //   //这样的，同名方法就叫重载
 //   public int add(int x, int y){
 //       return x + y;
 //   }

//    public int add(int m, int n){      //已报错，此方法引用参数时，只能数据类型有关，与参数名称无关
//        return m + n;
//    }


 //   public double add(int x, double y){
 //       return x + y;
 //   }
//
 //   public int add(int x, int y, int z){
 //       return x + y + z;
 //   }

    public void mOl(int i){
        System.out.println(i * i);
    }
    public void mOl(int x, int y){
        System.out.println(x * y);
    }
    public void mOl(String s){
        System.out.println(s);
    }

    public void max(int x, int y){
        if (x > y){
            System.out.println("最大值是：" + x);
        } else {
            System.out.println("最大值是：" + y);
        }
    }

    public void max(double x, double y){
        double res = 0;
        if (x > y){
            res = x;
        }else {
            res = y;
        }
        System.out.println("最大值是：" + res);
    }

    public void max(double a, double b, double c){
        double res = 0;
        if (a > b & a > c){
            res = a;
        } else if (b > a & b > c) {
            res = b;
        } else if (c > a & c > b) {
            res = c;
        }
        System.out.println("最大值是：" + res);
    }
}
