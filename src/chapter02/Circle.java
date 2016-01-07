package chapter02;

/**
 * Created by Peng on 2015/12/21.
 * 定义类和创建对象。
 */
public class Circle {
    double radius;

    Circle() {
        radius = 1;
    }

    Circle(double newRadius) {
        radius = newRadius;
    }

    double getRadius() {
        return radius;
    }

    double gerArea() {
        return radius * radius * Math.PI;
    }

}


