package computerNetworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Peng on 2016/4/7.
 * new code.
 */
public class FrameTestNew {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data/sendFrameGroup.txt");
        Scanner scanner = new Scanner(file);
        File outFile = new File("data/binStringGroup.txt");
        PrintWriter printWriter = new PrintWriter(outFile);
        while (scanner.hasNext()) {
            String received = scanner.nextLine();
            Frame frame = FrameUtils.getFrameFromString(received);
            printWriter.println(frame.getData());
        }
        printWriter.close();
    }
}
