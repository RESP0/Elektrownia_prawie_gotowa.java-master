package com.company.GUI;
import com.company.Elektrownie.*;
import com.company.GUI.ElektrownieOkno.*;
import com.company.Head.Gracz;
import com.company.Head.Serializacja;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class GamePanel extends JPanel implements ActionListener{
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

    JFrame frame;


    ElektrowniaAtomowaOkno elektrowniaAtomowa1;
    ElektrowniaAtomowaOkno elektrowniaAtomowa2;
    ElektrowniaAtomowaOkno elektrowniaAtomowa3;
    ElektrowniaAtomowaOkno elektrowniaAtomowa4;
    ElektrowniaAtomowaOkno elektrowniaAtomowa5;

    ElektrowniaWeglowaOkno elektrowniaWeglowa1;
    ElektrowniaWeglowaOkno elektrowniaWeglowa2;
    ElektrowniaWeglowaOkno elektrowniaWeglowa3;
    ElektrowniaWeglowaOkno elektrowniaWeglowa4;
    ElektrowniaWeglowaOkno elektrowniaWeglowa5;

    ElektrowniaGazowaOkno elektrowniaGazowa1;
    ElektrowniaGazowaOkno elektrowniaGazowa2;
    ElektrowniaGazowaOkno elektrowniaGazowa3;
    ElektrowniaGazowaOkno elektrowniaGazowa4;
    ElektrowniaGazowaOkno elektrowniaGazowa5;

    ElektrowniaFotowoltaicznaOkno elektrowniaFotowoltaiczna1;
    ElektrowniaFotowoltaicznaOkno elektrowniaFotowoltaiczna2;
    ElektrowniaFotowoltaicznaOkno elektrowniaFotowoltaiczna3;
    ElektrowniaFotowoltaicznaOkno elektrowniaFotowoltaiczna4;
    ElektrowniaFotowoltaicznaOkno elektrowniaFotowoltaiczna5;

    boolean a1 , a2, a3, a4, a5;
    boolean f1 , f2, f3, f4, f5;
    boolean w1 , w2, w3, w4, w5;
    boolean g1 , g2, g3, g4, g5;


    JPanel tym;

    public GamePanel(){
        frame = new JFrame("test");
        this.setPreferredSize(new Dimension(width,height));
        listyElektrowni = new ListyElektrowni();
        gracz = new Gracz();
        menu = new Menue(width,height);
        gra = new Gra(width,height,gracz);
        listaAtom = new ListaEle(width,height,"atomowych",gracz, 0, listyElektrowni.elektrownieAtomowe);
        listaFoto = new ListaEle(width,height,"fotowoltaicnych",gracz, 1, listyElektrowni.elektrownieFotowoltaiczne);
        listaWegiel = new ListaEle(width,height,"weglowych",gracz, 2, listyElektrowni.elektrownieWeglowe);
        listaGaz = new ListaEle(width,height,"gazowych",gracz, 3, listyElektrowni.elektrownieGazowe);

        menu.nowaGra.addActionListener(this);
        menu.wczytajGre.addActionListener(this);
        menu.zakoncz.addActionListener(this);
        this.add(menu);
        gra.atomowa.addActionListener(this);
        gra.weglowa.addActionListener(this);
        gra.gazowa.addActionListener(this);
        gra.fotowoltaiczna.addActionListener(this);
        gra.nastepnyDzien.addActionListener(this);
        //this.add(gra);
        listaAtom.powrot.addActionListener(this);
        listaAtom.kup1.addActionListener(this);
        listaAtom.kup2.addActionListener(this);
        listaAtom.kup3.addActionListener(this);
        listaAtom.kup4.addActionListener(this);
        listaAtom.kup5.addActionListener(this);
        listaAtom.button1.addActionListener(this);
        listaAtom.button2.addActionListener(this);
        listaAtom.button3.addActionListener(this);
        listaAtom.button4.addActionListener(this);
        listaAtom.button5.addActionListener(this);
        //---------------------------------------------------------
        listaFoto.powrot.addActionListener(this);
        listaFoto.kup1.addActionListener(this);
        listaFoto.kup2.addActionListener(this);
        listaFoto.kup3.addActionListener(this);
        listaFoto.kup4.addActionListener(this);
        listaFoto.kup5.addActionListener(this);
        listaFoto.button1.addActionListener(this);
        listaFoto.button2.addActionListener(this);
        listaFoto.button3.addActionListener(this);
        listaFoto.button4.addActionListener(this);
        listaFoto.button5.addActionListener(this);
        //---------------------------------------------------------
        listaWegiel.powrot.addActionListener(this);
        listaWegiel.kup1.addActionListener(this);
        listaWegiel.kup2.addActionListener(this);
        listaWegiel.kup3.addActionListener(this);
        listaWegiel.kup4.addActionListener(this);
        listaWegiel.kup5.addActionListener(this);
        listaWegiel.button1.addActionListener(this);
        listaWegiel.button2.addActionListener(this);
        listaWegiel.button3.addActionListener(this);
        listaWegiel.button4.addActionListener(this);
        listaWegiel.button5.addActionListener(this);
        //--------------------------------------------------------
        listaGaz.powrot.addActionListener(this);
        listaGaz.kup1.addActionListener(this);
        listaGaz.kup2.addActionListener(this);
        listaGaz.kup3.addActionListener(this);
        listaGaz.kup4.addActionListener(this);
        listaGaz.kup5.addActionListener(this);
        listaGaz.button1.addActionListener(this);
        listaGaz.button2.addActionListener(this);
        listaGaz.button3.addActionListener(this);
        listaGaz.button4.addActionListener(this);
        listaGaz.button5.addActionListener(this);



        frame.setTitle("Okno elektrowni");
        tym = new JPanel();
        tym.setPreferredSize(new Dimension(900,600));
        frame.setLayout(new GridLayout());
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(false);
        frame.add(tym);
        frame.pack();

        a1 = false;
        a2 = false;
        a3 = false;
        a4 = false;
        a5 = false;

        f1 = false;
        f2 = false;
        f3 = false;
        f4 = false;
        f5 = false;

        w1 = false;
        w2 = false;
        w3 = false;
        w4 = false;
        w5 = false;

        g1 = false;
        g2 = false;
        g3 = false;
        g4 = false;
        g5 = false;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Serializacja serializacje = new Serializacja();
        if(e.getSource()==menu.nowaGra){
            this.remove(menu);
            setWybor(1);
            this.add(gra, BorderLayout.CENTER);
        }
        else if(e.getSource()==menu.wczytajGre){
            System.out.println("Otwieram zapisana gre...");
            this.remove(menu);
            setWybor(2);
            gracz.setListaElektrowni(serializacje.odczyt());
            gracz.setBalans(serializacje.odczytStanuKonta());
            //otorz zapisana
            this.add(gra, BorderLayout.CENTER);
            zaktualizujStanKonta();
        }
        else if(e.getSource()==menu.zakoncz){
            System.exit(0);
        }
        else if(e.getSource()==gra.atomowa){
            this.remove(gra);
            this.add(listaAtom, BorderLayout.CENTER);
        }
        else if(e.getSource()==gra.weglowa){
            this.remove(gra);
            this.add(listaWegiel, BorderLayout.CENTER);
        }
        else if(e.getSource()==gra.gazowa){
            this.remove(gra);
            this.add(listaGaz, BorderLayout.CENTER);
        }
        else if(e.getSource()==gra.fotowoltaiczna){
            this.remove(gra);
            this.add(listaFoto, BorderLayout.CENTER);
        }
        else if(e.getSource()==gra.nastepnyDzien){
            System.out.println("Nastepny dzien...");
            //nastepny dzien + serializacja
            serializacje.zapis(gracz.getListaElektrowni());
            serializacje.zapisStanuKonta(gracz.getBalans());
        }
        //--------------------------------------------------------------------------
        else if(e.getSource() == listaAtom.powrot){
            this.remove(listaAtom);
            add(gra,BorderLayout.CENTER);
        }
        //-------- Atomowa -------------------------
        else if (e.getSource() == listaAtom.kup1 && gracz.getBalans() > listaAtom.getElektrownie().get(0).getCenaZakupu()){
            listaAtom.actionPerformed(e);
            gracz.zakupElektrowni(listaAtom.getNrEle(),0,listaAtom.getElektrownie().get(0));
            gracz.odejmijBalans(listaAtom.getElektrownie().get(0).getCenaZakupu());
            zaktualizujStanKonta();
        }

        else if (e.getSource() == listaAtom.kup2 && gracz.getBalans() > listaAtom.getElektrownie().get(1).getCenaZakupu()){
            listaAtom.actionPerformed(e);
            gracz.zakupElektrowni(listaAtom.getNrEle(),1,listaAtom.getElektrownie().get(1));
            gracz.odejmijBalans(listaAtom.getElektrownie().get(1).getCenaZakupu());
            zaktualizujStanKonta();
        }

        else if (e.getSource() == listaAtom.kup3 && gracz.getBalans() > listaAtom.getElektrownie().get(2).getCenaZakupu()){
            listaAtom.actionPerformed(e);
            gracz.zakupElektrowni(listaAtom.getNrEle(),2,listaAtom.getElektrownie().get(2));
            gracz.odejmijBalans(listaAtom.getElektrownie().get(2).getCenaZakupu());
            zaktualizujStanKonta();
        }

        else if (e.getSource() == listaAtom.kup4 && gracz.getBalans() > listaAtom.getElektrownie().get(3).getCenaZakupu()){
            listaAtom.actionPerformed(e);
            gracz.zakupElektrowni(listaAtom.getNrEle(),3,listaAtom.getElektrownie().get(3));
            gracz.odejmijBalans(listaAtom.getElektrownie().get(3).getCenaZakupu());
            zaktualizujStanKonta();
        }

        else if (e.getSource() == listaAtom.kup5 && gracz.getBalans() > listaAtom.getElektrownie().get(4).getCenaZakupu()){
            listaAtom.actionPerformed(e);
            gracz.zakupElektrowni(listaAtom.getNrEle(),4,listaAtom.getElektrownie().get(4));
            gracz.odejmijBalans(listaAtom.getElektrownie().get(4).getCenaZakupu());
            zaktualizujStanKonta();
        }

        //-------- Gazowa -------------------------

        else if (e.getSource() == listaGaz.kup1 && gracz.getBalans() > listaGaz.getElektrownie().get(0).getCenaZakupu()){
            listaGaz.actionPerformed(e);
            gracz.zakupElektrowni(listaGaz.getNrEle(),0,listaGaz.getElektrownie().get(0));
            gracz.odejmijBalans(listaGaz.getElektrownie().get(0).getCenaZakupu());
            zaktualizujStanKonta();
        }

        else if (e.getSource() == listaGaz.kup2 && gracz.getBalans() > listaGaz.getElektrownie().get(1).getCenaZakupu()){
            listaGaz.actionPerformed(e);
            gracz.zakupElektrowni(listaGaz.getNrEle(),1,listaGaz.getElektrownie().get(1));
            gracz.odejmijBalans(listaGaz.getElektrownie().get(1).getCenaZakupu());
            zaktualizujStanKonta();
        }

        else if (e.getSource() == listaGaz.kup3 && gracz.getBalans() > listaGaz.getElektrownie().get(2).getCenaZakupu()){
            listaGaz.actionPerformed(e);
            gracz.zakupElektrowni(listaGaz.getNrEle(),2,listaGaz.getElektrownie().get(2));
            gracz.odejmijBalans(listaGaz.getElektrownie().get(2).getCenaZakupu());
            zaktualizujStanKonta();
        }

        else if (e.getSource() == listaGaz.kup4 && gracz.getBalans() > listaGaz.getElektrownie().get(3).getCenaZakupu()){
            listaGaz.actionPerformed(e);
            gracz.zakupElektrowni(listaGaz.getNrEle(),3,listaGaz.getElektrownie().get(3));
            gracz.odejmijBalans(listaGaz.getElektrownie().get(3).getCenaZakupu());
            zaktualizujStanKonta();
        }

        else if (e.getSource() == listaGaz.kup5 && gracz.getBalans() > listaGaz.getElektrownie().get(4).getCenaZakupu()){
            listaGaz.actionPerformed(e);
            gracz.zakupElektrowni(listaGaz.getNrEle(),4,listaGaz.getElektrownie().get(4));
            gracz.odejmijBalans(listaGaz.getElektrownie().get(4).getCenaZakupu());
            zaktualizujStanKonta();
        }

        //-------- Weglowa -------------------------

        else if (e.getSource() == listaWegiel.kup1 && gracz.getBalans() > listaWegiel.getElektrownie().get(0).getCenaZakupu()){
            listaWegiel.actionPerformed(e);
            gracz.zakupElektrowni(listaWegiel.getNrEle(),0,listaWegiel.getElektrownie().get(0));
            gracz.odejmijBalans(listaWegiel.getElektrownie().get(0).getCenaZakupu());
            zaktualizujStanKonta();
        }

        else if (e.getSource() == listaWegiel.kup2 && gracz.getBalans() > listaWegiel.getElektrownie().get(1).getCenaZakupu()){
            listaWegiel.actionPerformed(e);
            gracz.zakupElektrowni(listaWegiel.getNrEle(),1,listaWegiel.getElektrownie().get(1));
            gracz.odejmijBalans(listaWegiel.getElektrownie().get(1).getCenaZakupu());
            zaktualizujStanKonta();
        }

        else if (e.getSource() == listaWegiel.kup3 && gracz.getBalans() > listaWegiel.getElektrownie().get(2).getCenaZakupu()){
            listaWegiel.actionPerformed(e);
            gracz.zakupElektrowni(listaWegiel.getNrEle(),2,listaWegiel.getElektrownie().get(2));
            gracz.odejmijBalans(listaWegiel.getElektrownie().get(2).getCenaZakupu());
            zaktualizujStanKonta();
        }

        else if (e.getSource() == listaWegiel.kup4 && gracz.getBalans() > listaWegiel.getElektrownie().get(3).getCenaZakupu()){
            listaWegiel.actionPerformed(e);
            gracz.zakupElektrowni(listaWegiel.getNrEle(),3,listaWegiel.getElektrownie().get(3));
            gracz.odejmijBalans(listaWegiel.getElektrownie().get(3).getCenaZakupu());
            zaktualizujStanKonta();
        }

        else if (e.getSource() == listaWegiel.kup5 && gracz.getBalans() > listaWegiel.getElektrownie().get(4).getCenaZakupu()){
            listaWegiel.actionPerformed(e);
            gracz.zakupElektrowni(listaWegiel.getNrEle(),4,listaWegiel.getElektrownie().get(4));
            gracz.odejmijBalans(listaWegiel.getElektrownie().get(4).getCenaZakupu());
            zaktualizujStanKonta();
        }

        //-------- Fotowoltaiczna -------------------------

        else if (e.getSource() == listaFoto.kup1 && gracz.getBalans() > listaFoto.getElektrownie().get(0).getCenaZakupu()){
            listaFoto.actionPerformed(e);
            gracz.zakupElektrowni(listaFoto.getNrEle(),0,listaFoto.getElektrownie().get(0));
            gracz.odejmijBalans(listaFoto.getElektrownie().get(0).getCenaZakupu());
            zaktualizujStanKonta();
        }

        else if (e.getSource() == listaFoto.kup2 && gracz.getBalans() > listaFoto.getElektrownie().get(1).getCenaZakupu()){
            listaFoto.actionPerformed(e);
            gracz.zakupElektrowni(listaFoto.getNrEle(),1,listaFoto.getElektrownie().get(1));
            gracz.odejmijBalans(listaFoto.getElektrownie().get(1).getCenaZakupu());
            zaktualizujStanKonta();
        }

        else if (e.getSource() == listaFoto.kup3 && gracz.getBalans() > listaFoto.getElektrownie().get(2).getCenaZakupu()){
            listaFoto.actionPerformed(e);
            gracz.zakupElektrowni(listaFoto.getNrEle(),2,listaFoto.getElektrownie().get(2));
            gracz.odejmijBalans(listaFoto.getElektrownie().get(2).getCenaZakupu());
            zaktualizujStanKonta();
        }

        else if (e.getSource() == listaFoto.kup4 && gracz.getBalans() > listaFoto.getElektrownie().get(3).getCenaZakupu()){
            listaFoto.actionPerformed(e);
            gracz.zakupElektrowni(listaFoto.getNrEle(),3,listaFoto.getElektrownie().get(3));
            gracz.odejmijBalans(listaFoto.getElektrownie().get(3).getCenaZakupu());
            listaFoto.actionPerformed(e);
            zaktualizujStanKonta();
        }

        else if (e.getSource() == listaFoto.kup5 && (gracz.getBalans() > listaFoto.getElektrownie().get(4).getCenaZakupu())){
            listaFoto.actionPerformed(e);
            gracz.zakupElektrowni(listaFoto.getNrEle(),4,listaFoto.getElektrownie().get(4));
            gracz.odejmijBalans(listaFoto.getElektrownie().get(4).getCenaZakupu());
            zaktualizujStanKonta();
        }
//-----------------------------------------------------eleAtom
       if(e.getSource() == listaAtom.button1){
            elektrowniaAtomowa1 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(0),gracz);
            walidacjaOkna(elektrowniaAtomowa1);
            a1 = true;

        }
        if (a1){
            if(e.getSource() == elektrowniaAtomowa1.sprzedajButton){
                gracz.dodajBalans(listaAtom.getElektrownie().get(0).getCenaSprzedazy());
                zaktualizujStanKonta();
                System.out.println("tste");
        }

        }


        if(e.getSource() == listaAtom.button2){
            elektrowniaAtomowa2 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(1),gracz);
            walidacjaOkna(elektrowniaAtomowa2);
            a2 = true;
        }
        if (a2){
            if (e.getSource() == elektrowniaAtomowa2.sprzedajButton){
                System.out.println("Prosze działaj");
            }

        }
        if(e.getSource() == listaAtom.button3){
            elektrowniaAtomowa3 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(2),gracz);
            walidacjaOkna(elektrowniaAtomowa3);
            a3 = true;
        }
        if (a3){
            if (e.getSource() == elektrowniaAtomowa3.sprzedajButton){
                System.out.println("Dużo kodu");
            }

        }
        if(e.getSource() == listaAtom.button4){
            elektrowniaAtomowa4 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(3),gracz);
            walidacjaOkna(elektrowniaAtomowa4);
            a4 = true;
        }
        if (a4){
            if (e.getSource() == elektrowniaAtomowa4.sprzedajButton){
                System.out.println("Inaczej nie potrafię");
            }

        }
        if(e.getSource() == listaAtom.button5){
            elektrowniaAtomowa5 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(4),gracz);
            walidacjaOkna(elektrowniaAtomowa5);
            a5 = true;
        }
        if (a5){
            if (e.getSource() == elektrowniaAtomowa5.sprzedajButton){
                System.out.println("dqsagqsdgvq");
            }
        }
        //-----
        if(e.getSource() == listaFoto.button1){
            elektrowniaFotowoltaiczna1 = new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(5),gracz);
            walidacjaOkna(elektrowniaFotowoltaiczna1);
            f1 = true;
        }
        if (f1){
            if (e.getSource() == elektrowniaFotowoltaiczna1.sprzedajButton){
                System.out.println("dqsagqsdgvq");
            }
        }
        if(e.getSource() == listaFoto.button2){
            elektrowniaFotowoltaiczna2 = new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(6),gracz);
            walidacjaOkna(elektrowniaFotowoltaiczna2);
            f2 = true;
        }
        if (f2){
            if (e.getSource() == elektrowniaFotowoltaiczna2.sprzedajButton){
                System.out.println("dqsagqsdgvq");
            }
        }
        if(e.getSource() == listaFoto.button3){
            elektrowniaFotowoltaiczna3 = new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(7),gracz);
            walidacjaOkna(elektrowniaFotowoltaiczna3);
            f3 = true;
        }
        if (f3){
            if (e.getSource() == elektrowniaFotowoltaiczna3.sprzedajButton){
                System.out.println("dqsagqsdgvq");
            }
        }
        if(e.getSource() == listaFoto.button4){
            elektrowniaFotowoltaiczna4 = new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(8),gracz);
            walidacjaOkna(elektrowniaFotowoltaiczna4);
            f4 = true;
        }
        if (f4){
            if (e.getSource() == elektrowniaFotowoltaiczna4.sprzedajButton){
                System.out.println("dqsagqsdgvq");
            }
        }
        if(e.getSource() == listaFoto.button5){
            elektrowniaFotowoltaiczna5 = new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(9),gracz);
            walidacjaOkna(elektrowniaFotowoltaiczna5);
            f5 = true;
        }
        if (f5){
            if (e.getSource() == elektrowniaFotowoltaiczna5.sprzedajButton){
                System.out.println("dqsagqsdgvq");
            }
        }
        //-------------
        if(e.getSource() == listaWegiel.button1){
            elektrowniaWeglowa1 = new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(10),gracz);
            walidacjaOkna(elektrowniaWeglowa1);
            w1 = true;
        }
        if (w1){
            if (e.getSource() == elektrowniaWeglowa1.sprzedajButton){
                System.out.println("dqsagqsdgvq");
            }
        }
        if(e.getSource() == listaWegiel.button2){
            elektrowniaWeglowa2 = new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(11),gracz);
            walidacjaOkna(elektrowniaWeglowa2);
            w2 = true;
        }
        if (w2){
            if (e.getSource() == elektrowniaWeglowa2.sprzedajButton){
                System.out.println("dqsagqsdgvq");
            }
        }
        if(e.getSource() == listaWegiel.button3){
            elektrowniaWeglowa3 = new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(12),gracz);
            walidacjaOkna(elektrowniaWeglowa3);
            w3 = true;
        }
        if (w3){
            if (e.getSource() == elektrowniaWeglowa3.sprzedajButton){
                System.out.println("dqsagqsdgvq");
            }
        }
        if(e.getSource() == listaWegiel.button4){
            elektrowniaWeglowa4 = new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(13),gracz);
            walidacjaOkna(elektrowniaWeglowa4);
            w4 = true;
        }
        if (w4){
            if (e.getSource() == elektrowniaWeglowa4.sprzedajButton){
                System.out.println("dqsagqsdgvq");
            }
        }
        if(e.getSource() == listaWegiel.button5){
            elektrowniaWeglowa5 = new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(14),gracz);
            walidacjaOkna(elektrowniaWeglowa5);
            w5 = true;
        }
        if (w5){
            if (e.getSource() == elektrowniaWeglowa5.sprzedajButton){
                System.out.println("dqsagqsdgvq");
            }
        }
        //---------------
        if(e.getSource() == listaGaz.button1){
            elektrowniaGazowa1 = new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(15),gracz);
            walidacjaOkna(elektrowniaGazowa1);
            g1 = true;
        }
        if (g1){
            if (e.getSource() == elektrowniaGazowa1.sprzedajButton){
                System.out.println("dqsagqsdgvq");
            }
        }
        if(e.getSource() == listaGaz.button2){
            elektrowniaGazowa2 = new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(16),gracz);
            walidacjaOkna(elektrowniaGazowa2);
            g2 = true;
        }
        if (g2){
            if (e.getSource() == elektrowniaGazowa2.sprzedajButton){
                System.out.println("dqsagqsdgvq");
            }
        }
        if(e.getSource() == listaGaz.button3){
            elektrowniaGazowa3 = new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(17),gracz);
            walidacjaOkna(elektrowniaGazowa3);
            g3 = true;
        }
        if (g3){
            if (e.getSource() == elektrowniaGazowa3.sprzedajButton){
                System.out.println("dqsagqsdgvq");
            }
        }
        if(e.getSource() == listaGaz.button4){
            elektrowniaGazowa4 = new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(18),gracz);
            walidacjaOkna(elektrowniaGazowa4);
            g4 = true;
        }
        if (g4){
            if (e.getSource() == elektrowniaGazowa4.sprzedajButton){
                System.out.println("dqsagqsdgvq");
            }
        }
        if(e.getSource() == listaGaz.button5){
            elektrowniaGazowa5 = new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(18),gracz);
            walidacjaOkna(elektrowniaGazowa5);
            g5 = true;
        }
        if (g5){
            if (e.getSource() == elektrowniaGazowa5.sprzedajButton){
                System.out.println("dqsagqsdgvq");
            }
        }

        //-------------------------------------------------------------------------
        if(e.getSource() == listaFoto.powrot){
            this.remove(listaFoto);
            add(gra,BorderLayout.CENTER);
        }
        else if(e.getSource() == listaFoto.button1){
            new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(5), gracz);
        }
        else if(e.getSource() == listaFoto.button2){
            new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(6), gracz);
        }
        else if(e.getSource() == listaFoto.button3){
            new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(7), gracz);
        }
        else if(e.getSource() == listaFoto.button4){
            new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(8), gracz);
        }
        else if(e.getSource() == listaFoto.button5){
            new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(9), gracz);
        }
        //------------------------------------------------------------------------------
        else if(e.getSource() == listaWegiel.powrot){
            this.remove(listaWegiel);
            add(gra,BorderLayout.CENTER);
        }
        else if(e.getSource() == listaWegiel.button1){
            new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(10), gracz);
        }
        else if(e.getSource() == listaWegiel.button2){
            new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(11), gracz);
        }
        else if(e.getSource() == listaWegiel.button3){
            new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(12), gracz);
        }
        else if(e.getSource() == listaWegiel.button4){
            new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(13), gracz);
        }
        else if(e.getSource() == listaWegiel.button5){
            new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(14), gracz);
        }
        //------------------------------------------------------------------------------
        else if(e.getSource() == listaGaz.powrot){
            this.remove(listaGaz);
            add(gra,BorderLayout.CENTER);
        }
        else if(e.getSource() == listaGaz.button1){
            new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(15), gracz);
        }
        else if(e.getSource() == listaGaz.button2){
            new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(16), gracz);
        }
        else if(e.getSource() == listaGaz.button3){
            new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(17), gracz);
        }
        else if(e.getSource() == listaGaz.button4){
            new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(18), gracz);
        }
        else if(e.getSource() == listaGaz.button5){
            new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(19), gracz);
        }
        this.revalidate();
        this.repaint();
        frame.revalidate();
        frame.repaint();
    }

    public void zaktualizujStanKonta(){
        listaAtom.stanKonta.setText("Stan konta: " + gracz.getBalans());
        listaWegiel.stanKonta.setText("Stan konta: " + gracz.getBalans());
        listaGaz.stanKonta.setText("Stan konta: " + gracz.getBalans());
        listaFoto.stanKonta.setText("Stan konta: " + gracz.getBalans());
        gra.stan_konta.setText("Aktualny stan konta: " + gracz.getBalans());
    }
    public void walidacjaOkna(ElektrowniaOknoAbstract okno){
        okno.dokupButton.addActionListener(this);
        okno.zatrudnijPracownika.addActionListener(this);
        okno.zwolnijPracownika.addActionListener(this);
        okno.kupBloki.addActionListener(this);
        okno.sprzedajButton.addActionListener(this);
        tym.removeAll();
        tym.add(okno);
        tym.revalidate();
        tym.repaint();

        frame.setVisible(true);
    }

    private int wybor;
    public void setWybor(int x){
        wybor = x;
    }
    public int getWybor(){
        return wybor;
    }
}
