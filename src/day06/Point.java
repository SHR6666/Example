package day06;

/**
 * 设置三个坐标点
 */

public class Point {
    public Point(int n, int m, int k){
        x = m;
        y = n;
        z = k;
    }
    double x;
    double y;
    double z;

    public void setPoint(int n, int m, int k){
        x = m;
        y = n;
        z = k;
    }
}
