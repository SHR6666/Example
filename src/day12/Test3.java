package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
//        Test3.testFileReader("D:\\ѧϰ\\Javaѧϰ\\tt1.txt");
//        Test3.testFileWriter("Hello World", "D:\\ѧϰ\\Javaѧϰ\\tt5.txt.txt");
        Test3.copyFile("D:\\ѧϰ\\Javaѧϰ\\tt5.txt.txt", "D:\\ѧϰ\\Javaѧϰ\\1\\tt5.txt.txt");
    }

    /**
     * �ļ��ַ���������
     * @param inPath
     */
    public static void testFileReader(String inPath){
        try {
            FileReader fr = new FileReader(inPath);   //�����ļ��ַ�����������

            char[] c = new char[10];  //������ʱ������ݵ�����

            int len = 0;   //����һ���������Ķ�ȡ����

            while ((len = fr.read(c)) != -1){
                System.out.println(new String(c, 0, len));
//                fr.read(c, 0, len);
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * �ļ��ַ������
     * @param text  д���������
     * @param outPath  ����ļ�
     */
    public static void testFileWriter(String text, String outPath){   //д������
        try {
            FileWriter fw = new FileWriter(outPath);
            fw.write(text);   //д���ڴ���
            fw.flush();  //���ڴ������ˢ��Ӳ��
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param inPath  ԭ�ļ�
     * @param outPath  ���ƺ���ļ�
     */
    public static void copyFile(String inPath, String outPath){
        try {
            FileReader fr = new FileReader(inPath);
            FileWriter fw = new FileWriter(outPath);

            char[] c = new char[100];

            int len = 0;
            while ((len = fr.read(c)) != -1){  //��ȡ����
                fw.write(c, 0, len);   //д�����ݵ��ڴ�
            }
            fw.flush();
            fw.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
