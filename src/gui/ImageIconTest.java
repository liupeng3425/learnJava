package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Peng on 2016/1/25.
 * test ImageIcon.
 */
public class ImageIconTest extends JFrame {
    private ImageIcon imageIcon1 = new ImageIcon("image/p1.jpg");
    private ImageIcon imageIcon2 = new ImageIcon("image/p2.jpg");
    private ImageIcon imageIcon3 = new ImageIcon("image/p3.jpg");
    private ImageIcon imageIcon4 = new ImageIcon("image/p4.jpg");

    public ImageIconTest() {
        setLayout(new GridLayout(1, 4, 5, 5));
        add(new JLabel(imageIcon1));
        add(new JButton(imageIcon2));
        add(new JButton(imageIcon3));
        add(new JButton(imageIcon4));
    }

    public static void main(String[] args) {
        ImageIconTest imageIconTest = new ImageIconTest();
        imageIconTest.setTitle("ImageIconTest");
        imageIconTest.setSize(400, 400);
        imageIconTest.setLocationRelativeTo(null);
        imageIconTest.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        imageIconTest.setVisible(true);
    }

}
