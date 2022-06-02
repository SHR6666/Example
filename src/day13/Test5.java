package day13;

import java.io.*;

/**
 * ���л��뷴���л�
 */
public class Test5 {
    public static void main(String[] args) {
//        Test5.testSerialization();
        Test5.testDeserialization();
    }

    public static void testSerialization(){
        //���������������Ѷ�������л����ŵ�ָ�����ļ���
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\JavaProject\\untitled\\src\\day13\\tt9.txt"));

            Person p = new Person();
            p.name = "С��";
            p.age = 15;

            out.writeObject(p);
            out.flush();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/**
 * ����ķ����л�
 */
    public static void testDeserialization(){
        //������������������ָ�����ļ��аѶ������л�����
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
