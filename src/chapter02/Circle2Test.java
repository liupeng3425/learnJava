package chapter02;

/**
 * Created by Peng on 2016/1/20.
 * test class Circle2.
 */
public class Circle2Test {
    public static void main(String[] args) {
        System.out.println("There " + Circle2.getNumberOfCircle() + " circles");

        Circle2 circle21 = new Circle2();
        System.out.println("There " + Circle2.getNumberOfCircle() + " circles");

        Circle2 circle22 = new Circle2(5);
        System.out.println("There " + Circle2.getNumberOfCircle() + " circles");
    }
}
