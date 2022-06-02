package day13;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
//            Test.testBufferedInputStream();
//            Test.testBufferedOutputStream();
            Test.copyFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 缓冲字节流输入
     * BufferedInputStream
     */
    public static void testBufferedInputStream() throws Exception {
        //文件字节输入流对象
            FileInputStream in = new FileInputStream("D:\\JavaProject\\untitled\\src\\day12\\Test2.java");
        //把文件字节输入流放到缓冲字节流输入对象
        BufferedInputStream br  = new BufferedInputStream(in);
        byte[] b = new byte[10];
        int len;
        while((len = br.read(b)) != -1){
            System.out.println(new String(b, 0, len));
        }
        //关闭流时，最晚开的最早关，然后依次关
        br.close();
        in.close();
    }

    /**
     * 缓冲字节输出流
     * @throws FileNotFoundException
     */
    public static void testBufferedOutputStream() throws Exception {
        FileOutputStream out = new FileOutputStream("D:\\JavaProject\\untitled\\src\\day13\\tt1.txt");
        BufferedOutputStream bo = new BufferedOutputStream(out);

        String s = "woooooooooooow, nice";
        bo.write(s.getBytes());
        bo.flush();
        bo.close();
        out.close();
    }

    /**
     * 缓冲流实现文件的复制
     */
    public static void copyFile() throws Exception {
        //缓冲输入流
        BufferedInputStream br = new BufferedInputStream(new FileInputStream("D:\\JavaProject\\untitled\\src\\day13\\tt1.txt"));

        //缓冲输出流
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("D:\\JavaProject\\untitled\\src\\day13\\tt2.txt"));

        byte[] b = new byte[1024];
        int len = 0;  //设置一个读取到的长度，直到执行到br.read()的最后
        while((len = br.read(b)) != -1){
            bo.write(b, 0, len);    //写入内存中
        }
        bo.flush();
        bo.close();
        br.close();
    }
}
