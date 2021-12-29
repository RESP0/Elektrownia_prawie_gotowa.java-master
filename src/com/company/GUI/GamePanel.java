package com.company.GUI;
import com.company.Elektrownie.*;
import com.company.GUI.ElektrownieOkno.*;
import com.company.Head.Gracz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

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



    public GamePanel(){

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
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==menu.nowaGra){
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

        else if(e.getSource() == listaAtom.button1){
            elektrowniaAtomowa1 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(0), gracz);
            elektrowniaAtomowa1.sprzedajButton.addActionListener(this);
        }

        else if(e.getSource() == elektrowniaAtomowa1.sprzedajButton){
            gracz.dodajBalans(listaAtom.getElektrownie().get(0).getCenaSprzedazy());
            zaktualizujStanKonta();
        }

        else if(e.getSource() == listaAtom.button2){
            elektrowniaAtomowa2 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(1), gracz);
            elektrowniaAtomowa2.sprzedajButton.addActionListener(this);
        }

        else if(e.getSource() == elektrowniaAtomowa2.sprzedajButton){
            gracz.dodajBalans(listaAtom.getElektrownie().get(1).getCenaSprzedazy());
            zaktualizujStanKonta();
        }

        else if(e.getSource() == listaAtom.button3){
            elektrowniaAtomowa3 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(2), gracz);
            elektrowniaAtomowa3.sprzedajButton.addActionListener(this);
        }

        else if(e.getSource() == elektrowniaAtomowa3.sprzedajButton){
            gracz.dodajBalans(listaAtom.getElektrownie().get(2).getCenaSprzedazy());
            zaktualizujStanKonta();
        }

        else if(e.getSource() == listaAtom.button4){
            elektrowniaAtomowa4 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(3), gracz);
            elektrowniaAtomowa4.sprzedajButton.addActionListener(this);
        }

        else if(e.getSource() == elektrowniaAtomowa4.sprzedajButton){
            gracz.dodajBalans(listaAtom.getElektrownie().get(3).getCenaSprzedazy());
            zaktualizujStanKonta();
        }

        else if(e.getSource() == listaAtom.button5){
            elektrowniaAtomowa5 = new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(4), gracz);
            elektrowniaAtomowa5.sprzedajButton.addActionListener(this);
        }

        else if(e.getSource() == elektrowniaAtomowa5.sprzedajButton){
            gracz.dodajBalans(listaAtom.getElektrownie().get(4).getCenaSprzedazy());
            zaktualizujStanKonta();
        }

        //-------------------------------------------------------------------------
        else if(e.getSource() == listaFoto.powrot){
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
    }

    public void zaktualizujStanKonta(){
        listaAtom.stanKonta.setText("Stan konta: " + gracz.getBalans());
        listaWegiel.stanKonta.setText("Stan konta: " + gracz.getBalans());
        listaGaz.stanKonta.setText("Stan konta: " + gracz.getBalans());
        listaFoto.stanKonta.setText("Stan konta: " + gracz.getBalans());
        gra.stan_konta.setText("Aktualny stan konta: " + gracz.getBalans());
    }

    private int wybor;
    public void setWybor(int x){
        wybor = x;
    }
    public int getWybor(){
        return wybor;
    }
}
