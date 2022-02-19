package com.company;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.Objects;

public class SchimbValutar extends JFrame {

    SchimbValutar() {
        setTitle("Schimb Valutar");
        setSize(300, 200);
        setLayout(new GridLayout(4, 1));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] valute = {"MDL", "EUR", "USD", "RUB", "UAH", "RON"};

        JPanel curs = new JPanel();
        JLabel cursIn = new JLabel("1 MDL");
        JLabel equals = new JLabel(" = ");
        JLabel cursOut = new JLabel("1 MDL");
        curs.add(cursIn);
        curs.add(equals);
        curs.add(cursOut);

        JPanel panelChoose = new JPanel();
        JComboBox<String> valutaIn = new JComboBox<>(valute);
        JComboBox<String> valutaOut = new JComboBox<>(valute);
        JLabel arrow = new JLabel(">>");
        panelChoose.add(valutaIn);
        panelChoose.add(arrow);
        panelChoose.add(valutaOut);

        JPanel panelIn = new JPanel();
        JLabel labelSuma = new JLabel("Suma: ");
        JTextField fieldInput = new JTextField(3);
        JLabel labelInChoosed = new JLabel("MDL");
        panelIn.add(labelSuma);
        panelIn.add(fieldInput);
        panelIn.add(labelInChoosed);

        JPanel panelOut = new JPanel();
        JLabel labelRezultat = new JLabel("Rezultat: ");
        JLabel labelOutput = new JLabel("0");
        JLabel labelOutChoosed = new JLabel("MDL");
        panelOut.add(labelRezultat);
        panelOut.add(labelOutput);
        panelOut.add(labelOutChoosed);

        valutaIn.addActionListener(e -> {
            DecimalFormat df = new DecimalFormat("#.##");
            String selectedItemIn = Objects.requireNonNull(valutaIn.getSelectedItem()).toString();
            String selectedItemOut = Objects.requireNonNull(valutaOut.getSelectedItem()).toString();
            cursIn.setText("1 " + selectedItemIn);
            cursOut.setText(df.format(schimb(selectedItemIn, selectedItemOut, 1)) + selectedItemOut);
            labelInChoosed.setText(selectedItemIn);
        });

        valutaOut.addActionListener(e -> {
            DecimalFormat df = new DecimalFormat("#.##");
            String selectedItemIn = Objects.requireNonNull(valutaIn.getSelectedItem()).toString();
            String selectedItemOut = Objects.requireNonNull(valutaOut.getSelectedItem()).toString();
            cursOut.setText(df.format(schimb(selectedItemIn, selectedItemOut, 1)) + selectedItemOut);
            labelOutChoosed.setText(selectedItemOut);
        });

        fieldInput.addActionListener(e -> {
            DecimalFormat df = new DecimalFormat("#.##");
            String selectedIn = Objects.requireNonNull(valutaIn.getSelectedItem()).toString();
            String selectedOut = Objects.requireNonNull(valutaOut.getSelectedItem()).toString();
            double amount = Double.parseDouble(fieldInput.getText());

            labelOutput.setText(df.format(schimb(selectedIn, selectedOut, amount)));
        });

        add(curs);
        add(panelChoose);
        add(panelIn);
        add(panelOut);

        setVisible(true);
    }

    double schimb(String input, String output, double amount) {
        double mdl = 0, eur = 0, usd = 0, rub = 0, uah = 0, ron = 0;

        switch (input) {
            case "MDL" -> {
                mdl = amount;
                eur = amount * 0.05;
                usd = amount * 0.06;
                rub = amount * 4.21;
                uah = amount * 1.57;
                ron = amount * 0.24;
            }
            case "EUR" -> {
                mdl = amount * 20.03;
                eur = amount;
                usd = amount * 1.12;
                rub = amount * 84.05;
                uah = amount * 31.39;
                ron = amount * 4.86;
            }
            case "USD" -> {
                mdl = amount * 17.83;
                eur = amount * 0.88;
                usd = amount;
                rub = amount * 75.25;
                uah = amount * 28.10;
                ron = amount * 4.35;
            }
            case "RUB" -> {
                mdl = amount * 0.24;
                eur = amount * 0.01;
                usd = amount * 0.01;
                rub = amount;
                uah = amount * 0.28;
                ron = amount * 0.04;
            }
            case "UAH" -> {
                mdl = amount * 0.64;
                eur = amount * 0.04;
                usd = amount * 0.03;
                rub = amount * 2.68;
                uah = amount;
                ron = amount * 0.15;
            }
            case "RON" -> {
                mdl = amount * 4.11;
                eur = amount * 0.20;
                usd = amount * 0.23;
                rub = amount * 17.30;
                uah = amount * 6.39;
                ron = amount;
            }
        }

        switch (output) {
            case "MDL" -> {
                return mdl;
            }
            case "EUR" -> {
                return eur;
            }
            case "USD" -> {
                return usd;
            }
            case "RUB" -> {
                return rub;
            }
            case "UAH" -> {
                return uah;
            }
            case "RON" -> {
                return ron;
            }
        }

        return 0;
    }
}
