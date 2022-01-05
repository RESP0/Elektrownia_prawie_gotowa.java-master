package com.company.Awarie;
import java.util.Random;

import com.company.Elektrownie.Elektrownia;

import java.io.Serializable;

public class Sposob1ReakcjaNaAwarieZasilania implements ReakcjaNaAwarieZasilania , Serializable {
    private static final long serialVersionUID = 1234670990555762290L;


    @Override
    public void ReakcjeNaAwarieZasilania(Elektrownia e) {

        //jak zmenijszymy np do 25% moc to jest wieksza szansa urzadzenia w elektrwnowni sie nie posypia i ze nie bedzie kolejnego zwarcia itp.
    			Random generator = new Random();
    			
                e.setMocChwilowa(25*e.getMocMaksymalna()/100);
        		System.out.print("Z powodu awarii zasilania moc chwilowa zostaje zmniejszona do 25%. ");

    }

}
