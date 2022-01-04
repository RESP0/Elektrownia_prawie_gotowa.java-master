package com.company.AtakTerro;

import com.company.Elektrownie.Elektrownia;
import com.company.GUI.Gra;
import com.company.Head.Gracz;

import java.io.Serializable;
import java.util.Random;

public class Sposob2ReakcjaNaAtakTerrorystyczny implements ReakcjeNaAtakTerrorystyczny, Serializable {

    private static final long serialVersionUID = 1234670990255712290L;

    @Override
    public void ReakcjaNaAtakTerrorystyczny(Elektrownia e, Gracz g) {

    	Random generator = new Random();
        
        int wybor = generator.nextInt(4)+1;
        
        switch(wybor) 
        {
        
        	case 1:    
        		
        		int mocC = generator.nextInt(55,85);
        		e.setMocChwilowa(mocC*e.getMocMaksymalna()/100);
        		System.out.println("Z powodu ataku elektrownia zmienia moc chwilowa na: " +mocC +" %");

        		
        		break;
        	case 2:
        	case 3:
        	case 4:
            
        		int strata = generator.nextInt(1000,3500);
        		e.setMocChwilowa(80*e.getMocMaksymalna()/100);
        		g.odejmijBalans(strata);
        		System.out.println("Z powodu ataku elektrownia zostaje okradziona i traci: " +strata +" oraz zmienia moc chwilowa na 80%");
            
        		break;
        }
    }
}
