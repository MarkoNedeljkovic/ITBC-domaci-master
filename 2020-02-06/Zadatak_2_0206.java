package Domaci2;

import java.util.Scanner;

public class Zadatak_2_0206 {
	public static void main(String[] args) {
		
		/*
		 ZADATAK: Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima meseci u godini 
		 koji pocinju na to slovo (na taj glas) - za resavanje ovog zadatka koristiti switch
		 */

		Scanner scan = new Scanner(System.in);

		boolean kraj = false;

		System.out.println("Koliko ima meseci u godini koji pocinju na pocetno slovo unetog meseca?");
		System.out.println(" ");

		while (kraj == false) {
			System.out.println("Unesite W za izlaz");
			System.out.print("Unesite ime meseca: ");
			String mesec = scan.next();
			System.out.println(" ");

			char s, s1;

			s = mesec.charAt(0);

			s1 = Character.toUpperCase(s);

			switch (s1) {

			case 'J':
				System.out.println("Na slovo J pocinju imena 3 meseca");
				System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
				System.out.println(" ");
				break;

			case 'F':
				System.out.println("Na slovo F pocinje ime 1 meseca");
				System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  ");
				System.out.println(" ");
				break;

			case 'M':
				System.out.println("Na slovo M pocinju imena 2 meseca");
				System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
				System.out.println(" ");
				break;

			case 'A':
				System.out.println("Na slovo A pocinju imena 2 meseca");
				System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
				System.out.println(" ");
				break;

			case 'S':
				System.out.println("Na slovo S pocinje ime 1 meseca");
				System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  ");
				System.out.println(" ");
				break;

			case 'O':
				System.out.println("Na slovo O pocinje ime 1 meseca");
				System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  ");
				System.out.println(" ");
				break;

			case 'N':
				System.out.println("Na slovo N pocinje ime 1 meseca");
				System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  ");
				System.out.println(" ");
				break;

			case 'D':
				System.out.println("Na slovo D pocinje ime 1 meseca");
				System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  ");
				System.out.println(" ");
				break;

			case 'W':
				System.out.println("Kraj programa!");
				System.out.println("_ _ _ _ _ _ _ ");
				kraj = true;
				break;

			default:
				System.out.println("Ne postoji mesec koji pocinje sa slovom " + s1 + "!");
				System.out.println("Pokusajte ponovo");
				System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
				System.out.println(" ");
				break;

			}

		}

	}

}
