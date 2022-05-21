package day08;

/**
 * 饿汉式的单代例
 */
public class Single {
//    public Single(){
//        //假设构造中要执行一千行代码要占用大量资源，耗时长
//        //每次new Single一个对象都要十秒钟，运行1000行代码
//        //像这种情况就适合单例模式，只new一次对象，之后就一直使用这个对象
//    }

    //私有的构造,构造方法私有化，调用这个类的人就不能直接用new来创建对象
    private Single() {

    }
    //实验一个静态的Single能否被调用
    //私有的Single类型的类变量
    private static Single single = new Single();   //调用了上头私有的Single。
    public static Single getInstance(){
        return single;
    }
}
