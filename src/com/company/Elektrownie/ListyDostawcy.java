package com.company.Elektrownie;

import com.company.Head.Wlasciciel;
import com.company.uslugodawcy.DostawcaGazu;
import com.company.uslugodawcy.DostawcaWegla;
import com.company.uslugodawcy.OdbiorcaOdpadow;

import java.io.Serializable;
import java.util.ArrayList;

public class ListyDostawcy implements Serializable {

    public ArrayList <DostawcaWegla> dostawcyWegla = new ArrayList<>(){
        {
            add( new DostawcaWegla());
            add( new DostawcaWegla());
            add( new DostawcaWegla());
            add( new DostawcaWegla());
            add( new DostawcaWegla());
        }
    };

    public ArrayList <DostawcaGazu> dostawcyGazu = new ArrayList<>(){
        {
            add( new DostawcaGazu(1,new Wlasciciel()));
            add( new DostawcaGazu(1.16f,new Wlasciciel()));
            add( new DostawcaGazu(1.357f,new Wlasciciel()));
            add( new DostawcaGazu(1.53f,new Wlasciciel()));
            add( new DostawcaGazu(1.69f,new Wlasciciel()));
        }
    };

    public ArrayList <OdbiorcaOdpadow> odbiocyOdpadow = new ArrayList<>(){
        {
            add( new OdbiorcaOdpadow());
            add( new OdbiorcaOdpadow());
            add( new OdbiorcaOdpadow());
            add( new OdbiorcaOdpadow());
            add( new OdbiorcaOdpadow());
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
