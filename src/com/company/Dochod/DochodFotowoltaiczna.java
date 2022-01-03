package com.company.Dochod;

import com.company.Elektrownie.Elektrownia;

import java.io.Serializable;

public class DochodFotowoltaiczna implements ObliczDochodElektrowni, Serializable {
    private static final long serialVersionUID = 1223143L;
    int EnergiaProdukowanaPrzezJedenBlok = 50;
    int StawkaGodzinowa =30;

    @Override
    public float ObliczDochod(Elektrownia e) {

        e.setMocMaksymalna(e.getLiczbaBlokow()*EnergiaProdukowanaPrzezJedenBlok);

        return
                //przychod
                e.getMocChwilowa()* e.getDystrybutor().getCenaSkupu()*12
                //wydatki
                - e.getLiczbaPracownikow()*StawkaGodzinowa*12;
    }
}
