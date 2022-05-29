package day12;
/**
 * 文件字节流的体会
 */

import java.io.*;

public class Test1 {
    public static void main(String[] args){
//        Test1.testFileInputStream();
        Test1.testFileOutputStream();
    }

    /**
     * 文件字节输入流FileInputStream
     */
    public static void testFileInputStream(){
        try {
            FileInputStream in = new FileInputStream("D:\\学习\\Java学习\\tt1.txt");
            byte[] b = new byte[1024];   //设置一个byte数组接收读取文件的内容
            int len = 0;
//            in.read(b);   //in.read有一个返回值，返回读取的字节数，如果读取完成了，如果读取到最后一个数据还会身后一个读一个，这个时候返回值就是-1
            //也是意味着读取完毕了
            while ((len = in.read(b)) != -1){
                System.out.println(new String(b,0,len));
                //new String(b,0,len) 参数1缓冲数据的数组，参数2是从缓冲数据的数组的哪个位置开始转换成字符串读取，参数3是读取的长度
            }

            in.close();    //流在使用之后一定要关闭
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件字节输入流FileOutputStream
     */
    public static void testFileOutputStream(){
        try {
            FileOutputStream out = new FileOutputStream("D:\\学习\\Java学习\\tt4.txt"); //指定向tt4输入数据
            String str = "hello world";
            out.write(str.getBytes());  //把数据写到内存中
            out.flush();  //刷新内存中的数据到硬盘中
            out.close();  //关闭流
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
