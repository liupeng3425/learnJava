package computerNetworks;

/**
 * Created by Peng on 2016/4/7.
 * ldkjf
 */
public class CrcTestNew {
    public static void main(String[] args) {
        String data = "1010101010101010";
        String crc = CRC16.getCRCString(Integer.parseUnsignedInt(data, 2));
        System.out.println(CRC16.check(Integer.parseUnsignedInt(data + crc, 2)));
    }
}
