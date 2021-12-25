package com.company.Head;

import java.io.*;

public class Serializacja {

    public static void zapis(Gracz gracz) {
        try(ObjectOutputStream so = new ObjectOutputStream(new FileOutputStream("PlikAktualnySave.ser"))) {

            so.writeObject(gracz);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Gracz odczyt() {


        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("PlikAktualnySave.ser"))) {

            Object obj1 = is.readObject();


            return (Gracz) obj1;


        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }
}

