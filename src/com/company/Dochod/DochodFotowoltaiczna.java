package com.company.Dochod;

import com.company.Elektrownie.Elektrownia;
import com.company.Elektrownie.ElektrowniaFotowoltaiczna;

import java.io.Serializable;

public class DochodFotowoltaiczna implements ObliczDochodElektrowni, Serializable {
    private static final long serialVersionUID = 1223143L;
    int EnergiaProdukowanaPrzezJedenBlok = 55;
    int StawkaGodzinowa =30;

    @Override
    public float ObliczDochod(Elektrownia e) {

        e.setMocMaksymalna(e.getLiczbaBlokow() * EnergiaProdukowanaPrzezJedenBlok);
        ((ElektrowniaFotowoltaiczna) e).setZuzyciePaneli(((ElektrowniaFotowoltaiczna) e).getZuzyciePaneli() + 2);

        while (((ElektrowniaFotowoltaiczna) e).getZuzyciePaneli() < 100) {
            return
                    //przychod
                    e.getMocChwilowa() * e.getDystrybutor().getCenaSkupu() * 12  //6600
                            //wydatki
                            - e.getLiczbaPracownikow() * StawkaGodzinowa * 12; //3600
        }
        return 0;
    }
}
