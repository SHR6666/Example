package day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����������
 */
public class Test {
    public static void main(String[] args) {
//        File f = new File("D:\\ѧϰ\\Javaѧϰ\\5��22�ջ���.txt");  //���ʱ�����f���� 5��22�ջ���.txt ����ļ�
////        File f1 = new File("D:\\ѧϰ","Javaѧϰ\\5��22�ջ���.txt");  //���f1Ҳ�� 5��22�ջ���.txt ����ļ�������ʹ����Խ���
//        File f1 = new File("D:\\ѧϰ\\Javaѧϰ");
//
//        System.out.println(f.getName());   //��ȡ�ļ���
//        System.out.println(f1.getName());  //��ȡ��ǰ�ļ�����
//
//        File f5 = new File("src/day12/Test.java");
//        System.out.println(f5.getPath());   //��ȡ�ļ���·��,�������·��
//        System.out.println(f5.getAbsolutePath());  //��ȡ�ļ������·��
//
//        f.renameTo(new File("D:\\ѧϰ\\Javaѧϰ\\5��22�ջ���1.txt"));  //���ļ����ļ���������
//
//        File f6 = new File("D:\\ѧϰ\\Javaѧϰ\\5��22�ջ���1.txt");
//        System.out.println(f6.exists());   //�ж��ļ������ļ����Ƿ����
//        System.out.println(f6.canRead());   //�ж��ļ��Ƿ�ɶ�
//        System.out.println(f6.canWrite());  //�ж��ļ��Ƿ��д
//
//        System.out.println(f6.isFile());  //�жϵ�ǰ��file�����Ƿ����ļ�
//        System.out.println(f6.isDirectory()); //�жϵ�ǰ��file�Ƿ����ļ��л�Ŀ¼
//
//        System.out.println(f6.lastModified());   //�����ϴ��޸ĵ�ʱ�� ���Ǻ�����
//        System.out.println(f6.length());   //�����ļ��ĳ���,��λ���ֽ���

//        File f8 = new File("D:\\ѧϰ\\Javaѧϰ\\tt1.txt");
//        System.out.println(f8.exists());
//        if (!f8.exists()){
//            try {
//                f8.createNewFile();     //�����µ��ļ�
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        f8.delete();  //ɾ������
//        File f9 = new File("D:\\ѧϰ\\Javaѧϰ\\cc");
//        f9.mkdirs();  //��������Ŀ¼

//        File f10 = new File("D:\\ѧϰ\\Javaѧϰ\\cc\\c");
//        f10.mkdirs(); //����������Դ����༶Ŀ¼

//        File f11 = new File("D:\\ѧϰ\\Javaѧϰ");
//        String[] fl = f11.list();   //���ص��ǵ�ǰ�ļ����Ӽ�������Ŀ¼���ļ�
//        for (String s: fl){
//            System.out.println(s);
//        }
//
//        File[] fs = f11.listFiles();  //�õ����ļ����Ӽ��ľ���·��
//        for (File s1 : fs){
//            System.out.println(s1);
//        }


        //����d����ѧϰ���ļ��У�������Ŀ¼���ļ�ȫ���������������۲㼶�����Ҫȫ����������,������test����
        //���ʹ�õݹ�ķ�����ʵ��
        File f12 = new File("D:\\ѧϰ\\Javaѧϰ");
        new Test().test(f12);
        

    }


    /**
     * �ݹ�����ļ�
     * @param file
     */
    public void test(File file){
        if(file.isFile()){
            System.out.println(file.getAbsolutePath() + "���ļ�");
        }else{
            System.out.println(file.getAbsolutePath() + "���ļ���");
            //�������ļ�������ļ���Ϳ��������ļ������ļ�
            File[] fs = file.listFiles(); //��ȡ��ǰ�ļ��������ļ��л����ļ���file����
            if (fs != null && fs.length > 0){
                for (File f : fs){
                    test(f); //�ݹ����

//                    if (f.isDirectory()){
//                        System.out.println(f.getAbsolutePath() + "���ļ���");
//                }else{
//                        System.out.println(f.getAbsolutePath() + "���ļ�");
//                        File[] fs1 = f.listFiles();
//                        if (fs1 != null && fs1.length > 0){
//                            for (File ff1: fs1){
//                                System.out.println(ff1.getAbsolutePath() + "���ļ�");
//                            }
//                        }
//                    }
                }
            }
        }
    }
}

