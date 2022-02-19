package com.company;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Frame frame = new Frame("Name");
        frame.setLayout(new GridLayout(7, 1, 10, 10));

        Panel first = new Panel();
        TextField squareInput = new TextField(10);
        Button squareCalculate = new Button("Patrat");
        Label squareResult = new Label("0");
        squareCalculate.addActionListener(e -> {
            try {
                Double value = Double.parseDouble(squareInput.getText());
                squareResult.setText(Double.toString(value * value));
            } catch (Exception ex) {
                squareResult.setText("Eroare");
            }
        });
        first.add(squareInput);
        first.add(squareCalculate);
        first.add(squareResult);

        Panel second = new Panel();
        Button redButton = new Button("Red");
        Button greenButton = new Button("Green");
        Button blueButton = new Button("Blue");
        Button yellowButton = new Button("Yellow");
        Button magentaButton = new Button("Magenta");
        redButton.addActionListener(e -> second.setBackground(Color.RED));
        greenButton.addActionListener(e -> second.setBackground(Color.GREEN));
        blueButton.addActionListener(e -> second.setBackground(Color.BLUE));
        yellowButton.addActionListener(e -> second.setBackground(Color.YELLOW));
        magentaButton.addActionListener(e -> second.setBackground(Color.MAGENTA));
        second.add(redButton);
        second.add(greenButton);
        second.add(blueButton);
        second.add(yellowButton);
        second.add(magentaButton);

        Panel third = new Panel();
        TextField calculatorFirstInput = new TextField(10);
        TextField calculatorSecondInput = new TextField(10);
        Button plusButton = new Button("+");
        Button minusButton = new Button("-");
        Button multiplicationButton = new Button("*");
        Button divideButton = new Button("/");
        Label calculatorResult = new Label(" = 0");
        calculatorResult.setSize(300, 40);

        plusButton.addActionListener(e -> {
            try {
                Double firstInput = Double.parseDouble(calculatorFirstInput.getText());
                Double secondInput = Double.parseDouble(calculatorSecondInput.getText());
                calculatorResult.setText(" = " + (firstInput + secondInput));
            } catch (Exception ex) {
                calculatorResult.setText("Eroare " + ex.getMessage());
            }
        });

        minusButton.addActionListener(e -> {
            try {
                Double firstInput = Double.parseDouble(calculatorFirstInput.getText());
                Double secondInput = Double.parseDouble(calculatorSecondInput.getText());
                calculatorResult.setText(" = " + (firstInput - secondInput));
            } catch (Exception ex) {
                calculatorResult.setText("Eroare " + ex.getMessage());
            }
        });

        multiplicationButton.addActionListener(e -> {
            try {
                Double firstInput = Double.parseDouble(calculatorFirstInput.getText());
                Double secondInput = Double.parseDouble(calculatorSecondInput.getText());
                calculatorResult.setText(" = " + (firstInput * secondInput));
            } catch (Exception ex) {
                calculatorResult.setText("Eroare " + ex.getMessage());
            }
        });

        divideButton.addActionListener(e -> {
            try {
                Double firstInput = Double.parseDouble(calculatorFirstInput.getText());
                Double secondInput = Double.parseDouble(calculatorSecondInput.getText());
                calculatorResult.setText(" = " + (firstInput / secondInput));
            } catch (Exception ex) {
                calculatorResult.setText("Eroare " + ex.getMessage());
            }
        });

        calculatorResult.setSize(calculatorResult.getPreferredSize());

        third.add(calculatorFirstInput);
        third.add(calculatorSecondInput);
        third.add(plusButton);
        third.add(minusButton);
        third.add(multiplicationButton);
        third.add(divideButton);
        third.add(calculatorResult);

        Panel fourth = new Panel();
        TextField textInput = new TextField();
        Button calculateLetters = new Button("Calculeaza");
        Label textResult = new Label("-");
        calculateLetters.addActionListener(e -> {
            try {
                String text = textInput.getText();
                int vowelCount = 0;

                for (int i = 0; i < text.length(); i++) {
                    char ch = text.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                        break;
                    }
                }

                textResult.setText("Nr. de vocale: " + vowelCount + ", nr. de consoale: " + (text.length() - vowelCount));
            } catch (Exception ex) {
                textResult.setText("Eroare " + ex.getMessage());
            }
        });

        fourth.add(textInput);
        fourth.add(calculateLetters);
        fourth.add(textResult);

        frame.add(first);
        frame.add(second);
        frame.add(third);
        frame.add(fourth);
        //frame.add(fifth);
        frame.pack();
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}
