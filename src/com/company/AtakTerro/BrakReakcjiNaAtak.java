package com.company.AtakTerro;

import com.company.Elektrownie.Elektrownia;
import com.company.Head.Gracz;

import java.util.Random;

public class BrakReakcjiNaAtak implements ReakcjeNaAtakTerrorystyczny{
    @Override
    public void ReakcjaNaAtakTerrorystyczny(Elektrownia e, Gracz g) {
        Random random = new Random();
            g.odejmijBalans(random.nextInt(2000,7000));
    }
}
