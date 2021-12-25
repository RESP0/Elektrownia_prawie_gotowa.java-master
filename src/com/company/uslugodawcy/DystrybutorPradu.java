package com.company.uslugodawcy;

import com.company.Head.Wlasciciel;

import java.io.Serializable;

public class DystrybutorPradu implements Serializable {

    private static final long serialVersionUID = 1234678333255762290L;
    private float CenaSkupu;
    private com.company.Head.Wlasciciel Wlasciciel;

    public DystrybutorPradu() {
        CenaSkupu = 1;
        Wlasciciel = new Wlasciciel();
    }

    public DystrybutorPradu(float CenaSkupu, Wlasciciel Wlasciciel) {
        this.CenaSkupu = CenaSkupu;
        this.Wlasciciel = Wlasciciel;
    }

    public static void KupPrad() { System.out.println("Prad kupiony"); }

    public float getCenaSkupu() { return CenaSkupu; }

    public void setCenaSkupu(float cenaSkupu) { CenaSkupu = cenaSkupu; }

    public com.company.Head.Wlasciciel getWlasciciel() { return Wlasciciel; }

    public void setWlasciciel(com.company.Head.Wlasciciel wlasciciel) { Wlasciciel = wlasciciel; }

    @Override
    public String toString() {
        return "\n\tCenaSkupu: " + CenaSkupu + "\t\tWlasciciel: " + Wlasciciel;
    }
}
