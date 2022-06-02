package day13;

import java.io.*;

/**
 * 序列化与反序列化
 */
public class Test5 {
    public static void main(String[] args) {
//        Test5.testSerialization();
        Test5.testDeserialization();
    }

    public static void testSerialization(){
        //定义对象输出流，把对象的序列化流放到指定的文件中
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\JavaProject\\untitled\\src\\day13\\tt9.txt"));

            Person p = new Person();
            p.name = "小王";
            p.age = 15;

            out.writeObject(p);
            out.flush();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/**
 * 对象的反序列化
 */
    public static void testDeserialization(){
        //创建对象输入流，从指定的文件中把对象序列化出来
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\JavaProject\\untitled\\src\\day13\\tt9.txt"));
            Object obj = in.readObject();

            Person p = (Person) obj;

            System.out.println(p.age);
            System.out.println(p.name);

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
