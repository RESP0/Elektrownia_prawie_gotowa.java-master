package com.company.AtakTerro;

import com.company.Elektrownie.Elektrownia;
import com.company.Head.Gracz;

import java.io.Serializable;

public class Sposob2ReakcjaNaAtakTerrorystyczny extends Gracz implements ReakcjeNaAtakTerrorystyczny, Serializable {

    private static final long serialVersionUID = 1234670990255712290L;

    @Override
    public void ReakcjaNaAtakTerrorystyczny(Elektrownia e) {
        e.setMocChwilowa(e.getMocChwilowa()/2);

        System.out.println("Z powodu ataku elektrownia zmniejsza swoja moc chwilowa o 50%!");

        odejmijBalans(500);

    }
}
