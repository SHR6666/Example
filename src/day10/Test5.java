package day10;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("b");   //��һ�������±��ǡ�0��
        list.add("d");
        list.add("c");
        list.add("a");
        list.add("d");
        System.out.println(list);
        System.out.println(list.get(4));  //ͨ������������Ԫ����ָ��λ�õļ���

        list.add(1,"f");
        System.out.println(list);

        List<String> l = new ArrayList<>();
        l.add("123");
        l.add("456");

        list.addAll(2, l);    //��ָ���������±��λ�ò��뼯��

        System.out.println(list);
        System.out.println(list.indexOf("d"));   //��ȡָ��Ԫ����ʲô�����е�һ�γ��ֵ������±�
        System.out.println(list.lastIndexOf("d"));//��ȡָ��Ԫ����ʲô���������γ��ֵ������±�

        list.remove(2);
        System.out.println(list);   //����ָ���������±��Ƴ�Ԫ��

        list.set(1, "fff");        //����ָ�������±��޸�Ԫ��
        System.out.println(list);

        List<String> ls = list.subList(2, 4);     //�ɱ�ʾΪ[2,4)�����������±��ȡһ��Ԫ�����ݣ��γ�һ���µļ���
        System.out.println(ls);
    }
}
