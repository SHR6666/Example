package day06;

public class Person {
    private int age;
    public void printAge(){
        System.out.println("�����ǣ�"+age);
    }

    public void setAge(int a){
        if (a >= 0 & a <= 150){
            age = a;
        }else {
            System.out.println("�������������ڴ���");
        }
    }
}
