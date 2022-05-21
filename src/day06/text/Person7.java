package day06.text;

/**
 * this代表 ”这个“ 表示着当前
 */
public class Person7 {

    public Person7(){

    }
    public Person7(int age){
        this.age = age;
    }
    public Person7(String name){
        this();  //等同于调用public Person7()
        this.name = name;
    }


    public Person7(int age, String name){
        this(1); //等同于调用public Person7(int age)
        this.age = age;         //因内外都有，故而难辨，应加以this.表示其内外引用关系
        this.name = name;       //this。xx 后面表示的外面的age，等号右边的是内部形参

    }
    int age;
    String name;

    public void setName(String name){
        this.name = name;
    }
    public void setName1(String name){
        this.setName(name);       //即（）中的形参为setName1中的，而this。setName中的为外部类
    }
    public void showInfo(){
        System.out.println("姓名"+ this.name);
        System.out.println("年龄"+ this.age);
    }
}
