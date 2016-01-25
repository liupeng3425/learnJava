package chapter04;

/**
 * Created by Peng on 2016/1/23.
 * test class Circle.
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle;

        try {
            circle = new Circle(-25);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            System.out.println("Set the radius 1.");
            circle = new Circle();
        }

        System.out.println(circle.getPerimeter());

        // 会默认调用 toString().
        System.out.println(circle);
    }
}
