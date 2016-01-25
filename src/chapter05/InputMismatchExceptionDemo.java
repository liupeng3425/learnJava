package chapter05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Peng on 2016/1/25.
 * InputMismatchException.
 */
public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            try {
                System.out.println("Enter an integer: ");
                int number = scanner.nextInt();
                System.out.println("The number entered is " + number);
                continueInput = false;
            } catch (InputMismatchException e) {
                System.out.println(e.toString());
                System.out.println("Try again.(Incorrect input: an integer is required.)");
                // 丢弃当前输入行。
                scanner.nextLine();
            }
        }
    }
}
