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
//        Person p = s;   //�����ൽ��������Զ�����ת��

//        Person p = new Person();
//        Student s = (Student) p;  //�Ӹ��ൽ��������ͱ���ǿ��ת��

//        Text t = new Text();
//        Person p1 = new Person();
//        Person p1 = t;  //�޼̳й�ϵ���������ͼ�ת���ǷǷ���

        //Object�����������߸���

//        String s = "Hello";
//        Object obj = s;   //�����ൽ���������ת�����Զ����У���ΪObject��������Ķ�������
//        System.out.println(obj);

//        Object obj = "Hello";
//        String s = (String) obj;    //�Ӹ��ൽ��������ͱ���ǿ��ת��
//        System.out.println(s);

//        Text t = new Text();
//        t.method(new Person());
//        t.method(new Student());

//        int i = 3;
//        System.out.println(i == 3);

//        Person p1 = new Person();
//        Person p2 = new Person();
////        p1 = p2;
//        System.out.println(p1 == p2);  //ֻ��ָ��һ������ʱ��==�ŷ���true
//        System.out.println(p1.equals(p2));  //������һ��Ч��

//        int a = 3, b = 4;
//        if(a < b){
//            System.out.println("java������������");
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
//        Integer i = new Integer("abc");  //�������������д�
//        System.out.println(i);

//        Integer i = new Integer(111);   //װ��
//        int i0 = i.intValue();     //����
//
//        Integer i1 = 113;  //�Զ�װ��
//        int i2 = i1;        //�Զ�����
//        System.out.println(i0);
//
////        boolean b = new Boolean("false").booleanValue();
//        boolean b = new Boolean("false");  //�Զ�����
//        Boolean b1 = true;   //�Զ�װ��
//        System.out.println(b);

//        int i = Integer.parseInt("123");
//        float f = Float.parseFloat("0.40");
//        boolean b = Boolean.parseBoolean("false");
//
//        String list = String.valueOf(i);   //��i����ת��Ϊ�ַ���
//        String fl = String.valueOf(f);
//        String bo = String.valueOf(true);

//        MyDate m = new MyDate(2030, 12, 12);
//        System.out.println(m.toString());
//        System.out.println(m);

//        Chinese.country = "�й�";
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
//        //��û�а취ֻдһ�ι���,�����еĶ���ʹ����ͬ�Ĺ���
//        System.out.println(c.country);
//        System.out.println(c1.country);
//        System.out.println(c2.country);

//        String s = null;
////        if (s != null && !s.equals("")){
////            //��δ���Ŀ����п��ܻ���ʹ����һ�жϣ���ô�ڴ��������Ļ����Ͽ��������ظ��Ļ����ͺܶ�
////            //����Ҫ�������Ĵ����ȡ������������һ������
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

        //����ʽʹ��
//        Single s = new Single();  //����˽�У��޷�����
//        Single s = Single.getInstance();  //�������ɵ���

        //����ʽʹ��
        Single s = Single.getInstance();   //�൱��new Single1�滻�ˣ�private static Single1 s1 = null;����null��λ��
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
