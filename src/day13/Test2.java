package day13;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        //�����ļ������б����ʽ��
        try {
//            Test2.testBufferedInputStreamReader();
            Test2.testBufferedOutputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * ת��������
     */
    public static void testBufferedInputStreamReader() throws Exception {
        FileInputStream fs = new FileInputStream("D:\\JavaProject\\untitled\\\\src\\day13\\tt5.txt");

        //���ֽ���ת��Ϊ�ַ���
        InputStreamReader ir = new InputStreamReader(fs, "GBK");  //����һ���ֽ������������Ǳ���

        char[] c = new char[100];
        int len = 0;
        while((len = ir.read(c)) != -1){
            System.out.println(new String(c, 0, len));
        }
        ir.close();
        fs.close();
    }

    /**
     * ת���ֽ������Ϊ�ֽ�������
     * @throws Exception
     */
    public static void testBufferedOutputStream() throws Exception {
        FileOutputStream fo = new FileOutputStream("D:\\JavaProject\\untitled\\\\src\\day13\\tt6.txt");
        OutputStreamWriter ow = new OutputStreamWriter(fo, "UTF-8");

        String s = "�����Text2��FileNotFoundException����";
        ow.write(s);
        ow.flush();
        ow.close();
        fo.close();
    }
}
