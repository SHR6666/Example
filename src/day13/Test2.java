package day13;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        //所有文件都是有编码格式的
        try {
//            Test2.testBufferedInputStreamReader();
            Test2.testBufferedOutputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 转换输入流
     */
    public static void testBufferedInputStreamReader() throws Exception {
        FileInputStream fs = new FileInputStream("D:\\JavaProject\\untitled\\\\src\\day13\\tt5.txt");

        //把字节流转换为字符流
        InputStreamReader ir = new InputStreamReader(fs, "GBK");  //参数一是字节流，参数二是编码

        char[] c = new char[100];
        int len = 0;
        while((len = ir.read(c)) != -1){
            System.out.println(new String(c, 0, len));
        }
        ir.close();
        fs.close();
    }

    /**
     * 转换字节输出流为字节输入流
     * @throws Exception
     */
    public static void testBufferedOutputStream() throws Exception {
        FileOutputStream fo = new FileOutputStream("D:\\JavaProject\\untitled\\\\src\\day13\\tt6.txt");
        OutputStreamWriter ow = new OutputStreamWriter(fo, "UTF-8");

        String s = "这个是Text2的FileNotFoundException测试";
        ow.write(s);
        ow.flush();
        ow.close();
        fo.close();
    }
}
