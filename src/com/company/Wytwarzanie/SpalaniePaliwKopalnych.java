package com.company.Wytwarzanie;


import java.io.Serial;
import java.io.Serializable;

public class SpalaniePaliwKopalnych implements WytwarzanieEnergiiElektrycznej, Serializable {

    private static final long serialVersionUID = 123462290255762290L;

    @Override
    public void SposobNaWytworzenieEnergiiElektrycznej() {
        System.out.println("Algorytm wytworzenia energii elektrycznej z paliw kopalnych:");
        System.out.println("Krok 1: przekazanie paliwa do specjalnego kotła");
        System.out.println("Krok 2: spalanie paliwa");
        System.out.println("Krok 3: energia chemiczna paliwa zamieniana na energie cieplna pary wodnej");
        System.out.println("Krok 4: napędzenie turbiny wytwarzającej prąd");
        System.out.println("Krok 5: przekazanie energii mechanicznej do generatora");
        System.out.println("Krok 6: przetworzenie energii mechanicznej w energie elektryczną");
    }
}
