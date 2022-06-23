package day14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("day14.Student");
//            Class superclass = clazz.getSuperclass();   //获取父类
//            System.out.println("父类" + superclass.getName());
//
//            Class[] interfaces = clazz.getInterfaces();  //获取当前类的所有接口
//            for (Class c:
//                 interfaces) {
//                System.out.println("接口" + c.getName());
//            }
//
//            Constructor[] cons = clazz.getConstructors();  //获取类公有的构造方法
//            for(Constructor c: cons) {
//                System.out.println("构造方法名称：" + c.getName());  //getName()是获取方法名称
//                //getModifiers()是获取方法修饰符，返回数字1代表public，返回数字2代表private；
//                System.out.println("构造方法：" + c.getName() + "的修饰符是" + c.getModifiers());
//
//                Class[] paramClass = c.getParameterTypes();
//                for (Class pc : paramClass){
//                    System.out.println("构造方法：" + c.getName() + "参数类型是：" + pc.getName());
//                }
//            }

//            Constructor[] cons1 = clazz.getDeclaredConstructors();   //获取所有类的构造方法，包括公有和私有的
//            System.out.println("======================");

//            for (Constructor c : cons1){
//                System.out.println("构造方法名称：" + c.getName());  //getName()是获取方法名称
//                System.out.println("构造方法：" + c.getName() + "的修饰符是" + c.getModifiers());
//                Class[] paramClass = c.getParameterTypes();
//                for (Class pc : paramClass){
//                    System.out.println("构造方法：" + c.getName() + "参数类型是：" + pc.getName());
//                }
//                System.out.println("=====================");
//            }

        //如果用反射的构造方法来创建对象
//        try{
//            Object obj = clazz.newInstance();  //相当于调用Student类的无参公有的构造方法
////            Student stu = (Student) obj;
////            System.out.println(stu.school);
//
////            Constructor c = clazz.getConstructor(String.class);  //获取指定的一个参数，并且为String类型的公有构造方法
////            Student stu1 = (Student) c.newInstance("第一中学");  //newInstance实例化构造对象，相当于是调用public Student
////
////            System.out.println(stu1.school);
//            //通过反射机制可以强制调用私有的构造方法
//            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);  //指定获取有两个参数的构造方法
//
//            c.setAccessible(true);  //解除私有的封装，下面就可以对私有方法强制调用。
//            Student stu = (Student) c.newInstance("zhangsan","12");
//        }catch (Exception e){
//            e.printStackTrace();
//        }

//            Method[] ms =  clazz.getMethods();  //获取类的所有公有方法
//            Method[] ms = clazz.getDeclaredMethods();  //获取类所有方法，包含公有和私有类。
//            for (Method m : ms) {
//                System.out.println("方法名：" + m.getName());
//                System.out.println("返回值类型：" + m.getReturnType());
//                System.out.println("修饰符：" + m.getModifiers());
//
//                Class[] pcs = m.getParameterTypes();  //获取方法的参数类型，是一个数组，方法有几个参数，数据就有几个。
//                if (pcs != null && pcs.length > 0) {
//                    for (Class pc : pcs) {
//                        System.out.println("参数类型：" + pc.getName());
//                    }
//                }
//                System.out.println("==============================");
//            }

//            Field[] fs = clazz.getFields();  //获取类的公有属性 Get public attribute
//            Field[] fs = clazz.getDeclaredFields(); //获取所有的数据，包括私有。
//            for(Field f : fs){
//                System.out.println("修饰符" + f.getModifiers());
//                System.out.println("属性的类型" + f.getType());
//                System.out.println("属性名称" + f.getName());
//            }
//
//            Package p = clazz.getPackage();  //获取类所在的包
//            System.out.println(p.getName());

            //=================================================
            /**
             * 注：下面不论是反射调用setInfo方法还是test方法，
             * 都需要调用的obj对象的方法，obj对象时间上就是student对象
             */
//            Constructor con = clazz.getConstructor();  //获取无参构造
//            Object obj = con.newInstance(); //ues Nonparametric construction created Object
//            Method m = clazz.getMethod("setInfo", String.class, String.class); //得到名称叫setInfo，参数是String，String的方法
//            m.invoke(obj, "zhangsan", "第一中学");  //参数1是需要实例化的对象，后面的参数是要调用当前方法的实际参数
//
//            //如果想要调用私有方法
//            Method m1 = clazz.getDeclaredMethod("test", String.class); //获取方法名为test，参数为一个String类型的方法
//            m1.setAccessible(true);  //解除私有封装，下面可以强制调用私有的方法
//            m1.invoke(obj, "李四");
//
//            //调用一个重载方法
//            Method m2 = clazz.getMethod("setInfo", int.class);
//            m2.invoke(obj, 1);
//
//            //有返回值的方法
//            Method m3 = clazz.getMethod("getSchool");
//            String school = (String) m3.invoke(obj);
//            System.out.println(school);

            //创建一个反射
            Constructor con = clazz.getConstructor();
            Student stu = (Student) con.newInstance();

            Field f = clazz.getField("school"); //获取名称为school的属性
            f.set(stu, "第三中学");  //对stu对象的school属性设置值"第三中学"
            String school = (String) f.get(stu);  //获取stu的school属性的值
            System.out.println(school);

            //如果是私有的属性
            Field f1 = clazz.getDeclaredField("privateFile");

            f1.setAccessible(true);  //解除私有封装，下面就可以强制调用私有的属性
            f1.set(stu, "测试私有属性");
            System.out.println(f1.get(stu));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
