package day10;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
//        Set set = new HashSet();
        Set<Object> set = new HashSet<Object>();  //������ĵȼ�
//        set.add(1);
//        set.add("a");
//        System.out.println(set);
//
//        set.remove(1);
//        System.out.println(set);
//        System.out.println(set.contains(1));

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        System.out.println(set);
        //ʹ�õ�������������
        Iterator it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        //for each��������
        for (Object obj: set) {  //�����˼��˵��ÿһ��set��ֵȡ������ֵ��obj��ֱ��ѭ��set������ֵ
            System.out.println(obj);
        }

        System.out.println(set.size()); //��ȡ���ϵ�Ԫ�ظ���

        //������ü���ֻ�ܴ�ͬ���Ķ�����ô��
        //ʹ�÷���
        Set<String> set1 = new HashSet<String>();  //����ָ��StringΪ���ϵķ��Σ���ô������ϾͲ��ܴ�String���������
            set1.add("abc");

    }
}
