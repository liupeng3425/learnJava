package chapter01;

import java.util.Scanner;

/**
 * Created by Peng on 2015/11/28.
 * using scanner to get a keyboard input.
 */
public class ScannerUsing {
    public static void main(String[] args) {
        int number;
        Scanner mScanner = new Scanner(System.in);
        System.out.print("input a number:");
        number = mScanner.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
