package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by Peng on 2016/1/27.
 * using implements.
 */
public class HandleEventWithImplements extends JFrame implements ActionListener {
    public HandleEventWithImplements() throws HeadlessException {
        JButton jButtonOK = new JButton("OK");
        JButton jButtonCancel = new JButton("Cancel");

        setLayout(new BorderLayout(5, 5));

        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jPanel.add(jButtonOK);
        jPanel.add(jButtonCancel);

        add(jPanel, BorderLayout.CENTER);

        jButtonCancel.addActionListener(this);
        jButtonOK.addActionListener(this);
    }

    public static void main(String[] args) {
        HandleEventWithImplements handleEventWithImplements = new HandleEventWithImplements();

        handleEventWithImplements.setSize(400, 200);
        handleEventWithImplements.setTitle("ClickEvent");
        handleEventWithImplements.setLocationRelativeTo(null);
        handleEventWithImplements.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        handleEventWithImplements.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "OK":
                System.out.println("OK." + new Date(e.getWhen()));
                break;
            case "Cancel":
                System.out.println("Cancel." + new Date(e.getWhen()));
                break;
            default:
                System.out.println(e.paramString());
                System.out.println(e.getActionCommand());
                System.out.println(e.getModifiers());
                System.out.println(e.getWhen());
                break;
        }
    }
}