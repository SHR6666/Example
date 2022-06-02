package day13;

import java.io.*;

/**
 * ��������ר�������������������͵Ķ�д��
 */
public class Test4 {
    public static void main(String[] args) {
        Test4.testDataOutputStream();
        Test4.testDataInputStream();
    }

    /**
     * ���������
     * �����������д���ļ��еĻ�����������������ģ�����ֱ�ӱ��ϳ�������Ҫ��������������ȡ
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
     * ����������
     * �����������д���ļ��еĻ������ݣ�������ģ�����ֱ�ӱ��ϳ�������Ҫ�������������ȡ
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
