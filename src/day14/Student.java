package day14;

public class Student extends Person implements Study, Move{
    public Student(){
        System.out.println("调用的是public Student()");
    }
    public Student(String school){
        this.school = school;
        System.out.println("调用的是public Student(String school)");
    }
    private Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("调用的是private Student(String name, int age)");
    }

    public String school;
    private String privateFile;

    public void showInfo(){
        System.out.println("学校是：" + this.school);
    }

    @Override
    public void studyInfo() {
        System.out.println("学习的是中学的知识");
    }

    @Override
    public void moveType() {
        System.out.println("骑自行车上学");
    }

    private void test(String name){
        System.out.println("这是私有方法");
    }

    public String getSchool(){
        return this.school;
    }

    public void setInfo(String name, String school){
        this.name = name;
        this.school = school;
        System.out.println("这是setInfo(String name, String school)方法");
    }

    public void setInfo(int age){
        System.out.println("这是setInfo(int age)方法");
    }
}
