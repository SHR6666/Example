package Login;

/**
 * �����߳�ģ�� 3 ������ͬʱ����ͬһ����ĺ�����Ʊ���ٶ����� 150 �Ż�Ʊ����������һ��-1������ʾʣ��Ļ�Ʊ������
 * Ҫ��ʵ�� Runnable �ӿڵ�������Ϊ SaleThread������������Ϊ Test5��
 */
public class Test5 {
    public static void main(String[] args) {
           // �����̶߳���
            SaleThread st1 = new SaleThread();
            SaleThread st2 = new SaleThread();
            SaleThread st3 = new SaleThread();

            // �����߳�
            st1.start();
            st2.start();
            st3.start();
    }
}
