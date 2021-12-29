package com.company.Elektrownie;


import com.company.AtakTerro.Sposob1ReakcjaNaAtakTerrorystyczny;
import com.company.Awarie.Sposob1ReakcjaNaAwarieZasilania;
import com.company.Dochod.DochodFotowoltaiczna;
import com.company.Head.Pracownicy;
import com.company.Head.Wlasciciel;
import com.company.Wytwarzanie.ZamianaEnegiiPromieniowaniaSlonecznego;
import com.company.uslugodawcy.DostawcaGazu;
import com.company.uslugodawcy.DystrybutorPradu;

public class ElektrowniaFotowoltaiczna extends Elektrownia {


	private float ZuzyciePaneli;

	public ElektrowniaFotowoltaiczna() {
		super();
		ZuzyciePaneli = 10;
	}

	public ElektrowniaFotowoltaiczna(String Nazwa, String Miasto, int MocChwilowa, int MocMaksymalna, int LiczbaPracownikow, Wlasciciel wlasciciel,
			boolean czyPracuje, float ZuzyciePaneli, DystrybutorPradu Dystrybutor, int cenaZakupu, int cenaSprzedazy)
	{
		super(Nazwa, Miasto, MocChwilowa, MocMaksymalna, LiczbaPracownikow, czyPracuje, wlasciciel, Dystrybutor, cenaZakupu, cenaSprzedazy);
		
		this.ZuzyciePaneli = ZuzyciePaneli;

		reakcjaNaAwarieZasilania = new Sposob1ReakcjaNaAwarieZasilania();
		reakcjeNaAtakTerrorystyczny = new Sposob1ReakcjaNaAtakTerrorystyczny();
		obliczDochodElektrowni = new DochodFotowoltaiczna();
	}

	
	//Metody typu get i metody typu set
	public float getZuzyciePaneli()
	{
		return ZuzyciePaneli;
	}

	public void setZuzyciePaneli(float zuzyciePaneli)
	{
		ZuzyciePaneli = zuzyciePaneli;
	}

	//Metody klasy
	public void WymienPanele()
	{
		
		this.setZuzyciePaneli(0);
	}

	@Override
	public String toString() {
		return "ElektrowniaFotowoltaiczna: " + super.toString() +
				"\nZuzyciePaneli: " + ZuzyciePaneli + '\'';
	}

	@Override
	public float ObliczDochod(Elektrownia e) {
		return obliczDochodElektrowni.ObliczDochod(this);
	}
}
