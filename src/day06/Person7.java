package day06;

/**
 * 一个JavaBean
 * 私有属性和对应一个setXxx和一个getXxx方法
 */

public class Person7 {
    private String name;
    private int sex;   //0为男，1为女
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    public void setName(String name){      //set 赋值，get取值
//        this.name = name;
//    }
//
//    public String getName(){
//        return this.name;
//    }
//
//    public void setSex(int sex){
//        this.sex = sex;
//    }
//    public int getSex(){
//        return this.sex;
//    }
//
//    public void setAge(int age){
//        this.age = age;
//    }
//
//    public int getAge(){
//        return this.age;
//    }

}
