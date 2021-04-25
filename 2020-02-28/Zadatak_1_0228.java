package Domaci6;

import java.util.Scanner;

public class Zadatak_1_0228 {

	public static void main(String[] args) {
		/*
		 * Korisnik ucitava niz od n elemenata niza, kao i neki broj br. Program
		 * ispisuje elemente niza deljive brojem br.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int dNiza, br;
		
		//Trazimo od korisnika da unese duzinu niza
		System.out.println("Molimo Vas unesite duzinu niza:");
		dNiza = sc.nextInt();
		
		int [] niz = new int [dNiza];
		
		//Trazimo od korisnika da unese elemente niza
		
		for (int i = 0;i<niz.length;i++) {
			System.out.println("Molimo Vas unesite " + (i+1) + ". element niza:");
			niz[i] = sc.nextInt();
		}
		
		//Trazimo od korisnika da unese broj sa kojim ce se elementi niza deliti
		
		System.out.println("Molimo Vas unesite broj sa kojim ce se elementi niza deliti:");
		br = sc.nextInt();
		
		//Ispisujemo elemente niza deljive sa br
		System.out.println("Elementi niza deljivi sa " + br + " su: ");
		for (int i = 0;i<niz.length;i++) {
			if (niz[i]%br==0) {
				System.out.print(niz[i] + " ");
			}
		}
	

	}

}
