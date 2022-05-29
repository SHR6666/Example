package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 文件字节流的复制
 */
public class Test2 {
    public static void main(String[] args) {
//        Test2.copyFile("D:\\学习\\Java学习\\tt1.txt", "D:\\学习\\Java学习\\tt4.txt");
        Test2.copyFile("D:\\学习\\Java学习\\img.png", "D:\\学习\\Java学习\\1\\img.png");

    }

    /**
     * 复制文件到指定路径
     * @param inPath 源文件路径
     * @param outPath 复制到文件夹位置
     */
    public static void copyFile(String inPath, String outPath){
        try {
            FileInputStream in = new FileInputStream(inPath);  //读取的原文件
            FileOutputStream out = new FileOutputStream(outPath); //复制到哪里
            byte[] b = new byte[1024];

            int len = 0;

            while ((len = in.read(b)) != -1){
                out.write(b, 0 , len);  //参数1是写的缓冲，参数2是从数据哪个位置开始写，数组3是写的总长
            }
            out.flush();  //把写的数据刷到硬盘
            out.close(); //关闭流
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
