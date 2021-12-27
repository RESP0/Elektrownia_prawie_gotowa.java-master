package com.company.Head;

import java.util.Scanner;

import com.company.AtakTerro.ReakcjeNaAtakTerrorystyczny;
import com.company.Awarie.ReakcjaNaAwarieZasilania;
import com.company.Dochod.DochodAtomowa;
import com.company.Elektrownie.ElektrowniaAtomowa;
import com.company.GUI.ElektrownieOkno.ElektrowniaAtomowaOkno;
import com.company.GUI.GamePanel;
import com.company.uslugodawcy.DystrybutorPradu;
import com.company.uslugodawcy.OdbiorcaOdpadow;
import com.company.GUI.MyFrame;


import static com.company.Head.Symulator.*;

public class Main {

    public static void main(String[] args) {
        //new ElektrowniaAtomowaOkno();
        new MyFrame();
        GamePanel gamepanel = new GamePanel();
        Gracz gracz = null;
        Scanner scan = new Scanner(System.in);


        while (gamepanel.getWybor() != 1 || gamepanel.getWybor() != 1){
            //bardzo chamskie czekanie na odpowiedz z GamePanel na dokonanie wyboru w menu xddd
        }
        switch (gamepanel.getWybor()){
            case 1:
                gracz = Serializacja.odczyt();
                break;
            case 2:
                 gracz = new Gracz();
                 break;
        }
        while(gracz.getBalans()>=0) {
            for (int i = 0; i < gracz.getListaElektrowni().size(); i++) {
                gracz.getListaElektrowni().get(i).setMocChwilowa(100);
                gracz.getListaElektrowni().get(i).setCzyPracuje(true);
            }
            for (int i = 0; i < (gracz.getListaElektrowni()).size(); i++) {
               gracz.setBalans(gracz.getBalans() + (gracz.getListaElektrowni()).get(i).ObliczDochod(gracz.getListaElektrowni().get(i)));
            }
            boolean f = true;
            while (f) {
                int numer;
                while (f) {
                    if (gracz.getListaElektrowni().isEmpty()) {
                        System.out.println("Wybierz opcję:" + "\n" +
                                "1 - Zakup elektrowni" + "\n" +
                                "2 - Pokaz stan konta" + "\n" +
                                "3 (i inne) - Przejdz do nastepnego dnia + \n");

                        numer = scan.nextInt();
                        switch (numer) {
                            case 1:
                                gracz.zakupElektrowni();
                                break;
                            case 2:
                                System.out.println(gracz.getBalans());
                                break;
                            default:
                                f = false;
                        }
                    } else {
                        System.out.println("Wybierz opcję:" + "\n" +
                                "1 - Zakup elektrowni" + "\n" +
                                "2 - Wybierz reakcję na awarie zasilania" + "\n" +
                                "3 - Wybierz reakcję na atak terrorystyczny" + "\n" +
                                "4 - Sprzedaj elektrownie" + "\n" +
                                "5 - Pokaz posiadane elektrownie \n" +
                                "6 - Pokaz stan konta \n" +
                                "7 - Zakończ gre \n" +
                                "INNE - Przejdz do nastepnego dnia i zapisz postępy");
                        numer = scan.nextInt();
                        switch (numer) {
                            case 1:
                                gracz.zakupElektrowni();
                                break;
                            case 2:
                                ReakcjaNaAwarieZasilania reakcjaAwaria = zmienRekacjeAwaria();
                                WyborElektrowni(gracz).ustawReakcjeNaAwarie(reakcjaAwaria);
                                break;
                            case 3:
                                ReakcjeNaAtakTerrorystyczny reakcjaAtak = zmienReakcjeAtak();
                                WyborElektrowni(gracz).ustawReakcjeNaAtak(reakcjaAtak);
                                break;
                            case 4:
                                gracz.SprzedajElektrownie();
                                break;
                            case 5:
                                gracz.show();
                                break;
                            case 6:
                                System.out.println(gracz.getBalans());
                                break;
                            case 7:
                                System.out.println("\nGra zakończona!\n");
                                return;
                            default:
                                f = false;
                                Serializacja.zapis(gracz);
                        }
                    }
                }
            }
            for (int i = 0; i < gracz.getListaElektrowni().size(); i++) {
                rozneWydarzeniaLosowe(gracz.getListaElektrowni().get(i));

            }
        }
        System.out.println("Twoje pieniadze sie skonczyły, koniec gry!");

    }

}


