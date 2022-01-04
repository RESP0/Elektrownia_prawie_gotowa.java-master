package com.company.Elektrownie;

import com.company.Head.Wlasciciel;
import com.company.uslugodawcy.DystrybutorPradu;

import java.io.Serializable;
import java.util.ArrayList;

public class ListyDystrybutorzy implements Serializable {

    ListyWlasciciele wlasciciele = new ListyWlasciciele();

    public ArrayList<DystrybutorPradu> dystrybutorzyPradu = new ArrayList<>(){
        {
            add( new DystrybutorPradu(1,wlasciciele.getWlasciciele().get(6)));
            add( new DystrybutorPradu(1.11f,wlasciciele.getWlasciciele().get(5)));
            add( new DystrybutorPradu(1.227f,wlasciciele.getWlasciciele().get(7)));
            add( new DystrybutorPradu(1.34f,wlasciciele.getWlasciciele().get(9)));
            add( new DystrybutorPradu(1.45f,wlasciciele.getWlasciciele().get(8)));
        }
    };

    public void setDystrybutorzyPradu(ArrayList<DystrybutorPradu> dystrybutorzyPradu) {
        this.dystrybutorzyPradu = dystrybutorzyPradu;
    }

    public ArrayList<DystrybutorPradu> getDystrybutorzyPradu() { return dystrybutorzyPradu; }
}
