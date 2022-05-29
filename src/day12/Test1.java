package day12;
/**
 * �ļ��ֽ��������
 */

import java.io.*;

public class Test1 {
    public static void main(String[] args){
//        Test1.testFileInputStream();
        Test1.testFileOutputStream();
    }

    /**
     * �ļ��ֽ�������FileInputStream
     */
    public static void testFileInputStream(){
        try {
            FileInputStream in = new FileInputStream("D:\\ѧϰ\\Javaѧϰ\\tt1.txt");
            byte[] b = new byte[1024];   //����һ��byte������ն�ȡ�ļ�������
            int len = 0;
//            in.read(b);   //in.read��һ������ֵ�����ض�ȡ���ֽ����������ȡ����ˣ������ȡ�����һ�����ݻ������һ����һ�������ʱ�򷵻�ֵ����-1
            //Ҳ����ζ�Ŷ�ȡ�����
            while ((len = in.read(b)) != -1){
                System.out.println(new String(b,0,len));
                //new String(b,0,len) ����1�������ݵ����飬����2�Ǵӻ������ݵ�������ĸ�λ�ÿ�ʼת�����ַ�����ȡ������3�Ƕ�ȡ�ĳ���
            }

            in.close();    //����ʹ��֮��һ��Ҫ�ر�
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * �ļ��ֽ�������FileOutputStream
     */
    public static void testFileOutputStream(){
        try {
            FileOutputStream out = new FileOutputStream("D:\\ѧϰ\\Javaѧϰ\\tt4.txt"); //ָ����tt4��������
            String str = "hello world";
            out.write(str.getBytes());  //������д���ڴ���
            out.flush();  //ˢ���ڴ��е����ݵ�Ӳ����
            out.close();  //�ر���
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
