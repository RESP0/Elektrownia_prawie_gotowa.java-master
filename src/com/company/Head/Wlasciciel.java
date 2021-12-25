package com.company.Head;

import java.io.Serializable;

public class Wlasciciel implements Serializable {

	private static final long serialVersionUID = 1234670990255762290L;
	private String NazwaFirmy;
	private String NIP;
	private String Prezes;
	
	
	//---------------------------------------------------
	public Wlasciciel() {
		NazwaFirmy = "nieznana";
		NIP = "nieznany";
		Prezes = "nieznany";
	}
	
	public Wlasciciel(String NazwaFirmy, String NIP, String Prezes) {
		this.NazwaFirmy = NazwaFirmy;
		this.NIP = NIP;
		this.Prezes = Prezes;
	}


	//---------------------------------------------------
	
	public String getNazwaFirmy() {
		return NazwaFirmy;
	}

	public void setNazwaFirmy(String nazwaFirmy) {
		NazwaFirmy = nazwaFirmy;
	}

	public String getNIP() {
		return NIP;
	}

	public void setNIP(String nIP) {
		NIP = nIP;
	}

	public String getPrezes() {
		return Prezes;
	}

	public void setPrezes(String prezes) {
		Prezes = prezes;
	}

	@Override
	public String toString() {
		return "NazwaFirmy: " + NazwaFirmy + "\tNIP: " + NIP + "\tPrezes: " + Prezes;
	}

}
