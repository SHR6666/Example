package Practie;

/**
 * 计算圆柱的体积
 */
public class TextCylinder extends Cylinder{

//    double length = 1;
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }

    public void findVolume(){
        super.setLength(20.3);
        super.setRadius(21.2);
        super.findArea();
        System.out.println("圆柱体体积为：" + pi * radius * radius *length);

    }
//
//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        TextCylinder textCylinder= new TextCylinder();
//        circle.setRadius(20.3);
//        textCylinder.setLength(11.3);
//        textCylinder.findVolume();
//    }

    public static void main(String[] args) {
        TextCylinder textCylinder = new TextCylinder();
        textCylinder.findVolume();
    }

}
