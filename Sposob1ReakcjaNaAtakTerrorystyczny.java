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
        
        int wybor = generator.nextInt(5)+1;
        
        switch(wybor) 
        {
        
        	case 1:  
        	case 2:  
        		
        		int mocC = generator.nextInt(30)+60;
        		int mocM = generator.nextInt(10)+90;
        		e.setMocChwilowa(mocC);
        		e.setMocMaksymalna(mocM);
        		System.out.println("Z powodu ataku elektrownia zmienia moc chwilowa na: " +mocC +" oraz moc maksymalna na: " +mocM);

        		
        		break;
        	case 3:
        	case 4:
            
        		e.setCzyPracuje (false);
        		System.out.println("Z powodu ataku elektrownia zostaje zamknieta!");
            
        		break;
        
        	case 5:
            
        		int strata = generator.nextInt(4000)+1000;
        		e.setMocChwilowa(75);
        		g.odejmijBalans(strata);
        		System.out.println("Z powodu ataku elektrownia zostaje okradziona i traci: " +strata +" oraz zmienia moc chwilowa na 75%");
            
        		break;
        }
    }
}
