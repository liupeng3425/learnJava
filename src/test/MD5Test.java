package test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Peng on 2016/2/29.
 * test md5.
 */
public class MD5Test {
    private static final String[] hexDigits =
            {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    public static void main(String[] args) {
        String plainCode = "1234";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(plainCode.getBytes());
            byte[] code = messageDigest.digest();
            System.out.println(MD5Test.bytesToString(code));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static String bytesToString(byte[] input) {
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
