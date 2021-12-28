package com.company.GUI.ElektrownieOkno;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract public class ElektrowniaOknoAbstract extends JFrame implements ActionListener, ChangeListener {
    JPanel mainPanel;
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
    JPanel bloki;
    JButton dokupButton;
    JButton zatrudnijPracownika;
    JButton zwolnijPracownika;
    JButton kupBloki;
    JButton sprzedajButton;

    //wybory
    JPanel wybory;
    JPanel reakcjaNaAtak;
    JRadioButton atak1;
    JRadioButton atak2;
    ButtonGroup grupaAtak;
    JPanel reakcjaNaAwarie;
    JRadioButton awaria1;
    JRadioButton awaria2;
    ButtonGroup grupaAwaria;
    JPanel moc;
    JSlider mocSlider;
    JLabel mocLabel;
    JPanel kiedyDokupic;
    JSlider kiedySlider;
    JLabel kiedyLabel;


    //skroty
    JPanel skroty;
    JButton zapiszIZamknij;

    public ElektrowniaOknoAbstract() {
        //USTAWIENIA RAMKI
        this.setResizable(false);
        this.setLayout(new GridLayout());
        this.setVisible(true);
        this.getContentPane().setBackground(Color.black);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);    //do usuniecia w finalnej wesji
        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(900,600));
        mainPanel.setLayout(new GridLayout(1,3));
        this.add(mainPanel);
        this.pack();
        //PODZIAŁ NA 3 PANELE
        podstawoweAkcje = new JPanel();
        podstawoweAkcje.setBackground(Color.black);
        podstawoweAkcje.setLayout(new GridLayout(4,1));
        mainPanel.add(podstawoweAkcje);

        wybory = new JPanel();
        wybory.setBackground(Color.red);
        wybory.setLayout(new GridLayout(4,1));
        mainPanel.add(wybory);

        skroty = new JPanel();
        skroty.setBackground(Color.blue);
        skroty.setLayout(new BoxLayout(skroty, BoxLayout.Y_AXIS));
        mainPanel.add(skroty);

        //------------- PODSTAWOWE AKCJE -------------
        //PANEL DOSTAWCA
        bloki = new JPanel();
        kafelek(bloki,Color.blue,"ROZBUDUJ ELEKTROWNIE",podstawoweAkcje);
        
        //PRZYCISK DOKUP BLOKI
        kupBloki = new JButton();
        pojedynczyPrzycisk(kupBloki, "Kup Bloki",bloki , Color.green);

        //PANEL PRACOWNIKA
        pracownicy = new JPanel();
        kafelek(pracownicy,new Color(50, 110, 150),"<html>ZWOLNIJ / ZATRUDNIJ<br>PRACOWNIKÓW</html>",podstawoweAkcje);

        //PRZYCISKI ZWOLNIJ ZATRUDNIJ PRACOWNIKA
        pracownicy.add(Box.createRigidArea(new Dimension(0,80)));

        zatrudnijPracownika = new JButton("ZATRUDNIJ");
        zatrudnijPracownika.setPreferredSize(new Dimension(140,40));
        zatrudnijPracownika.setFont(new Font("Arial black", Font.BOLD, 13));
        zatrudnijPracownika.setFocusable(false);
        zatrudnijPracownika.setForeground(Color.green);

        zwolnijPracownika = new JButton("ZWOLNIJ");
        zwolnijPracownika.setFont(new Font("Arial black", Font.BOLD, 13));
        zwolnijPracownika.setPreferredSize(new Dimension(140,40));
        zwolnijPracownika.setFocusable(false);
        zwolnijPracownika.setForeground(Color.red);

        pracownicy.add(zatrudnijPracownika);
        pracownicy.add(zwolnijPracownika);

        //PANEL WEGLA
        wegiel = new JPanel();
        kafelek(wegiel,Color.blue,"ILOSC WEGLA W MAGAZYNIE",podstawoweAkcje);
        //DOKUP BUTTON
        dokupButton = new JButton();
        pojedynczyPrzycisk(dokupButton,"DOKUP",wegiel, Color.green);

        //PANEL SPRZEDAJ
        sprzedaj = new JPanel();
        kafelek(sprzedaj,new Color(50, 110, 150),"SPRZEDAJ ELEKTROWNIE",podstawoweAkcje);

        //SPRZEDAJ BUTTON
        sprzedajButton = new JButton();
        pojedynczyPrzycisk(sprzedajButton,"SPRZEDAJ",sprzedaj, Color.red);

        //------------- WYBORY -------------
        //PANEL REAKCJI NA ATAK
        reakcjaNaAtak = new JPanel();
        kafelek(reakcjaNaAtak,new Color(100, 100, 100),"REAKCJA NA ATAK",wybory);

        //RADIO BUTTONY ATAKU\
        atak1 = new JRadioButton("Sposób1");
        atak2 = new JRadioButton("Sposób2");
        grupaAtak = new ButtonGroup();
        radia(atak1,atak2,grupaAtak,reakcjaNaAtak);

        //PANEL REAKCJI NA AWARIĘ
        reakcjaNaAwarie = new JPanel();
        kafelek(reakcjaNaAwarie,new Color(80, 90, 100),"REAKCJA NA AWARIE",wybory);

        //RADIO BUTTONY AWARII
        awaria1 = new JRadioButton("Sposób1");
        awaria2 = new JRadioButton("Sposób2");
        grupaAwaria = new ButtonGroup();
        radia(awaria1,awaria2,grupaAwaria,reakcjaNaAwarie);

        //PANEL MOCY
        moc = new JPanel();
        kafelek(moc,new Color(100, 100, 100),"MOC CHWILOWA",wybory);

        //MOC SLIDER
        mocSlider = new JSlider(0,100,20);
        mocLabel = new JLabel();
        slider(mocSlider,mocLabel,moc);

        //PANEL KIEDY DOKUPIC
        kiedyDokupic = new JPanel();
        kafelek(kiedyDokupic,new Color(80, 90, 100),"KIEDY DOKUPIC",wybory);

        //SLIDER KIEDY KUPIC
        kiedySlider = new JSlider(0,100,20);
        kiedyLabel = new JLabel();
        slider(kiedySlider,kiedyLabel,kiedyDokupic);

        //------------- SKROTY -------------
        skroty.setLayout(new BoxLayout(skroty,BoxLayout.Y_AXIS));

        skrot("Moc chwilowa elektrowni","dane1",skroty);
        skrot("Moc maksymalna elektrowni","dane1",skroty);
        skrot("Liczba pracowników elektrowni","dane1",skroty);
        skrot("Ilosc wegla w elektrowni","dane1",skroty);
        skroty.add(Box.createRigidArea(new Dimension(0,250)));

        //PRZYCISK ZAPISZ I ZAMKNIJ
        zapiszIZamknij = new JButton("Zapisz i zamknij");
        zapiszIZamknij.setFont(new Font("Arial black", Font.BOLD, 22));
        zapiszIZamknij.setForeground(Color.red);
        zapiszIZamknij.setAlignmentX(Component.CENTER_ALIGNMENT);
        zapiszIZamknij.addActionListener(this);
        skroty.add(zapiszIZamknij);

    }
    Font font = new Font("Arial black", Font.BOLD, 15);
    public void kafelek(JPanel panel, Color kolor,String tekst, JPanel parent){
        panel.setBackground(kolor);
        panel.setLayout(new FlowLayout());

        panel.add(Box.createRigidArea(new Dimension(0,50)));
        JLabel label = new JLabel(tekst,SwingConstants.CENTER);
        label.setFont(font);
        label.setForeground(Color.white);
        panel.add(label);
        parent.add(panel);
    }
    public void pojedynczyPrzycisk(JButton przycisk,String tekst, JPanel panel, Color color){
        panel.add(Box.createRigidArea(new Dimension(0,50)));
        przycisk.setText(tekst);
        przycisk.setFont(new Font("Arial black", Font.BOLD, 22));
        przycisk.setForeground(color);
        przycisk.setFocusable(false);
        panel.add(przycisk);
    }
    public void radia(JRadioButton przycisk1,JRadioButton przycisk2, ButtonGroup grupa, JPanel panel) {
        panel.add(Box.createRigidArea(new Dimension(0,100)));
        Font font = new Font("Arial black", Font.BOLD, 20);
        przycisk1.setFont(font);
        przycisk2.setFont(font);
        przycisk1.setOpaque(false);
        przycisk2.setOpaque(false);
        przycisk1.setForeground(Color.white);
        przycisk2.setForeground(Color.white);
        przycisk1.setFocusable(false);
        przycisk2.setFocusable(false);
        grupa.add(przycisk1);
        grupa.add(przycisk2);
        panel.add(przycisk1);
        panel.add(przycisk2);
    }
    public void slider(JSlider slider,JLabel label,JPanel panel){
        slider.setPreferredSize(new Dimension(250,50));
        slider.setOpaque(false);
        slider.setForeground(Color.white);
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.addChangeListener(this);
        panel.add(slider);
        panel.add(Box.createRigidArea(new Dimension(10,0)));

        label.setText(slider.getValue() + " %");
        label.setForeground(Color.white);
        label.setFont(new Font("Arial black", Font.BOLD, 15));
        panel.add(label);
    }
    public void skrot(String tekst, String dane, JPanel parent){
        JLabel label = new JLabel("<html>-"+tekst + ":<br> " + dane+"<html>");
        label.setFont(font);
        label.setForeground(Color.white);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        parent.add(label);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == zapiszIZamknij){
            System.out.println("Stan zostal zapisany");
            this.dispose();
        }
        this.revalidate();
        this.repaint();
    }
    public void stateChanged(ChangeEvent e){
        if (e.getSource() == mocSlider) {
            mocLabel.setText(mocSlider.getValue() + " %");
        }
        else if (e.getSource() == kiedySlider) {
            kiedyLabel.setText(kiedySlider.getValue() + " %");
        }


    }
}