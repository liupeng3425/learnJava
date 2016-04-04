package computerNetworks;

/**
 * Created by Peng on 2016/4/4.
 * small tools.
 */
public class Utils {
    public static String getEnoughString(String data, int requiredLength) {
        String outString = data;
        while (outString.length() < requiredLength) outString = "0" + outString;
        return outString;
    }
}
