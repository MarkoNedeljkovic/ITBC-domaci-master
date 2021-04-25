package Domaci4;

import java.util.Scanner;

public class Zadatak_1_0221 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije:
		 * 
		 * 0 - Izlaz iz programa 1 - dodavanje cene proizvoda na racun (ubacivanje u
		 * potrosacku korpu) 2 - naplata racuna
		 * 
		 * Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese
		 * opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
		 * na racun u prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika
		 * da unese kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost
		 * manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja
		 * racuna i da se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili
		 * jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
		 * Zatim se ponovo ispisuje meni.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int op;
		float cena, racun, kusur;
		String jos;
		jos = "";

		cena = 0;
		racun = 0;
		kusur = 0;
		op = 1;
		while (op != 0) {
			System.out.println("Molimo Vas odaberite opciju");
			System.out.println("0 - Izlaz iz programa");
			System.out.println("1 - dodavanje cene proizvoda na racun");
			System.out.println("2 - naplata racuna");
			op = sc.nextInt();

			switch (op) {
			case 0:
				System.out.println("Hvala Vam sto kupujete u nasoj prodavnici!");
				System.out.println("Kraj programa!");
				break;

			case 1:
				do {
					System.out.println("Molimo Vas upisite cenu proizvoda: ");
					cena = sc.nextFloat();
					if (cena > 0) {
						racun += cena;
					} else {
						System.out.println("Cena ne moze biti negativan broj!");
					}

					System.out.println("Da li zelite da dodate jos neki proizvod u korpu?");
					System.out.println("Za vracanje na pocetni ekran upisite STOP, za nastavak bio koje dugme");
					jos = sc.next();
					if (jos.toUpperCase().equals("STOP")) {
						System.out.println("Vas racun iznosi " + racun + " dinara");
						System.out.println("---------------------------------------------------");
					}

				} while (!jos.toUpperCase().equals("STOP"));

				break;

			case 2:
				System.out.println("Vas racun iznosi " + racun + " dinara");
				if (racun == 0) {
					System.out.println("Molimo Vas da se vratite na opciju 1 i upisete cene proizvoda");
					System.out.println("--------------------------------------------------------------");
					break;
				}
				System.out.println("Molimo Vas unesite iznos za uplatu: ");
				cena = sc.nextFloat();
				while (cena < 0 || cena < racun) {
					if (cena < 0) {
						System.out.println("Uplata ne moze biti negativan broj!");
						System.out.println("Vas racun iznosi " + racun + " dinara");
						System.out.println("---------------------------------------------------");
						System.out.println("Molimo Vas unesite iznos za uplatu: ");
						cena = sc.nextFloat();
					}
					if (cena < racun) {
						System.out.println("Uplata ne moze biti manja od racuna!");
						System.out.println("Vas racun iznosi " + racun + " dinara");
						System.out.println("---------------------------------------------------");
						System.out.println("Molimo Vas unesite iznos za uplatu: ");
						cena = sc.nextFloat();
					}
				}
				kusur = cena - racun;
				if (kusur > 0) {
					System.out.println("Vas kusur je " + kusur + " dinara");
					System.out.println("---------------------------------------------------");
				}
				racun = 0;
				break;

			default:
				System.out.println("Pogresan unos");
				break;

			}

		}
		// System.out.println("Neispravan unos!");
		// System.out.println("Molimo Vas unesite Da ili Ne!");

	}

}
