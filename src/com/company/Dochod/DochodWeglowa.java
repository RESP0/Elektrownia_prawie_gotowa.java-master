package com.company.Dochod;

import com.company.Elektrownie.Elektrownia;
import com.company.Elektrownie.ElektrowniaWeglowa;

import java.io.Serializable;

public class DochodWeglowa implements ObliczDochodElektrowni, Serializable {
    private static final long serialVersionUID = 1223123L;

    float IloscCO2 = 0.5f;
    float OplataEmisyjna = 5f;
    int StawkaGodzinowa = 35;
    int EnergiaProdukowanaPrzezJedenBlok = 75;

    public float ObliczDochod(Elektrownia e){

        e.setMocMaksymalna(e.getLiczbaBlokow()*EnergiaProdukowanaPrzezJedenBlok);
        if(((ElektrowniaWeglowa) e).getIloscWeglaWMagazynie()*100/((ElektrowniaWeglowa) e).getMaxPojemnoscMagazynu() < ((ElektrowniaWeglowa) e).getKiedyDokupic()){
            ((ElektrowniaWeglowa) e).setIloscWeglaWMagazynie(((ElektrowniaWeglowa) e).getMaxPojemnoscMagazynu());
            return  e.getMocChwilowa()* e.getDystrybutor().getCenaSkupu()*24  // dochód
                    //wydatki na wegiel
                    - e.getMocChwilowa()*((ElektrowniaWeglowa) e).getZuzyciePaliwa()*((ElektrowniaWeglowa) e).getDostawcaWegla().getCenaZaTone()
                    //wydatki na pracownikow
                    -e.getLiczbaPracownikow()*StawkaGodzinowa*24
                    //wydatki na kary emisyjne
                    -IloscCO2*e.getMocChwilowa()*OplataEmisyjna
                    -((ElektrowniaWeglowa) e).getDostawcaWegla().getCenaZaTone()*(((ElektrowniaWeglowa) e).getMaxPojemnoscMagazynu()-((ElektrowniaWeglowa) e).getIloscWeglaWMagazynie());
        }
        return  e.getMocChwilowa()* e.getDystrybutor().getCenaSkupu()*24  // dochód //19980
                //wydatki na wegiel
                - e.getMocChwilowa()*((ElektrowniaWeglowa) e).getZuzyciePaliwa()*((ElektrowniaWeglowa) e).getDostawcaWegla().getCenaZaTone() //
                //wydatki na pracownikow
                -e.getLiczbaPracownikow()*StawkaGodzinowa*24 //8400
                //wydatki na kary emisyjne
                -IloscCO2*e.getMocChwilowa()*OplataEmisyjna; //1875
    }
}
