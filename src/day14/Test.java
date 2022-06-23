package day14;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Class clazz = p.getClass();   //clazz 对象就包含p所属的Person类的所有信息

        Class c0 = Person.class;  //通过类名.class创建指定类的Class实例
        Class c1 = p.getClass();  //通过一个类的实例对象的getClass()方法，获取相应实例对象类的Class实例

        try {
            //通过Class的静态方法.forName()来获取一个类的Class实例
            //forName(String className)方法参数是你要获取的class实例的类的全路径（包名.类名）
            Class c2 = Class.forName("day14.Person");  //这个是获取实例的常用方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}