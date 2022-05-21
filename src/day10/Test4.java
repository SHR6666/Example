package day10;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test4 {
    public static void main(String[] args) {
//        //TreeSet����Ȼ����
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
//        //�������ı���
//        Iterator<Integer> it = set.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        //for each�������ϣ��Ƽ�ʹ������
//        for (Integer i: set) {
//            System.out.println(i);
//        }

        Person p1 = new Person(20, "����");
        Person p2 = new Person(21, "��ǿ");
        Person p3 = new Person(25, "lucy");
        Person p4 = new Person(16, "ǿǿ");

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

class Person implements Comparator<Person> {   //��������Ѷ���浽TreeSet�в��Ұ�����������
    int age;
    String name;
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }


    @Override
    public int compare(Person o1, Person o2) {    //������������
        if (o1.age > o2.age){
            return 1;
        } else if (o1.age < o2.age) {
            return -1;
        }else {
            return 0;
        }
    }
}
