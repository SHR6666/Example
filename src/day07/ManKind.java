package day07;

public class ManKind {

    int sex;  //0为女，1为男
    int salary;  //0为no job，1为job

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * 其中设置一个根据值显示是男人还是女人
     */
    public void manOrWoman(){
        if (this.sex == 0){
            System.out.println("woman");
        }else if (this.sex == 1){
            System.out.println("man");
        }
    }

    public void employed(){
        if (this.salary == 0){
            System.out.println("no job");
        } else {
            System.out.println("job");
        }
    }
}
