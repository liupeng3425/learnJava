package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Peng on 2016/1/27.
 * handle button click event.
 */
public class HandleEvent extends JFrame {
    public HandleEvent() throws HeadlessException {
        JButton jButtonOK = new JButton("OK");
        JButton jButtonCancel = new JButton("Cancel");

        setLayout(new FlowLayout(FlowLayout.CENTER));

        add(jButtonOK);
        add(jButtonCancel);

        // jdk1.8 新特性 lambda 表达式。

//        jButtonCancel.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Cancel.");
//                System.out.println(e.getActionCommand());
//            }
//        });

        jButtonCancel.addActionListener(e -> {
            System.out.println("Cancel.");
            System.out.println(e.getActionCommand());
        });

//        jButtonOK.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("OK.");
//                System.out.println(e.paramString());
//            }
//        });

        jButtonOK.addActionListener(e -> {
            System.out.println("OK.");
            System.out.println(e.paramString());
        });
    }

    public static void main(String[] args) {
        HandleEvent handleEvent = new HandleEvent();

        handleEvent.setSize(400, 200);
        handleEvent.setTitle("ClickEvent");
        handleEvent.setLocationRelativeTo(null);
        handleEvent.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        handleEvent.setVisible(true);
    }
}
