package chapter02;

/**
 * Created by Peng on 2016/1/7.
 * class TV.
 */
public class TV {

    private int channel;
    private int volumeLevel;

    private boolean on;

    public TV() {
        channel = 1;
        volumeLevel = 0;
        on = false;
    }

    public TV(int newChannel, int newVolumeLevel, boolean newOn) {
        channel = newChannel;
        volumeLevel = newVolumeLevel;
        on = newOn;
    }

    public void printStatus() {
        System.out.println("Channel is " + this.getChannel() + ".");
        System.out.println("Volume Level is " + this.getVolumeLevel() + ".");
        System.out.println("Switch is " + this.on + ".");
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (on && channel >= 1 && channel <= 120)
            this.channel = channel;
    }

    public void channelUp() {
        if (on && channel < 120)
            channel++;
    }

    public void channelDown() {
        if (on && channel > 1)
            channel--;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (on && volumeLevel >= 0 && volumeLevel <= 100)
            this.volumeLevel = volumeLevel;
    }

    public void volumeUp() {
        if (on && volumeLevel < 100)
            volumeLevel++;
    }

    public void volumeDown() {
        if (on && volumeLevel > 0)
            volumeLevel--;
    }
}
