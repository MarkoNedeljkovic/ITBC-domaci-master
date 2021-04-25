package Zadatak_1_0306;

import java.util.Scanner;

public class GlavniProgram {

	public static void main(String[] args) {
		/*
		 * Napisati klasu Sportista. Sportista ima 1) ime i prezime (polje tipa String)
		 * koje moze da se dohvati, ali ne i postavi 2) sport kojim se bavi (polje tipa
		 * String) koje moze da se dohvati ali ne i postavi 3) klub za koji igra (polje
		 * tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji
		 * igra. 4) broj koji nosi na dresu (neka u ovom zadatku bude tipa int) koje
		 * moze i da se dohvati i da se postavi.
		 * 
		 * Napisati glavni program koji kreira tri igraca. U glavnom programu
		 * iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi
		 * Sportista.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		//Pravimo objekte za tri 
		Sportista s1 = new Sportista();
		Sportista s2 = new Sportista();
		Sportista s3 = new Sportista();

		int opcija = 1;

		while (opcija != 0) {
			System.out.println("*************************************");
			System.out.println("Za kreiranje prvog igraca ukucajte 1 ");
			System.out.println("-za kreiranje drugog igraca ukucajte 2");
			System.out.println("-za kreiranje treceg igraca ukucajte 3");
			System.out.println("-za izmenu kluba ukucajte 4");
			System.out.println("-za izmenu broja na dresu ukucajte 5");
			System.out.println("-za prikaz imena igraca ukucajte 6");
			System.out.println("-za prikaz sporta kojim se igraci bave ukucajte 7");
			System.out.println("-za izlaz ukucajte 0");
			System.out.println("Unesite opciju: ");
			opcija = sc.nextInt();
			switch (opcija) {
			case 1:
				System.out.println("Unesite: ime i prezime igraca");
				sc.nextLine();
				String s1Ime = sc.nextLine();
				System.out.println("sport kojim se bavi");
				String s1Sport = sc.nextLine();
				System.out.println("klub za koji igra");
				String s1Klub = sc.nextLine();
				System.out.println("broj na dresu");
				int s1Broj = sc.nextInt();
				s1 = new Sportista(s1Ime, s1Sport, s1Klub, s1Broj);
				break;
			case 2:
				System.out.println("Unesite: ime i prezime igraca");
				sc.nextLine();
				String s2Ime = sc.nextLine();
				System.out.println("sport kojim se bavi");
				String s2Sport = sc.nextLine();
				System.out.println("klub za koji igra");
				String s2Klub = sc.nextLine();
				System.out.println("broj na dresu");
				int s2Broj = sc.nextInt();
				s2 = new Sportista(s2Ime, s2Sport, s2Klub, s2Broj);
				break;
			case 3:
				System.out.println("Unesite: ime i prezime igraca");
				sc.nextLine();
				String s3Ime = sc.nextLine();
				System.out.println("sport kojim se bavi");
				String s3Sport = sc.nextLine();
				System.out.println("klub za koji igra");
				String s3Klub = sc.nextLine();
				System.out.println("broj na dresu");
				int s3Broj = sc.nextInt();
				s3 = new Sportista(s3Ime, s3Sport, s3Klub, s3Broj);
				break;
			case 4:
				System.out.println("Koji od sportista menja klub?");
				System.out.print("Za ");
				s1.dohvatiIme();
				System.out.println(" ukucajte 1");
				System.out.print("Za ");
				s2.dohvatiIme();
				System.out.println(" ukucajte 2");
				System.out.print("Za ");
				s3.dohvatiIme();
				System.out.println(" ukucajte 3");
				int opKlub = sc.nextInt();
				sc.nextLine();
				switch (opKlub) {
				case 1:
					System.out.println("Unesite ime novog kluba:");
					s1.postaviKlub(sc.nextLine());
					break;
				case 2:
					System.out.println("Unesite ime novog kluba:");
					s2.postaviKlub(sc.nextLine());
					break;
				case 3:
					System.out.println("Unesite ime novog kluba:");
					s3.postaviKlub(sc.nextLine());
					break;
				}

				break;
			case 5:
				System.out.println("Koji od sportista menja broj na dresu?");
				System.out.print("Za ");
				s1.dohvatiIme();
				System.out.println(" ukucajte 1");
				
				System.out.print("Za ");
				s2.dohvatiIme();
				System.out.println(" ukucajte 2");
				
				System.out.print("Za ");
				s3.dohvatiIme();
				System.out.println(" ukucajte 3");
				
				int opDres = sc.nextInt();
				sc.nextInt();
				switch (opDres) {
				case 1:
					System.out.println("Unesite novi broj dresa:");
					s1.postaviKlub(sc.nextLine());
					break;
				case 2:
					System.out.println("Unesite novi broj dresa:");
					s2.postaviKlub(sc.nextLine());
					break;
				case 3:
					System.out.println("Unesite novi broj dresa:");
					s3.postaviKlub(sc.nextLine());
					break;
				}

				break;
			case 6:
				System.out.println("Provera imena:");
				System.out.print("Ime prvog igraca je ");
				s1.dohvatiIme();
				System.out.println();

				System.out.print("Ime drugog igraca je ");
				s2.dohvatiIme();
				System.out.println();

				System.out.print("Ime treceg igraca je ");
				s3.dohvatiIme();
				System.out.println();
				break;
			case 7:
				System.out.println("Provera sporta kojim se igraci bave:");
				s1.dohvatiIme();
				System.out.print(" se bavi ");
				s1.dohvatiSport();
				System.out.println();

				s2.dohvatiIme();
				System.out.print(" se bavi ");
				s2.dohvatiSport();
				System.out.println();

				s3.dohvatiIme();
				System.out.print(" se bavi ");
				s3.dohvatiSport();
				System.out.println();
				break;
			case 0:
				System.out.println("Kraj programa!");
				break;
			default:
				System.out.println("Pogresan unos!");
			}
		}

	}

}
