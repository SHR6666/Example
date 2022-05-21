package day10;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test4 {
    public static void main(String[] args) {
//        //TreeSet的自然排序
//        Set<Integer> set = new TreeSet<>();
//        set.add(5);
//        set.add(2);
//        set.add(4);
//        set.add(3);
//        System.out.println(set);
//        set.remove(5);
//        set.contains(3);
////        set.clear();
//
//        //迭代器的遍历
//        Iterator<Integer> it = set.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        //for each迭代集合，推荐使用这种
//        for (Integer i: set) {
//            System.out.println(i);
//        }

        Person p1 = new Person(20, "李四");
        Person p2 = new Person(21, "王强");
        Person p3 = new Person(25, "lucy");
        Person p4 = new Person(16, "强强");

        Set<Person> set = new TreeSet<Person>(new Person(0,""));
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        for (Person p: set) {
            System.out.println(p.name + "    " + p.age);
        }
    }
}

class Person implements Comparator<Person> {   //根据年龄把对象存到TreeSet中并且按照年龄排序
    int age;
    String name;
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }


    @Override
    public int compare(Person o1, Person o2) {    //年龄正序排列
        if (o1.age > o2.age){
            return 1;
        } else if (o1.age < o2.age) {
            return -1;
        }else {
            return 0;
        }
    }
}
