package day14;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Class clazz = p.getClass();   //clazz ����Ͱ���p������Person���������Ϣ

        Class c0 = Person.class;  //ͨ������.class����ָ�����Classʵ��
        Class c1 = p.getClass();  //ͨ��һ�����ʵ�������getClass()��������ȡ��Ӧʵ���������Classʵ��

        try {
            //ͨ��Class�ľ�̬����.forName()����ȡһ�����Classʵ��
            //forName(String className)������������Ҫ��ȡ��classʵ�������ȫ·��������.������
            Class c2 = Class.forName("day14.Person");  //����ǻ�ȡʵ���ĳ��÷���
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}