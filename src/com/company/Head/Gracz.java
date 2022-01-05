package com.company.Head;

import com.company.Elektrownie.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Gracz implements Serializable {
    private float balans;
    private ArrayList <Elektrownia> listaElektrowni;
    private static final long serialVersionUID = 1L;
    ListyElektrowni listyElektrowni = new ListyElektrowni();

    public Gracz() {
        balans = 100000f;
        listaElektrowni = new ArrayList<>(){
            {   //Atom
                add(null);
                add(null);
                add(null);
                add(null);
                add(null);
                //Fotowoltaika-------------------
                add(null);
                add(null);
                add(null);
                add(null);
                add(null);
                //Weglowa-------------------
                add(null);
                add(null);
                add(null);
                add(null);
                add(null);
                //Gazowa-------------------
                add(null);
                add(null);
                add(null);
                add(null);
                add(null);
            }
        };
    }

    public void zakupElektrowni(int nrEle,int indeks,Elektrownia e) {
        listaElektrowni.set(nrEle*5+indeks, e);
    }

    public void sprzedazElektrowni(int nrEle,int indeks,Elektrownia e) {
        listaElektrowni.set(nrEle*5+indeks, null);
    }

    public float getBalans() {
        return balans;
    }

    public void setBalans(float balans) {
        this.balans = balans;
    }

    public void setListaElektrowni(ArrayList<Elektrownia> listaElektrowni) {
        this.listaElektrowni = listaElektrowni;
    }

    public List<Elektrownia> getListaElektrowni() {
        return listaElektrowni;
    }

    public void odejmijBalans(float x) {this.balans -= x;}

    public void dodajBalans(float x) {this.balans += x;}
}