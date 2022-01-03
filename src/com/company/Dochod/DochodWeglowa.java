package com.company.Dochod;

import com.company.Elektrownie.Elektrownia;
import com.company.Elektrownie.ElektrowniaWeglowa;

import java.io.Serializable;

public class DochodWeglowa implements ObliczDochodElektrowni, Serializable {
    private static final long serialVersionUID = 1223123L;

    int IloscCO2 = 350;
    int OplataEmisyjna = 25;
    int StawkaGodzinowa =40;
    int EnergiaProdukowanaPrzezJedenBlok = 100;

    public float ObliczDochod(Elektrownia e){

        e.setMocMaksymalna(e.getLiczbaBlokow()*EnergiaProdukowanaPrzezJedenBlok);

        return  e.getMocChwilowa()* e.getDystrybutor().getCenaSkupu()*24
                - e.getMocChwilowa()*((ElektrowniaWeglowa) e).getZuzyciePaliwa()*((ElektrowniaWeglowa) e).getDostawcaWegla().getCenaZaTone()
                -e.getLiczbaPracownikow()*StawkaGodzinowa*24
                -IloscCO2*e.getMocChwilowa()*OplataEmisyjna;
    }
}
