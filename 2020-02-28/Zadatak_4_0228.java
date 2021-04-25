package Domaci6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_4_0228 {

	public static void main(String[] args) {
		/*
		 * Pomocu jave i seleniuma otvoriti pretrazivac i otici na Youtube. Pet puta
		 * kliknuti na dugme refresh, i tek onda zatvoriti pretrazivac.
		 */
		System.setProperty("webdrivre.chrom.driver", "chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		
		//pokrece se pretrazivac i otvara stranica Youtube

		wd.get("https://www.youtube.com/");
		
		//Sledi refresh pet puta za redom

		wd.navigate().refresh();

		wd.navigate().refresh();

		wd.navigate().refresh();

		wd.navigate().refresh();

		wd.navigate().refresh();
		
		//Zatvara se pretrazivac

		wd.close();


	}

}
