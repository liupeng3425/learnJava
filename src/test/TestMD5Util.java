package test;

import utils.MD5Util;

/**
 * Created by Peng on 2016/2/29.
 * test class MD5Util.
 */
public class TestMD5Util {
    public static void main(String[] args) {
        String plainCode = "hello";
        System.out.println("origin code: " + plainCode);
        System.out.println("MD5: " + MD5Util.getMD5Code(plainCode));
    }
}
