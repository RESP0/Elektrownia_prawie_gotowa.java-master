package com.company.Elektrownie;

import com.company.Head.Wlasciciel;
import com.company.uslugodawcy.DostawcaGazu;
import com.company.uslugodawcy.DostawcaWegla;
import com.company.uslugodawcy.OdbiorcaOdpadow;

import java.io.Serializable;
import java.util.ArrayList;

public class ListyDostawcy implements Serializable {

    ListyWlasciciele wlasciciele = new ListyWlasciciele();

    public ArrayList <DostawcaWegla> dostawcyWegla = new ArrayList<>(){
        {
            add( new DostawcaWegla(1.21f,new Wlasciciel()));
            add( new DostawcaWegla(1.54f,new Wlasciciel()));
            add( new DostawcaWegla(1.91f,new Wlasciciel()));
            add( new DostawcaWegla(2.264f,new Wlasciciel()));
            add( new DostawcaWegla(2.59f,new Wlasciciel()));
        }
    };

    public ArrayList <DostawcaGazu> dostawcyGazu = new ArrayList<>(){
        {
            add( new DostawcaGazu(1,wlasciciele.getWlasciciele().get(6)));
            add( new DostawcaGazu(1.16f,wlasciciele.getWlasciciele().get(5)));
            add( new DostawcaGazu(1.357f,wlasciciele.getWlasciciele().get(7)));
            add( new DostawcaGazu(1.53f,wlasciciele.getWlasciciele().get(9)));
            add( new DostawcaGazu(1.69f,wlasciciele.getWlasciciele().get(8)));
        }
    };

    public ArrayList <OdbiorcaOdpadow> odbiocyOdpadow = new ArrayList<>(){
        {
            add( new OdbiorcaOdpadow(3.3f,new Wlasciciel()));
            add( new OdbiorcaOdpadow(3.47f,new Wlasciciel()));
            add( new OdbiorcaOdpadow(3.62f,new Wlasciciel()));
            add( new OdbiorcaOdpadow(3.73f,new Wlasciciel()));
            add( new OdbiorcaOdpadow(3.8f,new Wlasciciel()));
        }
    };

    public void setDostawcyWegla(ArrayList<DostawcaWegla> dostawcyWegla) {
        this.dostawcyWegla = dostawcyWegla;
    }

    public void setDostawcyGazu(ArrayList<DostawcaGazu> dostawcyGazu) {
        this.dostawcyGazu = dostawcyGazu;
    }

    public void setOdbiocyOdpadow(ArrayList<OdbiorcaOdpadow> odbiocyOdpadow) {
        this.odbiocyOdpadow = odbiocyOdpadow;
    }

    public ArrayList<DostawcaWegla> getDostawcyWegla() { return dostawcyWegla; }

    public ArrayList<DostawcaGazu> getDostawcyGazu() { return dostawcyGazu; }

    public ArrayList<OdbiorcaOdpadow> getOdbiocyOdpadow() { return odbiocyOdpadow; }
}
