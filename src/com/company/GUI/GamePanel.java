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
import java.util.ArrayList;

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
    final int cenaZatrudnieniaPracownika = 100;

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

            gracz.setListaElektrowni(serializacje.odczyt());
            gracz.setBalans(serializacje.odczytStanuKonta());
            listaAtom.uzupelnijKupione(0,gracz);
            listaFoto.uzupelnijKupione(1,gracz);
            listaWegiel.uzupelnijKupione(2,gracz);
            listaGaz.uzupelnijKupione(3,gracz);
            //otworz zapisana
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
            serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
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
                gracz.dodajBalans(listyElektrowni.getElektrownieAtomowe().get(0).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(0,null);
                a1 = false;
                listaAtom.uzupelnijKupione(0,gracz);
                frame.dispose();
            }
           if(e.getSource() == elektrowniaAtomowa1.kupBloki){
               gracz.odejmijBalans(listyElektrowni.getElektrownieAtomowe().get(0).getCenaBloku());
               listaAtom.nowyBlok(0);
               zaktualizujStanKonta();
           }
           if(e.getSource() == elektrowniaAtomowa1.zatrudnijPracownika){
               gracz.odejmijBalans(cenaZatrudnieniaPracownika);
               listaAtom.dodatkowyPracownik(0);
               zaktualizujStanKonta();
           }
           if(e.getSource() == elektrowniaAtomowa1.zwolnijPracownika){
               listaAtom.zolnionyPracownik(0);
           }
           if(e.getSource() == elektrowniaAtomowa1.dokupButton){
               gracz.odejmijBalans(420);
               listaAtom.uzupelnienieMagazynu(0);
               zaktualizujStanKonta();
           }
           if(e.getSource() == elektrowniaAtomowa1.zapiszIZamknij){
               serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
               serializacje.zapisStanuKonta(gracz.getBalans());
               frame.dispose();
           }
           reakcjaAtakRadia(elektrowniaAtomowa1,gracz,0,e);
       }


        if(e.getSource() == listaAtom.button2){
            elektrowniaAtomowa2 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(1),gracz);
            walidacjaOkna(elektrowniaAtomowa2);
            a2 = true;
        }
        if (a2){
            if (e.getSource() == elektrowniaAtomowa2.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieAtomowe().get(1).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(1,null);
                a2 = false;
                frame.dispose();
                listaAtom.uzupelnijKupione(0, gracz);
            }
            if(e.getSource() == elektrowniaAtomowa2.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieAtomowe().get(1).getCenaBloku());
                listaAtom.nowyBlok(1);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaAtomowa2.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaAtom.dodatkowyPracownik(1);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaAtomowa2.zwolnijPracownika){
                listaAtom.zolnionyPracownik(1);
            }
            if(e.getSource() == elektrowniaAtomowa2.dokupButton){
                gracz.odejmijBalans(420);
                listaAtom.uzupelnienieMagazynu(1);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaAtomowa2.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
            }
        }
        if(e.getSource() == listaAtom.button3){
            elektrowniaAtomowa3 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(2),gracz);
            walidacjaOkna(elektrowniaAtomowa3);
            a3 = true;
        }
        if (a3){
            if (e.getSource() == elektrowniaAtomowa3.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieAtomowe().get(2).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(2,null);
                a3 = false;
                frame.dispose();
                listaAtom.uzupelnijKupione(0 , gracz);
            }
            if(e.getSource() == elektrowniaAtomowa3.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieAtomowe().get(2).getCenaBloku());
                listaAtom.nowyBlok(2);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaAtomowa3.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaAtom.dodatkowyPracownik(2);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaAtomowa3.zwolnijPracownika){
                listaAtom.zolnionyPracownik(2);
            }
            if(e.getSource() == elektrowniaAtomowa3.dokupButton){
                gracz.odejmijBalans(420);
                listaAtom.uzupelnienieMagazynu(2);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaAtomowa3.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
            }
        }
        if(e.getSource() == listaAtom.button4){
            elektrowniaAtomowa4 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(3),gracz);
            walidacjaOkna(elektrowniaAtomowa4);
            a4 = true;
        }
        if (a4){
            if (e.getSource() == elektrowniaAtomowa4.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieAtomowe().get(3).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(3,null);
                a4 = false;
                frame.dispose();
                listaAtom.uzupelnijKupione(0, gracz);

            }
            if(e.getSource() == elektrowniaAtomowa4.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieAtomowe().get(3).getCenaBloku());
                listaAtom.nowyBlok(3);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaAtomowa4.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaAtom.dodatkowyPracownik(3);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaAtomowa4.zwolnijPracownika){
                listaAtom.zolnionyPracownik(3);
            }
            if(e.getSource() == elektrowniaAtomowa4.dokupButton){
                gracz.odejmijBalans(420);
                listaAtom.uzupelnienieMagazynu(3);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaAtomowa4.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
            }
        }
        if(e.getSource() == listaAtom.button5){
            elektrowniaAtomowa5 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(4),gracz);
            walidacjaOkna(elektrowniaAtomowa5);
            a5 = true;
        }
        if (a5){
            if (e.getSource() == elektrowniaAtomowa5.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieAtomowe().get(4).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(4,null);
                a5 = false;
                frame.dispose();
                listaAtom.uzupelnijKupione(0, gracz);
            }
            if(e.getSource() == elektrowniaAtomowa5.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieAtomowe().get(4).getCenaBloku());
                listaAtom.nowyBlok(4);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaAtomowa5.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaAtom.dodatkowyPracownik(4);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaAtomowa5.zwolnijPracownika){
                listaAtom.zolnionyPracownik(4);
            }
            if(e.getSource() == elektrowniaAtomowa5.dokupButton){
                gracz.odejmijBalans(420);
                listaAtom.uzupelnienieMagazynu(4);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaAtomowa5.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
            }
        }
        //--------- FOTOWOLTAICZNA -------
        if(e.getSource() == listaFoto.button1){
            elektrowniaFotowoltaiczna1 = new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(5),gracz);
            walidacjaOkna(elektrowniaFotowoltaiczna1);
            f1 = true;
        }
        if (f1){
            if (e.getSource() == elektrowniaFotowoltaiczna1.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieFotowoltaiczne().get(0).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(5,null);
                f1 = false;
                frame.dispose();
                listaFoto.uzupelnijKupione(1, gracz);
            }
            if(e.getSource() == elektrowniaFotowoltaiczna1.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieFotowoltaiczne().get(0).getCenaBloku());
                listaFoto.nowyBlok(0);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaFotowoltaiczna1.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaFoto.dodatkowyPracownik(0);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaFotowoltaiczna1.zwolnijPracownika){
                listaFoto.zolnionyPracownik(0);
            }
            if(e.getSource() == elektrowniaFotowoltaiczna1.dokupButton){
                gracz.odejmijBalans(420);
                listaFoto.uzupelnienieMagazynu(0);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaFotowoltaiczna1.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
            }
        }
        if(e.getSource() == listaFoto.button2){
            elektrowniaFotowoltaiczna2 = new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(6),gracz);
            walidacjaOkna(elektrowniaFotowoltaiczna2);
            f2 = true;
        }
        if (f2){
            if (e.getSource() == elektrowniaFotowoltaiczna2.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieFotowoltaiczne().get(1).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(6,null);
                f2 = false;
                frame.dispose();
                listaFoto.uzupelnijKupione(1, gracz);
            }
            if(e.getSource() == elektrowniaFotowoltaiczna2.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieFotowoltaiczne().get(1).getCenaBloku());
                listaFoto.nowyBlok(1);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaFotowoltaiczna2.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaFoto.dodatkowyPracownik(1);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaFotowoltaiczna2.zwolnijPracownika){
                listaFoto.zolnionyPracownik(1);
            }
            if(e.getSource() == elektrowniaFotowoltaiczna2.dokupButton){
                gracz.odejmijBalans(420);
                listaFoto.uzupelnienieMagazynu(1);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaFotowoltaiczna2.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
            }
        }
        if(e.getSource() == listaFoto.button3){
            elektrowniaFotowoltaiczna3 = new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(7),gracz);
            walidacjaOkna(elektrowniaFotowoltaiczna3);
            f3 = true;
        }
        if (f3){
            if (e.getSource() == elektrowniaFotowoltaiczna3.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieFotowoltaiczne().get(2).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(7,null);
                f3 = false;
                frame.dispose();
                listaFoto.uzupelnijKupione(1, gracz);
            }
            if(e.getSource() == elektrowniaFotowoltaiczna3.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieFotowoltaiczne().get(2).getCenaBloku());
                listaFoto.nowyBlok(2);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaFotowoltaiczna3.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaFoto.dodatkowyPracownik(2);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaFotowoltaiczna3.zwolnijPracownika){
                listaFoto.zolnionyPracownik(2);
            }
            if(e.getSource() == elektrowniaFotowoltaiczna3.dokupButton){
                gracz.odejmijBalans(420);
                listaFoto.uzupelnienieMagazynu(2);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaFotowoltaiczna3.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
            }
        }
        if(e.getSource() == listaFoto.button4){
            elektrowniaFotowoltaiczna4 = new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(8),gracz);
            walidacjaOkna(elektrowniaFotowoltaiczna4);
            f4 = true;
        }
        if (f4){
            if (e.getSource() == elektrowniaFotowoltaiczna4.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieFotowoltaiczne().get(3).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(8,null);
                f4 = false;
                frame.dispose();
                listaFoto.uzupelnijKupione(1, gracz);
            }
            if(e.getSource() == elektrowniaFotowoltaiczna4.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieFotowoltaiczne().get(3).getCenaBloku());
                listaFoto.nowyBlok(3);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaFotowoltaiczna4.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaFoto.dodatkowyPracownik(3);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaFotowoltaiczna4.zwolnijPracownika){
                listaFoto.zolnionyPracownik(3);
            }
            if(e.getSource() == elektrowniaFotowoltaiczna4.dokupButton){
                gracz.odejmijBalans(420);
                listaFoto.uzupelnienieMagazynu(3);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaFotowoltaiczna4.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
            }
        }
        if(e.getSource() == listaFoto.button5){
            elektrowniaFotowoltaiczna5 = new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(9),gracz);
            walidacjaOkna(elektrowniaFotowoltaiczna5);
            f5 = true;
        }
        if (f5){
            if (e.getSource() == elektrowniaFotowoltaiczna5.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieFotowoltaiczne().get(4).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(9,null);
                f5 = false;
                frame.dispose();
                listaFoto.uzupelnijKupione(1, gracz);
            }
            if(e.getSource() == elektrowniaFotowoltaiczna5.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieFotowoltaiczne().get(4).getCenaBloku());
                listaFoto.nowyBlok(4);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaFotowoltaiczna5.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaFoto.dodatkowyPracownik(4);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaFotowoltaiczna5.zwolnijPracownika){
                listaFoto.zolnionyPracownik(4);
            }
            if(e.getSource() == elektrowniaFotowoltaiczna5.dokupButton){
                gracz.odejmijBalans(420);
                listaFoto.uzupelnienieMagazynu(4);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaFotowoltaiczna5.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
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
                gracz.dodajBalans(listyElektrowni.getElektrownieWeglowe().get(0).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(10,null);
                w1 = false;
                frame.dispose();
                listaWegiel.uzupelnijKupione(2, gracz);
            }
            if(e.getSource() == elektrowniaWeglowa1.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieWeglowe().get(0).getCenaBloku());
                listaWegiel.nowyBlok(0);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaWeglowa1.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaWegiel.dodatkowyPracownik(0);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaWeglowa1.zwolnijPracownika){
                listaWegiel.zolnionyPracownik(0);
            }
            if(e.getSource() == elektrowniaWeglowa1.dokupButton){
                gracz.odejmijBalans(420);
                listaWegiel.uzupelnienieMagazynu(0);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaWeglowa1.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
            }
        }
        if(e.getSource() == listaWegiel.button2){
            elektrowniaWeglowa2 = new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(11),gracz);
            walidacjaOkna(elektrowniaWeglowa2);
            w2 = true;
        }
        if (w2){
            if (e.getSource() == elektrowniaWeglowa2.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieWeglowe().get(1).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(11,null);
                w2 = false;
                frame.dispose();
                listaWegiel.uzupelnijKupione(2, gracz);
            }
            if(e.getSource() == elektrowniaWeglowa2.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieWeglowe().get(1).getCenaBloku());
                listaWegiel.nowyBlok(1);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaWeglowa2.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaWegiel.dodatkowyPracownik(1);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaWeglowa2.zwolnijPracownika){
                listaWegiel.zolnionyPracownik(1);
            }
            if(e.getSource() == elektrowniaWeglowa2.dokupButton){
                gracz.odejmijBalans(420);
                listaWegiel.uzupelnienieMagazynu(1);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaWeglowa2.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
            }
        }
        if(e.getSource() == listaWegiel.button3){
            elektrowniaWeglowa3 = new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(12),gracz);
            walidacjaOkna(elektrowniaWeglowa3);
            w3 = true;
        }
        if (w3){
            if (e.getSource() == elektrowniaWeglowa3.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieWeglowe().get(2).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(12,null);
                w3 = false;
                frame.dispose();
                listaWegiel.uzupelnijKupione(2, gracz);
            }
            if(e.getSource() == elektrowniaWeglowa3.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieWeglowe().get(2).getCenaBloku());
                listaWegiel.nowyBlok(2);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaWeglowa3.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaWegiel.dodatkowyPracownik(2);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaWeglowa3.zwolnijPracownika){
                listaWegiel.zolnionyPracownik(2);
            }
            if(e.getSource() == elektrowniaWeglowa3.dokupButton){
                gracz.odejmijBalans(420);
                listaWegiel.uzupelnienieMagazynu(2);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaWeglowa3.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
            }
        }
        if(e.getSource() == listaWegiel.button4){
            elektrowniaWeglowa4 = new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(13),gracz);
            walidacjaOkna(elektrowniaWeglowa4);
            w4 = true;
        }
        if (w4){
            if (e.getSource() == elektrowniaWeglowa4.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieWeglowe().get(3).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(13,null);
                w4 = false;
                frame.dispose();
                listaWegiel.uzupelnijKupione(2, gracz);
            }
            if(e.getSource() == elektrowniaWeglowa4.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieWeglowe().get(3).getCenaBloku());
                listaWegiel.nowyBlok(3);
                zaktualizujStanKonta();

            }
            if(e.getSource() == elektrowniaWeglowa4.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaWegiel.dodatkowyPracownik(3);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaWeglowa4.zwolnijPracownika){
                listaWegiel.zolnionyPracownik(3);
            }
            if(e.getSource() == elektrowniaWeglowa4.dokupButton){
                gracz.odejmijBalans(420);
                listaWegiel.uzupelnienieMagazynu(3);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaWeglowa4.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
            }
        }
        if(e.getSource() == listaWegiel.button5){
            elektrowniaWeglowa5 = new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(14),gracz);
            walidacjaOkna(elektrowniaWeglowa5);
            w5 = true;
        }
        if (w5){
            if (e.getSource() == elektrowniaWeglowa5.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieWeglowe().get(4).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(14,null);
                w5 = false;
                frame.dispose();
                listaWegiel.uzupelnijKupione(2, gracz);
            }
            if(e.getSource() == elektrowniaWeglowa5.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieWeglowe().get(4).getCenaBloku());
                listaWegiel.nowyBlok(4);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaWeglowa5.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaWegiel.dodatkowyPracownik(4);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaWeglowa5.zwolnijPracownika){
                listaWegiel.zolnionyPracownik(4);
            }
            if(e.getSource() == elektrowniaWeglowa5.dokupButton){
                gracz.odejmijBalans(420);
                listaWegiel.uzupelnienieMagazynu(4);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaWeglowa5.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
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
                gracz.dodajBalans(listyElektrowni.getElektrownieGazowe().get(0).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(15,null);
                g1 = false;
                frame.dispose();
                listaGaz.uzupelnijKupione(3, gracz);
            }
            if(e.getSource() == elektrowniaGazowa1.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieGazowe().get(0).getCenaBloku());
                listaGaz.nowyBlok(0);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaGazowa1.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaGaz.dodatkowyPracownik(0);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaGazowa1.zwolnijPracownika){
                listaGaz.zolnionyPracownik(0);
            }
            if(e.getSource() == elektrowniaGazowa1.dokupButton){
                gracz.odejmijBalans(420);
                listaGaz.uzupelnienieMagazynu(0);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaGazowa1.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
            }
        }
        if(e.getSource() == listaGaz.button2){
            elektrowniaGazowa2 = new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(16),gracz);
            walidacjaOkna(elektrowniaGazowa2);
            g2 = true;
        }
        if (g2){
            if (e.getSource() == elektrowniaGazowa2.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieGazowe().get(1).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(16,null);
                g2 = false;
                frame.dispose();
                listaGaz.uzupelnijKupione(3, gracz);
            }
            if(e.getSource() == elektrowniaGazowa2.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieGazowe().get(1).getCenaBloku());
                listaGaz.nowyBlok(1);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaGazowa2.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaGaz.dodatkowyPracownik(1);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaGazowa2.zwolnijPracownika){
                listaGaz.zolnionyPracownik(1);
            }
            if(e.getSource() == elektrowniaGazowa2.dokupButton){
                gracz.odejmijBalans(420);
                listaGaz.uzupelnienieMagazynu(1);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaGazowa2.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
            }
        }
        if(e.getSource() == listaGaz.button3){
            elektrowniaGazowa3 = new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(17),gracz);
            walidacjaOkna(elektrowniaGazowa3);
            g3 = true;
        }
        if (g3){
            if (e.getSource() == elektrowniaGazowa3.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieGazowe().get(2).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(17,null);
                g3 = false;
                frame.dispose();
                listaGaz.uzupelnijKupione(3, gracz);
            }
            if(e.getSource() == elektrowniaGazowa3.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieGazowe().get(2).getCenaBloku());
                listaGaz.nowyBlok(2);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaGazowa3.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaGaz.dodatkowyPracownik(2);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaGazowa3.zwolnijPracownika){
                listaGaz.zolnionyPracownik(2);
            }
            if(e.getSource() == elektrowniaGazowa3.dokupButton){
                gracz.odejmijBalans(420);
                listaGaz.uzupelnienieMagazynu(2);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaGazowa3.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
            }
        }
        if(e.getSource() == listaGaz.button4){
            elektrowniaGazowa4 = new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(18),gracz);
            walidacjaOkna(elektrowniaGazowa4);
            g4 = true;
        }
        if (g4){
            if (e.getSource() == elektrowniaGazowa4.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieGazowe().get(3).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(18,null);
                g4 = false;
                frame.dispose();
                listaGaz.uzupelnijKupione(3, gracz);
            }
            if(e.getSource() == elektrowniaGazowa4.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieGazowe().get(3).getCenaBloku());
                listaGaz.nowyBlok(3);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaGazowa4.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaGaz.dodatkowyPracownik(3);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaGazowa4.zwolnijPracownika){
                listaGaz.zolnionyPracownik(3);
            }
            if(e.getSource() == elektrowniaGazowa4.dokupButton){
                gracz.odejmijBalans(420);
                listaGaz.uzupelnienieMagazynu(3);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaGazowa4.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
            }
        }
        if(e.getSource() == listaGaz.button5){
            elektrowniaGazowa5 = new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(19),gracz);
            walidacjaOkna(elektrowniaGazowa5);
            g5 = true;
        }
        if (g5){
            if (e.getSource() == elektrowniaGazowa5.sprzedajButton){
                gracz.dodajBalans(listyElektrowni.getElektrownieGazowe().get(4).getCenaSprzedazy());
                zaktualizujStanKonta();
                gracz.getListaElektrowni().set(19,null);
                g5 = false;
                frame.dispose();
                listaGaz.uzupelnijKupione(3, gracz);
            }
            if(e.getSource() == elektrowniaGazowa5.kupBloki){
                gracz.odejmijBalans(listyElektrowni.getElektrownieGazowe().get(4).getCenaBloku());
                listaGaz.nowyBlok(4);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaGazowa5.zatrudnijPracownika){
                gracz.odejmijBalans(cenaZatrudnieniaPracownika);
                listaGaz.dodatkowyPracownik(4);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaGazowa5.zwolnijPracownika){
                listaGaz.zolnionyPracownik(4);
            }
            if(e.getSource() == elektrowniaGazowa5.dokupButton){
                gracz.odejmijBalans(420);
                listaGaz.uzupelnienieMagazynu(4);
                zaktualizujStanKonta();
            }
            if(e.getSource() == elektrowniaGazowa5.zapiszIZamknij){
                serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
                serializacje.zapisStanuKonta(gracz.getBalans());
                frame.dispose();
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
        okno.zapiszIZamknij.addActionListener(this);
        okno.atakBrak.addActionListener(this);
        okno.atak1.addActionListener(this);
        okno.atak2.addActionListener(this);
        okno.awariaBrak.addActionListener(this);
        okno.awaria1.addActionListener(this);
        okno.awaria2.addActionListener(this);
        tym.removeAll();
        tym.add(okno);
        tym.revalidate();
        tym.repaint();

        frame.setVisible(true);
    }
    public void reakcjaAtakRadia(ElektrowniaOknoAbstract okno, Gracz gracz,int indeksElektrowni,ActionEvent e){
        if (e.getSource() == okno.atakBrak){
            gracz.getListaElektrowni().get(indeksElektrowni).setSposobNaReakcjeNaAtak(0);
        }else if (e.getSource() == okno.atak1){
            gracz.getListaElektrowni().get(indeksElektrowni).setSposobNaReakcjeNaAtak(1);
        }else if (e.getSource() == okno.atak2){
            gracz.getListaElektrowni().get(indeksElektrowni).setSposobNaReakcjeNaAtak(2);
        }
    }

    private int wybor;
    public void setWybor(int x){
        wybor = x;
    }
    public int getWybor(){
        return wybor;
    }
}
