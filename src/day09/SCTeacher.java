package day09;

/**
 * 描述一个会唱歌厨子是老师的类
 */
public class SCTeacher extends Person1 implements Cooking, Sing{
    String course; //教的科目
    public void setInfo(){
        super.age = 17;
        super.name = "王富贵";
        super.sex = 1;

        this.course = "数学";
    }
    @Override
    public void showInfo() {
        System.out.println("会唱歌厨子是老师的信息是：");
        System.out.println(super.age);
        System.out.println(super.name);
        System.out.println(super.sex);
        System.out.println(this.course);
    }

    @Override
    public void fly() {
        System.out.println(super.name + "老师拿手的厨艺是炒菜");
    }

    @Override
    public void singing() {
        System.out.println(super.name+"老师擅长美声唱法");
    }
}
