package Domaci8;

import java.util.Scanner;

public class Zadatak_2_0305 {

	public static void main(String[] args) {
		/*
		 * Na sahovskoj tabli je red obelezen brojevima 1 2 3 4 5 6 7 8 i kolona takodje
		 * brojevima 1 2 3 4 5 6 7 8. Na tabli stoje beli pion i crni skakac. Beli pion
		 * pocinje sa dna table a crni skakac sa vrha. Korisnik prvo unosi poziciju
		 * piona kao dva cela broja, a zatim poziciju skakaca, gde prvi broj predstavlja
		 * red, a drugi kolonu. Program treba da ispise da li se figure nalaze u
		 * poziciji da je skakac napadnut.
		 */

		Scanner sc = new Scanner(System.in);
		// Dimenzija table 8x8
		int d = 8;

		// Korisnik unosi poziciju piona
		int p1, p2, s1, s2;
		do {
			System.out.println("Unesite poziciju piona:");
			p1 = sc.nextInt();
			p2 = sc.nextInt();
			if (p1 > d || p2 > d) {
				System.out.println("Tabla je dimenzija " + d + " x " + d + " polja");
				System.out.println("Unesite odgovarajucu poziciju na tabli");
			}
			if (p1 <= 0 || p2 <= 0) {
				System.out.println("Pozicije na tabli ne mogu biti manje ili jednake 0!");
			}
		} while (p1 > d || p2 > d || p1 <= 0 || p2 <= 0);

		// Korisnik unosi poziciju skakaca
		do {
			do {
				System.out.println("Unesite poziciju skakaca:");
				s1 = sc.nextInt();
				s2 = sc.nextInt();
				if (s1 > d || s2 > d) {
					System.out.println("Tabla je dimenzija " + d + " x " + d + " polja");
					System.out.println("Unesite odgovarajucu poziciju na tabli");
				}
				if (s1 <= 0 || s2 <= 0) {
					System.out.println("Pozicije na tabli ne mogu biti manje ili jednake 0!");
				}
			} while (s1 > d || s2 > d || s1 <= 0 || s2 <= 0);

			// Skakac ne moze da stoji na istom polju kao pion
			if (p1 == s1 && p2 == s2) {
				System.out.println("Skakac ne moze da stoji na ovom polju!");
				System.out.println("Polje je vec zauzeo pion");
			}
		} while (p1 == s1 && p2 == s2);

		p1 -= 1;
		p2 -= 1;

		s1 -= 1;
		s2 -= 1;

		Boolean[][] pniz = new Boolean[d][d];

		pniz[p1][p2] = true;

		for (int i = 0; i < pniz.length; i++) {
			if (i == p1 - 1 || i == p1 || i == p1 + 1) {
				for (int j = 0; j < pniz.length; j++) {
					if (j == p2 - 1 || j == p2 || j == p2 + 1) {
						pniz[i][j] = true;
					} else {
						pniz[i][j] = false;
					}
				}
			} else {
				for (int j = 0; j < pniz.length; j++) {
					if (j == p2 - 1 || j == p2 || j == p2 + 1) {
						pniz[i][j] = false;
					} else {
						pniz[i][j] = false;
					}
				}
			}
		}

		if (pniz[s1][s2] == true) {
			System.out.println("Skakac je napadnut!");
		} else {
			System.out.println("Skakac nije napadnut!");
		}

	}

}
