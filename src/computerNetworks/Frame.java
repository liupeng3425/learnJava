package computerNetworks;

/**
 * Created by Peng on 2016/4/1.
 * frame, include seq, data,
 */
public class Frame {
    public static final int SEQ_LENGTH = 1;
    public static final int DATA_LENGTH = 16;
    public static final int CRC_LENGTH = 16;
    private int seq;
    private String data;
    private String crc;

    public Frame(int seq, String data, String crc) {
        this.seq = seq;
        this.data = data;
        this.crc = crc;
    }

    public int getSeq() {
        return seq;
    }

    public String getData() {
        return data;
    }

    public String getCrc() {
        return crc;
    }

    public String getSeqString() {
        String seqString = Integer.toBinaryString(seq);
        while (seqString.length() < SEQ_LENGTH) seqString = "0" + seqString;
        return seqString;
    }

    @Override
    public String toString() {
        return getSeqString() + data + crc;
    }
}
