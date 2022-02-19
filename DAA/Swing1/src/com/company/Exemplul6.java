package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Exemplul6 extends JFrame {
    public Exemplul6() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int a = JOptionPane.showConfirmDialog(null, "Sunteti siguri?", "Selectati o optiune", JOptionPane.YES_NO_OPTION);
                if (a == JOptionPane.YES_OPTION) {
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });

        setLayout(new BorderLayout());

        JButton yellow = new JButton("Galben");
        yellow.setBackground(Color.YELLOW);
        yellow.addActionListener(e -> getContentPane().setBackground(Color.YELLOW));

        JButton green = new JButton("Verde");
        green.setBackground(Color.GREEN);
        green.addActionListener(e -> getContentPane().setBackground(Color.GREEN));

        JButton blue = new JButton("Albastru");
        blue.setBackground(Color.BLUE);
        blue.addActionListener(e -> getContentPane().setBackground(Color.BLUE));

        add(yellow, BorderLayout.EAST);
        add(green, BorderLayout.NORTH);
        add(blue, BorderLayout.WEST);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);
    }
}