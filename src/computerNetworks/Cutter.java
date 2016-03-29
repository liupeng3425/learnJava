package computerNetworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Peng on 2016/3/29.
 * cut bin string to several group. 16 bit each.
 */
public class Cutter {
    public static final int length = 16;

    public static void cut(String binString) throws FileNotFoundException {
        File file = new File("data/binStringGroup.txt");
        PrintWriter printWriter = new PrintWriter(file);
        while (binString.length() > length) {
            String string = binString.substring(0, length);
            binString = binString.substring(length);
            printWriter.println(string);
        }
        if (binString.length() > 0) printWriter.print(binString);
        printWriter.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data/binStringSend.txt");
        Scanner scanner = new Scanner(file);
        cut(scanner.nextLine());
    }
}
