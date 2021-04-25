package Domaci8;

import java.util.Scanner;

public class Zadatak_1_0305 {

	public static int duzinaNiza() {
		// Trazimo od korisnika da unese duzinu niza
		// Niz ne moze biti negativan broj
		Scanner sc = new Scanner(System.in);
		int d = 0;
		do {
			System.out.println("Molimo Vas unesite duzinu niza:");
			d = sc.nextInt();
			if (d <= 0) {
				System.out.println("Duzina niza ne moze biti manja ili jednaka 0!");
			}
		} while (d <= 0);
		return d;
	}

	public static int[] elementiNiza(int d) {
		// Trazimo od korisnika da unese elemente niza
		Scanner sc = new Scanner(System.in);
		int[] niz = new int[d];
		System.out.println("Molimo Vas unesite elemente niza:");

		for (int i = 0; i < d; i++) {
			niz[i] = sc.nextInt();
		}
		return niz;
	}

	public static Boolean palindrom(int[] niz) {
		// Proveravamo da li je niz palindrom
		System.out.println("Da li je niz palindrom?");
		Boolean t = false;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] != niz[niz.length - i - 1]) {
				t = false;
				break;
			} else {
				t = true;
			}
		}
		return t;
	}

	public static void jesteNije(Boolean t) {
		// Ispisujemo da li je niz zaista palindrom
		if (t == true) {
			System.out.println("Uneti niz jeste palindrom!");
		} else {
			System.out.println("Uneti niz nije palindrom!");
		}
	}

	public static void main(String[] args) {
		/*
		 * Domaci zadatak od utorka “da li je niz celih brojeva palindrom ili nije”
		 * uradi koristeci metode.
		 */

		System.out.println("Proverimo da li je niz palindrom!");

		int d = duzinaNiza();

		int[] niz = elementiNiza(d);

		Boolean t = palindrom(niz);
		
		jesteNije(t);

	}

}
