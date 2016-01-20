package chapter02;

/**
 * Created by Peng on 2016/1/20.
 * add static method to circle.
 */
public class Circle2 {
    static int numberOfCircle = 0;
    double radius;

    Circle2() {
        this.radius = 1;
        numberOfCircle++;
    }

    Circle2(double radius) {
        this.radius = radius;
        numberOfCircle++;
    }

    public static int getNumberOfCircle() {
        return numberOfCircle;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}
