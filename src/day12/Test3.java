package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
//        Test3.testFileReader("D:\\学习\\Java学习\\tt1.txt");
//        Test3.testFileWriter("Hello World", "D:\\学习\\Java学习\\tt5.txt.txt");
        Test3.copyFile("D:\\学习\\Java学习\\tt5.txt.txt", "D:\\学习\\Java学习\\1\\tt5.txt.txt");
    }

    /**
     * 文件字符的输入流
     * @param inPath
     */
    public static void testFileReader(String inPath){
        try {
            FileReader fr = new FileReader(inPath);   //创建文件字符输入流对象

            char[] c = new char[10];  //创建临时存放数据的数组

            int len = 0;   //定义一个输入流的读取长度

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
     * 文件字符输出流
     * @param text  写输出的内容
     * @param outPath  输出文件
     */
    public static void testFileWriter(String text, String outPath){   //写入数据
        try {
            FileWriter fw = new FileWriter(outPath);
            fw.write(text);   //写到内存中
            fw.flush();  //把内存的数据刷入硬盘
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param inPath  原文件
     * @param outPath  复制后的文件
     */
    public static void copyFile(String inPath, String outPath){
        try {
            FileReader fr = new FileReader(inPath);
            FileWriter fw = new FileWriter(outPath);

            char[] c = new char[100];

            int len = 0;
            while ((len = fr.read(c)) != -1){  //读取数据
                fw.write(c, 0, len);   //写入数据到内存
            }
            fw.flush();
            fw.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
