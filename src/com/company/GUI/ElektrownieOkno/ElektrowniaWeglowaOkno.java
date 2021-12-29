package com.company.GUI.ElektrownieOkno;

import com.company.Elektrownie.Elektrownia;

import javax.swing.*;
import java.awt.*;

public class ElektrowniaWeglowaOkno extends ElektrowniaOknoAbstract{
    public ElektrowniaWeglowaOkno(Elektrownia elektrownia){
        super(elektrownia);
        this.setTitle("Elektrownia weglowa");

    }
}

