package com.company.GUI;

import javax.swing.*;
import java.awt.*;

public class Gra extends JPanel{
    ImageIcon plansza;
    JLabel tlo;
    JButton atomowa;
    JButton weglowa;
    JButton gazowa;
    JButton fotowoltaiczna;
    JButton nastepnyDzien;

    Gra(int szer, int wys){
        this.setPreferredSize(new Dimension(szer,wys));
        plansza = new ImageIcon("plansza.jpg");
        tlo = new JLabel();
        tlo.setIcon(plansza);
        this.add(tlo);

        //atomowa
        ImageIcon Atomowa = new ImageIcon("Atomowa_v2.png");
        atomowa = new JButton(Atomowa);
        atomowa.setBounds(200, 30, 343, 147);
        atomowa.setFocusable(false);

        //weglowa
        ImageIcon Weglowa = new ImageIcon("Elektrownia_weglowa.png");
        weglowa = new JButton(Weglowa);
        weglowa.setBounds(650, 150, 197, 130);
        weglowa.setFocusable(false);

        //gazowa
        ImageIcon Gazowa = new ImageIcon("Elektrownia_gazowa.png");
        gazowa = new JButton(Gazowa);
        gazowa.setBounds(20, 380, 197, 130);
        gazowa.setFocusable(false);

        //fotowoltaiczna
        ImageIcon Fotowoltaiczna = new ImageIcon("Elektrownia_fotowoltaiczna.png");
        fotowoltaiczna = new JButton(Fotowoltaiczna);
        fotowoltaiczna.setBounds(480, 510, 320, 85);

        //nastepny dzien
        nastepnyDzien = new JButton("Nastepny dzien");
        nastepnyDzien.setBounds(480, 510, 320, 85);
        nastepnyDzien.setFocusable(false);

        //dodaje przyciski do okna
        tlo.add(atomowa);
        tlo.add(weglowa);
        tlo.add(gazowa);
        tlo.add(fotowoltaiczna);
        tlo.add(nastepnyDzien);
    }
}
