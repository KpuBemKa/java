package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Exemplul 3
 * */
public class Fereastra3 extends JFrame implements ActionListener {
    JTextField name;
    JTextField gen;
    JTextField prenume;

    public Fereastra3() {
        setTitle("Detalii");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        this.name = new JTextField(8);
        this.gen = new JTextField(8);
        this.prenume = new JTextField(8);
        JButton afiseaza = new JButton("Afiseaza");
        JButton close = new JButton("Inchide");

        add(new JLabel("Nume"));
        add(name);
        add(new JLabel("Gen"));
        add(gen);
        add(new JLabel("Prenume"));
        add(prenume);
        add(afiseaza);
        add(close);

        afiseaza.addActionListener(this);
        close.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();
        if (command.equals("Afiseaza")) {
            System.out.println(name.getText() + ", " + gen.getText() + ", " + prenume.getText());
        } else if (command.equals("Inchide")) {
            setVisible(false);
            dispose();
        }
    }
}