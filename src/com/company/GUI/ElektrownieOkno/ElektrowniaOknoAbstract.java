package com.company.GUI.ElektrownieOkno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract public class ElektrowniaOknoAbstract extends JFrame implements ActionListener{
//do usuniecia
    JLabel nazwa;
    JLabel miasto;
    JLabel moc_chwilowa;
    JLabel moc_maksymalna;
    JLabel liczba_pracowanikow;
    JLabel czypracuje;
    JLabel dystrybutor;
    JPanel wlasciciel;
    JLabel ilosc_wegla;// tyle

    //akcje
    JPanel podstawoweAkcje;
    JPanel wegiel;
    JPanel pracownicy;
    JPanel sprzedaj;
    JPanel dostawca;
    JButton dokupButton;
    JButton zatrudnijPracownika;
    JButton zwolnijPracownika;
    JButton nowyDostawca;  //<--- bedzie losowac nowego dostawce pradu z kilku zapisanch
    JButton sprzedajButton;

    //wybory
    JPanel wybory;
    JPanel reakcjaNaAtak;
    JPanel reakcjaNaAwarie;
    JPanel moc;
    JPanel kiedyDokupicWegiel;

    //skroty
    JPanel skroty;
    JButton zapiszIZamknij;

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

        //------------- PODSTAWOWE AKCJE -------------

        wegiel = new JPanel();
        pracownicy = new JPanel();
        sprzedaj = new JPanel();
        dostawca = new JPanel();

        wegiel.setBackground(new Color(60, 100, 160));
        wegiel.setLayout(new CardLayout());
        podstawoweAkcje.add(wegiel, new GridBagConstraints());

        JLabel iloscWeglaLabel = new JLabel("ILOSC WEGLA W MAGAZYNIE", SwingConstants.CENTER);
        iloscWeglaLabel.setVerticalAlignment(SwingConstants.TOP);
        tekst(iloscWeglaLabel);
        wegiel.add(iloscWeglaLabel);

        wegiel.setLayout(new FlowLayout());

        dokupButton = new JButton("DOKUP");
        dokupButton.setFont(new Font("Arial black", Font.BOLD, 22));
        dokupButton.setForeground(Color.green);
        dokupButton.addActionListener(this);
        wegiel.add(dokupButton);

        pracownicy.setBackground(new Color(50, 110, 150));
        pracownicy.setLayout(new CardLayout());
        podstawoweAkcje.add(pracownicy, new GridBagConstraints());

        JLabel pracownicyLabel = new JLabel("<html>ZWOLNIJ/ZATRUDNIJ<br>PRACOWNIKÓW</html>", SwingConstants.CENTER);
        pracownicyLabel.setVerticalAlignment(SwingConstants.TOP);
        tekst(pracownicyLabel);
        pracownicy.add(pracownicyLabel);
//zly layout
        pracownicy.setLayout(new FlowLayout());

        zatrudnijPracownika = new JButton("ZATRUDNIJ");
        zatrudnijPracownika.setFont(new Font("Arial black", Font.BOLD, 22));
        zatrudnijPracownika.setForeground(Color.green);
        zatrudnijPracownika.addActionListener(this);
        pracownicy.add(zatrudnijPracownika);

        zwolnijPracownika = new JButton("ZWOLNIJ");
        zwolnijPracownika.setFont(new Font("Arial black", Font.BOLD, 22));
        zwolnijPracownika.setForeground(Color.red);
        zwolnijPracownika.addActionListener(this);
        pracownicy.add(zwolnijPracownika);


        dostawca.setBackground(Color.gray);
        dostawca.setLayout(new CardLayout());
        podstawoweAkcje.add(dostawca, new GridBagConstraints());

        JLabel dostawcaLabel = new JLabel("ZMIEN DOSTAWCE", SwingConstants.CENTER);
        dostawcaLabel.setVerticalAlignment(SwingConstants.TOP);
        tekst(dostawcaLabel);
        dostawca.add(dostawcaLabel);

        dostawca.setLayout(new FlowLayout());

        nowyDostawca = new JButton("<html>ZNAJDZ NOWEGO<br>DOSTAWCE</html>");
        nowyDostawca.setFont(new Font("Arial black", Font.BOLD, 20));
        nowyDostawca.setForeground(Color.green);
        nowyDostawca.addActionListener(this);
        dostawca.add(nowyDostawca);

        sprzedaj.setBackground(new Color(50, 110, 150));
        sprzedaj.setLayout(new CardLayout());
        podstawoweAkcje.add(sprzedaj, new GridBagConstraints());

        JLabel sprzedajLabel = new JLabel("SPRZEDAJ ELEKTROWNIE", SwingConstants.CENTER);
        sprzedajLabel.setVerticalAlignment(SwingConstants.TOP);
        tekst(sprzedajLabel);
        sprzedaj.add(sprzedajLabel);

        sprzedaj.setLayout(new FlowLayout());
//zły layout
        sprzedajButton = new JButton("SPRZEDAJ");
        sprzedajButton.setFont(new Font("Arial black", Font.BOLD, 22));
        sprzedajButton.setForeground(Color.red);
        sprzedajButton.addActionListener(this);
        sprzedaj.add(sprzedajButton);

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

        //to tez nie dziala xd
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

        //------------- SKROTY -------------

        skroty.setLayout(new FlowLayout());

        moc_chwilowa = new JLabel("Moc chwilowa elektrowni: ");
        tekst(moc_chwilowa);

        moc_maksymalna = new JLabel("Moc maksymalna elektrowni: ");
        tekst(moc_maksymalna);

        liczba_pracowanikow = new JLabel("Liczba pracowników elektrowni: ");
        tekst(liczba_pracowanikow);

        ilosc_wegla = new JLabel("Ilosc wegla w elektrowni: ");
        tekst(ilosc_wegla);

        skroty.add(moc_chwilowa);
        skroty.add(moc_maksymalna);
        skroty.add(liczba_pracowanikow);
        skroty.add(ilosc_wegla);


        //nie wiem czemu ten glupi guzik nie chce zejsc na dol xdd
        zapiszIZamknij = new JButton("Zapisz i zamknij");
        zapiszIZamknij.setFont(new Font("Arial black", Font.BOLD, 22));
        zapiszIZamknij.setForeground(Color.red);
        zapiszIZamknij.addActionListener(this);
        skroty.add(zapiszIZamknij);
    }

    public void tekst(JLabel tekst){
        tekst.setFont(new Font("Arial black", Font.BOLD, 15));
        tekst.setForeground(Color.white);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == zapiszIZamknij){
            System.out.println("Stan zostal zapisany");
            this.dispose();
        }
        this.revalidate();
        this.repaint();
    }
}