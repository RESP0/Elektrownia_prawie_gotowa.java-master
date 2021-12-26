package com.company.Head;

import com.company.Elektrownie.*;
import com.company.uslugodawcy.DostawcaGazu;
import com.company.uslugodawcy.DostawcaWegla;
import com.company.uslugodawcy.DystrybutorPradu;
import com.company.uslugodawcy.OdbiorcaOdpadow;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Gracz implements Serializable {
    private float balans;
    private List <Elektrownia> listaElektrowni;
    private static final long serialVersionUID = 1L;
    Elektrownia el = null;
    private DystrybutorPradu dystrybutorPradu;

    public Gracz() {
        balans = 6000f;
        listaElektrowni = new ArrayList<>();
        DystrybutorPradu Tauron = new DystrybutorPradu();
        DostawcaWegla Rosja = new DostawcaWegla();
        Wlasciciel NajtanszyOdbiorSmieci = new Wlasciciel("NajtanszyOdbiorSmieci", "PL83762346", "Karol Wiśnia");
        Wlasciciel Promyk = new Wlasciciel("Promyk", "PL46372837", "Kamil Glik");
        OdbiorcaOdpadow Odbiorca1 = new OdbiorcaOdpadow(34.56f, NajtanszyOdbiorSmieci);
        OdbiorcaOdpadow Odbiorca2 = new OdbiorcaOdpadow(43.34f, Promyk);
        listaElektrowni.add(new ElektrowniaAtomowa());
    }

    DystrybutorPradu Tauron = new DystrybutorPradu();
    DostawcaWegla Rosja = new DostawcaWegla();
    Wlasciciel NajtanszyOdbiorSmieci = new Wlasciciel("NajtanszyOdbiorSmieci", "PL83762346", "Karol Wiśnia");
    Wlasciciel Promyk = new Wlasciciel("Promyk", "PL46372837", "Kamil Glik");
    OdbiorcaOdpadow Odbiorca1 = new OdbiorcaOdpadow(34.56f, NajtanszyOdbiorSmieci);
    OdbiorcaOdpadow Odbiorca2 = new OdbiorcaOdpadow(43.34f, Promyk);
    public void zakupElektrowni() {
        int numer;

        Scanner scan = new Scanner(System.in);
        Wlasciciel own = new Wlasciciel("FirmaGracza","123456789","PodajNick");
        System.out.println("Wybierz opcję:" + "\n" +
                "1 - Elektrownia atomowa (10 000)" + "\n" +
                "2 - Elektrownia Węglowa (2 000)" + "\n" +
                "3 - Elektrownia Gazowa (2 500)" + "\n" +
                "4 - Elektrownia Fotowoltaiczna (5 000)" + "\n");
        numer = scan.nextInt();
        switch (numer) {
            case 1:
                el = new ElektrowniaAtomowa("Konik","Czarnobyl", 100, 42000, 3, own, false, 86, 897, Tauron, 345, new OdbiorcaOdpadow[]{Odbiorca1,Odbiorca2});
                listaElektrowni.add(el);
                balans -= 10000;
                break;
            case 2:
                el = new ElektrowniaWeglowa("Belchatowek", "Belchatow",100,690,15, own, false, "roksana wegiel", 109f, 25, Tauron, 103.5f, Rosja, 190f);
                listaElektrowni.add(el);
                balans -= 2000;
                break;
            case 3:
                el= new ElektrowniaGazowa("Tauronek", "Turow",100,420,5, own, false, "gaz", 89f, 15, Tauron, 123f, new DostawcaGazu(), 200f);
                listaElektrowni.add(el);
                balans -= 2500;
                break;
            case 4:
                el = new ElektrowniaFotowoltaiczna("Brudzewek", "Brudzew", 100, 300, 1, own, false, 10, Tauron);
                listaElektrowni.add(el);
                balans -= 5000;
                break;
        }
    }


    public void SprzedajElektrownie() {
        int a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        listaElektrowni.remove(a);
        balans+=1000;
    }

    public void show() {
        for (int i = 0;i<listaElektrowni.size();i++) {
            System.out.println("Numer: " + i+ " " + listaElektrowni.get(i));
        }
    }

    @Override
    public String toString() {
        return "listaElektrowni=" + listaElektrowni +
                '}';
    }

    public float getBalans() {
        return balans;
    }

    public void setBalans(float balans) {
        this.balans = balans;
    }

    public void setListaElektrowni(List<Elektrownia> listaElektrowni) {
        this.listaElektrowni = listaElektrowni;
    }

    public List<Elektrownia> getListaElektrowni() {
        return listaElektrowni;
    }

    public void odejmijBalans(float x) {this.balans -= x;}

    public void dodajBalans(float x) {this.balans += x;}
}