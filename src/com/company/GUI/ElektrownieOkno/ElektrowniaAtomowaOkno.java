package com.company.GUI.ElektrownieOkno;

import com.company.Elektrownie.Elektrownia;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;

public class ElektrowniaAtomowaOkno extends ElektrowniaOknoAbstract {
    public ElektrowniaAtomowaOkno(Elektrownia e){
        super(e);
        this.setTitle("Elektrownia atomowa");
        skrot("Twoja stara", "test",skroty);
    }

}
