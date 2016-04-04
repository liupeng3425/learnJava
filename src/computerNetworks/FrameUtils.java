package computerNetworks;

/**
 * Created by Peng on 2016/4/1.
 * Framing and get data from frames.
 */
public class FrameUtils {
    public static String sendFrameString(Frame frame) {
        String sendString = frame.toString();
        sendString = sendString.replaceAll("11111", "111110");
        sendString = "01111110" + sendString + "01111110";
        return sendString;
    }

    public static Frame getFrameFromString(String receivedData) {
        String frameString = receivedData.substring(receivedData.indexOf("01111110"));
        frameString = frameString.substring(0, frameString.lastIndexOf("01111110"));
        frameString = frameString.replaceAll("01111110", "");
        frameString = frameString.replaceAll("111110", "11111");
        int seq = Integer.parseInt(frameString.substring(0, Frame.SEQ_LENGTH));
        String data = frameString.substring(Frame.SEQ_LENGTH, Frame.SEQ_LENGTH + Frame.DATA_LENGTH);
        String crc = frameString.substring(Frame.SEQ_LENGTH + Frame.CRC_LENGTH);

        return new Frame(seq, data, crc);
    }
}
