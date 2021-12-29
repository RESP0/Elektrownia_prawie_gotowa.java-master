package com.company.GUI.ElektrownieOkno;

import com.company.Elektrownie.Elektrownia;
import com.company.Head.Gracz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElektrowniaAtomowaOkno extends ElektrowniaOknoAbstract{
    public ElektrowniaAtomowaOkno(Elektrownia e, Gracz gracz){
        super(e, gracz);
        this.setTitle("Elektrownia atomowa");
        skrot("Aktualna liczba pracownikow", "",informacje);
    }
}
