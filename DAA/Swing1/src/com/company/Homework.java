package com.company;

import javax.swing.*;
import java.awt.*;

public class Homework extends JFrame {

    public Homework() {
        setTitle("Ecuatii patrate");
        setSize(300, 200);
        setLayout(new GridLayout(3, 1));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JTextField inputA = new JTextField(2);
        JTextField inputB = new JTextField(2);
        JTextField inputC = new JTextField(2);
        inputA.setHorizontalAlignment(SwingConstants.RIGHT);
        inputB.setHorizontalAlignment(SwingConstants.RIGHT);
        inputC.setHorizontalAlignment(SwingConstants.RIGHT);
        JLabel patrat = new JLabel("x2  + ");
        JLabel regular = new JLabel("x  + ");
        JLabel rest = new JLabel(" =  0");

        panel.add(inputA);
        panel.add(patrat);
        panel.add(inputB);
        panel.add(regular);
        panel.add(inputC);
        panel.add(rest);
        add(panel);

        JButton button = new JButton("Calculeaza");
        JLabel answer = new JLabel("Introduceti datele si apasati pe buton.");

        button.addActionListener(e -> {
            try {
                int a = Integer.parseInt(inputA.getText());
                int b = Integer.parseInt(inputB.getText());
                int c = Integer.parseInt(inputC.getText());

                double D = b*b - 4 * a * c;

                if(D < 0){
                    answer.setText("Delta este mai mica ca zero");
                    return;
                }

                double result1 = (-b - Math.sqrt(D)) / (a * a);
                double result2 = (-b + Math.sqrt(D)) / (a * a);

                if(result1 == result2){
                    answer.setText("x = " + result1);
                } else {
                    answer.setText("x1 = " + result1 + "   |   x2 = " + result2);
                }
            } catch (Exception ex) {
                System.out.println(ex);
                answer.setText("Introduceti datele corect.");
            }
        });

        add(button);
        add(answer);

        setVisible(true);
    }
}
