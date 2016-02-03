package chapter03;

/**
 * Created by Peng on 2016/2/3.
 * Using LastIndexOf().
 */
public class StringUsingLastIndexOf {
    public static void main(String[] args) {
        String musicPath = "c:/hello/index.mp3";
        String lrcPath = musicPath.substring(0, musicPath.lastIndexOf('.')) + ".lrc";
        System.out.println(lrcPath);
    }
}
