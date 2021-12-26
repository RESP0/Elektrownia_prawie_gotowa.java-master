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



    private com.company.uslugodawcy.DystrybutorPradu DystrybutorPradu;
    private com.company.Head.Pracownicy[] Pracownicy;
    private com.company.uslugodawcy.DostawcaWegla DostawcaWegla;
    private float IloscWeglaWMagazynie;
    private float MaxPojemnoscMagazynu;

    public ElektrowniaWeglowa() {
        DostawcaWegla = new DostawcaWegla();
        DystrybutorPradu = new DystrybutorPradu();
        IloscWeglaWMagazynie = 100;
        Pracownicy = new Pracownicy[this.getLiczbaPracownikow()];

    }

    public ElektrowniaWeglowa(String Nazwa, String Miasto, int MocChwilowa, int MocMaksymalna, int LiczbaPracownikow, Wlasciciel wlasciciel, boolean czyPracuje, String RodzajPaliwa, float ZuzyciePaliwa, int LiczbaBlokow, DystrybutorPradu DystrybutorPradu, float IloscWeglaWMagazynie, DostawcaWegla DostawcaWegla, float MaxPojemnoscMagazynu) {

        super(Nazwa, Miasto, MocChwilowa, MocMaksymalna, LiczbaPracownikow, wlasciciel, czyPracuje, RodzajPaliwa, ZuzyciePaliwa, LiczbaBlokow, DystrybutorPradu);
        this.DostawcaWegla = DostawcaWegla;
        this.IloscWeglaWMagazynie = IloscWeglaWMagazynie;
        this.MaxPojemnoscMagazynu = MaxPojemnoscMagazynu;
        this.DystrybutorPradu = DystrybutorPradu;

        reakcjaNaAwarieZasilania = new Sposob1ReakcjaNaAwarieZasilania();
        reakcjeNaAtakTerrorystyczny = new Sposob1ReakcjaNaAtakTerrorystyczny();
        wytwarzanieEnergiiElektrycznej = new SpalaniePaliwKopalnych();

    }

    public DystrybutorPradu getDystrybutorPradu() {
        return DystrybutorPradu;
    }

    public void setDystrybutorPradu(DystrybutorPradu dystrybutorPradu) {
        DystrybutorPradu = dystrybutorPradu;
    }

    public Pracownicy[] getPracownicy() {
        return Pracownicy;
    }

    public void setPracownicy(Pracownicy[] pracownicy) {
        Pracownicy = pracownicy;
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
                "\nDystrybutorPradu: " + DystrybutorPradu.toString() +
                "\nPracownicy: " + Arrays.toString(Pracownicy) +
                "\nDostawcaWegla: " + DostawcaWegla.toString() +
                "\nIloscWeglaWMagazynie: " + IloscWeglaWMagazynie +
                "\nMaksymalna Pojemność Magazynu: " + MaxPojemnoscMagazynu;
    }

    @Override
    public float ObliczDochod(Elektrownia e) {
        return 0;
    }
}
