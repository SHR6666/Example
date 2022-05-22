package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("cd");
        list.add("ca");
        list.add("a");
        list.add("1");

        System.out.println(list);

        Collections.reverse(list);     //反转list中元素的顺序
        System.out.println(list);

        Collections.shuffle(list);     //对list集合元素进行随机排序
        System.out.println(list);

        Collections.sort(list);       //对list字典进行升序排序
        System.out.println(list);

        System.out.println(Collections.frequency(list, "x"));    //返回指定集合中元素出现的次数

        Collections.replaceAll(list, "a", "aa");     //使用新值替换掉list对象中的所有旧值
        System.out.println(list);

//        Collections.swap(list,0, 4);    //指定的list集合中的 i 处元素和 j 处元素进行交换
//        System.out.println(list);

//        System.out.println(Collections.max(list));
//        System.out.println(Collections.min(list));



        System.out.println("======下一段========");
        //===========这是下一段============
        Student s1 = new Student(12,"张一");
        Student s2 = new Student(11,"张二");
        Student s3 = new Student(10,"张三");
        Student s4 = new Student( 9,"张四");

        List<Student> stus = new ArrayList<Student>();
        stus.add(s1);
        stus.add(s2);
        stus.add(s3);
        stus.add(s4);

        Student s = Collections.max(stus, new Student());
        System.out.println(s.name +","+ s.age);

//        for (Student stu : stus) {
//            System.out.println(stu.name + ",年龄" + stu.age);
//        }
//
//        Collections.sort(stus, new Student());
//        System.out.println("==========");
//        for (Student stu : stus) {
//            System.out.println(stu.name + ",年龄" + stu.age);
//        }
    }
}

class Student implements Comparator<Student>{
    int age;
    String name;

    public Student(){

    }
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compare(Student o1, Student o2) {     //根据年龄升序排列对象
        if (o1.age > o2.age){
            return 1;
        } else if (o1.age < o2.age) {
            return -1;
        }else {
            return 0;
        }
    }
}
