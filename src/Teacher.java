/**
 * 教师类
 */
public class Teacher {
    public String name;     //姓名
    public String career;   //专业
    public String teach;    //授课内容
    public int schoolAge;   //教龄

    public void showInfo(){
        System.out.println("姓名："+name);
        System.out.println("专业："+career);
        System.out.println("授课："+teach);
        System.out.println("教龄："+schoolAge);
    }
}
