package com.company;

import com.logic.User;

import javax.swing.*;

public class InsertWindow {
    private JPanel rootPanel;
    private JPanel panelText;
    private JLabel labelTitle;
    private JPanel panelDivider1;
    private JButton buttonClear;
    private JButton buttonSend;
    private JTextField fieldUsername;
    private JTextField fieldPassword;
    private JTextField fieldName;
    private JTextField fieldSurname;
    private JTextField fieldMobileNumber;
    private JTextField fieldEmail;
    private JFrame frame;

    InsertWindow(){
        frame = new JFrame("Înregistrare nouă");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.add(rootPanel);
        frame.pack();
        frame.setVisible(true);

        buttonSend.addActionListener(e -> {
            String username = fieldUsername.getText();
            String password = fieldPassword.getText();
            String name = fieldName.getText();
            String surname = fieldSurname.getText();
            String mobileNumber = fieldMobileNumber.getText();
            String email = fieldEmail.getText();

            boolean result = User.newUser(username, password, name, surname, mobileNumber, email);

            if(result)
                JOptionPane.showMessageDialog(frame, "Datele au fost introduse cu succes", "Succes", JOptionPane.PLAIN_MESSAGE);
            else
                JOptionPane.showMessageDialog(frame, "A aparut o eroare", "Eroare", JOptionPane.ERROR_MESSAGE);
        });

        buttonClear.addActionListener(e -> {
            fieldUsername.setText("");
            fieldPassword.setText("");
            fieldName.setText("");
            fieldSurname.setText("");
            fieldMobileNumber.setText("");
            fieldEmail.setText("");
        });
    }
}
