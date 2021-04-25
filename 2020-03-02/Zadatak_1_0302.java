package Domaci7;

import java.util.Scanner;

public class Zadatak_1_0302 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je
		 * palindrom” ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije
		 * palindrom). Korisnik unosi int [ ]
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Proverimo da li je niz palindrom!");

		// Trazimo od korisnika da unese duzinu niza
		// Niz ne moze biti negativan broj
		int d = 0;
		do {
			System.out.println("Molimo Vas unesite duzinu niza:");
			d = sc.nextInt();
		} while (d <= 0);

		// Trazimo od korisnika da unese elemente niza
		int[] niz = new int[d];
		System.out.println("Molimo Vas unesite elemente niza:");

		for (int i = 0; i < d; i++) {
			niz[i] = sc.nextInt();
		}
		// Proveravamo da li je niz palindrom
		System.out.println("Da li je niz palindrom?");
		Boolean t = false; // Boolean koristim da
		for (int i = 0; i < d; i++) {
			if (niz[i] != niz[d - i - 1]) {
				t = false;
				break;
			} else {
				t = true;
			}
		}
		// Ispisujemo da li je niz zaista palindrom
		if (t == true) {
			System.out.println("Uneti niz je palindrom!");
		} else {
			System.out.println("Uneti niz nije palindrom!");
		}

	}

}
