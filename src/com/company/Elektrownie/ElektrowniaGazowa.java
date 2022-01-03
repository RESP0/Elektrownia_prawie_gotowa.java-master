package com.company.Elektrownie;

import com.company.AtakTerro.Sposob2ReakcjaNaAtakTerrorystyczny;
import com.company.Awarie.Sposob2ReakcjaNaAwarieZasilania;
import com.company.Dochod.DochodGazowa;
import com.company.Head.Wlasciciel;
import com.company.uslugodawcy.DostawcaGazu;
import com.company.uslugodawcy.DystrybutorPradu;

public class ElektrowniaGazowa extends ElektrowniaNaPaliwoStale  {

	private float IloscGazuWMagazynie;
	private com.company.uslugodawcy.DostawcaGazu DostawcaGazu;
	private float MaxPojemnoscMagazynu;

	public ElektrowniaGazowa() {
		super();
		DostawcaGazu = new DostawcaGazu();
		IloscGazuWMagazynie = 100;
	}

	public ElektrowniaGazowa(String Nazwa, String Miasto, int MocChwilowa, int MocMaksymalna, int liczbaBlokow, int LiczbaPracownikow, Wlasciciel wlasciciel, boolean czyPracuje, String RodzajPaliwa, float ZuzyciePaliwa, int LiczbaBlokow, DystrybutorPradu Dystrubutor, float IloscGazuWMagazynie, DostawcaGazu DostawcaGazu, float MaxPojemnoscMagazynu, int cenaZakupu, int cenaSprzedazy, int cenaBloku) {
		super(Nazwa, Miasto, MocChwilowa, MocMaksymalna, liczbaBlokow, LiczbaPracownikow, wlasciciel, czyPracuje, RodzajPaliwa, ZuzyciePaliwa, LiczbaBlokow, Dystrubutor, cenaZakupu, cenaSprzedazy, cenaBloku);

		this.IloscGazuWMagazynie = IloscGazuWMagazynie;
		this.DostawcaGazu = DostawcaGazu;
		this.MaxPojemnoscMagazynu = MaxPojemnoscMagazynu;

		reakcjaNaAwarieZasilania = new Sposob2ReakcjaNaAwarieZasilania();
		reakcjeNaAtakTerrorystyczny = new Sposob2ReakcjaNaAtakTerrorystyczny();
		obliczDochodElektrowni = new DochodGazowa();
	}


	public float getIloscGazuWMagazynie() { return IloscGazuWMagazynie; }

	public void setIloscGazuWMagazynie(float iloscGazuWMagazynie)  { IloscGazuWMagazynie = iloscGazuWMagazynie; }

	public DostawcaGazu getDostawcaGazu() {	return DostawcaGazu; }

	public void setDostawcaGazu(DostawcaGazu dostawcaGazu) { DostawcaGazu = dostawcaGazu; }

	public float getMaxPojemnoscMagazynu() {
		return MaxPojemnoscMagazynu;
	}

	public void setMaxPojemnoscMagazynu(float maxPojemnoscMagazynu) {
		MaxPojemnoscMagazynu = maxPojemnoscMagazynu;
	}

	@Override
	public String toString() {
		return "ElektrowniaGazowa:" + super.toString() +
				"\nIloscGazuWMagazynie: " + IloscGazuWMagazynie +
				"\nDostawcaGazu: " + DostawcaGazu.toString() +
				"\nMaksymalna pojemność magazynu: " + MaxPojemnoscMagazynu;
	}

	@Override
	public float ObliczDochod(Elektrownia e) {
		return obliczDochodElektrowni.ObliczDochod(this);
	}
}
