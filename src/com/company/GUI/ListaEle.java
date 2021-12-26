package com.company.GUI;

import javax.swing.*;

import com.company.Elektrownie.Elektrownia;
import com.company.Elektrownie.ElektrowniaAtomowa;
import com.company.Head.Gracz;

//DODAC ZABEZPIECZENIE ZE NIE MOZNA KUPIC JAK MA SIĘ ZA MAŁO PIENIĘDZY
//LUB GDY LICZBA ELE JEST ROWNA 5

//oPCJONaLNIE DO KAŻDEGO BUTTONA DOADAĆ INNĄ ICONE ZEBY ŁADNIE WYGLĄDAŁO
public class ListaEle extends JPanel {
    private int liczbaEle = 0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    String nazwa;
    String miasto;
    ListaEle(Gracz gracz, Elektrownia e){
        for (Elektrownia elektrownia : gracz.getListaElektrowni()){
            if (elektrownia.getClass() == e.getClass()){
                liczbaEle +=1;
                nazwa = elektrownia.getNazwa();
                miasto = elektrownia.getMiasto();
            }
        }
    }

}
