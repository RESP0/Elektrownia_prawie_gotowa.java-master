package com.company.Awarie;

import com.company.Elektrownie.Elektrownia;

import java.io.Serializable;
import java.util.Random;

public class Sposob2ReakcjaNaAwarieZasilania implements ReakcjaNaAwarieZasilania, Serializable {

    private static final long serialVersionUID = 1234670990255762299L;

    @Override
    public void ReakcjeNaAwarieZasilania(Elektrownia e) {

    	Random generator = new Random();
		
        e.setMocChwilowa(50*e.getMocMaksymalna()/100);
		System.out.print("Z powodu awarii zasilania moc chwilowa zostaje zmniejszona do 50%. ");


    }
}
