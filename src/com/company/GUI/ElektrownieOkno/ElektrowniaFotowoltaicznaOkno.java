package com.company.GUI.ElektrownieOkno;

import javax.swing.*;
import java.awt.*;

import com.company.Elektrownie.Elektrownia;
import com.company.Head.*;

public class ElektrowniaFotowoltaicznaOkno extends ElektrowniaOknoAbstract {

    public ElektrowniaFotowoltaicznaOkno(Elektrownia elektrownia, Gracz gracz) {
        super(elektrownia, gracz);
        //skrot("Zuzycie paneli", "0%",informacje);
        magazyn.removeAll();
        kiedyDokupic.removeAll();
    }
}
