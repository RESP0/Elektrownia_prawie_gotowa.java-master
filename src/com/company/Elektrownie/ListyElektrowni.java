package com.company.Elektrownie;

import com.company.Head.Wlasciciel;
import com.company.uslugodawcy.DostawcaGazu;
import com.company.uslugodawcy.DostawcaWegla;
import com.company.uslugodawcy.DystrybutorPradu;
import com.company.uslugodawcy.OdbiorcaOdpadow;

import java.util.ArrayList;

public class ListyElektrowni {
    public ArrayList<Elektrownia> elektrownieAtomowe = new ArrayList<>(){
        {
            add(new ElektrowniaAtomowa("Nazwa1","Miasto1", 100, 42000, 3, new Wlasciciel(), false, 86, 897, new DystrybutorPradu(), 345, new OdbiorcaOdpadow[]{new OdbiorcaOdpadow(),new OdbiorcaOdpadow()}));
            add(new ElektrowniaAtomowa("Nazwa2","Miasto2", 100, 42000, 3, new Wlasciciel(), false, 86, 897, new DystrybutorPradu(), 345, new OdbiorcaOdpadow[]{new OdbiorcaOdpadow(),new OdbiorcaOdpadow()}));
            add(new ElektrowniaAtomowa("Nazwa3","Miasto3", 100, 42000, 3, new Wlasciciel(), false, 86, 897, new DystrybutorPradu(), 345, new OdbiorcaOdpadow[]{new OdbiorcaOdpadow(),new OdbiorcaOdpadow()}));
            add(new ElektrowniaAtomowa("Nazwa4","Miasto4", 100, 42000, 3, new Wlasciciel(), false, 86, 897, new DystrybutorPradu(), 345, new OdbiorcaOdpadow[]{new OdbiorcaOdpadow(),new OdbiorcaOdpadow()}));
            add(new ElektrowniaAtomowa("Nazwa5","Miasto5", 100, 42000, 3, new Wlasciciel(), false, 86, 897, new DystrybutorPradu(), 345, new OdbiorcaOdpadow[]{new OdbiorcaOdpadow(),new OdbiorcaOdpadow()}));
        }
    };

    public ArrayList<Elektrownia> elektrownieFotowoltaiczne = new ArrayList<>(){
        {
            add(new ElektrowniaFotowoltaiczna("Nazwa1", "Miasto1", 100, 300, 1, new Wlasciciel(), false, 10, new DystrybutorPradu()));
            add(new ElektrowniaFotowoltaiczna("Nazwa2", "Miasto2", 100, 300, 1, new Wlasciciel(), false, 10, new DystrybutorPradu()));
            add(new ElektrowniaFotowoltaiczna("Nazwa3", "Miasto3", 100, 300, 1, new Wlasciciel(), false, 10, new DystrybutorPradu()));
            add(new ElektrowniaFotowoltaiczna("Nazwa4", "Miasto4", 100, 300, 1, new Wlasciciel(), false, 10, new DystrybutorPradu()));
            add(new ElektrowniaFotowoltaiczna("Nazwa5", "Miasto5", 100, 300, 1, new Wlasciciel(), false, 10, new DystrybutorPradu()));
        }
    };

    public ArrayList<Elektrownia> elektrownieWeglowe = new ArrayList<>(){
        {
            add(new ElektrowniaWeglowa("Nazwa1", "Miasto1",100,690,15, new Wlasciciel(), false, "roksana wegiel", 109f, 25, new DystrybutorPradu(), 103.5f, new DostawcaWegla(), 190f));
            add(new ElektrowniaWeglowa("Nazwa2", "Miasto2",100,690,15, new Wlasciciel(), false, "roksana wegiel", 109f, 25, new DystrybutorPradu(), 103.5f, new DostawcaWegla(), 190f));
            add(new ElektrowniaWeglowa("Nazwa3", "Miasto3",100,690,15, new Wlasciciel(), false, "roksana wegiel", 109f, 25, new DystrybutorPradu(), 103.5f, new DostawcaWegla(), 190f));
            add(new ElektrowniaWeglowa("Nazwa4", "Miasto4",100,690,15, new Wlasciciel(), false, "roksana wegiel", 109f, 25, new DystrybutorPradu(), 103.5f, new DostawcaWegla(), 190f));
            add(new ElektrowniaWeglowa("Nazwa5", "Miasto5",100,690,15, new Wlasciciel(), false, "roksana wegiel", 109f, 25, new DystrybutorPradu(), 103.5f, new DostawcaWegla(), 190f));
        }
    };
    public ArrayList<Elektrownia> elektrownieGazowe = new ArrayList<>(){
        {
            add(new ElektrowniaGazowa("Nazwa1", "Miasto1",100,420,5, new Wlasciciel(), false, "gaz", 89f, 15, new DystrybutorPradu(), 123f, new DostawcaGazu(), 200f));
            add(new ElektrowniaGazowa("Nazwa2", "Miasto2",100,420,5, new Wlasciciel(), false, "gaz", 89f, 15, new DystrybutorPradu(), 123f, new DostawcaGazu(), 200f));
            add(new ElektrowniaGazowa("Nazwa3", "Miasto3",100,420,5, new Wlasciciel(), false, "gaz", 89f, 15, new DystrybutorPradu(), 123f, new DostawcaGazu(), 200f));
            add(new ElektrowniaGazowa("Nazwa4", "Miasto4",100,420,5, new Wlasciciel(), false, "gaz", 89f, 15, new DystrybutorPradu(), 123f, new DostawcaGazu(), 200f));
            add(new ElektrowniaGazowa("Nazwa5", "Miasto5",100,420,5, new Wlasciciel(), false, "gaz", 89f, 15, new DystrybutorPradu(), 123f, new DostawcaGazu(), 200f));
        }
    };

    public void setElektrownieAtomowe(ArrayList<Elektrownia> elektrownieAtomowe) {
        this.elektrownieAtomowe = elektrownieAtomowe;
    }

    public void setElektrownieFotowoltaiczne(ArrayList<Elektrownia> elektrownieFotowoltaiczne) {
        this.elektrownieFotowoltaiczne = elektrownieFotowoltaiczne;
    }

    public void setElektrownieWeglowe(ArrayList<Elektrownia> elektrownieWeglowe) {
        this.elektrownieWeglowe = elektrownieWeglowe;
    }

    public void setElektrownieGazowe(ArrayList<Elektrownia> elektrownieGazowe) {
        this.elektrownieGazowe = elektrownieGazowe;
    }

    public ArrayList<Elektrownia> getElektrownieAtomowe() {
        return elektrownieAtomowe;
    }

    public ArrayList<Elektrownia> getElektrownieFotowoltaiczne() {
        return elektrownieFotowoltaiczne;
    }

    public ArrayList<Elektrownia> getElektrownieWeglowe() {
        return elektrownieWeglowe;
    }

    public ArrayList<Elektrownia> getElektrownieGazowe() {
        return elektrownieGazowe;
    }
}
