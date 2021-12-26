package com.company.GUI;

import javax.swing.*;

import com.company.Elektrownie.Elektrownia;
import com.company.Elektrownie.ElektrowniaAtomowa;
import com.company.Head.Gracz;

import java.util.ArrayList;

public class ListaEle extends JPanel {
    ListaEle(Gracz gracz, Elektrownia e){
        for (Elektrownia elektrownia : gracz.getListaElektrowni()){
            if (elektrownia.getClass() == e.getClass()){
                System.out.println("0");
            }
        }
    }

}
