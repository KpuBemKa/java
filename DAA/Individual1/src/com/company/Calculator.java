package com.company;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Calculator extends Frame {

    public String operations = "0";
    Label labelResultText;

    public Calculator() {
        setTitle("Calculator");
        setSize(200, 320);
        setLayout(new GridLayout(6, 1));
        setLocationRelativeTo(null);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        ActionListener presssButtonEvent = e -> {
            String buttonText = e.getSource().toString();
            String symbol = Character.toString(buttonText.charAt(buttonText.length()-2));
            addSymbol(symbol);
        };

        ActionListener pressDeleteEvent = e -> {
            if (operations.length() <= 1) {
                operations = "0";
                labelResultText.setText(operations);
                return;
            }

            String text = removeLastChars(operations, 1);
            if (text.charAt(text.length() - 1) == ' ') {
                text = removeLastChars(text, 1);
            }

            operations = text;
            labelResultText.setText(operations);
        };

        ActionListener pressClearEvent = e -> {
            operations = "0";
            labelResultText.setText(operations);
        };

        ActionListener pressEqualsEvent = e -> {
            operations = calculate();
            labelResultText.setText(operations);
        };

        Panel panelResult = new Panel();
        labelResultText = new Label("0");
        labelResultText.setAlignment(Label.RIGHT);
        labelResultText.setFont(new Font("Calibri", Font.PLAIN, 25));
        labelResultText.setPreferredSize(new Dimension(180, 40));
        panelResult.add(labelResultText);

        Panel panelFirstRow = new Panel(new FlowLayout(FlowLayout.RIGHT));
        ControlButton buttonClear = new ControlButton("C", pressClearEvent);
        ControlButton buttonDelete = new ControlButton("<-", pressDeleteEvent);
        ControlButton buttonDivide = new ControlButton("/", presssButtonEvent);
        panelFirstRow.add(buttonClear);
        panelFirstRow.add(buttonDelete);
        panelFirstRow.add(buttonDivide);

        Panel panelSecondRow = new Panel(new FlowLayout(FlowLayout.RIGHT));
        ControlButton button7 = new ControlButton("7", presssButtonEvent);
        ControlButton button8 = new ControlButton("8", presssButtonEvent);
        ControlButton button9 = new ControlButton("9", presssButtonEvent);
        ControlButton buttonMultiply = new ControlButton("*", presssButtonEvent);
        panelSecondRow.add(button7);
        panelSecondRow.add(button8);
        panelSecondRow.add(button9);
        panelSecondRow.add(buttonMultiply);

        Panel panelThirdRow = new Panel(new FlowLayout(FlowLayout.RIGHT));
        ControlButton button4 = new ControlButton("4", presssButtonEvent);
        ControlButton button5 = new ControlButton("5", presssButtonEvent);
        ControlButton button6 = new ControlButton("6", presssButtonEvent);
        ControlButton buttonAdd = new ControlButton("+", presssButtonEvent);
        panelThirdRow.add(button4);
        panelThirdRow.add(button5);
        panelThirdRow.add(button6);
        panelThirdRow.add(buttonAdd);

        Panel panelFourthRow = new Panel(new FlowLayout(FlowLayout.RIGHT));
        ControlButton button1 = new ControlButton("1", presssButtonEvent);
        ControlButton button2 = new ControlButton("2", presssButtonEvent);
        ControlButton button3 = new ControlButton("3", presssButtonEvent);
        ControlButton buttonMinus = new ControlButton("-", presssButtonEvent);
        panelFourthRow.add(button1);
        panelFourthRow.add(button2);
        panelFourthRow.add(button3);
        panelFourthRow.add(buttonMinus);

        Panel panelFifthRow = new Panel(new FlowLayout(FlowLayout.RIGHT));
        ControlButton button0 = new ControlButton("0", presssButtonEvent);
        ControlButton buttonPoint = new ControlButton(".", presssButtonEvent);
        ControlButton buttonEqual = new ControlButton("=", pressEqualsEvent);
        panelFifthRow.add(button0);
        panelFifthRow.add(buttonPoint);
        panelFifthRow.add(buttonEqual);

        add(panelResult);
        add(panelFirstRow);
        add(panelSecondRow);
        add(panelThirdRow);
        add(panelFourthRow);
        add(panelFifthRow);
        setVisible(true);
    }

    public void addSymbol(String symbol) {
        String lastCharacter = Character.toString(operations.charAt(operations.length() - 1));

        if (equalsOperators(symbol)) {
            if (equalsOperators(lastCharacter)) {
                operations = removeLastChars(operations, 1);
            }
        }

        if (lastCharacter.equals("0") && operations.length() <= 1)
            operations = "";

        operations += symbol;
        labelResultText.setText(operations);
    }

    boolean equalsOperators(String operator) {
        return switch (operator) {
            case "+", "-", "/", "*" -> true;
            default -> false;
        };
    }

    String calculate() {
        Double result = null;
        String toCalculate = operations.replaceAll(" ", "");

        String[] numbersToConvert = toCalculate.replaceAll("[+\\-/*]", " ").split(" ");
        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<String> operators = new ArrayList<>();

        // convert numbers
        for (String n : numbersToConvert) {
            numbers.add(Double.parseDouble(n));
        }

        // convert operators
        for (int i = 0; i < toCalculate.length(); i++) {
            String character = Character.toString(toCalculate.charAt(i));
            switch (character) {
                case "+":
                case "-":
                case "/":
                case "*":
                    operators.add(character);
                    break;
                default:
                    break;
            }
        }

        for (int i = 0; i < operators.size(); i++) {
            if (result == null)
                result = numbers.get(i);
            if (operators.get(i).equals("/") && numbers.get(i + 1) == 0.0)
                return "Cannot divide by 0";

            result = calc(result, numbers.get(i + 1), operators.get(i));
        }

        DecimalFormat df = new DecimalFormat("##.##");
        return df.format(result);
    }

    double calc(double number1, double number2, String operator) {
        switch (operator) {
            case "*":
                return number1 * number2;
            case "/":
                return number1 / number2;
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            default:
                return 0;
        }
    }

    String removeLastChars(String string, int numberOfChars) {
        return string.substring(0, string.length() - numberOfChars);
    }
}
