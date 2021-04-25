package Dete;

public class Dete {
	private String ime;
	private String prezime;
	private double god;
	private int brKlikera;
	private static int ukBrKlikera=0;
	private static int brDece=0;
	private static double ukBrGodina=0;
	
	public Dete(String ime, String prezime, double god, int brKlikera) {
		this.ime = ime;
		this.prezime = prezime;
		this.god = god;
		this.brKlikera = brKlikera;
		ukBrKlikera += brKlikera;
		ukBrGodina += god;
		brDece++;
	}
	
	public void dodajKlikere (int klikeri) {
		if (klikeri>0) {
			brKlikera += klikeri;
			ukBrKlikera += klikeri;
		}
	}
	
	public void oduzmiKlikere (int klikeri) {
		if (klikeri > 0 && brKlikera>= klikeri) {
			brKlikera -= klikeri;
			ukBrKlikera -= klikeri;
		}
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public double getGod() {
		return god;
	}

	public int getBrKlikera() {
		return brKlikera;
	}

	public static int UkBrKlikera() {
		return ukBrKlikera;
	}
	
	public static double prosekGod() {
		double s= ukBrGodina / brDece;
		return s;
	}
	
	
	
	
}
