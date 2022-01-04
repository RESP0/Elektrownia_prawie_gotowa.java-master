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
            add(new ElektrowniaAtomowa("Żarnowiec","Żarnowiec", 2000, 4000, 3, 4, wlasciciele.getWlasciciele().get(0), false, 86, 897, dystrybutorzy.getDystrybutorzyPradu().get(0), 345,dostawcy.odbiocyOdpadow.get(1), 150000, 75000, 500,0,0,10));
            add(new ElektrowniaAtomowa("Dukovany","Trebic", 2000, 5000, 3, 4, wlasciciele.getWlasciciele().get(0), false, 86, 897, dystrybutorzy.getDystrybutorzyPradu().get(1), 345, dostawcy.odbiocyOdpadow.get(1), 281250, 140625, 7000,0,0,10));
            add(new ElektrowniaAtomowa("Biełojarsk","Jekateryburg", 2000, 5500, 3, 4, wlasciciele.getWlasciciele().get(0), false, 86, 897, dystrybutorzy.getDystrybutorzyPradu().get(2), 345, dostawcy.odbiocyOdpadow.get(1), 450000, 225000, 900,0,0,10));
            add(new ElektrowniaAtomowa("Emsland","Lingen", 2000, 6500, 3, 4, wlasciciele.getWlasciciele().get(0), false, 86, 897, dystrybutorzy.getDystrybutorzyPradu().get(3), 345, dostawcy.odbiocyOdpadow.get(1), 656250, 328125, 1100,0,0,10));
            add(new ElektrowniaAtomowa("Belleville","Burgundia", 2000, 8000, 3, 4, wlasciciele.getWlasciciele().get(0), false, 86, 897, dystrybutorzy.getDystrybutorzyPradu().get(4), 345, dostawcy.odbiocyOdpadow.get(1), 900000, 450000, 1300,0,0,10));
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
            add(new ElektrowniaWeglowa("Turów", "Bogatynia",100,690, 4,15, wlasciciele.getWlasciciele().get(0), false, "roksana wegiel", 109f, 25, dystrybutorzy.getDystrybutorzyPradu().get(0), 103.5f, dostawcy.dostawcyWegla.get(0), 190f, 50000, 25000, 400,0,0,10));
            add(new ElektrowniaWeglowa("Dziecmorowice", "Dziecmorowice",100,690, 4, 15, wlasciciele.getWlasciciele().get(0), false, "roksana wegiel", 109f, 25, dystrybutorzy.getDystrybutorzyPradu().get(0), 103.5f, dostawcy.dostawcyWegla.get(0), 190f, 91875, 45500, 500,0,0,10));
            add(new ElektrowniaWeglowa("Berezowska", "Szarypowo",100,690, 4, 15, wlasciciele.getWlasciciele().get(0), false, "roksana wegiel", 109f, 25, dystrybutorzy.getDystrybutorzyPradu().get(0), 103.5f, dostawcy.dostawcyWegla.get(0), 190f,  150000, 75000, 600,0,0,10));
            add(new ElektrowniaWeglowa("Niederaussem", "Bergheim",100,690, 4,15, wlasciciele.getWlasciciele().get(0), false, "roksana wegiel", 109f, 25, dystrybutorzy.getDystrybutorzyPradu().get(0), 103.5f, dostawcy.dostawcyWegla.get(0), 190f, 218750, 109375, 700,0,0,10));
            add(new ElektrowniaWeglowa("Belchatow", "Belchatow",100,690, 4,15, wlasciciele.getWlasciciele().get(0), false, "roksana wegiel", 109f, 25, dystrybutorzy.getDystrybutorzyPradu().get(0), 103.5f, dostawcy.dostawcyWegla.get(0), 190f, 300000, 150000, 800,0,0,10));
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
