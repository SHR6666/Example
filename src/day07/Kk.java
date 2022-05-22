package day07;

public class Kk extends Kids{
    public void text(){
        super.salary = 1;     //使用super方法可以向上追溯到kk的父类的父类即Mankind
        super.sex = 0;          //可以使用super追溯父类的父类的成员变量
        super.yearsOld = 10;
    }
}
