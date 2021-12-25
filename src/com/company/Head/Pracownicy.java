package com.company.Head;
import java.io.Serializable;
import java.util.Random;

public class Pracownicy implements Serializable {

    private static final long serialVersionUID = 1234678890255762290L;

    Random random = new Random();
    private  String Imie;
    private  String Nazwisko;
    private  float Doswiadczenie;
    private String[] imiona = {"Pawel", "Antoni", "Jan", "Aleksander", "Franciszek", "Jakub", "Szymon", "Mikołaj", "Leon", "Filip", "Stanisław"};
    private String[] nazwiska = {"Nowak", "Kowalski", "Wiśniewski", "Wójcik", "Kowalczyk", "Kamiński", "Lewandowski", "Zieliński", "Szymański", "Woźniak"};

    public Pracownicy() {

        Imie = imiona[random.nextInt(imiona.length)];
        Nazwisko = nazwiska[random.nextInt(nazwiska.length)];
        Doswiadczenie = random.nextInt(1, 10);
    }

    public Pracownicy(String Imie, String Nazwisko, float Doswiadczenie) {
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.Doswiadczenie = Doswiadczenie;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public float getDoswiadczenie() {
        return Doswiadczenie;
    }

    public void setDoswiadczenie(float doswiadczenie) {
        Doswiadczenie = doswiadczenie;
    }

    @Override
    public String toString() {
        return "Imie: " + Imie + '\t' +
                "Nazwisko: " + Nazwisko + '\t' +
                "Doswiadczenie: " + Doswiadczenie + "\n";
    }
}
