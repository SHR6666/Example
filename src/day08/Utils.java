package day08;

public class Utils {
    //ÅÐ¶ÏÒ»¸ö×Ö·û´®ÊÇ·ñÊÇ¿Õ×Ö·û´®
    public static boolean isEmpty(String s){
        boolean flag = false;
        if (s != null && !s.equals("")){
            flag = true;
        }
        return flag;
    }
}
