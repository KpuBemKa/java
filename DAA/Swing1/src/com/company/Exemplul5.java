package com.company;

import javax.swing.*;
import java.awt.*;

public class Exemplul5 extends JFrame {
    Exemplul5() {
        setTitle("Titlu");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton button = new JButton("Click aici!");
        JLabel label = new JLabel();


        button.addActionListener(e ->{
            String text = JOptionPane.showInputDialog("Introduceti un cuvant ");
            label.setText(text);
        });

        add(button);
        add(label);

        setVisible(true);
    }
}
