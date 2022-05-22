package Practie;

public class Cylinder extends Circle{
    double length = 1;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void findArea(){
        System.out.println("圆柱的表面积：" + 2 * pi * radius * radius * length);
    }


}
