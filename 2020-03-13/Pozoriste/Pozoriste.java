package Pozoriste;

public class Pozoriste {
	private String naziv;
	private static int id = 0;

	public Pozoriste(String naziv) {
		this.naziv = naziv;
		id++;
	}

	public String toString() {
		return naziv + "[" + id + "]";
	}

}
