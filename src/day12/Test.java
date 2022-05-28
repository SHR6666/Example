package day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 体验数据流
 */
public class Test {
    public static void main(String[] args) {
//        File f = new File("D:\\学习\\Java学习\\5月22日会议.txt");  //这个时候对象f就是 5月22日会议.txt 这个文件
////        File f1 = new File("D:\\学习","Java学习\\5月22日会议.txt");  //这个f1也是 5月22日会议.txt 这个文件，这种使用相对较少
//        File f1 = new File("D:\\学习\\Java学习");
//
//        System.out.println(f.getName());   //获取文件名
//        System.out.println(f1.getName());  //获取当前文件夹名
//
//        File f5 = new File("src/day12/Test.java");
//        System.out.println(f5.getPath());   //获取文件的路径,就是相对路径
//        System.out.println(f5.getAbsolutePath());  //获取文件的相对路径
//
//        f.renameTo(new File("D:\\学习\\Java学习\\5月22日会议1.txt"));  //给文件或文件夹重命名
//
//        File f6 = new File("D:\\学习\\Java学习\\5月22日会议1.txt");
//        System.out.println(f6.exists());   //判断文件或者文件夹是否存在
//        System.out.println(f6.canRead());   //判断文件是否可读
//        System.out.println(f6.canWrite());  //判断文件是否可写
//
//        System.out.println(f6.isFile());  //判断当前的file对象是否是文件
//        System.out.println(f6.isDirectory()); //判断当前的file是否是文件夹或目录
//
//        System.out.println(f6.lastModified());   //返回上次修改的时间 ，是毫秒数
//        System.out.println(f6.length());   //返回文件的长度,单位是字节数

//        File f8 = new File("D:\\学习\\Java学习\\tt1.txt");
//        System.out.println(f8.exists());
//        if (!f8.exists()){
//            try {
//                f8.createNewFile();     //创建新的文件
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        f8.delete();  //删除操作
//        File f9 = new File("D:\\学习\\Java学习\\cc");
//        f9.mkdirs();  //创建单层目录

//        File f10 = new File("D:\\学习\\Java学习\\cc\\c");
//        f10.mkdirs(); //这个方法可以创建多级目录

//        File f11 = new File("D:\\学习\\Java学习");
//        String[] fl = f11.list();   //返回的是当前文件的子集，包括目录和文件
//        for (String s: fl){
//            System.out.println(s);
//        }
//
//        File[] fs = f11.listFiles();  //得到当文件的子集的绝对路径
//        for (File s1 : fs){
//            System.out.println(s1);
//        }


        //遍历d盘下学习的文件夹，把所有目录与文件全部遍历出来，无论层级多深，都要全部遍历出来,并调用test方法
        //这个使用递归的方法来实现
        File f12 = new File("D:\\学习\\Java学习");
        new Test().test(f12);
        

    }


    /**
     * 递归遍历文件
     * @param file
     */
    public void test(File file){
        if(file.isFile()){
            System.out.println(file.getAbsolutePath() + "是文件");
        }else{
            System.out.println(file.getAbsolutePath() + "是文件夹");
            //如是是文件夹这个文件里就可能有子文件或者文件
            File[] fs = file.listFiles(); //获取当前文件夹下子文件夹或者文件的file对象
            if (fs != null && fs.length > 0){
                for (File f : fs){
                    test(f); //递归调用

//                    if (f.isDirectory()){
//                        System.out.println(f.getAbsolutePath() + "是文件夹");
//                }else{
//                        System.out.println(f.getAbsolutePath() + "是文件");
//                        File[] fs1 = f.listFiles();
//                        if (fs1 != null && fs1.length > 0){
//                            for (File ff1: fs1){
//                                System.out.println(ff1.getAbsolutePath() + "是文件");
//                            }
//                        }
//                    }
                }
            }
        }
    }
}

