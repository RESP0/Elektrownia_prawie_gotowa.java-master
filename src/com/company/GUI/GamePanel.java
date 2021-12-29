package com.company.GUI;
import com.company.Elektrownie.*;
import com.company.GUI.ElektrownieOkno.ElektrowniaAtomowaOkno;
import com.company.GUI.ElektrownieOkno.ElektrowniaFotowoltaicznaOkno;
import com.company.GUI.ElektrownieOkno.ElektrowniaGazowaOkno;
import com.company.GUI.ElektrownieOkno.ElektrowniaWeglowaOkno;
import com.company.Head.Gracz;

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
        listaAtom.button1.addActionListener(this);
        listaAtom.button2.addActionListener(this);
        listaAtom.button3.addActionListener(this);
        listaAtom.button4.addActionListener(this);
        listaAtom.button5.addActionListener(this);
        //---------------------------------------------------------
        listaFoto.powrot.addActionListener(this);
        listaFoto.kup1.addActionListener(this);

        listaFoto.button1.addActionListener(this);
        listaFoto.button2.addActionListener(this);
        listaFoto.button3.addActionListener(this);
        listaFoto.button4.addActionListener(this);
        listaFoto.button5.addActionListener(this);
        //---------------------------------------------------------
        listaWegiel.powrot.addActionListener(this);
        listaWegiel.button1.addActionListener(this);
        listaWegiel.button2.addActionListener(this);
        listaWegiel.button3.addActionListener(this);
        listaWegiel.button4.addActionListener(this);
        listaWegiel.button5.addActionListener(this);
        //--------------------------------------------------------
        listaGaz.powrot.addActionListener(this);
        listaGaz.button1.addActionListener(this);
        listaGaz.button2.addActionListener(this);
        listaGaz.button3.addActionListener(this);
        listaGaz.button4.addActionListener(this);
        listaGaz.button5.addActionListener(this);

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
            //rozszerzenie elektrowni atomowej
            this.remove(gra);
            this.add(listaAtom, BorderLayout.CENTER);
        }
        else if(e.getSource()==gra.weglowa){
            System.out.println("Wybrano elektrownie weglowa...");
            ////rozszerzenie elektrowni weglowej
            this.remove(gra);
            this.add(listaWegiel, BorderLayout.CENTER);
        }
        else if(e.getSource()==gra.gazowa){
            System.out.println("Wybrano elektrownie gazowa...");
            //rozszerzenie elektrowni gazowej
            this.remove(gra);
            this.add(listaGaz, BorderLayout.CENTER);
        }
        else if(e.getSource()==gra.fotowoltaiczna){
            System.out.println("Wybrano elektrownie fotowoltaiczna...");
            //rozszerzenie elektrowni fotowoltaicznej
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
        else if (e.getSource() == listaAtom.kup1){
            gracz.zakupElektrowni(listaAtom.getNrEle(),0,listaAtom.getElektrownie().get(0));
            gracz.odejmijBalans(listaAtom.getElektrownie().get(0).getCenaZakupu());
            listaAtom.stanKonta.setText("Stan konta: " + gracz.getBalans());
            listaWegiel.stanKonta.setText("Stan konta: " + gracz.getBalans());
            listaGaz.stanKonta.setText("Stan konta: " + gracz.getBalans());
            listaFoto.stanKonta.setText("Stan konta: " + gracz.getBalans());
            gra.stan_konta.setText("Aktualny stan konta: " + gracz.getBalans());
        }

        else if(e.getSource() == listaAtom.button1){
            new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(0));
        }
        else if(e.getSource() == listaAtom.button2){
            new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(1));
        }
        else if(e.getSource() == listaAtom.button3){
            new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(3));
        }
        else if(e.getSource() == listaAtom.button4){
            new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(4));
        }
        else if(e.getSource() == listaAtom.button5){
            new ElektrowniaAtomowaOkno(gracz.getListaElektrowni().get(5));
        }

        //-------------------------------------------------------------------------
        else if(e.getSource() == listaFoto.powrot){
            this.remove(listaFoto);
            add(gra,BorderLayout.CENTER);
        }
        else if (e.getSource() == listaFoto.kup1){
            gracz.zakupElektrowni(listaFoto.getNrEle(),0,listaFoto.getElektrownie().get(0));
            gracz.odejmijBalans(listaFoto.getElektrownie().get(0).getCenaZakupu());
            listaAtom.stanKonta = new JLabel("Stan konta: " + gracz.getBalans());

            System.out.println(gracz.getBalans());
        }
        else if(e.getSource() == listaFoto.button1){
            new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(5));
        }
        else if(e.getSource() == listaFoto.button2){
            new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(6));
        }
        else if(e.getSource() == listaFoto.button3){
            new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(7));
        }
        else if(e.getSource() == listaFoto.button4){
            new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(8));
        }
        else if(e.getSource() == listaFoto.button5){
            new ElektrowniaFotowoltaicznaOkno(gracz.getListaElektrowni().get(9));
        }
        //------------------------------------------------------------------------------
        else if(e.getSource() == listaWegiel.powrot){
            this.remove(listaWegiel);
            add(gra,BorderLayout.CENTER);
        }
        else if(e.getSource() == listaWegiel.button1){
            new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(10));
        }
        else if(e.getSource() == listaWegiel.button2){
            new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(11));
        }
        else if(e.getSource() == listaWegiel.button3){
            new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(12));
        }
        else if(e.getSource() == listaWegiel.button4){
            new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(13));
        }
        else if(e.getSource() == listaWegiel.button5){
            new ElektrowniaWeglowaOkno(gracz.getListaElektrowni().get(14));
        }
        //------------------------------------------------------------------------------
        else if(e.getSource() == listaGaz.powrot){
            this.remove(listaGaz);
            add(gra,BorderLayout.CENTER);
        }
        else if(e.getSource() == listaGaz.button1){
            new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(15));
        }
        else if(e.getSource() == listaGaz.button2){
            new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(16));
        }
        else if(e.getSource() == listaGaz.button3){
            new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(17));
        }
        else if(e.getSource() == listaGaz.button4){
            new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(18));
        }
        else if(e.getSource() == listaGaz.button5){
            new ElektrowniaGazowaOkno(gracz.getListaElektrowni().get(19));
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
