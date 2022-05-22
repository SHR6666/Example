package day09;

public class Test3 {
    int i;
    public int z;
    private int k;

    class A{
        int i;
        public void setTest3Files(){
            Test3.this.i = 1;
            Test3.this.z = 2;
            Test3.this.k = 3;
        }
        public void set(){
            this.i = 10;
        }
    }
    public void setInfo(){
        new A().setTest3Files();
    }

    public void showInfo(){
        System.out.println(this.i);
        System.out.println(this.z);
        System.out.println(this.k);
    }

    public static void main(String[] args) {
        Test3 t3 = new Test3();
        t3.setInfo();
        t3.showInfo();
    }
}

