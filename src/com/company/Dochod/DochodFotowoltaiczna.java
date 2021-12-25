package com.company.Dochod;

import com.company.Elektrownie.Elektrownia;

import java.io.Serializable;

public class DochodFotowoltaiczna implements ObliczDochodElektrowni, Serializable {

    @Override
    public float ObliczDochod(Elektrownia e) {

        return e.getMocChwilowa() * e.getDystrybutor().getCenaSkupu();
    }
}
