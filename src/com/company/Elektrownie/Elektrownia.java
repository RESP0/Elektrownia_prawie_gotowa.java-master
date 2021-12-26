package com.company.Elektrownie;

import com.company.AtakTerro.ReakcjeNaAtakTerrorystyczny;
import com.company.Awarie.ReakcjaNaAwarieZasilania;
import com.company.Head.Pracownicy;
import com.company.Head.Wlasciciel;
import com.company.Wytwarzanie.WytwarzanieEnergiiElektrycznej;
import com.company.uslugodawcy.DystrybutorPradu;
import com.company.Dochod.ObliczDochodElektrowni;

import java.io.Serializable;
import java.util.Arrays;

public abstract class Elektrownia implements Serializable, ObliczDochodElektrowni{

	private static final long serialVersionUID = 1234770990255762290L;

	private String nazwa;
	private String miasto;
	private int MocChwilowa;
	private int MocMaksymalna;
	private int LiczbaPracownikow;
	private Wlasciciel wlasciciel;
	private boolean czyPracuje;
	private Pracownicy pracownicy[];
	private DystrybutorPradu Dystrybutor;


	protected ReakcjaNaAwarieZasilania reakcjaNaAwarieZasilania;
	protected ReakcjeNaAtakTerrorystyczny reakcjeNaAtakTerrorystyczny;
	protected WytwarzanieEnergiiElektrycznej wytwarzanieEnergiiElektrycznej;
	protected ObliczDochodElektrowni obliczDochodElektrowni;



	public void wykonajReakcjaNaAwarieZasilania() {
		reakcjaNaAwarieZasilania.ReakcjeNaAwarieZasilania(this);
	}

	public void wykonajReakcjaNaAtakTerrorystyczny() {
		reakcjeNaAtakTerrorystyczny.ReakcjaNaAtakTerrorystyczny(this);
	}

	public void wykonajWytwarzanieEnergiiElektrycznej() {
		wytwarzanieEnergiiElektrycznej.SposobNaWytworzenieEnergiiElektrycznej();
	}

	public void ustawReakcjeNaAwarie(ReakcjaNaAwarieZasilania reakcjaAwaria) {
		this.reakcjaNaAwarieZasilania = reakcjaAwaria;
	}

	public void ustawReakcjeNaAtak(ReakcjeNaAtakTerrorystyczny reakcjaAtak) {
		this.reakcjeNaAtakTerrorystyczny = reakcjaAtak;
	}

	public Elektrownia()
	{
		nazwa = " ";
		miasto = "";
		MocChwilowa = 0;
		MocMaksymalna = 0;
		LiczbaPracownikow = 0;
		czyPracuje = false;
		wlasciciel = new Wlasciciel();
		Dystrybutor = new DystrybutorPradu();
	}
	
	public Elektrownia(String nazwa, String miasto, int MocChwilowa, int MocMaksymalna, int LiczbaPracownikow, boolean czyPracuje, Wlasciciel wlasciciel, DystrybutorPradu Dystrybutor)
	{
		this.nazwa = nazwa;
		this.miasto = miasto;
		this.MocChwilowa = MocChwilowa;
		this.MocMaksymalna = MocMaksymalna;
		this.LiczbaPracownikow = LiczbaPracownikow;
		this.wlasciciel = wlasciciel;
		this.czyPracuje = czyPracuje;
		this.pracownicy = new Pracownicy[getLiczbaPracownikow()];
		this.Dystrybutor = Dystrybutor;

		for(int i = 0; i<pracownicy.length;i++){
			pracownicy[i] = new Pracownicy();
		}
	}

	
	public Wlasciciel getWlasciciel(){
		return wlasciciel;
	}

	public void setWlasciciel(Wlasciciel wlasciciel) {
		this.wlasciciel = wlasciciel;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public int getMocChwilowa() {
		return MocChwilowa;
	}

	public void setMocChwilowa(int mocChwilowa) {
		MocChwilowa = mocChwilowa;
	}

	public int getMocMaksymalna() {
		return MocMaksymalna;
	}

	public void setMocMaksymalna(int mocMaksymalna) {
		MocMaksymalna = mocMaksymalna;
	}

	public int getLiczbaPracownikow() {
		return LiczbaPracownikow;
	}

	public void setLiczbaPracownikow(int liczbaPracownikow) {
		LiczbaPracownikow = liczbaPracownikow;
	}

	public boolean isCzyPracuje() {
		return czyPracuje;
	}

	public void setCzyPracuje(boolean czyPracuje) {
		this.czyPracuje = czyPracuje;
	}

	public Pracownicy[] getPracownicy() {
		return pracownicy;
	}

	public void setPracownicy(Pracownicy[] pracownicy) {
		this.pracownicy = pracownicy;
	}

	public DystrybutorPradu getDystrybutor() {
		return Dystrybutor;
	}

	public void setDystrybutor(DystrybutorPradu dystrybutor) {
		Dystrybutor = dystrybutor;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String toString()
	{
		 return "\nNazwa: " + nazwa +"\nMiasto: " + miasto + "\nmoc chwilowa: " + MocChwilowa + "\nmoc maksymalna: " + MocMaksymalna + "\nliczba pracownikow: " + LiczbaPracownikow + "\nczy pracuje: " + czyPracuje + " \nwlasciciel elektrowni:\t\t" + wlasciciel  + "\npracownicy: " + Arrays.toString(pracownicy) + "\nDystrybutor: " + Dystrybutor.toString();
	}
	
	public void RozpoczeciePracy(){
		if(czyPracuje) {
			System.out.println("\nElektrownia już pracuje\n");
		}else {
			System.out.println("\nElektrownia zaczyna pracowac\n");
			this.setCzyPracuje(true);

		}
	}
	
	public void ZatrzymaniePracy(){
		if(czyPracuje) {
			System.out.println("\nElektrownia kończy prace\n");
			this.setCzyPracuje(false);
		}else {
			System.out.println("\nElektrownia zaczyna pracowac\n");


		}
	}

}
