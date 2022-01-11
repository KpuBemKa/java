package com.strategii;

import com.company.IAmenda;

public class CautaCNP implements Strategie{
    String CNP;

    public CautaCNP(String CNP) {
        this.CNP = CNP;
    }

    @Override
    public boolean conditie(IAmenda amenda) {
        return this.CNP.equals(amenda.getCNP());
    }
}
