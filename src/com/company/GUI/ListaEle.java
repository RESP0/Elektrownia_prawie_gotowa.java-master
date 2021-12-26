package com.company.GUI;

import javax.swing.*;

import com.company.Elektrownie.Elektrownia;
import com.company.Head.Gracz;

import java.awt.*;
import java.util.ArrayList;

//DODAC ZABEZPIECZENIE ZE NIE MOZNA KUPIC JAK MA SIĘ ZA MAŁO PIENIĘDZY
//LUB GDY LICZBA ELE JEST ROWNA 5

//oPCJONaLNIE DO KAŻDEGO BUTTONA DOADAĆ INNĄ ICONE ZEBY ŁADNIE WYGLĄDAŁO
public class ListaEle extends JPanel {
    private int liczbaEle = 0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    ArrayList<JButton> przyciski;
    String nazwa;
    String miasto;
    JPanel panelPrzyciskow;
    ListaEle(int szer, int wys, Gracz gracz, Elektrownia e, ArrayList<Elektrownia> lista){
        //USTAWIENIA PANELU
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setPreferredSize(new Dimension(szer,wys));
        this.setBackground(Color.gray);

        //USTAWIENIA PANELU Z PRZYCISKAMI
        panelPrzyciskow = new JPanel();
        this.add(Box.createRigidArea(new Dimension(0,220)));
        panelPrzyciskow.setSize(new Dimension(szer,100));
        panelPrzyciskow.setLayout(new GridLayout());

        //DODANIE PRZYCISKÓW DO LISTY
        przyciski = new ArrayList<>(){
            {
                add(button1 = new JButton( lista.get(0).getNazwa() + lista.get(0).getMiasto() ));
                add(button2 = new JButton( lista.get(1).getNazwa() + "\t" + lista.get(1).getMiasto() ));
                add(button3 = new JButton( lista.get(2).getNazwa() + "\n" + lista.get(2).getMiasto() ));
                add(button4 = new JButton( lista.get(3).getNazwa() + "\n" + lista.get(3).getMiasto() ));
                add(button5 = new JButton( lista.get(4).getNazwa() + "\n" + lista.get(4).getMiasto() ));
            }
        };
        button1.setLayout(new FlowLayout());
        button1.setText(lista.get(0).getNazwa() + lista.get(0).getMiasto() );
        for (JButton przycisk : przyciski){
            przycisk.setMargin(new Insets(10, 20, 10, 20));
            przycisk.setFont(new Font("Arial black", Font.BOLD, 20));
            panelPrzyciskow.add(przycisk);
        }

        this.add(panelPrzyciskow);
        this.add(Box.createRigidArea(new Dimension(0,220)));




        for (Elektrownia elektrownia : gracz.getListaElektrowni()){
            if (elektrownia.getClass() == e.getClass()){
                liczbaEle +=1;
                nazwa = elektrownia.getNazwa();
                miasto = elektrownia.getMiasto();
            }
        }
    }

}
