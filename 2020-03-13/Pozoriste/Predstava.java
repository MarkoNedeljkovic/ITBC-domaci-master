package Pozoriste;

import java.util.ArrayList;

public class Predstava {
	private String naziv;
	private Pozoriste pozoriste;
	private ArrayList<Zaposleni> zaposleni;

	public Predstava(String naziv, Pozoriste pozoriste) {
		this.naziv = naziv;
		this.pozoriste = pozoriste;
		zaposleni = new ArrayList<Zaposleni>();
	}

	public void dodajZaposlenig(Zaposleni zaposleni) {
		this.zaposleni.add(zaposleni);
	}

	public boolean ukloniZaposlenog(Zaposleni zaposleni) {
		for (int i = 0; i < this.zaposleni.size(); i++) {
			if (this.zaposleni.get(i) == zaposleni) {
				this.zaposleni.remove(zaposleni);
			}
		}

		return false;
	}

	public int brZaposlenih() {
		return zaposleni.size();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv).append(", ").append(pozoriste).append("\n");
		for (int i = 0; i < zaposleni.size(); i++) {
			sb.append(zaposleni.get(i)).append("\n");
		}
		return sb.toString();
	}

}
