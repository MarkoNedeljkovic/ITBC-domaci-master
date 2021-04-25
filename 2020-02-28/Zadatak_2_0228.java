package Domaci6;

import java.util.Scanner;

public class Zadatak_2_0228 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		 * redosledom.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//Trazimo od korisnika da unese duzinu niza
		System.out.println("Molimo Vas unesite duzinu niza:");
		int br = sc.nextInt();
		
		//Trazimo od korisnika da unese elemente niza
		int [] niz = new int [br];
		
		for (int i = 0;i<niz.length;i++) {
			System.out.println("Molimo Vas unesite " + (i+1) + ". element niza:");
			niz[i] = sc.nextInt();
		}
		
		//Ispisujemo niz inverznim redoslednom
		System.out.println("Elementi niza ispisani inverznim redosledom: ");
		for (;br>0;br--) {
			System.out.print(niz[br-1] + " ");
		}

	}

}
