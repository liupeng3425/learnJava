package chapter02;

/**
 * Created by Peng on 2016/1/20.
 * 数据封装。
 */
public class Circle3 {
    private static int numberOfObjects = 0;
    private double radius;
    private double area;

    public Circle3() {
        radius = 1;
        area = radius * radius * Math.PI;
        numberOfObjects++;
    }

    public Circle3(double radius) {
        this.radius = 1;
        this.radius = radius;
        area = radius * radius * Math.PI;
        numberOfObjects++;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }
}
