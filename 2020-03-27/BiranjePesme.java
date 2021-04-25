package Domaci_27_03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Pomocu jave i selenijuma
	1) otici na sajt youtube
	2) u search-u pronaci Rick Astley i pustiti pesmu Never gonna give you up
	voditi racuna da ako postoje reklame da ih preskocite
*/

public class BiranjePesme {

	public static void main(String[] args) {
		System.setProperty("webdrivre.chrom.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // cekanje da se ucita stranica

		driver.get("https://www.youtube.com/"); // otvaranje youtube-a

		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Rick Astley"); // unos u pretragu

		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click(); // zapocinjanje pretrage

		driver.findElement(By.xpath("//a[@title='Rick Astley - Never Gonna Give You Up (Video)']")) // odabir pesme
				.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//div[@id='ad-text:t']")).click(); // preskakanje reklame - ovaj deo nisam siguran
																		// da li radi. Svakako mora da se saceka da
																		// istekne vreme, a uvek mi je izlazila ista
																		// reklama i prekidala se posle isteka vremena

	}

}
