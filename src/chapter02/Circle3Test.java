package chapter02;

import java.util.Random;

/**
 * Created by Peng on 2016/1/20.
 * test class Circle3.
 */
public class Circle3Test {
    public static void main(String[] args) {
        Circle3[] circleArray = createCircleArray();
        circleArrayPrinter(circleArray);
    }

    static Circle3[] createCircleArray() {
        Circle3[] circleArray = new Circle3[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle3(new Random().nextInt(100));
        }

        return circleArray;
    }

    static void circleArrayPrinter(Circle3[] circleArray) {
        for (Circle3 circle : circleArray) {
            System.out.printf("%f\t\t\t%f\n", circle.getRadius(), circle.getArea());
        }
        System.out.println("---------------------------------------------------");
        System.out.printf("total circle number: %d\n", Circle3.getNumberOfObjects());
        System.out.printf("total area: %f\n", sumArea(circleArray));
    }

    static double sumArea(Circle3[] circleArray) {
        double sum = 0;
        for (Circle3 circle : circleArray) {
            sum = sum + circle.getArea();
        }
        return sum;
    }

}
