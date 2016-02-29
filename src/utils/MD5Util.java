package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Peng on 2016/2/29.
 * generate MD5 code.
 */
public class MD5Util {
    private static final String[] hexDigits =
            {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    public static String getMD5Code(String origin) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(origin.getBytes());
            byte[] code = messageDigest.digest();
            return bytesToString(code);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String bytesToString(byte[] input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte anInput : input) {
            stringBuilder.append(byteToHex(anInput));
        }
        return stringBuilder.toString();
    }

    private static String byteToHex(byte in) {
        int input = in;
        if (input < 0) input += 256;
        return hexDigits[input / 16] + hexDigits[input % 16];
    }
}
