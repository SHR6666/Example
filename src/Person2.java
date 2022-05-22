public class Person2 {
    public String name;
    public int age;
    public int sex;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println(age);
    }

    public int addAge(int i){
        age += i;    //为 age = age+i 的简写
        return age;
    }
    /**
     * 随后在Text1中进行测试
     */
}
