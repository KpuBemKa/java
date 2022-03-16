package com.company;

import com.logic.User;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SelectWindow {
    private JFrame frame;
    private JPanel panelMain;
    private JPanel panelText;
    private JPanel panelDivider1;
    private JPanel panelTable;
    private JTable tableResult;
    private Table table;
    private JScrollPane scrollPanel;
    private JPanel rootPanel;
    private JButton buttonRefresh;

    public SelectWindow(){
        frame = new JFrame("Registrările curente");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);

        table = new Table(tableResult);
        table.updateTable();

        frame.add(rootPanel);
        frame.pack();
        frame.setVisible(true);

        buttonRefresh.addActionListener(e -> {
            table.updateTable();
        });
    }

}
