package computerNetworks;

import java.util.Scanner;

/**
 * Created by Peng on 2016/4/2.
 * test frame utils.
 */
public class FrameTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Frame frame = FrameUtils.getFrameFromString("0111111010000011111010000011111000000011111001111110");
        System.out.println(FrameUtils.sendFrameString(new Frame(1, "0000011111100000", "1111100000011111")));
        System.out.println(frame.toString());
        System.out.println("1" + "0000011111100000" + "1111100000011111");
    }
}
