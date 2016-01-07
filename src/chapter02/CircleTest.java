package chapter02;

/**
 * Created by Peng on 2016/1/7.
 * test class Circle.
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.println("The radius is " + circle.getRadius() + "\nThe area is " + circle.gerArea());
    }
}
