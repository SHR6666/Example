package day14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ���Ƕ�̬�Ĵ�����
 */
public class ProxyDemo implements InvocationHandler {
    Object obj; //������Ķ���

    public ProxyDemo(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "������ʼִ��");
        Object result = method.invoke(this.obj, args);  //ִ�е���ָ����������ָ������
        System.out.println(method.getName() + "����ִ�����");
        return result;
    }
}
