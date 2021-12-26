package com.company.GUI.ElektrownieOkno;

import javax.swing.*;
import java.awt.*;

public class ElektrowniaOknoAbstract extends JFrame{
    JLabel miasto;
    JLabel moc_chwilowa;
    JLabel moc_maksymalna;
    JLabel liczba_pracowanikow;
    JLabel wlasciciel;
    JLabel czypracuje;
    JLabel dystrybutor;


    public void tekst(JLabel tekst){
        tekst.setFont(new Font("Arial black", Font.BOLD, 20));
        tekst.setForeground(Color.white);
    }
}
