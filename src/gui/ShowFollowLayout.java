package gui;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by Peng on 2016/1/24.
 * using LayoutManager.
 */
public class ShowFollowLayout extends JFrame {
    public ShowFollowLayout() {
        // set FollowLayout, aligned left with horizontal gap 10
        // and vertical gap 20 between components.
        setLayout(new GridLayout(2, 1, 10, 20));

        // add labels and text fields to the frame.
        JPanel jPanelOthers = new JPanel();
        jPanelOthers.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        jPanelOthers.add(new JLabel("First name"));
        jPanelOthers.add(new JTextField(8));
        jPanelOthers.add(new JLabel("MI"));
        jPanelOthers.add(new JTextField(1));
        jPanelOthers.add(new JLabel("Last Name"));
        jPanelOthers.add(new JTextField(8));

        JPanel jPanelButton = new JPanel();
        jPanelButton.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        jPanelButton.add(new JButton("OK"));
        jPanelButton.add(new JButton("Cancel"));
        jPanelOthers.setBorder(new TitledBorder("Others"));

        add(jPanelOthers);
        add(jPanelButton);
    }

    public static void main(String[] args) {
        ShowFollowLayout showFollowLayout = new ShowFollowLayout();

        showFollowLayout.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        showFollowLayout.setTitle("ShowFollowLayout");
        showFollowLayout.setSize(600, 200);
        showFollowLayout.setLocationRelativeTo(null);

        showFollowLayout.setVisible(true);
    }
}
