package day09;

public interface TestIn extends TestIn1{   //接口可以继承接口
    int ID = 1;  //常量要大写，与public static final等同
    void test();  //public abstract void test();同
}
