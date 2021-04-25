package Domaci4;

public class Zadatak_2_0221 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce prebrojati koliko je brojeva od 9 do 250
		 * (ukljucujuci i njih) deljivih brojem 3.
		 */
		int i, n, rezultat;
		rezultat = 0;
		for (i = 9, n = 250; i <= n; i++) {
			if (i % 3 == 0) {
				rezultat++;
			}

		}
		System.out
				.println("Brojeva deljivih sa brojem 3 od 9 do 250 (ukljucujuci i njih) ukupno ima " + rezultat + ".");

	}

}
