package day10;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("b");   //第一个索引下标是【0】
        list.add("d");
        list.add("c");
        list.add("a");
        list.add("d");
        System.out.println(list);
        System.out.println(list.get(4));  //通过索引来访问元素中指定位置的集合

        list.add(1,"f");
        System.out.println(list);

        List<String> l = new ArrayList<>();
        l.add("123");
        l.add("456");

        list.addAll(2, l);    //在指定索引的下标的位置插入集合

        System.out.println(list);
        System.out.println(list.indexOf("d"));   //获取指定元素在什么集合中第一次出现的所有下标
        System.out.println(list.lastIndexOf("d"));//获取指定元素在什么集合中最后次出现的所有下标

        list.remove(2);
        System.out.println(list);   //根据指定的索引下标移除元素

        list.set(1, "fff");        //根据指定索引下标修改元素
        System.out.println(list);

        List<String> ls = list.subList(2, 4);     //可表示为[2,4)，根据索引下标截取一段元素数据，形成一个新的集合
        System.out.println(ls);
    }
}
