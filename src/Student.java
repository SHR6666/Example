/**
 * 学生类
 */
public class Student {
    public String name;   //姓名
    public int age;       //年龄
    public String course; //课程
    public String hobby;  //兴趣

    /**
     * 显示学生的个人信息
     */
    public void showInfo(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("课程："+course);
        System.out.println("兴趣："+hobby);
    }

}
