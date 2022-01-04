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
            add(new ElektrowniaAtomowa("Żarnowiec","Żarnowiec", 0, 1500, 10, 10, wlasciciele.getWlasciciele().get(0), false, 1, 10f, dystrybutorzy.getDystrybutorzyPradu().get(0), 2f,500,dostawcy.odbiocyOdpadow.get(0), 150000, 75000, 75000,0,0,10));
            add(new ElektrowniaAtomowa("Dukovany","Trebic", 0, 1500, 10, 10, wlasciciele.getWlasciciele().get(0), false, 1, 10f, dystrybutorzy.getDystrybutorzyPradu().get(1), 2f,500, dostawcy.odbiocyOdpadow.get(1), 281250, 140625, 93750,0,0,10));
            add(new ElektrowniaAtomowa("Biełojarsk","Jekateryburg", 0, 1500, 10, 10, wlasciciele.getWlasciciele().get(0), false, 1, 10f, dystrybutorzy.getDystrybutorzyPradu().get(2), 2f,500, dostawcy.odbiocyOdpadow.get(2), 450000, 225000, 112500,0,0,10));
            add(new ElektrowniaAtomowa("Emsland","Lingen", 0, 1500, 10, 10, wlasciciele.getWlasciciele().get(0), false, 1, 10f, dystrybutorzy.getDystrybutorzyPradu().get(3), 2f, 500, dostawcy.odbiocyOdpadow.get(3), 656250, 328125, 131250,0,0,10));
            add(new ElektrowniaAtomowa("Belleville","Burgundia", 0, 1500, 10, 10, wlasciciele.getWlasciciele().get(0), false, 1, 10f, dystrybutorzy.getDystrybutorzyPradu().get(4), 2f,500, dostawcy.odbiocyOdpadow.get(4), 900000, 450000, 150000,0,0,10));
        }
    };

    public ArrayList<Elektrownia> elektrownieFotowoltaiczne = new ArrayList<>(){
        {
            add(new ElektrowniaFotowoltaiczna("Esoleo", "Brudzew", 0, 550, 10, 10, wlasciciele.getWlasciciele().get(3), false, 0, dystrybutorzy.getDystrybutorzyPradu().get(0), 30000, 15000, 15000,0,0,10));
            add(new ElektrowniaFotowoltaiczna("Cez", "Chwaletice", 0, 550, 10, 10, wlasciciele.getWlasciciele().get(3), false, 0, dystrybutorzy.getDystrybutorzyPradu().get(1), 56250, 25000, 18750,0,0,10));
            add(new ElektrowniaFotowoltaiczna("OrskSolarPark", "Orsk", 0, 550, 10, 10, wlasciciele.getWlasciciele().get(3), false, 0, dystrybutorzy.getDystrybutorzyPradu().get(2), 90000, 45000, 22500,0,0,10));
            add(new ElektrowniaFotowoltaiczna("ENBW", "Werneuchen", 0, 550, 10, 10, wlasciciele.getWlasciciele().get(3), false, 0, dystrybutorzy.getDystrybutorzyPradu().get(3), 131250, 65000, 26250,0,0,10));
            add(new ElektrowniaFotowoltaiczna("FranceSolar", " Toul-Rosieres", 0, 550, 10, 10, wlasciciele.getWlasciciele().get(3), false, 0, dystrybutorzy.getDystrybutorzyPradu().get(4), 180000, 90000, 30000,0,0,10));
        }
    };

    public ArrayList<Elektrownia> elektrownieWeglowe = new ArrayList<>(){
        {
            add(new ElektrowniaWeglowa("Turów", "Bogatynia",0,750, 10,10, wlasciciele.getWlasciciele().get(0), false, "roksana wegiel", 3f, 10, dystrybutorzy.getDystrybutorzyPradu().get(0), 103.5f, dostawcy.dostawcyWegla.get(0), 190f, 50000, 25000, 25000,0,0,10));
            add(new ElektrowniaWeglowa("Dziecmorowice", "Dziecmorowice",0,750, 10, 10, wlasciciele.getWlasciciele().get(0), false, "roksana wegiel", 3f, 10, dystrybutorzy.getDystrybutorzyPradu().get(1), 103.5f, dostawcy.dostawcyWegla.get(1), 190f, 93750, 45500, 31250,0,0,10));
            add(new ElektrowniaWeglowa("Berezowska", "Szarypowo",0,750, 10, 10, wlasciciele.getWlasciciele().get(0), false, "roksana wegiel", 3f, 10, dystrybutorzy.getDystrybutorzyPradu().get(2), 103.5f, dostawcy.dostawcyWegla.get(2), 190f,  150000, 75000, 37500,0,0,10));
            add(new ElektrowniaWeglowa("Niederaussem", "Bergheim",0,750, 10,10, wlasciciele.getWlasciciele().get(0), false, "roksana wegiel", 3f, 10, dystrybutorzy.getDystrybutorzyPradu().get(3), 103.5f, dostawcy.dostawcyWegla.get(3), 190f, 218750, 109375, 43750,0,0,10));
            add(new ElektrowniaWeglowa("Belchatow", "Belchatow",0,750, 10,10, wlasciciele.getWlasciciele().get(0), false, "roksana wegiel", 3f, 10, dystrybutorzy.getDystrybutorzyPradu().get(4), 103.5f, dostawcy.dostawcyWegla.get(4), 190f, 300000, 150000, 50000,0,0,10));
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
