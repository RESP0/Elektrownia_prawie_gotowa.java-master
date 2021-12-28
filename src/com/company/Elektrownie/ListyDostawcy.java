package com.company.Elektrownie;

import com.company.uslugodawcy.DostawcaGazu;
import com.company.uslugodawcy.DostawcaWegla;
import com.company.uslugodawcy.OdbiorcaOdpadow;

import java.util.ArrayList;

public class ListyDostawcy {

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
            add( new DostawcaGazu());
            add( new DostawcaGazu());
            add( new DostawcaGazu());
            add( new DostawcaGazu());
            add( new DostawcaGazu());
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
