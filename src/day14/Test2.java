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
         * 需求
         * 在执行test1()和test2()方法时需要加入一些东西
         * 在执行方法前打印test1或test2开始执行
         * 在执行方法后打印test1或test2执行完毕
         * 打印的方法名要和当时要用的方法保持一致
         */

        InvocationHandler handler = new ProxyDemo(test);
        /**
         * 参数i是代理对象的类加载器
         * 参数2是被代理的对象的接口
         * 参数3是代理对象
         *
         * 返回的值就是成功被代理后的对象
         */
        ITestDemo t = (ITestDemo)Proxy.newProxyInstance(handler.getClass().getClassLoader(), test.getClass().getInterfaces(), handler);

        t.test1();
        System.out.println("===================");
        t.test2();
    }
}
