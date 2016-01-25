package chapter05;

import java.util.Scanner;

/**
 * Created by Peng on 2016/1/25.
 * 错误处理。
 */
public class QuotientWithException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        try {
            if (number2 == 0)
                throw new ArithmeticException("Divisor cannot be zero");

            System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
        } catch (ArithmeticException ex) {
            System.out.println("Exception: an integer cannot be divided by zero ");
        }
        System.out.println("Execution continues ...");
    }
}
