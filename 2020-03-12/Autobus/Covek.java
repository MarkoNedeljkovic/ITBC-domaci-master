package Autobus;

public class Covek {
	private String ime;
	private String prezime;

	public Covek(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getImePrezime() {
		return ime + " " + prezime;
	}

}
