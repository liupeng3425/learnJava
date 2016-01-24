package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Peng on 2016/1/24.
 * using JFrame.
 */
public class MyFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("MyFrame");
        JButton btnOK = new JButton("OK");
        jFrame.add(btnOK);
        jFrame.add(new JButton("Cancel"));

        // 可以使窗口居中。setSize()必须先调用。
        jFrame.setSize(400, 200);
        jFrame.setLocationRelativeTo(null);

        jFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
