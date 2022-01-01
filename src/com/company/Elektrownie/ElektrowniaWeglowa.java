package com.company.Elektrownie;

import com.company.AtakTerro.Sposob1ReakcjaNaAtakTerrorystyczny;
import com.company.Awarie.Sposob1ReakcjaNaAwarieZasilania;
import com.company.Head.Pracownicy;
import com.company.Head.Wlasciciel;
import com.company.Wytwarzanie.SpalaniePaliwKopalnych;
import com.company.uslugodawcy.DostawcaWegla;
import com.company.uslugodawcy.DystrybutorPradu;

import java.util.Arrays;

public class ElektrowniaWeglowa extends ElektrowniaNaPaliwoStale  {

    private com.company.uslugodawcy.DostawcaWegla DostawcaWegla;
    private float IloscWeglaWMagazynie;
    private float MaxPojemnoscMagazynu;

    public ElektrowniaWeglowa() {
        super();
        DostawcaWegla = new DostawcaWegla();
        IloscWeglaWMagazynie = 100;
    }

    public ElektrowniaWeglowa(String Nazwa, String Miasto, int MocChwilowa, int MocMaksymalna, int liczbaBlokow, int LiczbaPracownikow, Wlasciciel wlasciciel, boolean czyPracuje, String RodzajPaliwa, float ZuzyciePaliwa, int LiczbaBlokow, DystrybutorPradu DystrybutorPradu, float IloscWeglaWMagazynie, DostawcaWegla DostawcaWegla, float MaxPojemnoscMagazynu, int cenaZakupu, int cenaSprzedazy, int cenaBloku) {

        super(Nazwa, Miasto, MocChwilowa, MocMaksymalna, liczbaBlokow, LiczbaPracownikow, wlasciciel, czyPracuje, RodzajPaliwa, ZuzyciePaliwa, LiczbaBlokow, DystrybutorPradu, cenaZakupu, cenaSprzedazy, cenaBloku);
        this.DostawcaWegla = DostawcaWegla;
        this.IloscWeglaWMagazynie = IloscWeglaWMagazynie;
        this.MaxPojemnoscMagazynu = MaxPojemnoscMagazynu;



    }

    public DostawcaWegla getDostawcaWegla() {
        return DostawcaWegla;
    }

    public void setDostawcaWegla(DostawcaWegla dostawcaWegla) {
        DostawcaWegla = dostawcaWegla;
    }

    public float getIloscWeglaWMagazynie() {
        return IloscWeglaWMagazynie;
    }

    public void setIloscWeglaWMagazynie(float iloscWeglaWMagazynie) {
        IloscWeglaWMagazynie = iloscWeglaWMagazynie;
    }

    public float getMaxPojemnoscMagazynu() {
        return MaxPojemnoscMagazynu;
    }

    public void setMaxPojemnoscMagazynu(float maxPojemnoscMagazynu) {
        MaxPojemnoscMagazynu = maxPojemnoscMagazynu;
    }

    @Override
    public String toString() {
        return "ElektrowniaWeglowa: " + super.toString() +
                "\nDostawcaWegla: " + DostawcaWegla.toString() +
                "\nIloscWeglaWMagazynie: " + IloscWeglaWMagazynie +
                "\nMaksymalna Pojemność Magazynu: " + MaxPojemnoscMagazynu;
    }

    @Override
    public float ObliczDochod(Elektrownia e) {
        return 0;
    }
}
