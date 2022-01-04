package com.company.GUI;
import com.company.AtakTerro.Sposob1ReakcjaNaAtakTerrorystyczny;
import com.company.AtakTerro.Sposob2ReakcjaNaAtakTerrorystyczny;
import com.company.Awarie.Sposob1ReakcjaNaAwarieZasilania;
import com.company.Awarie.Sposob2ReakcjaNaAwarieZasilania;
import com.company.Elektrownie.*;
import com.company.GUI.ElektrownieOkno.*;
import com.company.Head.Gracz;
import com.company.Head.Serializacja;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class GamePanel extends JPanel implements ActionListener, ChangeListener {
    final int width = 942;
    final int height = 628;
    Serializacja serializacje;
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
    int liczbaKlikniec = 0;

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
        serializacje = new Serializacja();
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
            Random random = new Random();
            for (Elektrownia ele : gracz.getListaElektrowni()){
                int tym = random.nextInt(0,100);
                if (ele != null){
                    if (tym == 13){
                        ele.ReakcjaNaAtakTerrorystyczny(ele, gracz);
                        atakNotification(ele.getMiasto());
                    }
                    if (tym < 4){
                        ele.ReakcjeNaAwarieZasilania(ele);
                        awariaNotification(ele.getMiasto());
                    }
                    gracz.dodajBalans(ele.ObliczDochod(ele));
                    if (ele instanceof ElektrowniaGazowa){
                        if (((ElektrowniaGazowa) ele).getIloscGazuWMagazynie()*100/((ElektrowniaGazowa) ele).getMaxPojemnoscMagazynu() < ele.getKiedyDokupic()){

                        }
                    }
                }
            }

            serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
            serializacje.zapisStanuKonta(gracz.getBalans());
            zaktualizujStanKonta();
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
        else if (e.getSource() == listaAtom.kup1 && (gracz.getBalans() < listaAtom.getElektrownie().get(0).getCenaZakupu())){
            listaAtom.komunikat();
        }

        else if (e.getSource() == listaAtom.kup2 && gracz.getBalans() > listaAtom.getElektrownie().get(1).getCenaZakupu()){
            listaAtom.actionPerformed(e);
            gracz.zakupElektrowni(listaAtom.getNrEle(),1,listaAtom.getElektrownie().get(1));
            gracz.odejmijBalans(listaAtom.getElektrownie().get(1).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaAtom.kup2 && (gracz.getBalans() < listaAtom.getElektrownie().get(1).getCenaZakupu())){
            listaAtom.komunikat();
        }

        else if (e.getSource() == listaAtom.kup3 && gracz.getBalans() > listaAtom.getElektrownie().get(2).getCenaZakupu()){
            listaAtom.actionPerformed(e);
            gracz.zakupElektrowni(listaAtom.getNrEle(),2,listaAtom.getElektrownie().get(2));
            gracz.odejmijBalans(listaAtom.getElektrownie().get(2).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaAtom.kup3 && (gracz.getBalans() < listaAtom.getElektrownie().get(2).getCenaZakupu())){
            listaAtom.komunikat();
        }

        else if (e.getSource() == listaAtom.kup4 && gracz.getBalans() > listaAtom.getElektrownie().get(3).getCenaZakupu()){
            listaAtom.actionPerformed(e);
            gracz.zakupElektrowni(listaAtom.getNrEle(),3,listaAtom.getElektrownie().get(3));
            gracz.odejmijBalans(listaAtom.getElektrownie().get(3).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaAtom.kup4 && (gracz.getBalans() < listaAtom.getElektrownie().get(3).getCenaZakupu())){
            listaAtom.komunikat();
        }

        else if (e.getSource() == listaAtom.kup5 && gracz.getBalans() > listaAtom.getElektrownie().get(4).getCenaZakupu()){
            listaAtom.actionPerformed(e);
            gracz.zakupElektrowni(listaAtom.getNrEle(),4,listaAtom.getElektrownie().get(4));
            gracz.odejmijBalans(listaAtom.getElektrownie().get(4).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaAtom.kup5 && (gracz.getBalans() < listaAtom.getElektrownie().get(4).getCenaZakupu())){
            listaAtom.komunikat();
        }

        //-------- Gazowa -------------------------

        else if (e.getSource() == listaGaz.kup1 && gracz.getBalans() > listaGaz.getElektrownie().get(0).getCenaZakupu()){
            listaGaz.actionPerformed(e);
            gracz.zakupElektrowni(listaGaz.getNrEle(),0,listaGaz.getElektrownie().get(0));
            gracz.odejmijBalans(listaGaz.getElektrownie().get(0).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaGaz.kup1 && (gracz.getBalans() < listaGaz.getElektrownie().get(0).getCenaZakupu())){
            listaGaz.komunikat();
        }

        else if (e.getSource() == listaGaz.kup2 && gracz.getBalans() > listaGaz.getElektrownie().get(1).getCenaZakupu()){
            listaGaz.actionPerformed(e);
            gracz.zakupElektrowni(listaGaz.getNrEle(),1,listaGaz.getElektrownie().get(1));
            gracz.odejmijBalans(listaGaz.getElektrownie().get(1).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaGaz.kup2 && (gracz.getBalans() < listaGaz.getElektrownie().get(1).getCenaZakupu())){
            listaGaz.komunikat();
        }

        else if (e.getSource() == listaGaz.kup3 && gracz.getBalans() > listaGaz.getElektrownie().get(2).getCenaZakupu()){
            listaGaz.actionPerformed(e);
            gracz.zakupElektrowni(listaGaz.getNrEle(),2,listaGaz.getElektrownie().get(2));
            gracz.odejmijBalans(listaGaz.getElektrownie().get(2).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaGaz.kup3 && (gracz.getBalans() < listaGaz.getElektrownie().get(2).getCenaZakupu())){
            listaGaz.komunikat();
        }

        else if (e.getSource() == listaGaz.kup4 && gracz.getBalans() > listaGaz.getElektrownie().get(3).getCenaZakupu()){
            listaGaz.actionPerformed(e);
            gracz.zakupElektrowni(listaGaz.getNrEle(),3,listaGaz.getElektrownie().get(3));
            gracz.odejmijBalans(listaGaz.getElektrownie().get(3).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaGaz.kup4 && (gracz.getBalans() < listaGaz.getElektrownie().get(3).getCenaZakupu())){
            listaGaz.komunikat();
        }

        else if (e.getSource() == listaGaz.kup5 && gracz.getBalans() > listaGaz.getElektrownie().get(4).getCenaZakupu()){
            listaGaz.actionPerformed(e);
            gracz.zakupElektrowni(listaGaz.getNrEle(),4,listaGaz.getElektrownie().get(4));
            gracz.odejmijBalans(listaGaz.getElektrownie().get(4).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaGaz.kup5 && (gracz.getBalans() < listaGaz.getElektrownie().get(4).getCenaZakupu())){
            listaGaz.komunikat();
        }

        //-------- Weglowa -------------------------

        else if (e.getSource() == listaWegiel.kup1 && gracz.getBalans() > listaWegiel.getElektrownie().get(0).getCenaZakupu()){
            listaWegiel.actionPerformed(e);
            gracz.zakupElektrowni(listaWegiel.getNrEle(),0,listaWegiel.getElektrownie().get(0));
            gracz.odejmijBalans(listaWegiel.getElektrownie().get(0).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaWegiel.kup1 && (gracz.getBalans() < listaWegiel.getElektrownie().get(0).getCenaZakupu())){
            listaWegiel.komunikat();
        }

        else if (e.getSource() == listaWegiel.kup2 && gracz.getBalans() > listaWegiel.getElektrownie().get(1).getCenaZakupu()){
            listaWegiel.actionPerformed(e);
            gracz.zakupElektrowni(listaWegiel.getNrEle(),1,listaWegiel.getElektrownie().get(1));
            gracz.odejmijBalans(listaWegiel.getElektrownie().get(1).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaWegiel.kup2 && (gracz.getBalans() < listaWegiel.getElektrownie().get(1).getCenaZakupu())){
            listaWegiel.komunikat();
        }

        else if (e.getSource() == listaWegiel.kup3 && gracz.getBalans() > listaWegiel.getElektrownie().get(2).getCenaZakupu()){
            listaWegiel.actionPerformed(e);
            gracz.zakupElektrowni(listaWegiel.getNrEle(),2,listaWegiel.getElektrownie().get(2));
            gracz.odejmijBalans(listaWegiel.getElektrownie().get(2).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaWegiel.kup3 && (gracz.getBalans() < listaWegiel.getElektrownie().get(2).getCenaZakupu())){
            listaWegiel.komunikat();
        }

        else if (e.getSource() == listaWegiel.kup4 && gracz.getBalans() > listaWegiel.getElektrownie().get(3).getCenaZakupu()){
            listaWegiel.actionPerformed(e);
            gracz.zakupElektrowni(listaWegiel.getNrEle(),3,listaWegiel.getElektrownie().get(3));
            gracz.odejmijBalans(listaWegiel.getElektrownie().get(3).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaWegiel.kup4 && (gracz.getBalans() < listaWegiel.getElektrownie().get(3).getCenaZakupu())){
            listaWegiel.komunikat();
        }

        else if (e.getSource() == listaWegiel.kup5 && gracz.getBalans() > listaWegiel.getElektrownie().get(4).getCenaZakupu()){
            listaWegiel.actionPerformed(e);
            gracz.zakupElektrowni(listaWegiel.getNrEle(),4,listaWegiel.getElektrownie().get(4));
            gracz.odejmijBalans(listaWegiel.getElektrownie().get(4).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaWegiel.kup5 && (gracz.getBalans() < listaWegiel.getElektrownie().get(4).getCenaZakupu())){
            listaWegiel.komunikat();
        }

        //-------- Fotowoltaiczna -------------------------

        else if (e.getSource() == listaFoto.kup1 && gracz.getBalans() > listaFoto.getElektrownie().get(0).getCenaZakupu()){
            listaFoto.actionPerformed(e);
            gracz.zakupElektrowni(listaFoto.getNrEle(),0,listaFoto.getElektrownie().get(0));
            gracz.odejmijBalans(listaFoto.getElektrownie().get(0).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaFoto.kup1 && (gracz.getBalans() < listaFoto.getElektrownie().get(0).getCenaZakupu())){
            listaFoto.komunikat();
        }

        else if (e.getSource() == listaFoto.kup2 && gracz.getBalans() > listaFoto.getElektrownie().get(1).getCenaZakupu()){
            listaFoto.actionPerformed(e);
            gracz.zakupElektrowni(listaFoto.getNrEle(),1,listaFoto.getElektrownie().get(1));
            gracz.odejmijBalans(listaFoto.getElektrownie().get(1).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaFoto.kup2 && (gracz.getBalans() < listaFoto.getElektrownie().get(1).getCenaZakupu())){
            listaFoto.komunikat();
        }

        else if (e.getSource() == listaFoto.kup3 && gracz.getBalans() > listaFoto.getElektrownie().get(2).getCenaZakupu()){
            listaFoto.actionPerformed(e);
            gracz.zakupElektrowni(listaFoto.getNrEle(),2,listaFoto.getElektrownie().get(2));
            gracz.odejmijBalans(listaFoto.getElektrownie().get(2).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaFoto.kup3 && (gracz.getBalans() < listaFoto.getElektrownie().get(2).getCenaZakupu())){
            listaFoto.komunikat();
        }

        else if (e.getSource() == listaFoto.kup4 && gracz.getBalans() > listaFoto.getElektrownie().get(3).getCenaZakupu()){
            listaFoto.actionPerformed(e);
            gracz.zakupElektrowni(listaFoto.getNrEle(),3,listaFoto.getElektrownie().get(3));
            gracz.odejmijBalans(listaFoto.getElektrownie().get(3).getCenaZakupu());
            listaFoto.actionPerformed(e);
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaFoto.kup4 && (gracz.getBalans() < listaFoto.getElektrownie().get(3).getCenaZakupu())){
            listaFoto.komunikat();
        }

        else if (e.getSource() == listaFoto.kup5 && (gracz.getBalans() > listaFoto.getElektrownie().get(4).getCenaZakupu())){
            listaFoto.actionPerformed(e);
            gracz.zakupElektrowni(listaFoto.getNrEle(),4,listaFoto.getElektrownie().get(4));
            gracz.odejmijBalans(listaFoto.getElektrownie().get(4).getCenaZakupu());
            zaktualizujStanKonta();
        }
        else if (e.getSource() == listaFoto.kup5 && (gracz.getBalans() < listaFoto.getElektrownie().get(4).getCenaZakupu())){
            listaFoto.komunikat();
        }
//-----------------------------------------------------eleAtom
       if(e.getSource() == listaAtom.button1){
            elektrowniaAtomowa1 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(0),gracz);
            walidacjaOkna(elektrowniaAtomowa1);
            a1 = true;
        }
       if (a1){
           przypisButtonow(elektrowniaAtomowa1, frame,0,0, listyElektrowni.elektrownieAtomowe, listaAtom, gracz, a1, e);
       }


        if(e.getSource() == listaAtom.button2){
            elektrowniaAtomowa2 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(1),gracz);
            walidacjaOkna(elektrowniaAtomowa2);
            a2 = true;
        }
        if (a2){
            przypisButtonow(elektrowniaAtomowa2, frame,1,0, listyElektrowni.elektrownieAtomowe, listaAtom, gracz, a2, e);
        }
        if(e.getSource() == listaAtom.button3){
            elektrowniaAtomowa3 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(2),gracz);
            walidacjaOkna(elektrowniaAtomowa3);
            a3 = true;
        }
        if (a3){
            przypisButtonow(elektrowniaAtomowa3, frame,2,0, listyElektrowni.elektrownieAtomowe, listaAtom, gracz, a3, e);
        }
        if(e.getSource() == listaAtom.button4){
            elektrowniaAtomowa4 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(3),gracz);
            walidacjaOkna(elektrowniaAtomowa4);
            a4 = true;
        }
        if (a4){
            przypisButtonow(elektrowniaAtomowa4, frame,3,0, listyElektrowni.elektrownieAtomowe, listaAtom, gracz, a4, e);
        }
        if(e.getSource() == listaAtom.button5){
            elektrowniaAtomowa5 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(4),gracz);
            walidacjaOkna(elektrowniaAtomowa5);
            a5 = true;
        }
        if (a5){
            przypisButtonow(elektrowniaAtomowa5, frame,4,0, listyElektrowni.elektrownieAtomowe, listaAtom, gracz, a5, e);
        }
        //--------- FOTOWOLTAICZNA -------
        if(e.getSource() == listaFoto.button1){
            elektrowniaFotowoltaiczna1 = new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(5),gracz);
            walidacjaOkna(elektrowniaFotowoltaiczna1);
            f1 = true;
        }
        if (f1){
            przypisButtonow(elektrowniaFotowoltaiczna1, frame,5,1, listyElektrowni.elektrownieFotowoltaiczne, listaFoto, gracz, f1, e);
        }
        if(e.getSource() == listaFoto.button2){
            elektrowniaFotowoltaiczna2 = new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(6),gracz);
            walidacjaOkna(elektrowniaFotowoltaiczna2);
            f2 = true;
        }
        if (f2){
            przypisButtonow(elektrowniaFotowoltaiczna2, frame,6,1, listyElektrowni.elektrownieFotowoltaiczne, listaFoto, gracz, f2, e);
        }
        if(e.getSource() == listaFoto.button3){
            elektrowniaFotowoltaiczna3 = new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(7),gracz);
            walidacjaOkna(elektrowniaFotowoltaiczna3);
            f3 = true;
        }
        if (f3){
            przypisButtonow(elektrowniaFotowoltaiczna3, frame,7,1, listyElektrowni.elektrownieFotowoltaiczne, listaFoto, gracz, f3, e);
        }
        if(e.getSource() == listaFoto.button4){
            elektrowniaFotowoltaiczna4 = new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(8),gracz);
            walidacjaOkna(elektrowniaFotowoltaiczna4);
            f4 = true;
        }
        if (f4){
            przypisButtonow(elektrowniaFotowoltaiczna4, frame,8,1, listyElektrowni.elektrownieFotowoltaiczne, listaFoto, gracz, f4, e);
        }
        if(e.getSource() == listaFoto.button5){
            elektrowniaFotowoltaiczna5 = new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(9),gracz);
            walidacjaOkna(elektrowniaFotowoltaiczna5);
            f5 = true;
        }
        if (f5){
            przypisButtonow(elektrowniaFotowoltaiczna5, frame,9,1, listyElektrowni.elektrownieFotowoltaiczne, listaFoto, gracz, f5, e);
        }
        //-------------
        if(e.getSource() == listaWegiel.button1){
            elektrowniaWeglowa1 = new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(10),gracz);
            walidacjaOkna(elektrowniaWeglowa1);
            w1 = true;
        }
        if (w1){
            przypisButtonow(elektrowniaWeglowa1, frame,10,2, listyElektrowni.elektrownieWeglowe, listaWegiel, gracz, w1, e);
        }
        if(e.getSource() == listaWegiel.button2){
            elektrowniaWeglowa2 = new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(11),gracz);
            walidacjaOkna(elektrowniaWeglowa2);
            w2 = true;
        }
        if (w2){
            przypisButtonow(elektrowniaWeglowa2, frame,11,2, listyElektrowni.elektrownieWeglowe, listaWegiel, gracz, w2, e);
        }
        if(e.getSource() == listaWegiel.button3){
            elektrowniaWeglowa3 = new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(12),gracz);
            walidacjaOkna(elektrowniaWeglowa3);
            w3 = true;
        }
        if (w3){
            przypisButtonow(elektrowniaWeglowa3, frame,12,2, listyElektrowni.elektrownieWeglowe, listaWegiel, gracz, w3, e);
        }
        if(e.getSource() == listaWegiel.button4){
            elektrowniaWeglowa4 = new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(13),gracz);
            walidacjaOkna(elektrowniaWeglowa4);
            w4 = true;
        }
        if (w4){
            przypisButtonow(elektrowniaWeglowa4, frame,13,2, listyElektrowni.elektrownieWeglowe, listaWegiel, gracz, w4, e);
        }
        if(e.getSource() == listaWegiel.button5){
            elektrowniaWeglowa5 = new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(14),gracz);
            walidacjaOkna(elektrowniaWeglowa5);
            w5 = true;
        }
        if (w5){
            przypisButtonow(elektrowniaWeglowa5, frame,14,2, listyElektrowni.elektrownieWeglowe, listaWegiel, gracz, w5, e);
        }
        //---------------
        if(e.getSource() == listaGaz.button1){
            elektrowniaGazowa1 = new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(15),gracz);
            walidacjaOkna(elektrowniaGazowa1);
            g1 = true;
        }
        if (g1){
            przypisButtonow(elektrowniaGazowa1, frame,15,3, listyElektrowni.elektrownieGazowe, listaGaz, gracz, g1, e);
        }
        if(e.getSource() == listaGaz.button2){
            elektrowniaGazowa2 = new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(16),gracz);
            walidacjaOkna(elektrowniaGazowa2);
            g2 = true;
        }
        if (g2){
            przypisButtonow(elektrowniaGazowa2, frame,16,3, listyElektrowni.elektrownieGazowe, listaGaz, gracz, g2, e);

        }
        if(e.getSource() == listaGaz.button3){
            elektrowniaGazowa3 = new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(17),gracz);
            walidacjaOkna(elektrowniaGazowa3);
            g3 = true;
        }
        if (g3){
            przypisButtonow(elektrowniaGazowa3, frame,17,3, listyElektrowni.elektrownieGazowe, listaGaz, gracz, g3, e);

        }
        if(e.getSource() == listaGaz.button4){
            elektrowniaGazowa4 = new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(18),gracz);
            walidacjaOkna(elektrowniaGazowa4);
            g4 = true;
        }
        if (g4){
            przypisButtonow(elektrowniaGazowa4, frame,18,3, listyElektrowni.elektrownieGazowe, listaGaz, gracz, g4, e);

        }
        if(e.getSource() == listaGaz.button5){
            elektrowniaGazowa5 = new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(19),gracz);
            walidacjaOkna(elektrowniaGazowa5);
            g5 = true;
        }
        if (g5){
            przypisButtonow(elektrowniaGazowa5, frame,19,3, listyElektrowni.elektrownieGazowe, listaGaz, gracz, g5, e);
        }

        //-------------------------------------------------------------------------
        if(e.getSource() == listaFoto.powrot){
            this.remove(listaFoto);
            add(gra,BorderLayout.CENTER);
        }
        else if(e.getSource() == listaWegiel.powrot){
            this.remove(listaWegiel);
            add(gra,BorderLayout.CENTER);
        }
        else if(e.getSource() == listaGaz.powrot){
            this.remove(listaGaz);
            add(gra,BorderLayout.CENTER);
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
        okno.mocSlider.addChangeListener(this);
        okno.kiedySlider.addChangeListener(this);
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
            gracz.getListaElektrowni().get(indeksElektrowni).setReakcjeNaAtakTerrorystyczny(new Sposob1ReakcjaNaAtakTerrorystyczny());
        }else if (e.getSource() == okno.atak2){
            gracz.getListaElektrowni().get(indeksElektrowni).setSposobNaReakcjeNaAtak(2);
            gracz.getListaElektrowni().get(indeksElektrowni).setReakcjeNaAtakTerrorystyczny(new Sposob2ReakcjaNaAtakTerrorystyczny());
        }
    }
    public void reakcjaAwariaRadia(ElektrowniaOknoAbstract okno, Gracz gracz,int indeksElektrowni,ActionEvent e){
        if (e.getSource() == okno.awariaBrak){
            gracz.getListaElektrowni().get(indeksElektrowni).setSposobNaReakcjeNaAwarie(0);
        }else if (e.getSource() == okno.awaria1){
            gracz.getListaElektrowni().get(indeksElektrowni).setSposobNaReakcjeNaAwarie(1);
            gracz.getListaElektrowni().get(indeksElektrowni).setReakcjaNaAwarieZasilania(new Sposob1ReakcjaNaAwarieZasilania());
        }else if (e.getSource() == okno.awaria2){
            gracz.getListaElektrowni().get(indeksElektrowni).setSposobNaReakcjeNaAwarie(2);
            gracz.getListaElektrowni().get(indeksElektrowni).setReakcjaNaAwarieZasilania(new Sposob2ReakcjaNaAwarieZasilania());

        }
    }
    public void przypisButtonow(ElektrowniaOknoAbstract panel, JFrame okno,int indeksEle,int miejsce,ArrayList<Elektrownia> lista,ListaEle rodzaj,Gracz gracz,boolean bool,ActionEvent e){

        if (e.getSource() == panel.sprzedajButton){
            gracz.dodajBalans(lista.get(indeksEle%5).getCenaSprzedazy());
            zaktualizujStanKonta();
            gracz.getListaElektrowni().set(indeksEle,null);
            bool = false;
            okno.dispose();
            rodzaj.uzupelnijKupione(miejsce, gracz);
            liczbaKlikniec = 0;
        }
        if(e.getSource() == panel.kupBloki){
            gracz.odejmijBalans(lista.get(indeksEle%5).getCenaBloku());
            rodzaj.nowyBlok(indeksEle%5);
            zaktualizujStanKonta();
            liczbaKlikniec++;
            panel.mocMaksymalnaLabel.setText("<html><div style='text-align: center;'> Moc maksymalna elektrowni: <br> " + String.valueOf(Integer.valueOf(lista.get(indeksEle%5).getMocMaksymalna())+(100*liczbaKlikniec)) +"<html>");
            panel.liczbaBlokowLabel.setText("<html><div style='text-align: center;'> Liczba blokow elektrowni: <br> " + lista.get(indeksEle%5).getLiczbaBlokow() +"<html>");
            odswierzSlider(panel,indeksEle);
        }
        if(e.getSource() == panel.zatrudnijPracownika){
            gracz.odejmijBalans(cenaZatrudnieniaPracownika);
            rodzaj.dodatkowyPracownik(indeksEle%5);
            zaktualizujStanKonta();
            panel.liczbaPracownikowLabel.setText("<html><div style='text-align: center;'> Liczba pracowników elektrowni: <br> " + lista.get(indeksEle%5).getLiczbaPracownikow() +"<html>");
            odswierzSlider(panel,indeksEle);
        }
        if(e.getSource() == panel.zwolnijPracownika){
            rodzaj.zolnionyPracownik(indeksEle%5);
            panel.liczbaPracownikowLabel.setText("<html><div style='text-align: center;'> Liczba pracowników elektrowni: <br> " + lista.get(indeksEle%5).getLiczbaPracownikow() +"<html>");
            odswierzSlider(panel,indeksEle);
        }
        if(e.getSource() == panel.dokupButton){
            gracz.odejmijBalans(420);
            rodzaj.uzupelnienieMagazynu(indeksEle%5);
            zaktualizujStanKonta();
            panel.stanMagazynuLabel.setText("<html><div style='text-align: center;'> Stan magazynu: <br> " + "maks" +"<html>");
        }
        if(e.getSource() == panel.zapiszIZamknij){
            serializacje.zapis((ArrayList<Elektrownia>) gracz.getListaElektrowni());
            serializacje.zapisStanuKonta(gracz.getBalans());
            okno.dispose();
            liczbaKlikniec = 0;
        }
        reakcjaAtakRadia(panel,gracz,indeksEle,e);
        reakcjaAwariaRadia(panel,gracz,indeksEle,e);
    }
    void odswierzSlider(ElektrowniaOknoAbstract panel, int indeksEle){
        int tym = gracz.getListaElektrowni().get(indeksEle).getLiczbaPracownikow() * 100 / gracz.getListaElektrowni().get(indeksEle).getLiczbaBlokow();
        if (panel.mocSlider.getValue() > tym) {
            panel.mocSlider.setValue(tym);
        } else if (panel.mocSlider.getValue() == tym) {
            panel.mocLabel.setForeground(Color.red);
        } else {
            panel.mocLabel.setForeground(Color.white);
        }
        gracz.getListaElektrowni().get(indeksEle).setMocChwilowa(panel.mocSlider.getValue() * gracz.getListaElektrowni().get(indeksEle).getMocMaksymalna() / 100);

    }

    public void awariaNotification(String miasto){
        JOptionPane.showMessageDialog(null,"Doszło do awarii elektrowni w " + miasto + "!","Komunikat",JOptionPane.INFORMATION_MESSAGE);
    }

    public void atakNotification(String miasto){
        JOptionPane.showMessageDialog(null,"Doszło do ataku terrorystycznego na elektrownie w " + miasto + "!","Komunikat",JOptionPane.INFORMATION_MESSAGE);
    }


    private int wybor;
    public void setWybor(int x){
        wybor = x;
    }
    public int getWybor(){
        return wybor;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        slidery(elektrowniaAtomowa1,0,gracz,e,a1);
        slidery(elektrowniaAtomowa2,1,gracz,e,a2);
        slidery(elektrowniaAtomowa3,2,gracz,e,a3);
        slidery(elektrowniaAtomowa4,3,gracz,e,a4);
        slidery(elektrowniaAtomowa5,4,gracz,e,a5);

        slidery(elektrowniaFotowoltaiczna1,5,gracz,e,f1);
        slidery(elektrowniaFotowoltaiczna2,6,gracz,e,f2);
        slidery(elektrowniaFotowoltaiczna3,7,gracz,e,f3);
        slidery(elektrowniaFotowoltaiczna4,8,gracz,e,f4);
        slidery(elektrowniaFotowoltaiczna5,9,gracz,e,f5);

        slidery(elektrowniaWeglowa1,10,gracz,e,w1);
        slidery(elektrowniaWeglowa2,11,gracz,e,w2);
        slidery(elektrowniaWeglowa3,12,gracz,e,w3);
        slidery(elektrowniaWeglowa4,13,gracz,e,w4);
        slidery(elektrowniaWeglowa5,14,gracz,e,w5);

        slidery(elektrowniaGazowa1,15,gracz,e,g1);
        slidery(elektrowniaGazowa2,16,gracz,e,g2);
        slidery(elektrowniaGazowa3,17,gracz,e,g3);
        slidery(elektrowniaGazowa4,18,gracz,e,g4);
        slidery(elektrowniaGazowa5,19,gracz,e,g5);
    }
    public void slidery(ElektrowniaOknoAbstract okno,int indeksele,Gracz gracz,ChangeEvent e,boolean warunek) {
        if (warunek) {
            if (e.getSource() == okno.mocSlider) {
                gracz.getListaElektrowni().get(indeksele).setMocChwilowa(okno.mocSlider.getValue() * gracz.getListaElektrowni().get(indeksele).getMocMaksymalna() / 100);
                int tym = gracz.getListaElektrowni().get(indeksele).getLiczbaPracownikow() * 100 / gracz.getListaElektrowni().get(indeksele).getLiczbaBlokow();
                if (okno.mocSlider.getValue() > tym) {
                    okno.mocSlider.setValue(tym);
                } else if (okno.mocSlider.getValue() == tym) {
                    okno.mocLabel.setForeground(Color.red);
                } else {
                    okno.mocLabel.setForeground(Color.white);
                }
            }
            if (e.getSource() == okno.kiedySlider) {
                gracz.getListaElektrowni().get(indeksele).setKiedyDokupic(okno.kiedySlider.getValue());
            }
            okno.stateChanged(e);
        }
    }
}
