package Domaci3;

import java.util.Scanner;

public class Zadatak_2_0220 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
		 * unese 1 2 5 3 -1, program treba da ispise 11
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		float br, zbir;
		br = 1;
		zbir = 0;
		while (br > 0) {
			System.out.println("Molim Vas unesite neki broj:");
			br = sc.nextFloat();
			if (br > 0) {
				zbir += br;
			}
		}
		System.out.println("Zbir brojeva je: " + zbir);

	}

}
