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
            add( new Wlasciciel("Wiatr","brak","Thor"));
            add( new Wlasciciel("Xiong","56754","Xiao Shen"));
            add( new Wlasciciel("Continental","3465734","Pavel"));
            add( new Wlasciciel("Tauron","PL4457537","Kowalski"));
            add( new Wlasciciel("Rosija","999999999","Nikotiv"));
            add( new Wlasciciel("Baguette","176482358","Dubois"));
            add( new Wlasciciel("Gewurst","45682358","Karl"));
        }
    };

    public void setWlasciciele(ArrayList<Wlasciciel> wlasciciele) {
        this.wlasciciele = wlasciciele;
    }

    public ArrayList<Wlasciciel> getWlasciciele() { return wlasciciele; }
}
