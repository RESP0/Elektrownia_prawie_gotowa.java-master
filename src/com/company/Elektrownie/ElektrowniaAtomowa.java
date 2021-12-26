package com.company.Elektrownie;
import com.company.AtakTerro.Sposob2ReakcjaNaAtakTerrorystyczny;
import com.company.Awarie.Sposob1ReakcjaNaAwarieZasilania;
import com.company.Dochod.DochodAtomowa;
import com.company.Head.Wlasciciel;
import com.company.Wytwarzanie.RozszczepPierwiastkowPromieniotworczych;
import com.company.uslugodawcy.DystrybutorPradu;
import com.company.uslugodawcy.OdbiorcaOdpadow;

import java.util.Arrays;

public class ElektrowniaAtomowa extends Elektrownia {

    private int LiczbaReaktorow;
    private float ZuzycieWody;
    private float IloscOdpadow;
    private com.company.uslugodawcy.OdbiorcaOdpadow[] OdbiorcaOdpadow;

    public ElektrowniaAtomowa(){
        super();
        this.LiczbaReaktorow = 3;
    }


    public ElektrowniaAtomowa(String nazwa, String miasto, int MocChwilowa, int MocMaksymalna, int LiczbaPracownikow, Wlasciciel wlasciciel, boolean czyPracuje, int LiczbaReaktorow, float ZuzycieWody, DystrybutorPradu Dystrybutor, float IloscOdpadow, OdbiorcaOdpadow[] OdbiorcaOdpadow){

        super(nazwa, miasto, MocChwilowa, MocMaksymalna, LiczbaPracownikow, czyPracuje, wlasciciel, Dystrybutor);
        this.LiczbaReaktorow = LiczbaReaktorow;
        this.ZuzycieWody = ZuzycieWody;
        this.IloscOdpadow = IloscOdpadow;
        this.OdbiorcaOdpadow = OdbiorcaOdpadow;

        reakcjaNaAwarieZasilania = new Sposob1ReakcjaNaAwarieZasilania();
        reakcjeNaAtakTerrorystyczny = new Sposob2ReakcjaNaAtakTerrorystyczny();
        wytwarzanieEnergiiElektrycznej = new RozszczepPierwiastkowPromieniotworczych();
        obliczDochodElektrowni = new DochodAtomowa();
    }

    public void ZwiekszMoc() {
        if(getMocChwilowa()<getMocMaksymalna()){
            setMocChwilowa(getMocChwilowa()+1);
            setZuzycieWody(getZuzycieWody()+10f);
        }
        System.out.println("Moc zostala zwiekszona");
    }

    public void ZmniejszMoc() {
        if(getMocChwilowa()>0 && getZuzycieWody()>10){
            setMocChwilowa(getMocChwilowa()-1);
            setZuzycieWody(getZuzycieWody()-10f);
        }
    }

    public void WywozOdpadow(int x) {
        if (IloscOdpadow > 0)
            OdbiorcaOdpadow[x].WywiezOdpady(this);
    }


    //metody get i set
    public int getLiczbaReaktorow() {
        return LiczbaReaktorow;
    }

    public void setLiczbaReaktorow(int liczbaReaktorow) {
        LiczbaReaktorow = liczbaReaktorow;
    }

    public float getZuzycieWody() {
        return ZuzycieWody;
    }

    public void setZuzycieWody(float zuzycieWody) {
        ZuzycieWody = zuzycieWody;
    }


    public float getIloscOdpadow() {
        return IloscOdpadow;
    }

    public void setIloscOdpadow(float iloscOdpadow) {
        IloscOdpadow = iloscOdpadow;
    }

    public OdbiorcaOdpadow[] getOdbiorcaOdpadow() {
        return OdbiorcaOdpadow;
    }

    public void setOdbiorcaOdpadow(OdbiorcaOdpadow odbiorcaOdpadow, int x) {
        OdbiorcaOdpadow[x] = odbiorcaOdpadow;
    }

    @Override
    public String toString() {
        return "ElektrowniaAtomowa:" + super.toString() +
                "\nLiczbaReaktorow: " + LiczbaReaktorow +
                "\nZuzycieWody: " + ZuzycieWody +
                "\nIloscOdpadow: " + IloscOdpadow +
                "\nOdbiorcaOdpadow: " + Arrays.toString(OdbiorcaOdpadow);
    }

    @Override
    public float ObliczDochod(Elektrownia e) {
        return obliczDochodElektrowni.ObliczDochod(this);
    }
}
