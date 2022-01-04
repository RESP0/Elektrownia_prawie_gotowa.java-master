package com.company.Elektrownie;

import com.company.Head.Wlasciciel;
import com.company.uslugodawcy.DostawcaGazu;
import com.company.uslugodawcy.DostawcaWegla;
import com.company.uslugodawcy.DystrybutorPradu;
import com.company.uslugodawcy.OdbiorcaOdpadow;

import java.io.Serializable;
import java.util.ArrayList;

public class ListyElektrowni implements Serializable {
    ListyDystrybutorzy dystrybutorzy = new ListyDystrybutorzy();
    ListyWlasciciele wlasciciele = new ListyWlasciciele();
    ListyDostawcy dostawcy = new ListyDostawcy();
    public ArrayList<Elektrownia> elektrownieAtomowe = new ArrayList<>(){
        {
            add(new ElektrowniaAtomowa("Nazwa1","Miasto1", 2000, 4000, 3, 4, wlasciciele.getWlasciciele().get(0), false, 86, 897, dystrybutorzy.getDystrybutorzyPradu().get(0), 345,500,dostawcy.odbiocyOdpadow.get(0), 20000, 10000, 500,0,0,10));
            add(new ElektrowniaAtomowa("Nazwa2","Miasto2", 2000, 5000, 3, 4, wlasciciele.getWlasciciele().get(0), false, 86, 897, dystrybutorzy.getDystrybutorzyPradu().get(1), 345,500, dostawcy.odbiocyOdpadow.get(1), 22000, 12000, 7000,0,0,10));
            add(new ElektrowniaAtomowa("Nazwa3","Miasto3", 2000, 5500, 3, 4, wlasciciele.getWlasciciele().get(0), false, 86, 897, dystrybutorzy.getDystrybutorzyPradu().get(2), 345,500, dostawcy.odbiocyOdpadow.get(2), 24000, 14000, 900,0,0,10));
            add(new ElektrowniaAtomowa("Nazwa4","Miasto4", 2000, 6500, 3, 4, wlasciciele.getWlasciciele().get(0), false, 86, 897, dystrybutorzy.getDystrybutorzyPradu().get(3), 345,500, dostawcy.odbiocyOdpadow.get(3), 26000, 16000, 1100,0,0,10));
            add(new ElektrowniaAtomowa("Nazwa5","Miasto5", 2000, 8000, 3, 4, wlasciciele.getWlasciciele().get(0), false, 86, 897, dystrybutorzy.getDystrybutorzyPradu().get(4), 345,500, dostawcy.odbiocyOdpadow.get(4), 28000, 18000, 1300,0,0,10));
        }
    };

    public ArrayList<Elektrownia> elektrownieFotowoltaiczne = new ArrayList<>(){
        {
            add(new ElektrowniaFotowoltaiczna("Esoleo", "Brudzew", 0, 550, 10, 10, wlasciciele.getWlasciciele().get(0), false, 0, dystrybutorzy.getDystrybutorzyPradu().get(0), 30000, 15000, 15000,0,0,10));
            add(new ElektrowniaFotowoltaiczna("Cez", "Chwaletice", 0, 550, 10, 10, wlasciciele.getWlasciciele().get(0), false, 0, dystrybutorzy.getDystrybutorzyPradu().get(1), 56250, 25000, 18750,0,0,10));
            add(new ElektrowniaFotowoltaiczna("OrskSolarPark", "Orsk", 0, 550, 10, 10, wlasciciele.getWlasciciele().get(0), false, 0, dystrybutorzy.getDystrybutorzyPradu().get(2), 90000, 45000, 22500,0,0,10));
            add(new ElektrowniaFotowoltaiczna("ENBW", "Werneuchen", 0, 550, 10, 10, wlasciciele.getWlasciciele().get(0), false, 0, dystrybutorzy.getDystrybutorzyPradu().get(3), 131250, 65000, 26250,0,0,10));
            add(new ElektrowniaFotowoltaiczna("FranceSolar", " Toul-Rosieres", 0, 550, 10, 10, wlasciciele.getWlasciciele().get(0), false, 0, dystrybutorzy.getDystrybutorzyPradu().get(4), 180000, 90000, 30000,0,0,10));
        }
    };

    public ArrayList<Elektrownia> elektrownieWeglowe = new ArrayList<>(){
        {
            add(new ElektrowniaWeglowa("Nazwa1", "Miasto1",100,690, 4,15, wlasciciele.getWlasciciele().get(0), false, "roksana wegiel", 109f, 25, dystrybutorzy.getDystrybutorzyPradu().get(0), 103.5f, dostawcy.dostawcyWegla.get(0), 190f, 8000, 4000, 400,0,0,10));
            add(new ElektrowniaWeglowa("Nazwa2", "Miasto2",100,690, 4, 15, wlasciciele.getWlasciciele().get(0), false, "roksana wegiel", 109f, 25, dystrybutorzy.getDystrybutorzyPradu().get(0), 103.5f, dostawcy.dostawcyWegla.get(1), 190f, 10000, 6000, 500,0,0,10));
            add(new ElektrowniaWeglowa("Nazwa3", "Miasto3",100,690, 4, 15, wlasciciele.getWlasciciele().get(0), false, "roksana wegiel", 109f, 25, dystrybutorzy.getDystrybutorzyPradu().get(0), 103.5f, dostawcy.dostawcyWegla.get(2), 190f,  12000, 8000, 600,0,0,10));
            add(new ElektrowniaWeglowa("Nazwa4", "Miasto4",100,690, 4,15, wlasciciele.getWlasciciele().get(0), false, "roksana wegiel", 109f, 25, dystrybutorzy.getDystrybutorzyPradu().get(0), 103.5f, dostawcy.dostawcyWegla.get(3), 190f, 14000, 10000, 700,0,0,10));
            add(new ElektrowniaWeglowa("Nazwa5", "Miasto5",100,690, 4,15, wlasciciele.getWlasciciele().get(0), false, "roksana wegiel", 109f, 25, dystrybutorzy.getDystrybutorzyPradu().get(0), 103.5f, dostawcy.dostawcyWegla.get(4), 190f, 16000, 12000, 800,0,0,10));
        }
    };
    public ArrayList<Elektrownia> elektrownieGazowe = new ArrayList<>(){
        {
            add(new ElektrowniaGazowa("Polgazprom", "Dolna Odra",0,800,10, 10, wlasciciele.getWlasciciele().get(0), false, "gaz", 4.75f, 10, dystrybutorzy.getDystrybutorzyPradu().get(0), 123f, dostawcy.dostawcyGazu.get(0), 200f, 60000, 30000, 30000,0,0,10));
            add(new ElektrowniaGazowa("MelnikGaz", "Pepikovice",0,800,10, 10, wlasciciele.getWlasciciele().get(0), false, "gaz", 4.75f, 10, dystrybutorzy.getDystrybutorzyPradu().get(1), 123f, dostawcy.dostawcyGazu.get(1), 200f, 112500, 55000, 37500,0,0,10));
            add(new ElektrowniaGazowa("Gazprom", "Kacapowo",0,800,10, 10, wlasciciele.getWlasciciele().get(0), false, "gaz", 4.75f, 10, dystrybutorzy.getDystrybutorzyPradu().get(2), 123f, dostawcy.dostawcyGazu.get(2), 200f, 180000, 90000, 45000,0,0,10));
            add(new ElektrowniaGazowa("ENBW", "Helmutsdorf",0,800,10, 10, wlasciciele.getWlasciciele().get(0), false, "gaz", 4.75f, 10, dystrybutorzy.getDystrybutorzyPradu().get(3), 123f, dostawcy.dostawcyGazu.get(3), 200f, 225000, 112000, 52500,0,0,10));
            add(new ElektrowniaGazowa("Centrale a gaz", "Reno-Pari",0,800,10, 10, wlasciciele.getWlasciciele().get(0), false, "gaz", 4.75f, 10, dystrybutorzy.getDystrybutorzyPradu().get(4), 123f, dostawcy.dostawcyGazu.get(4), 200f, 270000, 135000, 60000,0,0,10));
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
