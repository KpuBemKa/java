package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Exemplul 1
 * */
public class Fereastra2 extends JFrame implements ActionListener {

    JLabel label;

    public Fereastra2(String titlu) {
        super(titlu);
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container x = getContentPane();
        x.setLayout(new FlowLayout());
        JButton A = new JButton("Buton 1");
        x.add(A);
        JButton B = new JButton("Buton 2");
        x.add(B);
        JButton C = new JButton("Buton 3");
        x.add(C);
        this.label = new JLabel("Apasa pe un buton");
        x.add(label);
        x.setBackground(Color.PINK);
        x.setFont(new Font("Dialog", Font.BOLD, 12));

        A.setToolTipText("Acesta este butonul 1");
        B.setToolTipText("Acesta este butonul 2");
        C.setToolTipText("Acesta este butonul 3");
        A.addActionListener(this);
        B.addActionListener(this);
        C.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Buton 1"))
            label.setText("A fost apasat butonul 1");
        else if (command.equals("Buton 2"))
            label.setText("A fost apasat butonul 2");
        else
            label.setText("A fost apasat butonul 3");
    }
}
