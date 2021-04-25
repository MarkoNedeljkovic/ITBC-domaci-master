package Pozoriste;

public class Glumac extends Zaposleni {
	private String uloga;
	
	public Glumac(String ime, Pozoriste pozoriste, String uloga) {
		super(ime, pozoriste);
		this.uloga = uloga;
	}


	public String toString() {
		return uloga + "_" + getImePozoriste();
	}
	
	

}
