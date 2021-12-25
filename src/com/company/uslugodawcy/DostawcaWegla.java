package com.company.uslugodawcy;

import com.company.Elektrownie.ElektrowniaWeglowa;
import com.company.Head.Wlasciciel;

import java.io.Serializable;

public class DostawcaWegla implements Serializable {

	private static final long serialVersionUID = 1234672220255762290L;
	private float CenaZaTone;
	private com.company.Head.Wlasciciel Wlasciciel;
	

	public DostawcaWegla() {
		CenaZaTone = 1;
		Wlasciciel = new Wlasciciel();
	}
	
	public DostawcaWegla(float CenaZaTone, Wlasciciel Wlasciciel) {
		this.CenaZaTone = CenaZaTone;
		this.Wlasciciel = Wlasciciel;
	}

	//---------------------------------------------------	
	
	public static void Dostawa(ElektrowniaWeglowa e) {
		e.setIloscWeglaWMagazynie(e.getMaxPojemnoscMagazynu());
	}
	
	
	
	//---------------------------------------------------
	public float getCenaZaTone() {
		return CenaZaTone;
	}

	public void setCenaZaTone(float cenaZaTone) {
		CenaZaTone = cenaZaTone;
	}

	public Wlasciciel getWlasciciel() {
		return Wlasciciel;
	}

	public void setWlasciciel(Wlasciciel wlasciciel) {
		Wlasciciel = wlasciciel;
	}

	@Override
	public String toString() {
		return "\tCenaZaTone: " + CenaZaTone +  "\tWlasciciel: " + Wlasciciel;
	}
}
