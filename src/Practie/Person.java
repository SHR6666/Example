package Practie;

public class Person {
    //��������
    private int age;

    public void setAge(int i){
        age = i;
        if (i >= 0 & i <= 130){
            System.out.println(i);
        }else {
            System.out.println("������������ڴ˲��ڷ�Χ��");
        }
    }

    public int getAge() {
        return age;
    }
}
