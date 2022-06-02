package day09;

public abstract class Employee {
    int id;
    String name;
    double salary;


    public abstract void work();

    static class CommonEmployee extends Employee {
        public void setCommonEmployeeInfo(int id, String name, double salary){
            super.id = id;
            super.name = name;
            super.salary = salary;
        }

        public void getCommonEmployeeInfo() {
            System.out.println(super.id);
            System.out.println(super.name);
            System.out.println(super.salary);
        }

        @Override
        public void work() {
            System.out.println("����һ����ͨԱ��");
        }
    }

    class Manager extends Employee{
        double bonus;

        public void setManagerInfo(int id, String name, double salary){
            super.id = id;
            super.name = name;
            super.salary = salary;
            this.bonus = bonus;
        }
        public void getManagerInfo() {
            System.out.println(super.id);
            System.out.println(super.name);
            System.out.println(super.salary);
            System.out.println(this.bonus);
        }

        @Override
        public void work() {
            System.out.println("����ָ��Ա");
        }
    }
}
