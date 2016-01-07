package chapter02;

/**
 * Created by Peng on 2016/1/7.
 * class TVTest.
 */
public class TVTest {
    public static void main(String[] args) {
        TV mTV = new TV();
        mTV.turnOn();
        mTV.setChannel(50);
        mTV.channelDown();
        mTV.printStatus();
    }
}
