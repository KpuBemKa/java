package com.company;

import com.logic.User;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.util.ArrayList;

public class Table {
    private JTable table;

    Table(JTable table){
        this.table = table;

        createTable();
    }

    private void createTable(){
        table.setModel(new DefaultTableModel(
                null,
                new String[]{"ID", "Username", "Password", "Numele", "Prenumele", "Telefonul", "E-mail-ul"}
        ));

        TableColumnModel columnModel = table.getColumnModel();
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i = 0; i < 6; i++){
            columnModel.getColumn(i).setCellRenderer(cellRenderer);
        }
    }

    public void updateTable(){
        ArrayList<User> users = User.getAllUsers();
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        model.setRowCount(0);
        for(User user : users){
            model.addRow(new Object[]{
                    user.getID(),
                    user.getUsername(),
                    user.getPassword(),
                    user.getName(),
                    user.getSurname(),
                    user.getMobileNumber(),
                    user.getEmail()
            });
        }
    }
}
