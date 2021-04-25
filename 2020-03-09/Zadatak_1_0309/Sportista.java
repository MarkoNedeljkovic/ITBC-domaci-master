package Zadatak_1_0309;

public class Sportista {
	private String ime;
	private String prezime;
	private int godR;
	
	public Sportista(String ime, String prezime, int godR) {
		this.ime = ime;
		this.prezime = prezime;
		this.godR = godR;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getGodR() {
		return godR;
	}
	
	public String toString() {
		return ime.toUpperCase() + "_" + prezime.toUpperCase() + ": " + godR;
	}
	
	

}
