package com.company.GUI.ElektrownieOkno;

import com.company.Elektrownie.Elektrownia;
import com.company.GUI.ListaEle;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

abstract public class ElektrowniaOknoAbstract extends JFrame implements ActionListener, ChangeListener {
    JPanel mainPanel;

    //akcje
    JPanel podstawoweAkcje;
    JPanel magazyn;
    JPanel pracownicy;
    JLabel infoPracownicy;
    JPanel sprzedaj;
    JPanel bloki;
    JLabel infoBloki;
    JButton dokupButton;
    JButton zatrudnijPracownika;
    JButton zwolnijPracownika;
    JButton kupBloki;
    JButton sprzedajButton;

    //wybory
    JPanel wybory;
    JPanel reakcjaNaAtak;
    JLabel infoAtak;
    JRadioButton atakBrak;
    JRadioButton atak1;
    JRadioButton atak2;
    ButtonGroup grupaAtak;
    JPanel reakcjaNaAwarie;
    JLabel infoAwarie;
    JRadioButton awariaBrak;
    JRadioButton awaria1;
    JRadioButton awaria2;
    ButtonGroup grupaAwaria;
    JPanel moc;
    JLabel infoMoc;
    JSlider mocSlider;
    JLabel mocLabel;
    JPanel kiedyDokupic;
    JLabel infoKiedy;
    JSlider kiedySlider;
    JLabel kiedyLabel;

    //skroty
    JPanel skroty;
    JButton zapiszIZamknij;
    JPanel informacje;
    JPanel zamknij;

    //info icon
    ImageIcon info;
    ImageIcon newInfo;

    public ElektrowniaOknoAbstract(Elektrownia elektrownia) {

        //USTAWIENIA RAMKI
        this.setResizable(false);
        this.setLayout(new GridLayout());
        this.setVisible(true);
        this.getContentPane().setBackground(Color.black);
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

        //INFO ICONA
        info = new ImageIcon("info.jpg");
        newInfo = new ImageIcon(info.getImage().getScaledInstance(28,28,Image.SCALE_DEFAULT));

        //ToolTip
        UIManager.put("ToolTip.background", Color.ORANGE);
        UIManager.put("ToolTip.foreground", Color.BLACK);
        UIManager.put("ToolTip.font", new Font("Arial", Font.BOLD, 30));


        wybory = new JPanel();
        wybory.setBackground(Color.red);
        wybory.setLayout(new GridLayout(4,1));
        mainPanel.add(wybory);

        skroty = new JPanel();
        skroty.setBackground(Color.blue);
        skroty.setLayout(new BoxLayout(skroty, BoxLayout.Y_AXIS));
        mainPanel.add(skroty);

        //------------- PODSTAWOWE AKCJE ---------------------------------------------------------------------------------------------------------------------------
        //PANEL DOKUP BLOKI
        bloki = new JPanel();
        kafelekInfo(bloki,new Color(80, 90, 100),"ROZBUDUJ ELEKTROWNIE",infoBloki,"<html>TwOj Stary możemy <br>tu napisać co chcemy<html>",podstawoweAkcje);
        
        //PRZYCISK DOKUP BLOKI
        kupBloki = new JButton();
        pojedynczyPrzycisk(kupBloki, "Kup Bloki",bloki , Color.green);

        //PANEL PRACOWNIKA
        pracownicy = new JPanel();
        kafelekInfo(pracownicy,new Color(100, 100, 100),"<html>ZWOLNIJ / ZATRUDNIJ<br>PRACOWNIKÓW</html>",infoPracownicy,"Ale zabawa",podstawoweAkcje);

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
        magazyn = new JPanel();
        kafelek(magazyn,Color.blue,"STAN MAGAZYNU",podstawoweAkcje);
        //DOKUP BUTTON
        magazyn.setBackground(new Color(80, 90, 100));
        dokupButton = new JButton();
        pojedynczyPrzycisk(dokupButton,"DOKUP", magazyn, Color.green);

        //PANEL SPRZEDAJ
        sprzedaj = new JPanel();
        kafelek(sprzedaj,new Color(100, 100, 100),"SPRZEDAJ ELEKTROWNIE",podstawoweAkcje);

        //SPRZEDAJ BUTTON
        sprzedajButton = new JButton();
        pojedynczyPrzycisk(sprzedajButton,"SPRZEDAJ",sprzedaj, Color.red);

        //------------- WYBORY -------------------------------------------------------------------------------------------------------------------------------------
        //PANEL REAKCJI NA ATAK
        reakcjaNaAtak = new JPanel();
        kafelekInfo(reakcjaNaAtak,new Color(100, 100, 100),"REAKCJA NA ATAK",infoAtak,"Jestem zajebisty",wybory);

        //RADIO BUTTONY ATAKU\
        atakBrak = new JRadioButton("Brak reakcji");
        atak1 = new JRadioButton("Sposób1");
        atak2 = new JRadioButton("Sposób2");
        grupaAtak = new ButtonGroup();
        radia(atakBrak,atak1,atak2,grupaAtak,reakcjaNaAtak);

        //PANEL REAKCJI NA AWARIĘ
        reakcjaNaAwarie = new JPanel();
        kafelekInfo(reakcjaNaAwarie,new Color(80, 90, 100),"REAKCJA NA AWARIE",infoAwarie,"Tutaj jest jakieś info",wybory);

        //RADIO BUTTONY AWARII
        awariaBrak = new JRadioButton("Brak reakcji");
        awaria1 = new JRadioButton("Sposób1");
        awaria2 = new JRadioButton("Sposób2");
        grupaAwaria = new ButtonGroup();
        awariaBrak.setSelected(true);
        radia(awariaBrak,awaria1,awaria2,grupaAwaria,reakcjaNaAwarie);

        //PANEL MOCY
        moc = new JPanel();
        kafelekInfo(moc,new Color(100, 100, 100),"MOC CHWILOWA",infoMoc,"Jak chcesz zrobic enter to html tu działa",wybory);

        //MOC SLIDER
        mocSlider = new JSlider(0,100,50);
        mocLabel = new JLabel();
        slider(mocSlider,mocLabel,moc);

        //PANEL KIEDY DOKUPIC
        kiedyDokupic = new JPanel();
        kafelekInfo(kiedyDokupic,new Color(80, 90, 100),"KIEDY DOKUPIC",infoKiedy,"Twoj staru",wybory);

        //SLIDER KIEDY KUPIC
        kiedySlider = new JSlider(0,100,0);
        kiedyLabel = new JLabel();
        slider(kiedySlider, kiedyLabel, kiedyDokupic);

        //------------- SKROTY -------------

        informacje = new JPanel();
        zamknij = new JPanel();


        informacje.setLayout(new BoxLayout(informacje,BoxLayout.Y_AXIS));

        skroty.setBackground(new Color(110, 120, 125));
        informacje.setBackground(new Color(110, 120, 125));
        zamknij.setBackground(new Color(110, 120, 125));

        skrot("Moc chwilowa elektrowni",String.valueOf(10),informacje);
        skrot("Moc maksymalna elektrowni","dane1",informacje);
        skrot("Liczba pracowników elektrowni","dane1",informacje);
        skrot("Moc chwilowa elektrowni","dane1",informacje);
        skrot("Moc maksymalna elektrowni","dane1",informacje);
        skrot("Liczba pracowników elektrowni","dane1",informacje);
        skroty.add(informacje);

        //PRZYCISK ZAPISZ I ZAMKNIJ
        skroty.add(Box.createRigidArea(new Dimension(0,100)));
        zapiszIZamknij = new JButton("ZAPISZ I ZAMKNIJ");
        zapiszIZamknij.setFont(new Font("Arial black", Font.BOLD, 22));
        zapiszIZamknij.setForeground(Color.red);
        zapiszIZamknij.setAlignmentX(Component.CENTER_ALIGNMENT);
        zapiszIZamknij.addActionListener(this);
        zamknij.add(zapiszIZamknij);

        skroty.add(zamknij);
    }
    Font font = new Font("Arial black", Font.BOLD, 17);

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
    public void kafelekInfo(JPanel panel, Color kolor,String tekst,JLabel ikona,String Informacja, JPanel parent){
        panel.setBackground(kolor);
        panel.setLayout(new FlowLayout());
        panel.add(Box.createRigidArea(new Dimension(0,50)));
        JLabel label = new JLabel(tekst,SwingConstants.CENTER);
        label.setFont(font);
        label.setForeground(Color.white);
        panel.add(label);
        ikona = new JLabel(newInfo);
        ikona.setToolTipText(Informacja);
        panel.add(ikona);
        parent.add(panel);
    }
    public void pojedynczyPrzycisk(JButton przycisk,String tekst, JPanel panel, Color color){
        panel.add(Box.createRigidArea(new Dimension(0,50)));
        przycisk.setText(tekst);
        przycisk.setFont(new Font("Arial black", Font.BOLD, 22));
        przycisk.setForeground(color);
        przycisk.setFocusable(false);
        przycisk.addActionListener(this);
        panel.add(przycisk);
    }
    public void radia(JRadioButton brak,JRadioButton przycisk1,JRadioButton przycisk2, ButtonGroup grupa, JPanel panel) {
        panel.add(Box.createRigidArea(new Dimension(0,50)));
        radio(brak);
        radio(przycisk1);
        radio(przycisk2);
        grupa.add(brak);
        grupa.add(przycisk1);
        grupa.add(przycisk2);
        panel.add(brak);
        panel.add(Box.createRigidArea(new Dimension(22,0)));
        panel.add(przycisk1);
        panel.add(przycisk2);
    }
    public void radio(JRadioButton przycisk){
        Font font = new Font("Arial black", Font.BOLD, 18);
        przycisk.setFont(font);
        przycisk.setOpaque(false);
        przycisk.setForeground(Color.white);
        przycisk.setFocusable(false);
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
            this.dispose();
        }
        else if (e.getSource() == sprzedajButton){
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
    /*
    public void mouseEntered(MouseEvent e){

    }
    public void mouseClicked(MouseEvent e){
        if (e.getSource() == infoBloki){
            new InfoFrame();
        }
        else if(e.getSource() == infoPracownicy){
            new InfoFrame();
        }
        else if(e.getSource() == infoAtak){
            new InfoFrame();
        }
        else if(e.getSource() == infoAwarie){
            new InfoFrame();
        }
        else if(e.getSource() == infoMoc){
            new InfoFrame();
        }
        else if(e.getSource() == infoKiedy){
            new InfoFrame();
        }

    }
    public void mousePressed(MouseEvent e){

    }
    public void mouseReleased(MouseEvent e){

    }
    public void mouseExited(MouseEvent e){

    }

     */
}