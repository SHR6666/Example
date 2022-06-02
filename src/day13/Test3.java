package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * ��׼���������
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
     * ��׼������
     *
     * @throws Exception
     */
    public static void testSystemIn() throws Exception {
        //����һ�����ռ����������ݵ������
        InputStreamReader is = new InputStreamReader(System.in);

        //��������ŵ���������
        BufferedReader br = new BufferedReader(is);

        String s = "";  //���ռ������������
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();
        is.close();
    }

    /**
     * ����������������ָ�����ļ���,�����յ��ַ���over�ͽ�������
     */
    public static void testSystemOut() throws Exception {
        //����һ�����ռ����������ݵ�������
        InputStreamReader is = new InputStreamReader(System.in);
        //���������ŵ���������
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