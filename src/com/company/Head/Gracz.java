package com.company.Head;

import com.company.Dochod.DochodAtomowa;
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

    public Gracz() {
        balans = 6000f;
        listaElektrowni = new ArrayList<>();
        listaElektrowni.add(new ElektrowniaAtomowa());
    }

    public void zakupElektrowni() {
        ListyElektrowni listyelektrowni = new ListyElektrowni();
        listaElektrowni.add(listyelektrowni.elektrownieAtomowe.get(0));
    }

    public void SprzedajElektrownie() {
        int a = 0;
        listaElektrowni.remove(a);
        balans+=1000;
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