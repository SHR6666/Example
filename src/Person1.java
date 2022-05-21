public class Person1 {

    {
        //在类中直接写上大括号，这就是代码块
        int i = 0;   //代码块局部变量
    }
    public String name = "zhangsan";
    private int age ;      //私有的，可以在本类中使用，不能在外部类使用
    //修饰符可以用来修饰变量，可以指明变量是公有还是私有，私有的变量不能通过对象，属性的方式调用
    //实例变量就是说在类实例化成对象后才能使的

    public static String sex = "男";  //static意思是静态的,这其中发现这个sex为斜体字，意味着可以直接使用，不需要实例化
    //直接可以通过  类名.属性  这样的方式直接调用，这样的变量叫做类变量
    public void showAge(){
        System.out.println(age);
    }
}
