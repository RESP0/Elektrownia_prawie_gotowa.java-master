package com.company.Elektrownie;

import com.company.Head.Wlasciciel;
import com.company.Wytwarzanie.SpalaniePaliwKopalnych;
import com.company.uslugodawcy.DystrybutorPradu;

public abstract class ElektrowniaNaPaliwoStale extends Elektrownia  {


	private String RodzajPaliwa;
	private float ZuzyciePaliwa;
	private int LiczbaBlokow;
	

	public ElektrowniaNaPaliwoStale(String Nazwa, String miasto, int MocChwilowa, int MocMaksymalna, int LiczbaPracownikow, Wlasciciel wlasciciel, boolean czyPracuje, String RodzajPaliwa, float ZuzyciePaliwa, int LiczbaBlokow, DystrybutorPradu Dystrybutor)
	{
		super(Nazwa, miasto, MocChwilowa, MocMaksymalna, LiczbaPracownikow, czyPracuje, wlasciciel, Dystrybutor);
		this.RodzajPaliwa = RodzajPaliwa;
		this.ZuzyciePaliwa = ZuzyciePaliwa;
		this.LiczbaBlokow = LiczbaBlokow;
	}

	public ElektrowniaNaPaliwoStale() {
		wytwarzanieEnergiiElektrycznej = new SpalaniePaliwKopalnych();
	}

	public String getRodzajPaliwa() {
		return RodzajPaliwa;
	}

	public void setRodzajPaliwa(String rodzajPaliwa) {
		RodzajPaliwa = rodzajPaliwa;
	}

	public float getZuzyciePaliwa() {
		return ZuzyciePaliwa;
	}

	public void setZuzyciePaliwa(float zuzyciePaliwa) {
		ZuzyciePaliwa = zuzyciePaliwa;
	}

	public int getLiczbaBlokow() {
		return LiczbaBlokow;
	}

	public void setLiczbaBlokow(int liczbaBlokow) {
		LiczbaBlokow = liczbaBlokow;
	}
	
	public String toString()
	{
		return super.toString() + "\nrodzaj paliwa: " + RodzajPaliwa + "\nzuzycie paliwa: " + ZuzyciePaliwa + "\nliczba blokow: " + LiczbaBlokow;
	}
	
	public void WylaczBloki(){

	}
	
	public void WlaczBloki(){

	}

}
