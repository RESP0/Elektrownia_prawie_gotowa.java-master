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
    			
                e.setMocChwilowa(25);
        		System.out.print("Z powodu awarii zasilania moc chwilowa zostaje zmniejszona do 25%. ");

                int wybor = generator.nextInt(5)+1;
                
                switch(wybor) 
                {
                
                	case 1:  
                	case 2: 
                	case 3:
                	case 4:
                		
                		int mocM = generator.nextInt(30)+70;
                		e.setMocMaksymalna(mocM);
                		System.out.println("Elektrownia dziala dalej, ale zmienia swoja moc maksymalna na: " +mocM);

                		
                		break;
           
                	case 5:
                    
                		e.setCzyPracuje(false);
                		System.out.println("Dzialania nie pomogly. Elektrownia zostaje wylaczona.");
                    
                		break;
                }
    }

}
