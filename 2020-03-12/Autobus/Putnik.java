package Autobus;

public class Putnik extends Covek {
	private double novac;

	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public double getNovac() {
		return this.novac;
	}

	public void dodajNovac(double novac) {
		if (novac > 0) {
			this.novac += novac;
		}
	}

	public boolean oduzmiNovac(double iznos) {
		if (iznos > 0 && this.novac >= iznos) {
			novac -= iznos;
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return getImePrezime() + "[" + novac + "]";
	}

}
