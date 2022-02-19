package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Exemplul 4
 * */
public class ButtonExample {
    ButtonExample() {
        JFrame f = new JFrame("Button Example");
        f.setLayout(new FlowLayout());
        ImageIcon icon = new ImageIcon("src/com/company/imagine.png");
        JButton b = new JButton(icon);

        JTextField text = new JTextField(8);

        b.addActionListener(e -> {
            Integer number = Integer.parseInt(text.getText());
            JOptionPane.showMessageDialog(f, "Patratul numarului este: " + number*number);
        });

        f.add(new JLabel("Introduceti un numar: "));
        f.add(text);
        f.add(b);
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}