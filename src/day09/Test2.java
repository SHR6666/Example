package day09;

public class Test2 {
    public static void main(String[] args) {
        //这是开发人员b的构造
        BWM b3 = new BWM3Factory().productBWM();
        BWM b5 = new BWM3Factory().productBWM();
        BWM b7 = new BWM3Factory().productBWM();

        b3.showInfo();
        b5.showInfo();
        b7.showInfo();
    }
}
