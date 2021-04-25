package Domaci5;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_1_0227 {

	public static void main(String[] args) {
		/*
		 * Pomocu jave i seleniuma 1) Otvoriti novi prozor u pretrazivacu i otici na IT
		 * Bootcamp 2) Primeniti metode koje smo vezbali na casu (get URL i Title,
		 * navigate - refresh, to, back, forward) 3) U kodu treba da se prozor
		 * maksimizuje, a pre zatvaranja drajvera vrati na prvobitnu velicinu (hint:
		 * koristite smernice okruzenja, ako to ne pomaze, guglajte
		 */
		System.setProperty("webdrivre.chrom.driver", "chromedriver.exe");

		WebDriver wd = new ChromeDriver();

		// pokrece se pretrazivac i otvara stranica IT Bootcamp

		wd.get("https://itbootcamp.rs/");

		//Metode koje smo vezbali
		
		//title
		
		String title = wd.getTitle();
		
		//refresh
		
		wd.navigate().refresh();
		
		//to
		
		wd.navigate().to("https://www.google.rs/");
		
		//back
		
		wd.navigate().back();
		
		//forward
		
		wd.navigate().forward();
		
		//Uzimamo dimenziju prozora
		
		Dimension d = wd.manage().window().getSize();
		System.out.println(d);
		
		//Prozor se maksimizuje
		
		wd.manage().window().maximize();
		
		//Prozor se vraca na prvobitnu dimenziju
		
		wd.manage().window().setSize(new Dimension(945, 1020));
		
		wd.close();
		
		System.out.println(title);
		System.out.println("Duzina naslova: " + title.length());

	}

}
