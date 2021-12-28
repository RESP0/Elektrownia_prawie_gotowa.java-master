package com.company.GUI;

import javax.swing.*;
import java.awt.*;

public class Menue extends JPanel {

    JButton nowaGra;
    JButton wczytajGre;
    JButton zakoncz;
    JLabel label;

    Menue(int szer, int wys){
        //USTAWIENIA PANELU
        this.setPreferredSize(new Dimension(szer,wys));
        this.setBackground(Color.gray);

        //TYTUŁ
        label = new JLabel("ELEKTROWNIE");
        this.add(Box.createRigidArea(new Dimension(0,50)));
        label.setFont(new Font("Ink Free",Font.BOLD,120));
        label.setForeground(Color.white);
        label.setAlignmentX(CENTER_ALIGNMENT);
        this.add(label);


        //UKŁAD PANELU
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));

        //PRZYCISK NOWA GRA
        this.add(Box.createRigidArea(new Dimension(0,150)));
        nowaGra = new JButton("Nowa Gra");
        przycisk(nowaGra);

        //PRZYCISK WCZYTAJ GRE
        wczytajGre = new JButton("Wczytaj Gre");
        przycisk(wczytajGre);

        //PRZYCISK ZAKONCZ
        zakoncz = new JButton("Zamknij");
        przycisk(zakoncz);

    }
    public void przycisk(JButton button){
        button.setBackground(Color.cyan);
        button.setFocusable(false);
        button.setFont(new Font("Arial black", Font.BOLD, 40));
        button.setAlignmentX(CENTER_ALIGNMENT);
        this.add(button);
        this.add(Box.createRigidArea(new Dimension(0,10)));
    }


}
