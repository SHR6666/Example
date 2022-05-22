package day07;

public class Kids extends ManKind{
    public Kids(){
        super();
    }

    int yearsOld;  //定义一个成员变量

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println(this.yearsOld);
    }

    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.setSex(0);
        someKid.setSalary(50000);
        someKid.setYearsOld(30);
        someKid.manOrWoman();
        someKid.employed();
    }
}
