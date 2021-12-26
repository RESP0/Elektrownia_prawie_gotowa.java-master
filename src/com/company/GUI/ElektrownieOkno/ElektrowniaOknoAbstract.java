package com.company.GUI.ElektrownieOkno;

import javax.swing.*;
import java.awt.*;

abstract public class ElektrowniaOknoAbstract extends JFrame{
//do usuniecia
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
    JPanel reakcjaNaAtak;
    JPanel reakcjaNaAwarie;
    JPanel moc;
    JPanel kiedyDokupicWegiel;

    public ElektrowniaOknoAbstract() {
        this.setResizable(false);
        this.setLayout(new GridLayout());
        this.setSize(900, 630);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.black);


        podstawoweAkcje = new JPanel();
        wybory = new JPanel();
        skroty = new JPanel();

        podstawoweAkcje.setBackground(Color.black);
        podstawoweAkcje.setLayout(new BoxLayout(podstawoweAkcje, BoxLayout.Y_AXIS));
        this.add(podstawoweAkcje, new GridBagConstraints());

        wybory.setBackground(new Color(80, 90, 100));
        wybory.setLayout(new BoxLayout(wybory, BoxLayout.Y_AXIS));
        this.add(wybory, new GridBagConstraints());

        skroty.setBackground(Color.blue);
        skroty.setLayout(new BoxLayout(skroty, BoxLayout.Y_AXIS));
        this.add(skroty, new GridBagConstraints());


        //------------- WYBORY -------------

        reakcjaNaAtak = new JPanel();
        reakcjaNaAwarie = new JPanel();
        moc = new JPanel();
        kiedyDokupicWegiel = new JPanel();

        reakcjaNaAtak.setBackground(new Color(100, 100, 100));
        reakcjaNaAtak.setLayout(new CardLayout());
        wybory.add(reakcjaNaAtak, new GridBagConstraints());

        JLabel reakcjaNaAtakLabel = new JLabel("REAKCJA NA ATAK", SwingConstants.CENTER);
        reakcjaNaAtakLabel.add(Box.createRigidArea(new Dimension(0,200)));
        reakcjaNaAtakLabel.setVerticalAlignment(SwingConstants.TOP);
        tekst(reakcjaNaAtakLabel);
        reakcjaNaAtak.add(reakcjaNaAtakLabel);


        JButton b=new JButton("Click Me..");
        b.setBounds(10,10,50, 50);
        reakcjaNaAtak.add(b);

        reakcjaNaAwarie.setBackground(new Color(80, 90, 100));
        reakcjaNaAwarie.setLayout(new CardLayout());
        wybory.add(reakcjaNaAwarie, new GridBagConstraints());

        JLabel reakcjaNaAwarieLabel = new JLabel("REAKCJA NA AWARIE", SwingConstants.CENTER);
        reakcjaNaAwarieLabel.setVerticalAlignment(SwingConstants.TOP);
        tekst(reakcjaNaAwarieLabel);
        reakcjaNaAwarie.add(reakcjaNaAwarieLabel);

        moc.setBackground(new Color(100, 100, 100));
        moc.setLayout(new CardLayout());
        wybory.add(moc, new GridBagConstraints());

        JLabel mocLabel = new JLabel("MOC", SwingConstants.CENTER);
        mocLabel.setVerticalAlignment(SwingConstants.TOP);
        tekst(mocLabel);
        moc.add(mocLabel);

        JSlider mocSlider = new JSlider(0, 10, 1);
        mocSlider.setPaintTrack(true);
        mocSlider.setPaintTicks(true);
        mocSlider.setPaintLabels(true);
        moc.add(mocSlider);

        kiedyDokupicWegiel.setBackground(new Color(80, 90, 100));
        kiedyDokupicWegiel.setLayout(new CardLayout());
        wybory.add(kiedyDokupicWegiel, new GridBagConstraints());

        JLabel kiedyDokupicLabel = new JLabel("KIEDY DOKUPIC WĘGIEL", SwingConstants.CENTER);
        kiedyDokupicLabel.setVerticalAlignment(SwingConstants.TOP);
        tekst(kiedyDokupicLabel);
        kiedyDokupicWegiel.add(kiedyDokupicLabel);
    }


    public void tekst(JLabel tekst){
        tekst.setFont(new Font("Arial black", Font.BOLD, 20));
        tekst.setForeground(Color.white);
    }
}