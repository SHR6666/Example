package Login;

/**
 * ���һ��ְԱ�� Employee��Ҫ�󣺾��г�Ա�������� name(String)���Ա� sex(char)��
 *  * ���� age(int)�����г�Ա�������ҽ��� String introduction()��ְԱ����С����Ҫ��Ϊ 20
 *  * �ꡣ��д������ Test3������ְԱ��Ķ��� tc������ introduction �����ĵ��ã���ʾְԱ
 *  * �������Ƿ����Ҫ��
 *  * ��ʾ��Ҫ����ְԱ����С����Ҫ�󣬿�ͨ�������Եķ�װ��ʵ�֡�
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
        return "�ҽ�" + name + "���Ա�" + sex + ", ���䣺" + age;
    }
}
