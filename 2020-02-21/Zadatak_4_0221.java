package Domaci4;

import java.util.Scanner;

public class Zadatak_4_0221 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce ispisati n brojeva Fibonacijevog niza. (Na internetu
		 * istraziti sta je Fibonacijev niz!!!)
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		int broj, a, b;
		String ulaz, greska;
		ulaz = "Unesite ceo broj(0 za kraj): ";
		greska = "Broj ne moze biti manji od 0";
		System.out.println(ulaz);
		broj = sc.nextInt();
		while (broj != 0) {
			if (broj < 0) {
				System.out.println(greska);
				System.out.println(ulaz);
				broj = sc.nextInt();
				continue;
			} else {
				a = 1;
				b = 1;
				System.out.println("Fibonacijev niz za " + broj + " ponavljanja je: ");
				System.out.println(a);
				System.out.println(b);

				while (broj != 0) {
					a = a + b;
					b = a - b;
					System.out.println(a);
					broj -= 1;
				}
			}
			System.out.println(ulaz);
			broj = sc.nextInt();
		}

		System.out.println("Kraj programa!");

	}

}
