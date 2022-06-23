package day14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("day14.Student");
//            Class superclass = clazz.getSuperclass();   //��ȡ����
//            System.out.println("����" + superclass.getName());
//
//            Class[] interfaces = clazz.getInterfaces();  //��ȡ��ǰ������нӿ�
//            for (Class c:
//                 interfaces) {
//                System.out.println("�ӿ�" + c.getName());
//            }
//
//            Constructor[] cons = clazz.getConstructors();  //��ȡ�๫�еĹ��췽��
//            for(Constructor c: cons) {
//                System.out.println("���췽�����ƣ�" + c.getName());  //getName()�ǻ�ȡ��������
//                //getModifiers()�ǻ�ȡ�������η�����������1����public����������2����private��
//                System.out.println("���췽����" + c.getName() + "�����η���" + c.getModifiers());
//
//                Class[] paramClass = c.getParameterTypes();
//                for (Class pc : paramClass){
//                    System.out.println("���췽����" + c.getName() + "���������ǣ�" + pc.getName());
//                }
//            }

//            Constructor[] cons1 = clazz.getDeclaredConstructors();   //��ȡ������Ĺ��췽�����������к�˽�е�
//            System.out.println("======================");

//            for (Constructor c : cons1){
//                System.out.println("���췽�����ƣ�" + c.getName());  //getName()�ǻ�ȡ��������
//                System.out.println("���췽����" + c.getName() + "�����η���" + c.getModifiers());
//                Class[] paramClass = c.getParameterTypes();
//                for (Class pc : paramClass){
//                    System.out.println("���췽����" + c.getName() + "���������ǣ�" + pc.getName());
//                }
//                System.out.println("=====================");
//            }

        //����÷���Ĺ��췽������������
//        try{
//            Object obj = clazz.newInstance();  //�൱�ڵ���Student����޲ι��еĹ��췽��
////            Student stu = (Student) obj;
////            System.out.println(stu.school);
//
////            Constructor c = clazz.getConstructor(String.class);  //��ȡָ����һ������������ΪString���͵Ĺ��й��췽��
////            Student stu1 = (Student) c.newInstance("��һ��ѧ");  //newInstanceʵ������������൱���ǵ���public Student
////
////            System.out.println(stu1.school);
//            //ͨ��������ƿ���ǿ�Ƶ���˽�еĹ��췽��
//            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);  //ָ����ȡ�����������Ĺ��췽��
//
//            c.setAccessible(true);  //���˽�еķ�װ������Ϳ��Զ�˽�з���ǿ�Ƶ��á�
//            Student stu = (Student) c.newInstance("zhangsan","12");
//        }catch (Exception e){
//            e.printStackTrace();
//        }

//            Method[] ms =  clazz.getMethods();  //��ȡ������й��з���
//            Method[] ms = clazz.getDeclaredMethods();  //��ȡ�����з������������к�˽���ࡣ
//            for (Method m : ms) {
//                System.out.println("��������" + m.getName());
//                System.out.println("����ֵ���ͣ�" + m.getReturnType());
//                System.out.println("���η���" + m.getModifiers());
//
//                Class[] pcs = m.getParameterTypes();  //��ȡ�����Ĳ������ͣ���һ�����飬�����м������������ݾ��м�����
//                if (pcs != null && pcs.length > 0) {
//                    for (Class pc : pcs) {
//                        System.out.println("�������ͣ�" + pc.getName());
//                    }
//                }
//                System.out.println("==============================");
//            }

//            Field[] fs = clazz.getFields();  //��ȡ��Ĺ������� Get public attribute
//            Field[] fs = clazz.getDeclaredFields(); //��ȡ���е����ݣ�����˽�С�
//            for(Field f : fs){
//                System.out.println("���η�" + f.getModifiers());
//                System.out.println("���Ե�����" + f.getType());
//                System.out.println("��������" + f.getName());
//            }
//
//            Package p = clazz.getPackage();  //��ȡ�����ڵİ�
//            System.out.println(p.getName());

            //=================================================
            /**
             * ע�����治���Ƿ������setInfo��������test������
             * ����Ҫ���õ�obj����ķ�����obj����ʱ���Ͼ���student����
             */
//            Constructor con = clazz.getConstructor();  //��ȡ�޲ι���
//            Object obj = con.newInstance(); //ues Nonparametric construction created Object
//            Method m = clazz.getMethod("setInfo", String.class, String.class); //�õ����ƽ�setInfo��������String��String�ķ���
//            m.invoke(obj, "zhangsan", "��һ��ѧ");  //����1����Ҫʵ�����Ķ��󣬺���Ĳ�����Ҫ���õ�ǰ������ʵ�ʲ���
//
//            //�����Ҫ����˽�з���
//            Method m1 = clazz.getDeclaredMethod("test", String.class); //��ȡ������Ϊtest������Ϊһ��String���͵ķ���
//            m1.setAccessible(true);  //���˽�з�װ���������ǿ�Ƶ���˽�еķ���
//            m1.invoke(obj, "����");
//
//            //����һ�����ط���
//            Method m2 = clazz.getMethod("setInfo", int.class);
//            m2.invoke(obj, 1);
//
//            //�з���ֵ�ķ���
//            Method m3 = clazz.getMethod("getSchool");
//            String school = (String) m3.invoke(obj);
//            System.out.println(school);

            //����һ������
            Constructor con = clazz.getConstructor();
            Student stu = (Student) con.newInstance();

            Field f = clazz.getField("school"); //��ȡ����Ϊschool������
            f.set(stu, "������ѧ");  //��stu�����school��������ֵ"������ѧ"
            String school = (String) f.get(stu);  //��ȡstu��school���Ե�ֵ
            System.out.println(school);

            //�����˽�е�����
            Field f1 = clazz.getDeclaredField("privateFile");

            f1.setAccessible(true);  //���˽�з�װ������Ϳ���ǿ�Ƶ���˽�е�����
            f1.set(stu, "����˽������");
            System.out.println(f1.get(stu));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
