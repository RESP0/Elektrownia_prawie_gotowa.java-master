package com.company.Dochod;

import com.company.Elektrownie.Elektrownia;
import com.company.Elektrownie.ElektrowniaWeglowa;

import java.io.Serializable;

public class DochodGazowa implements ObliczDochodElektrowni, Serializable {
    private static final long serialVersionUID = 123123L;

    int IloscCO2 = 100;
    int OplataEmisyjna = 7;
    int StawkaGodzinowa =35;
    int EnergiaProdukowanaPrzezJedenBlok = 120;

    public float ObliczDochod(Elektrownia e){

        e.setMocMaksymalna(e.getLiczbaBlokow()*EnergiaProdukowanaPrzezJedenBlok);

        return  e.getMocChwilowa()* e.getDystrybutor().getCenaSkupu()*24
                - e.getMocChwilowa()*((ElektrowniaWeglowa) e).getZuzyciePaliwa()*((ElektrowniaWeglowa) e).getDostawcaWegla().getCenaZaTone()
                -e.getLiczbaPracownikow()*StawkaGodzinowa*24
                -IloscCO2*e.getMocChwilowa()*OplataEmisyjna;
    }


}