package day08;

public class Utils {
    //�ж�һ���ַ����Ƿ��ǿ��ַ���
    public static boolean isEmpty(String s){
        boolean flag = false;
        if (s != null && !s.equals("")){
            flag = true;
        }
        return flag;
    }
}
