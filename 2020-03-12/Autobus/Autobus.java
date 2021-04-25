package Autobus;

import java.util.ArrayList;

public class Autobus {
	private String naziv;
	private Vozac vozac;
	private double cena;
	public ArrayList<Putnik> listaPutnika;

	public Autobus(String naziv, double cena) {
		this.naziv = naziv;
		this.cena = cena;
		listaPutnika = new ArrayList<Putnik>();
	}

	public String getNaziv() {
		return naziv;
	}

	public double getCena() {
		return cena;
	}

	public Vozac getVozac() {
		return vozac;
	}

	public boolean dodajVozaca(Vozac vozac) {
		if (this.vozac == null) {
			this.vozac = vozac;
			return true;
		} else {
			return false;
		}
	}

	public boolean oduzmiVozaca() {
		if (this.vozac != null) {
			this.vozac = null;
			return true;
		} else {
			return false;
		}

	}

	public void dodajPutnika(Putnik putnik) {
		listaPutnika.add(putnik);
	/*	for (int i = 0; i < listaPutnika.size(); i++) {
			if (listaPutnika.get(i) == putnik) {
				break;
			}
			listaPutnika.add(i, putnik);
		}
*/
	}

	public boolean ukloniPutnika(Putnik putnik) {
		for (int i = 0; i < listaPutnika.size(); i++) {
			if (listaPutnika.get(i) == putnik) {
				listaPutnika.remove(putnik);
			}
		}

		return false;

	}

	public boolean naplatiKartu() {
		if (vozac != null) {
			for (int i = 0; i < listaPutnika.size(); i++) {
				if (listaPutnika.get(i).oduzmiNovac(this.cena) == true) {
				} else {
					ukloniPutnika(listaPutnika.get(i));
					i--;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(vozac).append(" - ");
		for (int i = 0; i < listaPutnika.size(); i++) {
			sb.append(listaPutnika.get(i)).append(", ");
		}
		return sb.toString();
	}

}
