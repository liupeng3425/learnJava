package computerNetworks;

import java.util.Scanner;

/**
 * Created by Peng on 2016/4/4.
 * test crc.
 */
public class CRCTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String receivedData = scanner.nextLine();
        String frameString = receivedData.substring(receivedData.indexOf("01111110"));
        frameString = frameString.substring(0, frameString.lastIndexOf("01111110"));
        frameString = frameString.replaceAll("01111110", "");
        frameString = frameString.replaceAll("111110", "11111");
//        long receivedInt = Integer.parseInt(frameString, 2);
        System.out.println(frameString);
//        System.out.println(CRC16.check(Integer.parseUnsignedInt(frameString, 2)));
    }
}
