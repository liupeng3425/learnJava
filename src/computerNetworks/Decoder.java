package computerNetworks;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Scanner;

/**
 * Created by Peng on 2016/3/28.
 * change bin to words.
 */
public class Decoder {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        File file = new File("data/binStringReceived.txt");
        Scanner scanner = new Scanner(file);
        String binStringReceived = scanner.nextLine();
        byte[] utf8Byte = binStringToAsc(binStringReceived);
        String utf8Code = ascToUtfCodeString(utf8Byte);
        String originWord = URLDecoder.decode(utf8Code, "utf-8");
        System.out.println(originWord);
    }

    /**
     * liu zhiyuan
     *
     * @param binString
     * @return
     */
    public static byte[] binStringToAsc(String binString) {
        int length = binString.length() / 8;
        byte[] b = new byte[length];
        String[] d = new String[length];
        char[] c = binString.toCharArray();
        for (int i = 0; i < length; i++) {
            int j = 0;
            for (j = 0; j < 8; j++) {
                if (j == 0) {
                    d[i] = String.valueOf(c[8 * i]);
                } else {
                    d[i] = d[i] + c[8 * i + j];
                }
            }
        }
        for (int i = 0; i < d.length; i++) {
            b[i] = (byte) Integer.parseUnsignedInt(d[i], 2);
        }
        return b;
    }

    public static String ascToUtfCodeString(byte[] ascii) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte ascByte : ascii) {
            stringBuilder.append((char) ascByte);
        }
        return stringBuilder.toString();
    }
}