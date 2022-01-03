package com.company.Elektrownie;

import com.company.Head.Wlasciciel;
import com.company.uslugodawcy.DystrybutorPradu;

import java.io.Serializable;
import java.util.ArrayList;

public class ListyDystrybutorzy implements Serializable {

    public ArrayList<DystrybutorPradu> dystrybutorzyPradu = new ArrayList<>(){
        {
            add( new DystrybutorPradu(1,new Wlasciciel()));
            add( new DystrybutorPradu(1.25f,new Wlasciciel()));
            add( new DystrybutorPradu());
            add( new DystrybutorPradu());
            add( new DystrybutorPradu());
        }
    };

    public void setDystrybutorzyPradu(ArrayList<DystrybutorPradu> dystrybutorzyPradu) {
        this.dystrybutorzyPradu = dystrybutorzyPradu;
    }

    public ArrayList<DystrybutorPradu> getDystrybutorzyPradu() { return dystrybutorzyPradu; }
}
