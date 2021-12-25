package com.company.Wytwarzanie;


import java.io.Serializable;

public class ZamianaEnegiiPromieniowaniaSlonecznego implements WytwarzanieEnergiiElektrycznej, Serializable {

    private static final long serialVersionUID = 1230000990255762290L;

    @Override
    public void SposobNaWytworzenieEnergiiElektrycznej() {
        System.out.println("Algorytm wytworzenia energii elektrycznej z energii słonecznej:");
        System.out.println("Krok 1: Zastosowanie złącza półprzewodnikowego typu p-n");
        System.out.println("Krok 2: Przeksztalcenie energii słonecznej w prąd stały");
        System.out.println("Krok 3: Zasilanie inwentera prądem stałym");
        System.out.println("Krok 4: Inwenter zamienia prąd stały na prąd zmienny");
    }
}
