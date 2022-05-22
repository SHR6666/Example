package day09;

public class Text {
    public static void main(String[] args) {
//        new Person();

        //匿名内部类
//        Person p =new Person(){ //这就是一个Person的匿名子类
//            //现在想把name改成李四，但是不想动Person代码
//            {//用代码块代替构造方法
//                super.name = "李四";
//            }
//            @Override
//            public void text() {
//                System.out.println("=====");
//            }
//        };
//        System.out.println(p.name);
//        p.text();

//        Dog d = new Dog();
//        d.move();

//        Employee.CommonEmployee ce = new Employee.CommonEmployee();
//        ce.work();
//        ce.setCommonEmployeeInfo(1, "shr", 10000.5);
//        ce.getCommonEmployeeInfo();
//        Template.TextTmp tt = new Template.TextTmp();
//        tt.getTime();

//        TestChild tc = new TestChild();

        SCTeacher sct = new SCTeacher();
        sct.setInfo();
        sct.showInfo();
        sct.fly();
        sct.singing();

        Cooking c = new SCTeacher();
        c.fly();
    }
}
