package day08;

/**
 * 懒汉式的单例模式
 */
public class Single1 {
    //先私有构造方法，让外边不能直接new对象
    private Single1(){

    }
    private static Single1 s1 = null;

    public static Single1 getInstance(){
        if (s1 == null) {
            s1 = new Single1();
        }
        return s1;
    }
}
