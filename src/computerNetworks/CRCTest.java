package computerNetworks;

/**
 * Created by Peng on 2016/4/4.
 * test crc.
 */
public class CRCTest {
    public static void main(String[] args) {
        String data = "00100101010";
        int seq = 1;
        int dataInt = Integer.parseInt(seq + data, 2);
        String crc = CRC16.getCRCString(dataInt);
        Frame frame = new Frame(seq, data, crc);
        System.out.println(frame);
        System.out.println(CRC16.check(Integer.parseInt(frame.toString(), 2)));
        System.out.println(crc);
        System.out.println(frame.getSeqString() + frame.getData());
        System.out.println(frame.getCrc());
    }
}
