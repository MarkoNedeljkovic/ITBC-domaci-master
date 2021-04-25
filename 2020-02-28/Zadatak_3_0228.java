package Domaci6;

import java.util.Scanner;

public class Zadatak_3_0228 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		 * rastuci.
		 */

		Scanner sc = new Scanner(System.in);

		// Trazimo od korisnika da unese duzinu niza
		System.out.println("Molimo Vas unesite duzinu niza:");
		int br = sc.nextInt();

		// Trazimo od korisnika da unese elemente niza
		int[] niz = new int[br];

		for (int i = 0; i < niz.length; i++) {
			System.out.println("Molimo Vas unesite " + (i + 1) + ". element niza:");
			niz[i] = sc.nextInt();
		}
		
		//Proveravamno da li je niz rastuci
		Boolean rastuciNiz = false;
		
		for (int i = 0; i < (niz.length-1); i++) {
			if (niz[i]<niz[i+1]) {
				rastuciNiz = true;
			}
			else {
				rastuciNiz = false;
				break;
			}	
		}
		if (rastuciNiz == false) {
			System.out.println("Niz nije rastuci");
		}
		else {
			System.out.println("Niz je rastuci");
		}

	}

}
