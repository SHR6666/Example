package day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * �������·���ļ�������λ�ý��з���
 */
public class Test6 {
    public static void main(String[] args) {
//        Test6.testRandomAccessFileRead();
        Test6.testRandomAccessFile();
    }

    /**
     *������ļ�
     */
    public static void testRandomAccessFileRead() {
        try {
            RandomAccessFile ra = new RandomAccessFile("D:\\JavaProject\\untitled\\src\\day13\\tt10.txt", "r");
            ra.seek(0);  //���������
            byte[] b = new byte[1024];

            int len = 0;

            while ((len = ra.read(b)) != -1){
                System.out.println(new String(b, 0, len));
            }
            ra.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * ���д
     * RandomAccessFile
     */
    public static void testRandomAccessFile(){
        try {
            RandomAccessFile ra = new RandomAccessFile("D:\\JavaProject\\untitled\\src\\day13\\tt10.txt", "rw");
            ra.seek(0);  //����д����ʼ��
//            ra.seek(ra.length());  //����д����ʼ�㣬ra.length();������ļ������д����β��Ҳ����׷��

            ra.write("��ã�".getBytes());

            ra.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
