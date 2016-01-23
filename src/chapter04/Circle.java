package chapter04;

/**
 * Created by Peng on 2016/1/23.
 * 继承自 GeometricObjects 。
 */
public class Circle extends GeometricObjects {
    private double radius;

    /**
     * 创建一个默认的圆，半径为 1 .
     */
    public Circle() {
        this(1);
    }

    /**
     * @param radius 半径
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * @param color  颜色
     * @param filled 是否填充
     * @param radius 半径
     */
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * @return 半径
     */
    public double getRadius() {
        return radius;
    }

    /**
     * 设置圆的半径。
     *
     * @param radius 半径
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 返回圆的面积。
     *
     * @return 面积
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * 返回圆的直径。
     *
     * @return 直径
     */
    public double getDiameter() {
        return 2 * radius;
    }

    /**
     * 返回圆的周长。
     *
     * @return 周长
     */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * 返回圆的信息。
     *
     * @return 圆的信息
     */
    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }

    /**
     * 打印圆的信息。
     */
    public void printCircle() {
        System.out.println("The circle is " + toString() + " and the radius is " + radius);
    }
}
