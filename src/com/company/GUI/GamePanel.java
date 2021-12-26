package com.company.GUI;
import com.company.Elektrownie.ElektrowniaAtomowa;
import com.company.GUI.ElektrownieOkno.ElektrowniaAtomowaOkno;
import com.company.GUI.ElektrownieOkno.ElektrowniaFotowoltaicznaOkno;
import com.company.GUI.ElektrownieOkno.ElektrowniaGazowaOkno;
import com.company.GUI.ElektrownieOkno.ElektrowniaWeglowaOkno;
import com.company.Head.Gracz;
import com.company.Elektrownie.ListyElektrowni;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {
    final int width = 942;
    final int height = 628;
    Gracz gracz;
    Menue menu;
    Gra gra;
    ListyElektrowni listyElektrowni;
    ListaEle listaAtom;
    ListaEle listaWegiel;
    ListaEle listaGaz;
    ListaEle listaFoto;

    public GamePanel(){
        this.setPreferredSize(new Dimension(width,height));
        listyElektrowni = new ListyElektrowni();
        gracz = new Gracz();
        menu = new Menue(width,height);
        gra = new Gra(width,height);
        listaAtom = new ListaEle(width,height,gracz, new ElektrowniaAtomowa(), listyElektrowni.elektrownieAtomowe);

        menu.nowaGra.addActionListener(this);
        menu.wczytajGre.addActionListener(this);
        menu.zakoncz.addActionListener(this);
        this.add(menu);
        gra.atomowa.addActionListener(this);
        gra.weglowa.addActionListener(this);
        gra.gazowa.addActionListener(this);
        gra.fotowoltaiczna.addActionListener(this);
        gra.nastepnyDzien.addActionListener(this);
        this.add(gra);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==menu.nowaGra){
            System.out.println("Otwieram nowa gre...");
            this.remove(menu);
            setWybor(1);
            this.add(gra, BorderLayout.CENTER);
        }
        else if(e.getSource()==menu.wczytajGre){
            System.out.println("Otwieram zapisana gre...");
            this.remove(menu);
            setWybor(2);
            //otorz zapisana
            this.add(gra, BorderLayout.CENTER);
        }
        else if(e.getSource()==menu.zakoncz){
            System.out.println("Zamykam...");
            System.exit(0);
        }
        else if(e.getSource()==gra.atomowa){
            System.out.println("Wybrano elektrownie atomowa...");
            //uruchomienie panelu
            this.remove(gra);
            this.add(listaAtom, BorderLayout.CENTER);
        }
        else if(e.getSource()==gra.weglowa){
            System.out.println("Wybrano elektrownie weglowa...");
            //uruchomienie panelu
            new ElektrowniaWeglowaOkno();
        }
        else if(e.getSource()==gra.gazowa){
            System.out.println("Wybrano elektrownie gazowa...");
            //uruchomienie panelu
            new ElektrowniaGazowaOkno();
        }
        else if(e.getSource()==gra.fotowoltaiczna){
            System.out.println("Wybrano elektrownie fotowoltaiczna...");
            //uruchomienie panelu
            new ElektrowniaFotowoltaicznaOkno();
        }
        else if(e.getSource()==gra.nastepnyDzien){
            System.out.println("Nastepny dzien...");
            //nastepny dzien + serializacja
        }
        this.revalidate();
        this.repaint();
    }

    private int wybor;
    public void setWybor(int x){
        wybor = x;
    }
    public int getWybor(){
        return wybor;
    }
}
