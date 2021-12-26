package com.company.GUI.ElektrownieOkno;

import javax.swing.*;
import java.awt.*;

abstract public class ElektrowniaOknoAbstract extends JFrame{

    JLabel nazwa;
    JLabel miasto;
    JLabel moc_chwilowa;
    JLabel moc_maksymalna;
    JLabel liczba_pracowanikow;
    JLabel czypracuje;
    JLabel dystrybutor;
    JPanel wlasciciel;
    JPanel podstawoweAkcje;
    JPanel wybory;
    JPanel skroty;

    public ElektrowniaOknoAbstract() {
        this.setResizable(false);
        this.setLayout(null);
        this.setSize(900, 630);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.black);

        podstawoweAkcje = new JPanel();
        wybory = new JPanel();
        skroty = new JPanel();

        podstawoweAkcje.setBackground(Color.black);
        podstawoweAkcje.setLayout(new BoxLayout(podstawoweAkcje, BoxLayout.Y_AXIS));
        this.add(podstawoweAkcje, new GridBagConstraints());

        wybory.setBackground(Color.green);
        wybory.setLayout(new BoxLayout(wybory, BoxLayout.Y_AXIS));
        this.add(wybory, new GridBagConstraints());

        skroty.setBackground(Color.blue);
        skroty.setLayout(new BoxLayout(skroty, BoxLayout.Y_AXIS));
        this.add(skroty, new GridBagConstraints());

    }


    public void tekst(JLabel tekst){
        tekst.setFont(new Font("Arial black", Font.BOLD, 20));
        tekst.setForeground(Color.white);
    }
}