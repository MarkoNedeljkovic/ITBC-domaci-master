package Zadatak_1_0306;

public class Sportista {
	private String imeIprezime;
	private String sport;
	private String klub;
	private int broj;
	
	public Sportista() {
		
	}
	
	public Sportista (String ime, String sp, String kl, int br) {
		imeIprezime = ime;
		sport = sp;
		klub = kl;
		broj=br;
	}
	
	public void dohvatiIme() {
		System.out.print(imeIprezime);
	}
	public void dohvatiSport() {
		System.out.print(sport);
	}
	public void postaviKlub(String k) {
		klub = k;
		System.out.println(imeIprezime + " od sada igra u " + klub);
	}
	public void dohvatiKlub() {
		System.out.print(klub);
	}
	public void dohvatiBroj() {
		System.out.print(broj);
	}
	public void postaviBroj(int br) {
		broj = br;
		System.out.println(imeIprezime + " od sada nosi dres broj " + broj);
		
	}


}

