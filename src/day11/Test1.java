package day11;

/**
 * 泛型方法
 */
public class Test1 {
    public static void main(String[] args) {
//        B1<Object> b1 = new B1<Object>();
//        B1<String> b2 = new B1<String>();
//        B1<Integer> b3 = new B1<Integer>();

//        B2<String> b4 = new B2<String>();

        Cc<Object> c = new Cc<Object>();
        c.test("田文静，我cnm");
        //泛型方法在调用之前没有固定的数据类型
        //在调用时，传入的参数是什么类型，就会把泛型改成什么类型
        //也就是说，泛型方法会在调用时确定泛型距离数据类型
        Integer i = c.test1(2);   //传递的参数是Integer，泛型就固定成Integer，返回值就是Integer
        Boolean b = c.test1(true);//传递的参数是Boolean，泛型就固定成Boolean，返回值就是Boolean

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

class Cc<E> {
    private E e;
    /**
     * 无返回值的泛型
     * @param s
     * @param <T>
     */
    public<T> void test(T s){
        //在类上的泛型，可以在普通方法中使用
            System.out.println(this.e);

        T t = s;
    }

    public<T> T test1(T i){
        return i;
    }

    /**
     * 形参为可变参数的泛型
     * @param strs
     */
    public void test2(String... strs){
        for (String s:
             strs) {
            System.out.println(s);
        }
    }

    public static<T> void test3(T t){
        //在静态方法中不能使用类定义泛型
        System.out.println(t);
    }
}


