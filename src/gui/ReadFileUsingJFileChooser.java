package gui;

import javax.swing.*;
import java.io.File;

/**
 * Created by Peng on 2016/1/23.
 * using FileChooser.
 */
public class ReadFileUsingJFileChooser {
    public static void main(String[] args) {
        JFileChooser jFileChooser = new JFileChooser();

        if (jFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File mFile = jFileChooser.getSelectedFile();
            System.out.println(mFile.getAbsolutePath());
        } else {
            System.out.println("no file selected!");
        }
    }
}
