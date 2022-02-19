package com.company;

import javax.naming.ldap.Control;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlButton extends Button{

    public ControlButton(String text, ActionListener actionListener) {
        super(text);
        setPreferredSize(new Dimension(40, 40));
        addActionListener(actionListener);
    }
}
