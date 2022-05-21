package day10;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
//        Set set = new HashSet();
        Set<Object> set = new HashSet<Object>();  //与上面的等价
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
        //使用迭代器遍历集合
        Iterator it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        //for each迭代集合
        for (Object obj: set) {  //这个意思是说把每一个set的值取出来赋值给obj，直到循环set的所有值
            System.out.println(obj);
        }

        System.out.println(set.size()); //获取集合的元素个数

        //如果想让集合只能存同样的对象，怎么做
        //使用泛形
        Set<String> set1 = new HashSet<String>();  //比如指定String为集合的泛形，那么这个集合就不能存String以外的数据
            set1.add("abc");

    }
}
