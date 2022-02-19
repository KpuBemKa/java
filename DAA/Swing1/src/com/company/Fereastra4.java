package com.company;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * Exemplul 2
 * */
public class Fereastra4 extends JFrame {

    public Fereastra4() {
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
        JButton jbtLeft = new JButton("Stinga");
        JButton jbtCenter = new JButton("Centru");
        JButton jbtRight = new JButton("Dreapta");

        p1.add(jbtLeft);
        p1.add(jbtCenter);
        p1.add(jbtRight);

        p1.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));

        p1.setBorder(new TitledBorder("Trei butoane avem aici: "));
        jbtRight.setToolTipText("Acesta este butonul drept");
        jbtCenter.setForeground(Color.GREEN);
        jbtLeft.setBackground(Color.WHITE);

        JPanel p2 = new JPanel(new GridLayout(1, 2));
        JLabel jlblRed = new JLabel("Rosu");
        JLabel jlblOrange = new JLabel("Salut");

        jlblRed.setForeground(Color.RED);
        jlblOrange.setForeground(Color.ORANGE);
        jlblOrange.setFont(new Font("TimesRoman", Font.BOLD, 20));
        jlblOrange.setBorder(new LineBorder(Color.BLACK, 2));

        p2.add(jlblRed);
        p2.add(jlblOrange);

        setLayout(new GridLayout(2, 1));
        setTitle("Testare Swing ");
        setSize(300, 150);


        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(p1);
        add(p2);
    }
}