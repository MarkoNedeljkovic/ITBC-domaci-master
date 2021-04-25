package ucionica;

import java.util.ArrayList;

public class Laptop {
	private ArrayList<Polaznik> listaPolaznika;
	private String marka;
	
	public Laptop (String marka) {
		this.marka = marka;
		listaPolaznika = new ArrayList<Polaznik>();
	}
	
	public void setPolaznik (Polaznik p) {
		listaPolaznika.add(p);
	}
	
	public String toString() {
		String a = marka + "{" + listaPolaznika;
		return a;
	}

}
