package Domaci7;

import java.util.Scanner;

public class Zadatak_2_0302 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata
		 * niza koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)
		 */

		Scanner sc = new Scanner(System.in);

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

		int proizvod = 1;
		int brojac = 0;
		//Proveravamo da li su elementi niza veci od svog indeksa
		for (int i = 0; i < d; i++) {
			if (niz[i] > i) {
				proizvod *= niz[i];
			} else {
				brojac++;
			}
		}
		if (brojac == d) {
			System.out.println("Svi elementi su bili manji od svog indeksa!");
		} else {
			System.out.println("Proizvod elemenata niza koji su veci od svog indeksa je: " + proizvod);
		}
	}

}
