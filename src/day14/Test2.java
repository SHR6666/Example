package day14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test2 {
    public static void main(String[] args) {
        ITestDemo test = new TestDemoImpl();
        test.test1();
        test.test2();
        System.out.println("====================");
        /**
         * ����
         * ��ִ��test1()��test2()����ʱ��Ҫ����һЩ����
         * ��ִ�з���ǰ��ӡtest1��test2��ʼִ��
         * ��ִ�з������ӡtest1��test2ִ�����
         * ��ӡ�ķ�����Ҫ�͵�ʱҪ�õķ�������һ��
         */

        InvocationHandler handler = new ProxyDemo(test);
        /**
         * ����i�Ǵ��������������
         * ����2�Ǳ�����Ķ���Ľӿ�
         * ����3�Ǵ������
         *
         * ���ص�ֵ���ǳɹ��������Ķ���
         */
        ITestDemo t = (ITestDemo)Proxy.newProxyInstance(handler.getClass().getClassLoader(), test.getClass().getInterfaces(), handler);

        t.test1();
        System.out.println("===================");
        t.test2();
    }
}
