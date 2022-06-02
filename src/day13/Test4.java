package day13;

import java.io.*;

/**
 * 数据流，专门用来做基本数据类型的读写的
 */
public class Test4 {
    public static void main(String[] args) {
        Test4.testDataOutputStream();
        Test4.testDataInputStream();
    }

    /**
     * 数据输出流
     * 用数据输出流写到文件中的基本类型数据是乱码的，不可直接辩认出来，需要数据输入流来读取
     * BufferedOutputStream
     */
    public static void testDataOutputStream(){
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream("D:\\JavaProject\\untitled\\src\\day13\\tt8.txt"));
//            out.writeBoolean(true);
            out.writeDouble(1.35d);
//            out.writeInt(100);
            out.flush();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 数据输入流
     * 用数据输出流写到文件中的基本数据，是乱码的，不能直接辨认出来，需要数据输出流来读取
     * DataInputStream
     */
    public static void testDataInputStream(){
        try {
            DataInputStream in = new DataInputStream(new FileInputStream("D:\\JavaProject\\untitled\\src\\day13\\tt8.txt"));
            System.out.println(in.readDouble());

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
