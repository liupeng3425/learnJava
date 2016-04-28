package computerNetworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Peng on 2016/4/2.
 * test frame utils.
 */
public class FrameTest {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data/binStringGroup.txt");
        Scanner scanner = new Scanner(file);
        int seq = 0;
        File outFile = new File("data/sendFrameGroup.txt");
        PrintWriter printWriter = new PrintWriter(outFile);
        while (scanner.hasNext()) {
            String data = scanner.nextLine();
            String crc = CRC16.getCRCString(Integer.parseInt(seq + data, 2));
            Frame frame = new Frame(seq, data, crc);
            printWriter.println(FrameUtils.sendFrameString(frame));
            seq++;
            if (seq > 1) seq = 0;
        }
        printWriter.close();
    }
}
