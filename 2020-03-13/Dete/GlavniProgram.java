package Dete;

public class GlavniProgram {

	public static void main(String[] args) {
		Dete d1 = new Dete("Ime1", "Prezime1", 3, 10);
		Dete d2 = new Dete("Ime2", "Prezime2", 4, 10);
		Dete d3 = new Dete("Ime3", "Prezime3", 5, 10);
		
		System.out.println(Dete.prosekGod());
		System.out.println(Dete.UkBrKlikera());

	}

}
