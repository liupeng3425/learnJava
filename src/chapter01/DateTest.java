package chapter01;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Peng on 2016/1/23.
 * date.
 */
public class DateTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Date date = null;
        while (true) {
            System.out.println("1.create a date");
            System.out.println("2.show date[0]");
            System.out.println("3.exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    date = new Date();
                    break;
                case 2:
                    if (date != null) {
                        System.out.println(date);
                    }
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
