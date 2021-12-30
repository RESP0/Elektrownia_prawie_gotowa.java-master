package com.company.Head;

import com.company.Elektrownie.Elektrownia;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serializacja {

    public void zapis(ArrayList<Elektrownia> listaElektrowniArrayList) {
        try(ObjectOutputStream so = new ObjectOutputStream(new FileOutputStream("ElektrownieGracza.ser"))) {

            so.writeObject(listaElektrowniArrayList);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Elektrownia> odczyt() {


        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("ElektrownieGracza.ser"))) {

            Object obj1 = is.readObject();
            is.close();
            for(Elektrownia e : (ArrayList<Elektrownia> )obj1){
               // System.out.println(e.getNazwa());
            }
            return (ArrayList<Elektrownia>) obj1;

        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }

    public void zapisStanuKonta(float stan) {
        try(ObjectOutputStream so = new ObjectOutputStream(new FileOutputStream("StanKontaGracza.ser"))) {

            so.writeObject(stan);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public float odczytStanuKonta() {


        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("StanKontaGracza.ser"))) {

            Object obj1 = is.readObject();
            is.close();
            return (float) obj1;

        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return 0;
        }

    }
}

