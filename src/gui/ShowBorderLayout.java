package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Peng on 2016/1/24
 * using BorderLayout..
 */
public class ShowBorderLayout extends JFrame {
    public ShowBorderLayout() {
        setLayout(new BorderLayout(5, 5));

        add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("Center"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        ShowBorderLayout showBorderLayout = new ShowBorderLayout();

        showBorderLayout.setSize(200, 200);
        showBorderLayout.setLocationRelativeTo(null);
        showBorderLayout.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        showBorderLayout.setTitle("ShowBorderLayout");
        showBorderLayout.setVisible(true);
    }
}
