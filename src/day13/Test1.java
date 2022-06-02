package day13;

import java.io.*;

/**
 * »º³å×Ö·ûÁ÷
 */
public class Test1 {
    public static void main(String[] args) {
        try {
//            Test1.testBufferedReader();
//            Test1.testBufferedWriter();
            Test1.copyFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * BufferedReader  »º³å×Ö·ûÊäÈëÁ÷
     */
    public static void testBufferedReader() throws Exception {
        FileReader r = new FileReader("D:\\JavaProject\\untitled\\src\\day13\\tt1.txt");
        BufferedReader br = new BufferedReader(r);

        char[] c = new char[1024];

        int len = 0;

        while ((len = br.read(c)) != -1) {
            System.out.println(new String(c, 0, len));
        }
        br.close();
        r.close();
    }

    /**
     * BufferedWriter »º³å×Ö·ûÊä³öÁ÷
     */
    public static void testBufferedWriter() throws IOException {
        FileWriter fw = new FileWriter("D:\\JavaProject\\untitled\\src\\day13\\tt3.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        String s = "Very Prefect";
        bw.write(s);

        bw.flush();
        bw.close();
        fw.close();
    }

    /**
     * »º³å×Ö·ûÁ÷¸´ÖÆÎÄ¼þ
     */
    public static void copyFile() throws Exception {
        BufferedReader br = new BufferedReader(new  FileReader("D:\\JavaProject\\untitled\\src\\day13\\tt3.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaProject\\untitled\\\\src\\day13\\tt4.txt"));

        char[] c = new char[1024];
        int len =0;
        while ((len = br.read(c)) != -1){
            bw.write(c, 0, len);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
