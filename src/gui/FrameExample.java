package gui;

import javax.swing.*;

/**
 * Created by Peng on 2016/2/22.
 * example
 */
public class FrameExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        JButton jButton = new JButton("OK");

        jFrame.add(jButton);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setTitle("Example");
        jFrame.setSize(200, 200);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}
