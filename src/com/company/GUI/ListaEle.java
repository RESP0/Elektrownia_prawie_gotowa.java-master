package com.company.GUI;

import javax.swing.*;

import com.company.Elektrownie.*;
import com.company.Elektrownie.ElektrowniaAtomowa;
import com.company.GUI.ElektrownieOkno.ElektrowniaAtomowaOkno;
import com.company.Head.Gracz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;
import java.util.ArrayList;

//DODAC ZABEZPIECZENIE ZE NIE MOZNA KUPIC JAK MA SIĘ ZA MAŁO PIENIĘDZY

//oPCJONaLNIE DO KAŻDEGO BUTTONA DOADAĆ INNĄ ICONE ZEBY ŁADNIE WYGLĄDAŁO
public class ListaEle extends JPanel implements ActionListener {

    private int liczbaEle = 0;
    JLabel tytul;
    JLabel stanKonta;
    JLabel nazwa;
    JLabel miasto;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    ArrayList<JButton> przyciski;
    JPanel panelPrzyciskow;
    JButton powrot;
    JPanel dol;

    JButton kup1;
    JButton kup2;
    JButton kup3;
    JButton kup4;
    JButton kup5;
    ArrayList<JButton> kup;

    JLabel cena1;
    JLabel cena2;
    JLabel cena3;
    JLabel cena4;
    JLabel cena5;
    ArrayList<JLabel> cena;

    Gracz gracz;
    ArrayList<Elektrownia> elektrownie;
    int nrEle;

    ListaEle(int szer, int wys,String title, Gracz g, int indeks, ArrayList<Elektrownia> lista){
        gracz = g;
        elektrownie = lista;
        nrEle = indeks;
        //USTAWIENIA PANELU
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setPreferredSize(new Dimension(szer,wys));
        this.setBackground(Color.gray);

        //TYTUŁ PANELU
        tytul = new JLabel("Lista twoich elektrowni " + title);
        this.add(Box.createRigidArea(new Dimension(0,50)));
        tytul.setFont(new Font("Ink Free",Font.BOLD,40));
        tytul.setForeground(Color.white);
        tytul.setAlignmentX(CENTER_ALIGNMENT);
        this.add(tytul);
        /*
        //USTALANIE INDEKSU
        Elektrownia tym = lista.get(0);
        if (tym instanceof ElektrowniaAtomowa){

        }

         */

        //STAN KONTA GRACZA
        stanKonta = new JLabel();
        stanKonta.setText("Stan konta: " + g.getBalans());
        stanKonta.setFont(new Font("Ink Free",Font.BOLD,20));
        stanKonta.setForeground(Color.white);
        stanKonta.setAlignmentX(CENTER_ALIGNMENT);
        this.add(stanKonta);

        //USTAWIENIA PANELU Z PRZYCISKAMI
        panelPrzyciskow = new JPanel();
        this.add(Box.createRigidArea(new Dimension(0,130)));
        panelPrzyciskow.setPreferredSize(new Dimension(szer,160));


        panelPrzyciskow.setLayout(new GridLayout());

        //DODANIE PRZYCISKÓW DO LISTY
        przyciski = new ArrayList<>(){
            {
                add(button1 = new JButton());
                add(button2 = new JButton());
                add(button3 = new JButton());
                add(button4 = new JButton());
                add(button5 = new JButton());
            }
        };

        kup = new ArrayList<>(){
            {
                add(kup1 = new JButton("KUP"));
                add(kup2 = new JButton("KUP"));
                add(kup3 = new JButton("KUP"));
                add(kup4 = new JButton("KUP"));
                add(kup5 = new JButton("KUP"));
            }
        };
        //CENY KUPNA
        cena = new ArrayList<>(){
            {
                add(cena1 = new JLabel());
                add(cena2 = new JLabel());
                add(cena3 = new JLabel());
                add(cena4 = new JLabel());
                add(cena5 = new JLabel());
            }
        };


        //DODAWANIE NAPISÓW DO PRZYCISKÓW

        Font font = new Font("Arial black", Font.BOLD, 20);
        for (int i = 0; i<5; i++){
            nazwa = new JLabel(lista.get(i).getNazwa());
            nazwa.setFont(font);
            nazwa.setAlignmentX(CENTER_ALIGNMENT);
            nazwa.setAlignmentY(CENTER_ALIGNMENT);

            miasto = new JLabel(lista.get(i).getMiasto());
            miasto.setFont(font);
            miasto.setAlignmentX(CENTER_ALIGNMENT);
            miasto.setAlignmentY(CENTER_ALIGNMENT);

            kup.get(i).setFont(font);
            kup.get(i).setFocusable(false);
            kup.get(i).setForeground(Color.black);
            kup.get(i).setBackground(Color.red);
            kup.get(i).setAlignmentX(CENTER_ALIGNMENT);
            kup.get(i).addActionListener(this);

            cena.get(i).setText(String.valueOf(lista.get(i).getCenaZakupu()));
            cena.get(i).setFont(font);
            cena.get(i).setAlignmentX(CENTER_ALIGNMENT);

            przyciski.get(i).setLayout(new BoxLayout(przyciski.get(i), BoxLayout.Y_AXIS));
            przyciski.get(i).add(Box.createRigidArea(new Dimension(0,10)));
            przyciski.get(i).add(nazwa);
            przyciski.get(i).add(miasto);
            przyciski.get(i).add(Box.createRigidArea(new Dimension(0,10)));
            przyciski.get(i).add(kup.get(i));
            przyciski.get(i).add(cena.get(i));


            przyciski.get(i).setEnabled(false);
            przyciski.get(i).addActionListener(this);
            panelPrzyciskow.add(przyciski.get(i));
        }
        this.add(panelPrzyciskow);
        this.add(Box.createRigidArea(new Dimension(0,120)));

        //DOLNY PANEL
        dol = new JPanel();
        dol.setLayout(null);
        dol.setBackground(Color.gray);
        dol.setPreferredSize(new Dimension(szer,80));

        //PRZYCISK POWROTU
        powrot = new JButton("Powrot");
        powrot.setBounds(szer-150,0,130,60);
        powrot.setFont(new Font("Arial black", Font.BOLD, 18));
        powrot.addActionListener(this);
        dol.add(powrot);
        this.add(dol);

        for(int i = indeks*5;i<(indeks*5)+5;i++){
            if(g.getListaElektrowni().get(i) != null){
                kup.get(i%5).setVisible(false);
                cena.get(i%5).setVisible(false);
                przyciski.get(i%5).setEnabled(true);
            }
        }
    }

    public int getLiczbaEle() {
        return liczbaEle;
    }

    public void setLiczbaEle(int liczbaEle) {
        this.liczbaEle = liczbaEle;
    }

    public ArrayList<Elektrownia> getElektrownie() {
        return elektrownie;
    }

    public void setElektrownie(ArrayList<Elektrownia> elektrownie) {
        this.elektrownie = elektrownie;
    }

    public int getNrEle() {
        return nrEle;
    }

    public void setNrEle(int nrEle) {
        this.nrEle = nrEle;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == kup1 && gracz.getBalans() > elektrownie.get(0).getCenaZakupu()){
            System.out.println("Zakupiles nowa elektrownie");
            kup1.setVisible(false);
            cena1.setVisible(false);
            button1.setEnabled(true);
        }

        if (e.getSource() == kup2 && gracz.getBalans() > elektrownie.get(1).getCenaZakupu()){
            kup2.setVisible(false);
            button2.setEnabled(true);
            cena2.setVisible(false);
        }

        if (e.getSource() == kup3 && gracz.getBalans() > elektrownie.get(2).getCenaZakupu()){
            kup3.setVisible(false);
            button3.setEnabled(true);
            cena3.setVisible(false);
        }

        if (e.getSource() == kup4 && gracz.getBalans() > elektrownie.get(3).getCenaZakupu()){
            kup4.setVisible(false);
            button4.setEnabled(true);
            cena4.setVisible(false);
        }

        if (e.getSource() == kup5 && gracz.getBalans() > elektrownie.get(4).getCenaZakupu()){
            kup5.setVisible(false);
            button5.setEnabled(true);
            cena5.setVisible(false);
        }

        this.revalidate();
        this.repaint();
    }
}
