package computerNetworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Peng on 2016/3/29.
 * join binStringGroup to a bin string.
 */
public class Joiner {


    public static String join(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String outBinString = "";
//        String outBinStringFile = "data/joinedBinString.txt";
//        File outFile = new File(outBinStringFile);
//        PrintWriter printWriter = new PrintWriter(outFile);
        while (scanner.hasNext()) {
            String tmp = scanner.next();
            outBinString = outBinString + tmp;
        }
        if (outBinString != null) {
            outBinString = outBinString.replaceAll("\r|\n", "");
        }
        return outBinString;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data/binStringGroup.txt");
        System.out.println(join(file));
    }
}
