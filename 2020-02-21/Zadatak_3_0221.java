package Domaci4;

import java.util.Scanner;

public class Zadatak_3_0221 {
	public static void main(String[] args) {
		/*
		 * Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		 * Primer: ulaz m=3, n=7; Izlaz (vidljivo u konzoli) Hint: koristiti dve for
		 * petlje; 
		 */
		
		Scanner sc = new Scanner(System.in);
		int m,n;
		System.out.println("Nacrtajmo pravougaonik ili kvadrat, koristeci *");
		System.out.println("Unesite broj redova: ");
		m=sc.nextInt();
		while (m <= 0 ) {
			System.out.println("Broj redova ne moze biti manji od 1");
			System.out.println("Unesite broj redova: ");
			m=sc.nextInt();
		}
	
		System.out.println("Unesite broj kolona: ");
		n=sc.nextInt();
		while (n <= 0 ) {
			System.out.println("Broj kolona ne moze biti manji od 1");
			System.out.println("Unesite broj kolona: ");
			n=sc.nextInt();
		}
		System.out.println();
		
		
		for (int i=0;m>i;i++) {
			for(int j=0;n>j;j++) {
				System.out.print("* ");
			}
			System.out.println("");
			
		}
		

	}

}
