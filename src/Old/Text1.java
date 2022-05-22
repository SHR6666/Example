package Old;

/**
 * ͨ����������ʾѧ��������Ϣ
 */
public class Text1 {
    public static void main(String[] args) {
//        Old.Student stu = new Old.Student();
//        stu.name   = "С��";
//        stu.age    = 10;
//        stu.course = "���ԡ���ѧ��Ӣ��";
//        stu.hobby  = "�ô��롢���򡢽��衢ѧϰ����";
//        stu.showInfo();
//        System.out.println(" ");

        /**
         * ʵ����Old.Teacher��
         */
//        Old.Teacher teacher = new Old.Teacher();
//        teacher.name = "ë����";
//        teacher.career = "��ʷ";
//        teacher.teach = "���Ρ���ʷ";
//        teacher.schoolAge = 83;
//        teacher.showInfo();

        /**
         * ʵ����Old.Text1�е�������
         */
//        Old.Text1 t1 = new Old.Text1();
//        int area = t1.getArea(2, 3);
//        System.out.println(area);
//            //�˴�������ͬ
//        int a = 2;
//        int b = 3;
//        System.out.println(a * b);

 //   }

 //   public int getArea(int x, int y){
 //       return x * y;

 //       Old.Person2 person2 = new Old.Person2();
 //       person2.name = "С��";
 //       person2.age = 15;
 //       person2.sex = 1;    //0Ϊ�У�1ΪŮ
 //       person2.study();
 //       person2.addAge(2);
 //       person2.showAge();


        CircleArea o = new CircleArea();
        System.out.println("�뾶Ϊ5.2��Բ���Ϊ��"+o.area(5));

        //��һ�ַ���
        double area = new CircleArea().area(5);
        System.out.println("�뾶Ϊ5.2��Բ���Ϊ��"+ area);

        Text1 t1 = new Text1();
        t1.mOl(2);
        t1.mOl(2,3);
        t1.mOl("ǿ��");

        Text1 t2 = new Text1();
        t2.max(5,200);
        t2.max(1.5,0.7);
        t2.max(3,5,1.3);

    }

 //   public int getArea(int x, int y) {
 //       return x * y;
 //   }
//
 //   //�����ͬ���Ƶķ����������ͬһ�����й��棬��ô��Щͬ������һ���ǲ����ĸ������߲������������Ͳ�һ��
 //   //�����ģ�ͬ�������ͽ�����
 //   public int add(int x, int y){
 //       return x + y;
 //   }

//    public int add(int m, int n){      //�ѱ����˷������ò���ʱ��ֻ�����������йأ�����������޹�
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
            System.out.println("���ֵ�ǣ�" + x);
        } else {
            System.out.println("���ֵ�ǣ�" + y);
        }
    }

    public void max(double x, double y){
        double res = 0;
        if (x > y){
            res = x;
        }else {
            res = y;
        }
        System.out.println("���ֵ�ǣ�" + res);
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
        System.out.println("���ֵ�ǣ�" + res);
    }
}
