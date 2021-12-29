package com.company.GUI.ElektrownieOkno;

import com.company.Elektrownie.Elektrownia;

import javax.swing.*;
import java.awt.*;

public class ElektrowniaGazowaOkno extends ElektrowniaOknoAbstract {

    public ElektrowniaGazowaOkno(Elektrownia elektrownia) {
        super(elektrownia);
        this.setTitle("Elektrownia gazowa");
    }
}
