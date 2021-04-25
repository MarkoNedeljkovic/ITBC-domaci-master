package Zadatak_1_0309;

public class Klub {
	private String naziv;
	private String sediste;
	private int godO;
	private Sportista[] nizS;
	private int plz;
	
	public Klub(String naziv, String sediste, int godO) {
		this.naziv = naziv;
		this.sediste = sediste;
		this.godO = godO;
		nizS = new Sportista [5];
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public String getSediste() {
		return sediste;
	}
	
	public int getGod() {
		return godO;
	}
	
	public String toString() {
		String a = naziv + " " + sediste + " " + godO;
		return a;
	}
	
	public void setNizS (Sportista sportista) {
		nizS[plz] = sportista;
		plz++;
	}
	
	public void getNizS () {
		for (int i = 0;i<plz;i++) {
			
		}
		
	}
	
	
	

}
