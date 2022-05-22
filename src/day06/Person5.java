package day06;

public class Person5 {
    /**
     * 如果显示的定义了构造方法，那么就会使用显示的构造
     */
//    public Person5 (){
//        age = 1;
//        name = "zhangsan";
//    }

      public Person5(int a, String n){
          age = a;
          name = n;
      }


    public int age;
    public String name;
    public void showInfo(){
        System.out.println(age);
        System.out.println(name);
    }
}
