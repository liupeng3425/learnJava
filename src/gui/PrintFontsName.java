package gui;

import java.awt.*;

/**
 * Created by Peng on 2016/1/24.
 * 打印系统所有字体名字。
 */
public class PrintFontsName {
    public static void main(String[] args) {
        GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        String[] fontsName = environment.getAvailableFontFamilyNames();

        for (String name : fontsName) {
            System.out.println(name);
        }

        System.out.println(fontsName.length);

    }
}
