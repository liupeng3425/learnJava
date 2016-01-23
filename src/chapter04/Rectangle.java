package chapter04;

/**
 * Created by Peng on 2016/1/23.
 * 从 GeometricObjects 继承的长方形。
 */
public class Rectangle extends GeometricObjects {
    private double width;
    private double height;

    /**
     * 创建一个默认几何图形，颜色为 white ，填充为 false 。
     * 宽为 1 ，高度为 1 。
     */
    public Rectangle() {
        this(1, 1);
    }

    /**
     * @param width  宽度
     * @param height 高度
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * @param color  颜色
     * @param filled 填充
     * @param width  宽度
     * @param height 高度
     */
    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    /**
     * @return 长方形宽度
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width 设置长方形宽度为 width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return 长方形高度
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置长方形高度为 height 。
     *
     * @param height 高度
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 返回长方形面积。
     *
     * @return 面积
     */
    public double getArea() {
        return width * height;
    }

    /**
     * 返回长方形周长。
     *
     * @return 周长
     */
    public double getPerimeter() {
        return (width + height) * 2;
    }
}
