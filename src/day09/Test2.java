package day09;

public class Test2 {
    public static void main(String[] args) {
        //���ǿ�����Աb�Ĺ���
        BWM b3 = new BWM3Factory().productBWM();
        BWM b5 = new BWM3Factory().productBWM();
        BWM b7 = new BWM3Factory().productBWM();

        b3.showInfo();
        b5.showInfo();
        b7.showInfo();
    }
}
