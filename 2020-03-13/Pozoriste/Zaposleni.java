package Pozoriste;

public class Zaposleni {
	private String imePrezime;
	private Pozoriste pozoriste;

	public Zaposleni(String ime, Pozoriste pozoriste) {
		imePrezime = ime;
		this.pozoriste = pozoriste;
	}

	public String getImePozoriste() {
		return imePrezime + "[" + pozoriste + "]";
	}

}
