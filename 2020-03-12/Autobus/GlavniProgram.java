package Autobus;

public class GlavniProgram {

	public static void main(String[] args) {
		
		Vozac v1 = new Vozac("Pera", "Peric");
		Vozac v2 = new Vozac("Neki", "Vozac");
		
		System.out.println(v1);
		
		Putnik p1 = new Putnik("Ime1", "Prezime1", 1000);
		System.out.println(p1);
		
		Putnik p2 = new Putnik("Ime2", "Prezime2", 0);
		System.out.println(p2);
		
		Putnik p3 = new Putnik("Ime3", "Prezime3", 0);
		System.out.println(p3);
		p3.dodajNovac(500);
		System.out.println(p3);
		
		Autobus a1 = new Autobus("Autobus 1", 200);
		
		
		a1.dodajVozaca(v1);
		
		//System.out.println(a1.getVozac());
		
		a1.dodajPutnika(p1);
		a1.dodajPutnika(p2);
		a1.dodajPutnika(p3);
		
		a1.naplatiKartu();
		
		//System.out.println(a1.listaPutnika);
		
		System.out.println(a1);

	}

}
