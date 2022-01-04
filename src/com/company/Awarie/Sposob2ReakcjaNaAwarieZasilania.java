package com.company.Awarie;

import com.company.Elektrownie.Elektrownia;

import java.io.Serializable;
import java.util.Random;

public class Sposob2ReakcjaNaAwarieZasilania implements ReakcjaNaAwarieZasilania, Serializable {

    private static final long serialVersionUID = 1234670990255762299L;

    @Override
    public void ReakcjeNaAwarieZasilania(Elektrownia e) {

    	Random generator = new Random();
		
        e.setMocChwilowa(50);
		System.out.print("Z powodu awarii zasilania moc chwilowa zostaje zmniejszona do 50%. ");

        int wybor = generator.nextInt(6)+1;
        
        switch(wybor) 
        {
        
        	case 1:  
        	case 2: 
        	case 3:
        	case 4:
        		
        		int mocM = generator.nextInt(20)+80;
        		e.setMocMaksymalna(mocM);
        		System.out.println("Elektrownia dziala dalej, ale zmienia swoja moc maksymalna na: " +mocM);

        		
        		break;
   
        	case 5:
        	case 6:
        		
        		e.setCzyPracuje(false);
        		System.out.println("Dzialania nie pomogly. Elektrownia zostaje wylaczona.");
            
        		break;
        }
    }
}
