package chapter03;

import java.io.File;
import java.util.Date;

/**
 * Created by Peng on 2016/1/22.
 * File class test.
 */
public class FileTest {
    public static void main(String[] args) {
        File mFile = new File("image/Cover.jpg");
        System.out.println(mFile.exists());
        System.out.println(mFile.length() + "Bytes.");
        System.out.println(mFile.getAbsolutePath());
//        System.out.println(mFile.getCanonicalPath());
        System.out.println(mFile.isFile());
        System.out.println(mFile.isAbsolute());

        // 使用 Date 类输出时间。
        System.out.println(new Date(mFile.lastModified()));
    }
}
