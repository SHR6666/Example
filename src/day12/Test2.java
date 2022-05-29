package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * �ļ��ֽ����ĸ���
 */
public class Test2 {
    public static void main(String[] args) {
//        Test2.copyFile("D:\\ѧϰ\\Javaѧϰ\\tt1.txt", "D:\\ѧϰ\\Javaѧϰ\\tt4.txt");
        Test2.copyFile("D:\\ѧϰ\\Javaѧϰ\\img.png", "D:\\ѧϰ\\Javaѧϰ\\1\\img.png");

    }

    /**
     * �����ļ���ָ��·��
     * @param inPath Դ�ļ�·��
     * @param outPath ���Ƶ��ļ���λ��
     */
    public static void copyFile(String inPath, String outPath){
        try {
            FileInputStream in = new FileInputStream(inPath);  //��ȡ��ԭ�ļ�
            FileOutputStream out = new FileOutputStream(outPath); //���Ƶ�����
            byte[] b = new byte[1024];

            int len = 0;

            while ((len = in.read(b)) != -1){
                out.write(b, 0 , len);  //����1��д�Ļ��壬����2�Ǵ������ĸ�λ�ÿ�ʼд������3��д���ܳ�
            }
            out.flush();  //��д������ˢ��Ӳ��
            out.close(); //�ر���
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
