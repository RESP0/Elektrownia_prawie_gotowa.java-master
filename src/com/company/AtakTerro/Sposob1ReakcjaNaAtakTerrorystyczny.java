package com.company.AtakTerro;

import com.company.Elektrownie.Elektrownia;
import java.io.Serializable;
import java.util.Random;
import com.company.Head.Gracz;


public class Sposob1ReakcjaNaAtakTerrorystyczny implements ReakcjeNaAtakTerrorystyczny, Serializable {

    private static final long serialVersionUID = 34670990255762290L;

    @Override
    public void ReakcjaNaAtakTerrorystyczny(Elektrownia e, Gracz g) {

        
    	Random generator = new Random();
        
        int wybor = generator.nextInt(1,5);
        
        switch(wybor) 
        {
        
        	case 1:  
        	case 2:  
        		
        		int mocC = generator.nextInt(60,90);
        		e.setMocChwilowa(mocC*e.getMocMaksymalna()/100);
        		System.out.println("Z powodu ataku elektrownia zmienia moc chwilowa na: " +mocC +"%");

        		
        		break;
        	case 3:
        	case 4:
        	case 5:
            
        		int strata = generator.nextInt(1000,4000);
        		e.setMocChwilowa(e.getMocMaksymalna()*75/100);
        		g.odejmijBalans(strata);
        		System.out.println("Z powodu ataku elektrownia zostaje okradziona i traci: " +strata +" oraz zmienia moc chwilowa na 75%");
            
        		break;
        }
    }
}
