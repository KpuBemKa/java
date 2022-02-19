package com.strategii;

import com.company.IAmenda;
import com.company.ParcareaIlegala;

public class CautaParcareaIlegala implements Strategie{
    @Override
    public boolean conditie(IAmenda amenda) {
        return amenda instanceof ParcareaIlegala;
    }
}
