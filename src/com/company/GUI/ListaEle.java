package com.company.GUI;

import javax.swing.*;

import com.company.Elektrownie.Elektrownia;
import com.company.Elektrownie.ElektrowniaAtomowa;
import com.company.GUI.ElektrownieOkno.ElektrowniaAtomowaOkno;
import com.company.Head.Gracz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;
import java.util.ArrayList;

//DODAC ZABEZPIECZENIE ZE NIE MOZNA KUPIC JAK MA SIĘ ZA MAŁO PIENIĘDZY
//LUB GDY LICZBA ELE JEST ROWNA 5

//oPCJONaLNIE DO KAŻDEGO BUTTONA DOADAĆ INNĄ ICONE ZEBY ŁADNIE WYGLĄDAŁO
public class ListaEle extends JPanel implements ActionListener {

    private int liczbaEle = 0;
    JLabel tytul;
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

    ListaEle(int szer, int wys,String title, Gracz gracz, Elektrownia e, ArrayList<Elektrownia> lista){
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

        //USTAWIENIA PANELU Z PRZYCISKAMI
        panelPrzyciskow = new JPanel();
        this.add(Box.createRigidArea(new Dimension(0,120)));
        panelPrzyciskow.setPreferredSize(new Dimension(szer,150));


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

            przyciski.get(i).setLayout(new BoxLayout(przyciski.get(i), BoxLayout.Y_AXIS));
            przyciski.get(i).add(Box.createRigidArea(new Dimension(0,20)));
            przyciski.get(i).add(nazwa);
            przyciski.get(i).add(miasto);
            przyciski.get(i).add(Box.createRigidArea(new Dimension(0,20)));
            przyciski.get(i).add(kup.get(i));


            przyciski.get(i).setEnabled(true);
            przyciski.get(i).addActionListener(this);
            panelPrzyciskow.add(przyciski.get(i));
        }
        this.add(panelPrzyciskow);
        this.add(Box.createRigidArea(new Dimension(0,150)));

        //DOLNY PANEL
        dol = new JPanel();
        dol.setLayout(null);
        dol.setBackground(Color.gray);
        dol.setPreferredSize(new Dimension(szer,80));

        //PRZYCISK POWROTU
        powrot = new JButton("Powrot");
        powrot.setBounds(szer-150,5,130,60);
        powrot.setFont(new Font("Arial black", Font.BOLD, 18));
        powrot.addActionListener(this);
        dol.add(powrot);
        this.add(dol);
        /*
        for (Elektrownia elektrownia : gracz.getListaElektrowni()){
            if (elektrownia.getClass() == e.getClass()){
                liczbaEle +=1;
            }
        }

         */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == przyciski.get(0)){
            System.out.println("Oiweram nowa elektrownie");
            new ElektrowniaAtomowaOkno(null);
        }

        this.revalidate();
        this.repaint();
    }
}
