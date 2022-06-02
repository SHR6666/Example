package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * 标准输入输出流
 */
public class Test3 {
    public static void main(String[] args) {
        try {
//            Test3.testSystemIn();
            Test3.testSystemOut();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 标准输入流
     *
     * @throws Exception
     */
    public static void testSystemIn() throws Exception {
        //创建一个接收键盘输入数据的输出流
        InputStreamReader is = new InputStreamReader(System.in);

        //把输出流放到缓冲流里
        BufferedReader br = new BufferedReader(is);

        String s = "";  //接收键盘输入的数据
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();
        is.close();
    }

    /**
     * 把输入的内容输出到指定的文件中,当接收到字符串over就结束运行
     */
    public static void testSystemOut() throws Exception {
        //创建一个接收键盘输入数据的输入流
        InputStreamReader is = new InputStreamReader(System.in);
        //把输入流放到缓冲流中
        BufferedReader br = new BufferedReader(is);

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaProject\\untitled\\src\\day13\\tt7.txt"));
        String s = "";

        while((s = br.readLine()) != null){
            if (s.equals("over")){break;}
            bw.write(s);
        }
        bw.flush();
        bw.close();
        br.close();
        is.close();
    }
}