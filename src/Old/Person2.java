package Old;

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
        age += i;    //Ϊ age = age+i �ļ�д
        return age;
    }
    /**
     * �����Old.Text1�н��в���
     */
}
