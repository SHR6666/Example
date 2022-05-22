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

        Collections.reverse(list);     //��תlist��Ԫ�ص�˳��
        System.out.println(list);

        Collections.shuffle(list);     //��list����Ԫ�ؽ����������
        System.out.println(list);

        Collections.sort(list);       //��list�ֵ������������
        System.out.println(list);

        System.out.println(Collections.frequency(list, "x"));    //����ָ��������Ԫ�س��ֵĴ���

        Collections.replaceAll(list, "a", "aa");     //ʹ����ֵ�滻��list�����е����о�ֵ
        System.out.println(list);

//        Collections.swap(list,0, 4);    //ָ����list�����е� i ��Ԫ�غ� j ��Ԫ�ؽ��н���
//        System.out.println(list);

//        System.out.println(Collections.max(list));
//        System.out.println(Collections.min(list));



        System.out.println("======��һ��========");
        //===========������һ��============
        Student s1 = new Student(12,"��һ");
        Student s2 = new Student(11,"�Ŷ�");
        Student s3 = new Student(10,"����");
        Student s4 = new Student( 9,"����");

        List<Student> stus = new ArrayList<Student>();
        stus.add(s1);
        stus.add(s2);
        stus.add(s3);
        stus.add(s4);

        Student s = Collections.max(stus, new Student());
        System.out.println(s.name +","+ s.age);

//        for (Student stu : stus) {
//            System.out.println(stu.name + ",����" + stu.age);
//        }
//
//        Collections.sort(stus, new Student());
//        System.out.println("==========");
//        for (Student stu : stus) {
//            System.out.println(stu.name + ",����" + stu.age);
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
    public int compare(Student o1, Student o2) {     //���������������ж���
        if (o1.age > o2.age){
            return 1;
        } else if (o1.age < o2.age) {
            return -1;
        }else {
            return 0;
        }
    }
}
