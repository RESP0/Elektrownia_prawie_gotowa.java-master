package com.company.GUI.ElektrownieOkno;

import javax.swing.*;
import java.awt.*;

import com.company.Elektrownie.Elektrownia;
import com.company.Head.*;

public class ElektrowniaFotowoltaicznaOkno extends ElektrowniaOknoAbstract {

    JLabel zuzycie_paneli;

    public ElektrowniaFotowoltaicznaOkno(Elektrownia elektrownia, Gracz gracz) {
        super(elektrownia, gracz);
        //this.setTitle("Elektrownia fotowoltaiczna");
        magazyn.removeAll();
    }
}
