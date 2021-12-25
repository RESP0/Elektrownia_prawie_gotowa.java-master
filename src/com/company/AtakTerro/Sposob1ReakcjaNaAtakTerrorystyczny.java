package com.company.AtakTerro;

import com.company.Elektrownie.Elektrownia;

import java.io.Serializable;

public class Sposob1ReakcjaNaAtakTerrorystyczny implements ReakcjeNaAtakTerrorystyczny, Serializable {

    private static final long serialVersionUID = 34670990255762290L;

    @Override
    public void ReakcjaNaAtakTerrorystyczny(Elektrownia e) {

        //setCzypracuje false, zamykamy elektrownie i ewakuujemy personel

        //switch z losowym intem ktory ma 20% szans że jak nie wyłączymy elektrowni to mogą okraść itp.

        //set

        e.setCzyPracuje (false);

        System.out.println("Z powodu ataku elektrownia zostaje zamkniêta!");
    }
}
