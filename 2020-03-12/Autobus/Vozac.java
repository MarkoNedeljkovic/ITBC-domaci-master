package Autobus;

public class Vozac extends Covek {

	private String zvanje;

	public Vozac(String ime, String prezime) {
		super(ime, prezime);
		this.zvanje = "sofer";
	}

	@Override
	public String toString() {
		return getImePrezime() + " - " + zvanje;
	}

}
