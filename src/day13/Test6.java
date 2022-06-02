package day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * 程序可以路过文件的任意位置进行访问
 */
public class Test6 {
    public static void main(String[] args) {
//        Test6.testRandomAccessFileRead();
        Test6.testRandomAccessFile();
    }

    /**
     *随机读文件
     */
    public static void testRandomAccessFileRead() {
        try {
            RandomAccessFile ra = new RandomAccessFile("D:\\JavaProject\\untitled\\src\\day13\\tt10.txt", "r");
            ra.seek(0);  //设置起读点
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
     * 随机写
     * RandomAccessFile
     */
    public static void testRandomAccessFile(){
        try {
            RandomAccessFile ra = new RandomAccessFile("D:\\JavaProject\\untitled\\src\\day13\\tt10.txt", "rw");
            ra.seek(0);  //设置写的起始点
//            ra.seek(ra.length());  //设置写的起始点，ra.length();代表从文件的最后写到结尾，也就是追加

            ra.write("你好！".getBytes());

            ra.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
