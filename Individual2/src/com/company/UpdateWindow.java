package com.company;

import com.logic.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateWindow {
    private JPanel panelText;
    private JPanel panelDivider1;
    private JPanel panelTable;
    private JScrollPane scrollPanel;
    private JTable tableResult;
    private Table table;
    private JPanel rootPanel;
    private JButton buttonSend;
    private JButton buttonClear;
    private JPanel panelDivider3;
    private JPanel panelDivider2;
    private JLabel labelCurrent;
    private JLabel labelTitle;
    private JLabel labelSelect;
    private JLabel labelSelectData;
    private JTextField fieldID;
    private JTextField fieldUsername;
    private JTextField fieldPassword;
    private JTextField fieldName;
    private JTextField fieldSurname;
    private JTextField fieldMobileNumber;
    private JTextField fieldEmail;
    private JButton buttonRefresh;
    private JFrame frame;

    public UpdateWindow(){
        frame = new JFrame("Actualizarea registrărilor");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);

        table = new Table(tableResult);
        table.updateTable();

        frame.add(rootPanel);
        frame.pack();
        frame.setVisible(true);

        buttonSend.addActionListener(e -> {
            Integer id = Integer.parseInt(fieldID.getText());
            String username = fieldUsername.getText();
            String password = fieldPassword.getText();
            String name = fieldName.getText();
            String surname = fieldSurname.getText();
            String mobileNumber = fieldMobileNumber.getText();
            String email = fieldEmail.getText();

            boolean result = User.updateUser(id, username, password, name, surname, mobileNumber, email);

            if(result)
                JOptionPane.showMessageDialog(frame, "Datele au fost modificate cu succes", "Succes", JOptionPane.PLAIN_MESSAGE);
            else
                JOptionPane.showMessageDialog(frame, "A aparut o eroare", "Eroare", JOptionPane.ERROR_MESSAGE);
        });

        buttonClear.addActionListener(e -> {
            fieldID.setText("");
            fieldUsername.setText("");
            fieldPassword.setText("");
            fieldName.setText("");
            fieldSurname.setText("");
            fieldMobileNumber.setText("");
            fieldEmail.setText("");
        });

        buttonRefresh.addActionListener(e -> {
            table.updateTable();
        });
    }
}
