package computerNetworks;

/**
 * Created by Peng on 2016/3/29
 * crc16.
 */
public class CRC16 {
    public static String getCRCString(long data_crc) {
        data_crc <<= 16;
        long crc = mod2Remainder(data_crc);
        String crcString = Integer.toBinaryString((int) crc);
        while (crcString.length() < Frame.CRC_LENGTH) crcString = "0" + crcString;
        return crcString;
    }

    public static boolean check(long data_crc) {
        long remainder = mod2Remainder(data_crc);
        return remainder == 0;
    }

    private static long mod2Remainder(long dividend) {
        long divider = 0x11021;
        long remainder;
        remainder = dividend;
        for (int i = 15; i >= 0; i--) {
            divider <<= i;
            if ((remainder >> (i + 16)) == 1) remainder = remainder ^ divider;
            divider >>= i;
        }
        return remainder;
    }
}
