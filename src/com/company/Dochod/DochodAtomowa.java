package com.company.Dochod;

import com.company.Elektrownie.Elektrownia;
import com.company.Elektrownie.ElektrowniaAtomowa;

import java.io.Serializable;

public class DochodAtomowa implements ObliczDochodElektrowni, Serializable {

    int cenaZaWode = 100;

    @Override
    public float ObliczDochod(Elektrownia e) {

        return ((ElektrowniaAtomowa) e).getLiczbaReaktorow() * 10 * e.getMocChwilowa() * e.getDystrybutor().getCenaSkupu()
                - ((ElektrowniaAtomowa) e).getZuzycieWody()*cenaZaWode;
    }
}
