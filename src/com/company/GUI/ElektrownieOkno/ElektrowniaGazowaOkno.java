package com.company.GUI.ElektrownieOkno;

import javax.swing.*;
import java.awt.*;

public class ElektrowniaGazowaOkno extends ElektrowniaOknoAbstract {

    JLabel dostawca_gazu;
    JLabel ilosc_gazu;

    public ElektrowniaGazowaOkno(){
        this.setTitle("Elektrownia gazowa");
        this.setResizable(false);
        this.setLayout(null);
        this.setSize(900, 630);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.black);

        this.setLayout(new GridBagLayout());
        JPanel panel = new JPanel();

        panel.setBackground(Color.black);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        this.add(panel, new GridBagConstraints());
/*
        nazwa = new JLabel("Nazwa elektrowni: ");
        tekst(nazwa);

        miasto = new JLabel("Lokalizacja elektrowni: ");
        tekst(miasto);

        moc_chwilowa = new JLabel("Moc chwilowa elektrowni: ");
        tekst(moc_chwilowa);

        moc_maksymalna = new JLabel("Moc maksymalna elektrowni: ");
        tekst(moc_maksymalna);

        liczba_pracowanikow = new JLabel("Liczba pracowników elektrowni: ");
        tekst(liczba_pracowanikow);

        ilosc_gazu = new JLabel("Ilosc gazu w elektrowni: ");
        tekst(ilosc_gazu);

        dostawca_gazu = new JLabel("Dostawca gazu: ");
        tekst(dostawca_gazu);

        czypracuje = new JLabel("Czy elektrownia pracuje: ");
        tekst(czypracuje);

        dystrybutor = new JLabel("Dystrybutor pradu: ");
        tekst(dystrybutor);
        */
        panel.add(nazwa);
        panel.add(miasto);
        panel.add(moc_chwilowa);
        panel.add(moc_maksymalna);
        panel.add(liczba_pracowanikow);
        panel.add(ilosc_gazu);
        panel.add(dostawca_gazu);
        panel.add(wlasciciel);
        panel.add(czypracuje);
        panel.add(dystrybutor);
    }
}
