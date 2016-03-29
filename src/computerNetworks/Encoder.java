package computerNetworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Scanner;

/**
 * Created by Peng on 2016/3/28.
 * get utf-8.
 */
public class Encoder {
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = URLEncoder.encode(s, "utf-8");
        String binStringSend = ascToBinString(s1.getBytes());
        File file = new File("data/binStringSend.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(binStringSend);
        printWriter.close();
    }

    /**
     * liu zhiyuan
     *
     * @param ascii
     * @return
     */
    public static String ascToBinString(byte[] ascii) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte tmp : ascii) {
            String tmpString = null;
            tmpString = Integer.toBinaryString(tmp);
            while (tmpString.length() < 8) {
                tmpString = "0" + tmpString;
            }
            stringBuilder.append(tmpString);
        }
        return stringBuilder.toString();
    }

}
