package Login;

/**
 * ���һ��ְԱ�� Employee��Ҫ�󣺾��г�Ա�������� name(String)���Ա� sex(char)��
 * ���� age(int)�����г�Ա�������ҽ��� String introduction()��ְԱ����С����Ҫ��Ϊ 20
 * �ꡣ��д������ Test3������ְԱ��Ķ��� tc������ introduction �����ĵ��ã���ʾְԱ
 * �������Ƿ����Ҫ��
 * ��ʾ��Ҫ����ְԱ����С����Ҫ�󣬿�ͨ�������Եķ�װ��ʵ�֡�
 */
public class Test3{
    public static void main(String[] args) {
        Employee tc = new Employee();
        tc.setName("С��");
        tc.setSex('��');
        tc.setAge(20);
        System.out.println(tc.introduction());
    }

}
