package day09;

public class Text {
    public static void main(String[] args) {
//        new Person();

        //�����ڲ���
//        Person p =new Person(){ //�����һ��Person����������
//            //�������name�ĳ����ģ����ǲ��붯Person����
//            {//�ô������湹�췽��
//                super.name = "����";
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
