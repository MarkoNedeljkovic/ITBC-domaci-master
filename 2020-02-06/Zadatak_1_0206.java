package Domaci2;

import java.util.Scanner;

public class Zadatak_1_0206 {

	public static void main(String[] args) {
		
		/*
		 ZADATAK: U zgradi se nalazi lift nosivosti 680kg. Napisati program koji proverava da li ce lift
		 bezbedno krenuti u zavisnosti od tezine koju treba da ponese. Podrazumevane 3 opcije:
		 Lift je preopterecen; Na granici je; Lift je pokrenut (zahtevi zadatka namerno nisu dalje
		 razradjivani jer 1) ostavljamo vasoj masti na volju 2) zelim da budem upucena u vas tok
		 razmisljanja).
		 */
		
		Scanner scan=new Scanner (System.in);
		
		float nosivost, opterecenje;
		
		nosivost = 680;
		
		opterecenje = 0;
		
		while (opterecenje != 5000) {
		
		System.out.println("Unesite '5000' za kraj programa");
		System.out.println("Unesite opterecenje lifta: ");
		opterecenje = scan.nextFloat();
		
		
			if (opterecenje == 5000) {
				break;
				
			}
			
			if (opterecenje < 0) {
				
				System.out.println("Opterecenje lifta ne moze biti negativan broj!");
				System.out.println("Molim Vas unesite ponovo");
				System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
				continue;
			}
			else {
				if (opterecenje == 0) {

					System.out.println("Lift moze bezbedno da krene, ali je prazan!");
					System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
					continue;
				}
				
				if (nosivost > opterecenje) {

					System.out.println("Lift moze bezbedno da krene!");
					System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _");
					continue;
				}
				

				if (nosivost < opterecenje) {

					System.out.println("Lift je preopterecen i nije bezbedan!");
					System.out.println("Molimo Vas da rasteretite lift ispod " + nosivost + "kg");
					System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
					continue;

				} else {
					System.out.println("Lift je na granici nosivosti!");
					System.out.println("Molimo Vas da malo rasteretite lift!");
					System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
					continue;

				}

			}
			
			
		}
		
		System.out.println("Kraj programa!");
		
		
		
		
		
	}

}
