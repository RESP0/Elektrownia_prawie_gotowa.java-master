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
        		
        		int mocC = generator.nextInt(35)+55;
        		int mocM = generator.nextInt(20)+80;
        		e.setMocChwilowa(mocC);
        		e.setMocMaksymalna(mocM);
        		System.out.println("Z powodu ataku elektrownia zmienia moc chwilowa na: " +mocC +" oraz moc maksymalna na: " +mocM);

        		
        		break;
        	case 2:
            
        		e.setCzyPracuje (false);
        		System.out.println("Z powodu ataku elektrownia zostaje zamknieta!");
            
        		break;
        	case 3:
        	case 4:
            
        		int strata = generator.nextInt(2500)+1000;
        		e.setMocChwilowa(80);
        		g.odejmijBalans(strata);
        		System.out.println("Z powodu ataku elektrownia zostaje okradziona i traci: " +strata +" oraz zmienia moc chwilowa na 80%");
            
        		break;
        }
    }
}
