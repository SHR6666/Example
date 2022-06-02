package Login;

/**
 * 利用线程模拟 3 个窗口同时进行同一航班的航空售票，假定共有 150 张机票。并且卖出一张-1，并显示剩余的机票数量。
 * 要求：实现 Runnable 接口的类命名为 SaleThread，测试类命名为 Test5。
 */
public class Test5 {
    public static void main(String[] args) {
           // 创建线程对象
            SaleThread st1 = new SaleThread();
            SaleThread st2 = new SaleThread();
            SaleThread st3 = new SaleThread();

            // 启动线程
            st1.start();
            st2.start();
            st3.start();
    }
}
