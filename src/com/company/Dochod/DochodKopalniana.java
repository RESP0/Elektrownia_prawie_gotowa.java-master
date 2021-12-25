package com.company.Dochod;

import com.company.Elektrownie.Elektrownia;

import java.io.Serializable;

public class DochodKopalniana implements ObliczDochodElektrowni, Serializable {
    private static final long serialVersionUID = 123123L;
    public float ObliczDochod(Elektrownia e){
        return 0.6f * e.getMocChwilowa();
    }

//((ElektrowniaNaPaliwoStale) e).getLiczbaReaktorow()* e.getMocChwilowa()*e.getDystrybutor().getCenaSkupu() - ((ElektrowniaNaPaliwoStale) e).getZuzyciePaliwa()*

}