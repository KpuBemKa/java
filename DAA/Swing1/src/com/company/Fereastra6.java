package com.company;

import javax.swing.*;
import java.awt.*;

public class Fereastra6 extends JFrame {
    public Fereastra6(){
        setTitle("Buton cu iconite");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField text1 = new JTextField(8);
        JTextField text2 = new JTextField(8);

        ImageIcon usIcon = new ImageIcon("src/com/company/1.png"); //incarca imaginea
        ImageIcon caIcon = new ImageIcon("src/com/company/2.png");
        ImageIcon ukIcon = new ImageIcon("src/com/company/3.png");
        JButton jbt = new JButton("Click it!", usIcon);

        jbt.setPressedIcon(caIcon); //cind se executa butonul
        jbt.setRolloverIcon(ukIcon); //cursorul se misca pe buton
        jbt.addActionListener(e -> {
            int number1 = Integer.parseInt(text1.getText());
            int number2 = Integer.parseInt(text2.getText());
            if(number1 > number2){
                jbt.setText(text1.getText());
            } else {
                jbt.setText(text2.getText());
            }
        });
        add(text1);
        add(text2);
        add(jbt);
        setVisible(true);
    }

}
