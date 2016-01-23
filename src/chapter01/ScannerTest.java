package chapter01;

import java.util.Scanner;

/**
 * Created by Peng on 2016/1/23.
 * test Scanner.
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String input = scanner.nextLine();

        System.out.println(number);
        System.out.println(input);
    }
}
