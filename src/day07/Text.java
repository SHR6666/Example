package day07;

public class Text {
    /**
     *
     */
    public void test(Object object) {

    }

    public static void main(String[] args) {
        Text t = new Text();
        Person p = new Person();
        Student s = new Student();
        t.test(p);
        t.test(s);
        t.test(new Kk());

        Person e =new Person();
        e = p;
        System.out.println(p.equals(e));
        p.hashCode();
        Object o = new Object();
        System.out.println(o.hashCode());

        System.out.println(p.toString());
    }
}
