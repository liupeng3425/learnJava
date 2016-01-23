package chapter04;

/**
 * Created by Peng on 2016/1/23.
 * test class Circle.
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(25);

        System.out.println(circle.getPerimeter());

        // 会默认调用 toString().
        System.out.println(circle);
    }
}
