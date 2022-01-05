package com.company.Dochod;

import com.company.Elektrownie.Elektrownia;
import com.company.Elektrownie.ElektrowniaGazowa;
import com.company.Elektrownie.ElektrowniaNaPaliwoStale;
import com.company.Elektrownie.ElektrowniaWeglowa;

import java.io.Serializable;

public class DochodGazowa implements ObliczDochodElektrowni, Serializable {
    private static final long serialVersionUID = 123123L;

    float IloscCO2 = 0.1f;
    float OplataEmisyjna = 12.5f;
    int StawkaGodzinowa =35;
    int EnergiaProdukowanaPrzezJedenBlok = 80;

    public float ObliczDochod(Elektrownia e){

        e.setMocMaksymalna(e.getLiczbaBlokow()*EnergiaProdukowanaPrzezJedenBlok);

        if (((ElektrowniaGazowa) e).getIloscGazuWMagazynie()*100/((ElektrowniaGazowa) e).getMaxPojemnoscMagazynu() < e.getKiedyDokupic()){
            ((ElektrowniaGazowa) e).setIloscGazuWMagazynie(((ElektrowniaGazowa) e).getMaxPojemnoscMagazynu() );
            return  e.getMocChwilowa()* e.getDystrybutor().getCenaSkupu()*24 //23558
                    - e.getMocChwilowa()*((ElektrowniaGazowa) e).getZuzyciePaliwa()*((ElektrowniaGazowa) e).getDostawcaGazu().getCenaZaM3() //5158
                    -e.getLiczbaPracownikow()*StawkaGodzinowa*24  //8400
                    -IloscCO2*e.getMocChwilowa()*OplataEmisyjna //1000
                    -((ElektrowniaGazowa) e).getDostawcaGazu().getCenaZaM3()*(((ElektrowniaGazowa) e).getMaxPojemnoscMagazynu()-((ElektrowniaGazowa) e).getIloscGazuWMagazynie());
        }

        return  e.getMocChwilowa()* e.getDystrybutor().getCenaSkupu()*24 //23558
                - e.getMocChwilowa()*((ElektrowniaGazowa) e).getZuzyciePaliwa()*((ElektrowniaGazowa) e).getDostawcaGazu().getCenaZaM3() //5158
                -e.getLiczbaPracownikow()*StawkaGodzinowa*24  //8400
                -IloscCO2*e.getMocChwilowa()*OplataEmisyjna; //1000
    } //15228
}