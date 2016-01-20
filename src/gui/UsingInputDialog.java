package gui;

import javax.swing.*;

/**
 * Created by Peng on 2016/1/20.
 * using input dialog.
 */
public class UsingInputDialog {
    public static void main(String[] args) {
        String inputInt;
        int number1, number2;

        inputInt = JOptionPane.showInputDialog(null, "input a integer", "number1", JOptionPane.QUESTION_MESSAGE);

        number1 = Integer.parseInt(inputInt);

        inputInt = JOptionPane.showInputDialog(null, "input the second number", "number2", JOptionPane.QUESTION_MESSAGE);
        number2 = Integer.parseInt(inputInt);

        JOptionPane.showMessageDialog(null, String.format("%d + %d = %d", number1, number2, number1 + number2), "Sum", JOptionPane.INFORMATION_MESSAGE);

//        System.out.print(number1);
//        System.out.print(" + " + number2);
//        System.out.println(" = " + (number1 + number2));
    }
}
