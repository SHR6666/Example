package Login;

/**
 * 设计一个职员类 Employee，要求：具有成员变量姓名 name(String)、性别 sex(char)、
 * 年龄 age(int)；具有成员方法自我介绍 String introduction()；职员的最小年龄要求为 20
 * 岁。编写测试类 Test3，创建职员类的对象 tc，进行 introduction 方法的调用，显示职员
 * 的年龄是否符合要求。
 * 提示：要满足职员的最小年龄要求，可通过对属性的封装来实现。
 */
public class Test3{
    public static void main(String[] args) {
        Employee tc = new Employee();
        tc.setName("小王");
        tc.setSex('男');
        tc.setAge(20);
        System.out.println(tc.introduction());
    }

}
