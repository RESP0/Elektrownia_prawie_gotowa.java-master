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
            add(new ElektrowniaAtomowa("Nazwa1","Miasto1", 100, 42000, 3, new Wlasciciel(), false, 86, 897, new DystrybutorPradu(), 345, new OdbiorcaOdpadow[]{new OdbiorcaOdpadow(),new OdbiorcaOdpadow()}, 20000, 10000));
            add(new ElektrowniaAtomowa("Nazwa2","Miasto2", 100, 42000, 3, new Wlasciciel(), false, 86, 897, new DystrybutorPradu(), 345, new OdbiorcaOdpadow[]{new OdbiorcaOdpadow(),new OdbiorcaOdpadow()}, 22000, 12000));
            add(new ElektrowniaAtomowa("Nazwa3","Miasto3", 100, 42000, 3, new Wlasciciel(), false, 86, 897, new DystrybutorPradu(), 345, new OdbiorcaOdpadow[]{new OdbiorcaOdpadow(),new OdbiorcaOdpadow()}, 24000, 14000));
            add(new ElektrowniaAtomowa("Nazwa4","Miasto4", 100, 42000, 3, new Wlasciciel(), false, 86, 897, new DystrybutorPradu(), 345, new OdbiorcaOdpadow[]{new OdbiorcaOdpadow(),new OdbiorcaOdpadow()}, 26000, 16000));
            add(new ElektrowniaAtomowa("Nazwa5","Miasto5", 100, 42000, 3, new Wlasciciel(), false, 86, 897, new DystrybutorPradu(), 345, new OdbiorcaOdpadow[]{new OdbiorcaOdpadow(),new OdbiorcaOdpadow()}, 28000, 18000));
        }
    };

    public ArrayList<Elektrownia> elektrownieFotowoltaiczne = new ArrayList<>(){
        {
            add(new ElektrowniaFotowoltaiczna("Nazwa1", "Miasto1", 100, 300, 1, new Wlasciciel(), false, 10, new DystrybutorPradu(), 4000, 1000));
            add(new ElektrowniaFotowoltaiczna("Nazwa2", "Miasto2", 100, 300, 1, new Wlasciciel(), false, 10, new DystrybutorPradu(), 5000, 2000));
            add(new ElektrowniaFotowoltaiczna("Nazwa3", "Miasto3", 100, 300, 1, new Wlasciciel(), false, 10, new DystrybutorPradu(), 6000, 3000));
            add(new ElektrowniaFotowoltaiczna("Nazwa4", "Miasto4", 100, 300, 1, new Wlasciciel(), false, 10, new DystrybutorPradu(), 7000, 4000));
            add(new ElektrowniaFotowoltaiczna("Nazwa5", "Miasto5", 100, 300, 1, new Wlasciciel(), false, 10, new DystrybutorPradu(), 8000, 5000));
        }
    };

    public ArrayList<Elektrownia> elektrownieWeglowe = new ArrayList<>(){
        {
            add(new ElektrowniaWeglowa("Nazwa1", "Miasto1",100,690,15, new Wlasciciel(), false, "roksana wegiel", 109f, 25, new DystrybutorPradu(), 103.5f, new DostawcaWegla(), 190f, 8000, 4000));
            add(new ElektrowniaWeglowa("Nazwa2", "Miasto2",100,690,15, new Wlasciciel(), false, "roksana wegiel", 109f, 25, new DystrybutorPradu(), 103.5f, new DostawcaWegla(), 190f, 10000, 6000));
            add(new ElektrowniaWeglowa("Nazwa3", "Miasto3",100,690,15, new Wlasciciel(), false, "roksana wegiel", 109f, 25, new DystrybutorPradu(), 103.5f, new DostawcaWegla(), 190f,  12000, 8000));
            add(new ElektrowniaWeglowa("Nazwa4", "Miasto4",100,690,15, new Wlasciciel(), false, "roksana wegiel", 109f, 25, new DystrybutorPradu(), 103.5f, new DostawcaWegla(), 190f, 14000, 10000));
            add(new ElektrowniaWeglowa("Nazwa5", "Miasto5",100,690,15, new Wlasciciel(), false, "roksana wegiel", 109f, 25, new DystrybutorPradu(), 103.5f, new DostawcaWegla(), 190f, 16000, 12000));
        }
    };
    public ArrayList<Elektrownia> elektrownieGazowe = new ArrayList<>(){
        {
            add(new ElektrowniaGazowa("Nazwa1", "Miasto1",100,420,5, new Wlasciciel(), false, "gaz", 89f, 15, new DystrybutorPradu(), 123f, new DostawcaGazu(), 200f, 9000, 5000));
            add(new ElektrowniaGazowa("Nazwa2", "Miasto2",100,420,5, new Wlasciciel(), false, "gaz", 89f, 15, new DystrybutorPradu(), 123f, new DostawcaGazu(), 200f, 11000, 7000));
            add(new ElektrowniaGazowa("Nazwa3", "Miasto3",100,420,5, new Wlasciciel(), false, "gaz", 89f, 15, new DystrybutorPradu(), 123f, new DostawcaGazu(), 200f, 13000, 9000));
            add(new ElektrowniaGazowa("Nazwa4", "Miasto4",100,420,5, new Wlasciciel(), false, "gaz", 89f, 15, new DystrybutorPradu(), 123f, new DostawcaGazu(), 200f, 15000, 11000));
            add(new ElektrowniaGazowa("Nazwa5", "Miasto5",100,420,5, new Wlasciciel(), false, "gaz", 89f, 15, new DystrybutorPradu(), 123f, new DostawcaGazu(), 200f, 17000, 13000));
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
