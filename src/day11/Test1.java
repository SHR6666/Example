package day11;

public class Test1 {
    public static void main(String[] args) {
        B1<Object> b1 = new B1<Object>();
        B1<String> b2 = new B1<String>();
        B1<Integer> b3 = new B1<Integer>();

//        B2<String> b4 = new B2<String>();
    }
}

interface Id<T>{
    T text(T t);

}

/**
 * 未传入实参时，与泛型的定义相同。在声明类的时候，需要将泛型的声明一起加入类中
 * @param <T>
 */
class B1<T> implements Id<T>{

    @Override
    public T text(T t) {
        return t;
    }
}

/**
 * 如果蜜汁一品肉接口时指定具体数据类型
 * 这个类实现接口所有方法的位置老李把泛型替换成实际的具体数据类型
 */
class B2 implements Id<String>{

    @Override
    public String text(String s) {
        return null;
    }
}

class Cc {
    public<T> void test(T s){
        T t = s;
    }

    public<T> String test1(String s){
        return s;
    }

    public void test2(String... strs){

    }
}


