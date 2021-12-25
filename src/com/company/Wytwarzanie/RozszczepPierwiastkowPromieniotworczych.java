package com.company.Wytwarzanie;


import java.io.Serializable;

public class RozszczepPierwiastkowPromieniotworczych implements WytwarzanieEnergiiElektrycznej, Serializable {

    private static final long serialVersionUID = 1234670990255062290L;

    @Override
    public void SposobNaWytworzenieEnergiiElektrycznej() {
        System.out.println("Algorytm wytworzenia energii elektrycznej z rozszczepu pierwiastków promieniotwórczych:");
        System.out.println("Krok 1: Przekazanie paliwa rozszczepialnego do reaktora");
        System.out.println("Krok 2: Rozszczepienie jąder atomowych w reaktorze");
        System.out.println("Krok 3: Pobranie wydzielonego ciepła przez czynnik roboczy");
        System.out.println("Krok 4: Przekazanie czynnika roboczego do wytwornicy pary mokrej");
        System.out.println("Krok 5: Przejście pary mokrej przez system osuszający");
        System.out.println("Krok 6: Osuszona para trafia do turbiny połączonej z generatorem");
        System.out.println("Krok 7: Zamiana energii mechanicznej w energię elektryczną");
    }
}
