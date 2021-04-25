package Domaci3;

public class Zadatak_3_0220 {

	public static void main(String[] args) {
		/*
		 * Napisati 8 primera za post inkrementu (i++), pre inkrementu (++i), post
		 * dekrementu (i--) i pre dekrementu (--i) i u programu u komentarima opisati
		 * kako koji primer funkcionise. Napisati po 2 primera o svakom, koristeci
		 * promenljive a, b, c koje su i deklarisane i definisane (kao sto smo na tabli
		 * vezbali na casu)
		 * 
		 */

		int a, b, c;

		a = 5;
		b = 10;
		c = 15;

		c = a++ + b++;
		/*
		 * U ovom primeru se prvo uzima vrednost a(a=5), zatim se a uvecava(a=6), onda
		 * se uzima vrednos b(b=10), i sabira se sa prvom vrednosti a(a=5), i onda se b
		 * uvecava(b=11). Tako da na kraju imamo sledece vrednosti: a = 6; b = 11; c =
		 * 15;
		 */

		c = a++ + b++ - a++ + b++;
		/*
		 * U ovom primeru se prvo uzima vrednost a(a=5), zatim se a uvecava(a=6), onda
		 * se uzima vrednos b(b=10), i sabira se sa prvom vrednosti a(a=5), i onda se b
		 * uvecava(b=11), uzima se nova vrednost a(a=6) i oduzima se od zbira koji smo
		 * dobili i zatim se uvecava(a=7), nova vrednost b(b=11) se dodaje i zatim se
		 * uvecava(b=12) 
		 * Tako da na kraju imamo sledece vrednosti: a = 7; b = 12; c =20;
		 */
		
		
		c = ++a + ++b;
		/*
		 * c = ++a + ++b; => c = 6 + ++b; => c = 6 + 11; => c = 17;
		 */
		
		c = ++a + ++b - ++a + ++b;
		
		/*
		 * c = ++a + ++b - ++a + ++b; => c = 6 + ++b - ++a + ++b; => c = 6 + 11 - ++a + ++b; => c = 17 - 7 + ++b; =>
		 * c = 10 + 12; => c = 22
		 */
		
		c = a-- + b--;
		/*
		 * c = a-- + b--;  => c = 5 + 10;
		 * Tako da na kraju imamo sledece vrednosti: a = 4; b = 9; c =15;
		 */
		
		c = a-- + b-- - a-- + b--;
		
		/*
		 * c = a++ + b++ - a++ + b++; => c = 5 + 10 - 4 + 9;
		 * Tako da na kraju imamo sledece vrednosti: a = 3; b = 8; c =20;
		 */
		
		c = --a + --b;
		
		/*
		 * c = --a + --b; => c = 4 + 9;
		 * Tako da na kraju imamo sledece vrednosti: a = 4; b = 9; c =20;
		 */
		
		c = --a + --b - --a + --b;
		
		/*
		 * c = --a + --b - --a + --b; => c = 4 + 9 - 3 + 8;
		 * Tako da na kraju imamo sledece vrednosti: a = 3; b = 8; c =18;
		 */
		
		/*
		 * Izvinjavam se sto kasnim sa dostavom zadatka.
		 * Ovaj sam ostavio za karaj kao najlaksi al se oduzilo pisanje.
		 */

	}

}
