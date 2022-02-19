package com.company;

import javax.swing.*;
import java.awt.*;

public class Fereastra extends JFrame {
    Fereastra() {
        super("Utilizare JSpinner");
        setSize(300, 200);
        SpinnerModel setari = new SpinnerNumberModel(0,0, 20,2);
        JSpinner spinner = new JSpinner(setari);

        JLabel text = new JLabel("Apasa pe buton");
        JButton button = new JButton("Calculeaza factorialul");
        button.addActionListener(e -> {
            int number = Integer.parseInt(spinner.getValue().toString());

            int factorial = 1;
            for(int i = 1; i <= number; i++){
                factorial = factorial * i;
            }

            text.setText(Integer.toString(factorial));
        });

        add(spinner, BorderLayout.NORTH);
        add(text, BorderLayout.CENTER);
        add(button, BorderLayout.WEST);

        setVisible(true);
    }
}
