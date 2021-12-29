package com.company.GUI.ElektrownieOkno;

import com.company.Elektrownie.Elektrownia;

public class ElektrowniaAtomowaOkno extends ElektrowniaOknoAbstract {
    public ElektrowniaAtomowaOkno(Elektrownia e){
        super(e);
        this.setTitle("Elektrownia atomowa");
        skrot("Aktualna liczba pracownikow", "",informacje);
    }

}
