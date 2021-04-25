package Domaci3;

import java.util.Scanner;

public class Zadatak_1_0220 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		 * od 0 do n - za resavanje ovog zadatka koristiti samo jednu petlju (ne jednu
		 * vrstu petlje, vec samo jednu petlju). // podrazumeva se da se n ucitava preko
		 * standardnog ulaza
		 */

		Scanner sc = new Scanner(System.in);
		int n, suma, proizvod;
		System.out.println("Molim Vas unesite broj:");
		n = sc.nextInt();
		suma = 0;
		proizvod = 1;
		for (; n > 0; n--) {
			if (n % 2 == 0) {
				suma += n;
			} else {
				proizvod = proizvod * n;
			}

		}
		System.out.println("Suma parnih brojeva je " + suma + ", a proizvod neparnih brojeva je " + proizvod);

	}

}
