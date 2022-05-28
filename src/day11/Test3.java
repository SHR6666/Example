package day11;

public class Test3 {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        spring.showInfo();

        Season summer = Season.SUMMER;
        summer.showInfo();

        Season spring1 = Season.SPRING;
        System.out.println(spring.equals(spring1));
        spring1.test();
    }
}
enum Season implements ITest{     //枚举类型
    SPRING("春天", "春暖花开"),  //此处相当于是调用有参构造private Season (String name, String desc)
    SUMMER("夏天", "酷暑难耐"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "千里冰封");
    private final String name;
    private final String desc;

    private Season (String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public void showInfo(){
        System.out.println(this.name + "：" + this.desc);
    }

    @Override
    public void test() {
        System.out.println("这是实现的ITest接口的test方法");
    }
}

interface ITest{
    void test();
}
