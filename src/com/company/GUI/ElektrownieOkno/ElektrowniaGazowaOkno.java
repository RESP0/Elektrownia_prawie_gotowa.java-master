package com.company.GUI.ElektrownieOkno;

import com.company.Elektrownie.Elektrownia;
import com.company.Head.Gracz;

import javax.swing.*;
import java.awt.*;

public class ElektrowniaGazowaOkno extends ElektrowniaOknoAbstract {

    public ElektrowniaGazowaOkno(Elektrownia elektrownia, Gracz gracz) {
        super(elektrownia, gracz);
        skrot(stanMagazynuLabel, "Stan magazynu", "nieznany",informacje);
        skrot(uzupelnianieLabel, "Cena uzupelnienia magazynu", "420",informacje);
    }
}
