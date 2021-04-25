package Domaci1;

import java.util.Scanner;

public class Zadatak_1_0204 {

	public static void main(String[] args) {
		/*
		 * ZADATAK: Napisati program koji ce racunati povrsinu okrecene prostorije, tako
		 * sto se ivice prostorije ucitavaju preko konzole. (za pretpostavku uzeti da
		 * soba ima zidove oblika pravougaonika i nema prozore).
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Za izracunavanje povrsine okrecene prostorije unesite sledece dimenzije(m)");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		double a, b, c, zid1, zid2, zid3;

		System.out.print("Visina: ");
		a = scan.nextDouble();
		System.out.println(" ");

		System.out.print("Duzina: ");
		b = scan.nextDouble();
		System.out.println(" ");

		System.out.print("Sirina: ");
		c = scan.nextDouble();
		System.out.println(" ");

		zid1 = a * c;
		zid2 = a * b;
		zid3 = b * c;
		
		if (a>0 && b>0 && c>0 ) {
		
			System.out.println("Povrsina okrecene prostorije iznosi " + (2 * zid1 + 2 * zid2 + zid3) + "m2");
			
		}
		
		else {
			
			System.out.println("Unesite ispravne dimenzije");
			
		}

	}

}
