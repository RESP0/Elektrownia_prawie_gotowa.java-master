package com.company.Elektrownie;

import com.company.Head.Wlasciciel;

import java.io.Serializable;
import java.util.ArrayList;

public class ListyWlasciciele  implements Serializable {

    public ArrayList<Wlasciciel> wlasciciele = new ArrayList<>(){
        {
            add( new Wlasciciel("NajtanszyOdbiorSmieci", "PL83762346", "Karol Wiśnia"));
            add( new Wlasciciel("Promyk", "PL46372837", "Kamil Glik"));
            add( new Wlasciciel("FirmaGracza","123456789","PodajNick"));
            add( new Wlasciciel());
            add( new Wlasciciel());
        }
    };

    public void setWlasciciele(ArrayList<Wlasciciel> wlasciciele) {
        this.wlasciciele = wlasciciele;
    }

    public ArrayList<Wlasciciel> getWlasciciele() { return wlasciciele; }
}
