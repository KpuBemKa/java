package com.company;

import com.logic.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteWindow {
    private JPanel panelText;
    private JLabel labelTitle;
    private JPanel panelDivider1;
    private JPanel panelTable;
    private JScrollPane scrollPanel;
    private JTable tableResult;
    private Table table;
    private JLabel labelCurrent;
    private JPanel panelDivider2;
    private JButton buttonSend;
    private JLabel labelSelect;
    private JPanel rootPanel;
    private JTextField fieldID;
    private JButton buttonRefresh;
    JFrame frame;

    public DeleteWindow(){
        frame = new JFrame("Ștergerea registrărilor");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);

        table = new Table(tableResult);
        table.updateTable();

        frame.add(rootPanel);
        frame.pack();
        frame.setVisible(true);

        buttonSend.addActionListener(e -> {
            Integer id = Integer.parseInt(fieldID.getText());

            boolean result = User.deleteUser(id);

            if(result)
                JOptionPane.showMessageDialog(frame, "Datele au fost sterse cu succes", "Succes", JOptionPane.PLAIN_MESSAGE);
            else
                JOptionPane.showMessageDialog(frame, "A aparut o eroare", "Eroare", JOptionPane.ERROR_MESSAGE);
        });

        buttonRefresh.addActionListener(e -> {
            table.updateTable();
        });
    }
}
