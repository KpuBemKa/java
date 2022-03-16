package com.company;

import com.logic.User;

import javax.swing.*;
import java.util.ArrayList;

public class MainWindow {
    private JPanel rootPanel;
    private JButton buttonDelete;
    private JButton buttonUpdate;
    private JButton buttonInsert;
    private JButton buttonSelect;
    private JFrame frame;

    public MainWindow() {
        frame = new JFrame("Lucrarea individuală nr. 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(rootPanel);

        frame.pack();
        frame.setVisible(true);

        buttonInsert.addActionListener(e -> {
            new InsertWindow();
        });

        buttonSelect.addActionListener(e -> {
            new SelectWindow();
        });

        buttonUpdate.addActionListener(e -> {
            new UpdateWindow();
        });

        buttonDelete.addActionListener(e -> {
            new DeleteWindow();
        });
    }
}
