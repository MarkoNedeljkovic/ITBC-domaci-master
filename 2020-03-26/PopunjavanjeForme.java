package Domaci_26_03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopunjavanjeForme {

	/*
	 * Koristeci Selenium webdriver otici na sajt
	 * https://www.techlistic.com/p/selenium-practice-form.html i popuniti formu
	 * (idealno celu, ako ne ide onda probajte bar do kontinenta) Potrudite se da
	 * koristite vise lokatora za pronalazenje elemenata.
	 * 
	 */

	public static void main(String[] args) {
		System.setProperty("webdrivre.chrom.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://www.techlistic.com/p/selenium-practice-form.html"; // link sajta

		driver.get(url); // otvaranje sajta

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Marko"); // nalazenje i upis imena

		driver.findElement(By.name("lastname")).sendKeys("Nedeljkovic"); // nalazenje i upis prezimena

		driver.findElement(By.id("sex-0")).click(); // odabir pola

		driver.findElement(By.xpath("//input[@id='exp-0']")).click(); // odabir god iskustva

		driver.findElement(By.cssSelector("#datepicker")).sendKeys("29.03.2020"); // pise samo date...uneo sam danasnji datum

		List<WebElement> checkbox = driver.findElements(By.name("profession")); // nalazenje i dodavanje elemenata u listu

		for (int i = 0; i < checkbox.size(); i++) { // prolazak kroz listu
			checkbox.get(i).click(); // cekiranje elemenata
		}

		driver.findElement(By.id("tool-2")).click(); // odabir alata koji je koriscen

		driver.findElement(By.xpath("//option[contains(text(),'Europe')]")).click(); // odabir kontinenta

		driver.findElement(By.xpath("//option[contains(text(),'WebElement Commands')]")).click(); // odabir komande
		
		driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:\\Users\\Marko\\Desktop\\Test.txt"); // dodavanje fajla

		driver.findElement(By.id("submit")).click(); // klik na dugme

	}

}
