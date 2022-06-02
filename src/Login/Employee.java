package Login;

/**
 * 设计一个职员类 Employee，要求：具有成员变量姓名 name(String)、性别 sex(char)、
 *  * 年龄 age(int)；具有成员方法自我介绍 String introduction()；职员的最小年龄要求为 20
 *  * 岁。编写测试类 Test3，创建职员类的对象 tc，进行 introduction 方法的调用，显示职员
 *  * 的年龄是否符合要求。
 *  * 提示：要满足职员的最小年龄要求，可通过对属性的封装来实现。
 */
public class Employee {
    private String name;
    private char sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String introduction() {
        return "我叫" + name + "，性别" + sex + ", 年龄：" + age;
    }
}
