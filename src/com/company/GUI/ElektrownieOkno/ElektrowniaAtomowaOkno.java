package com.company.GUI.ElektrownieOkno;

import com.company.Elektrownie.Elektrownia;
import com.company.Head.Gracz;

public class ElektrowniaAtomowaOkno extends ElektrowniaOknoAbstract{
    public ElektrowniaAtomowaOkno(Elektrownia e, Gracz gracz){
        super(e, gracz);
        skrot(stanMagazynuLabel, "Stan magazynu", "nieznane",informacje);
        skrot(uzupelnianieLabel, "Cena wywozu odpadow", "420",informacje);
    }
}
