package Practie;

public class Person {
    //定义年龄
    private int age;

    public void setAge(int i){
        age = i;
        if (i >= 0 & i <= 130){
            System.out.println(i);
        }else {
            System.out.println("您输入的年龄在此不在范围中");
        }
    }

    public int getAge() {
        return age;
    }
}
