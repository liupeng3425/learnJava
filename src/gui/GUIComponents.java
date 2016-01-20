package gui;

import javax.swing.*;

/**
 * Created by Peng on 2016/1/20.
 * GUI Components.
 */
public class GUIComponents {
    public static void main(String[] args) {
        // Create a button with text "OK"
        JButton jButtonOK = new JButton("OK");

        // Create a button with text "Cancel"
        JButton jButtonCancel = new JButton("Cancel");

        // Create a label with text "Enter your name:"
        JLabel jLabelEnterYourName = new JLabel("Enter your name:");

        // Create a text field with text "Type Name Here"
        JTextField jTextFieldTypeName = new JTextField("Type Name Here");

        // Create a check box with text "Bold"
        JCheckBox jCheckBoxBold = new JCheckBox("Bold");

        // Create a check box with text "italic"
        JCheckBox jCheckBoxItalic = new JCheckBox("italic");

        // Create a radio button with text "Red"
        JRadioButton jRadioButtonRed = new JRadioButton("Red");

        // Create a radio button with text "Yellow"
        JRadioButton jRadioButtonYellow = new JRadioButton("Yellow");

        // Create a combo box with several choices
        JComboBox<String> jComboBoxColor = new JComboBox<>(new String[]{"Freshman", "Sophomore", "Junior", "Senior"});

        // Create a panel to group components
        JPanel jPanel = new JPanel();
        jPanel.add(jCheckBoxBold);
        jPanel.add(jCheckBoxItalic);
        jPanel.add(jLabelEnterYourName);
        jPanel.add(jTextFieldTypeName);
        jPanel.add(jRadioButtonRed);
        jPanel.add(jRadioButtonYellow);
        jPanel.add(jComboBoxColor);
        jPanel.add(jButtonCancel);
        jPanel.add(jButtonOK);

        // Create a Frame
        JFrame jFrame = new JFrame();
        jFrame.add(jPanel);

        jFrame.setTitle("Show GUI components");
        jFrame.setSize(450, 100);
        jFrame.setLocation(200, 100);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
