package com.company.Dochod;

import com.company.Elektrownie.Elektrownia;
import com.company.Elektrownie.ElektrowniaAtomowa;

import java.io.Serializable;

public class DochodAtomowa implements ObliczDochodElektrowni, Serializable {
    private static final long serialVersionUID = 1113123L;
    int cenaWody = 1;
    int StawkaGodzinowa = 50;
    int EnegiaProdukowanaPrzezReaktor = 250;

    @Override
    public float ObliczDochod(Elektrownia e) {
        e.setMocMaksymalna(e.getLiczbaBlokow()*((ElektrowniaAtomowa) e).getLiczbaReaktorow()*EnegiaProdukowanaPrzezReaktor);


        return
                //przychod
                e.getMocChwilowa()* e.getDystrybutor().getCenaSkupu()*24
                //wydatki
                - e.getMocChwilowa()*((ElektrowniaAtomowa) e).getZuzycieWody()*cenaWody
                - e.getLiczbaPracownikow()*StawkaGodzinowa*24
                - e.getMocChwilowa()*((ElektrowniaAtomowa) e).getIloscOdpadow()*((ElektrowniaAtomowa) e).getOdbiorcaOdpadow().getCenaZaTone();
    }
}
