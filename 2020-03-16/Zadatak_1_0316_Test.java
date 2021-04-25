package Domaci_16_03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Zadatak_1_0316_Test {

	/*
	 * Napraviti testNG klasu koja ce testirati da li se zeljena web stranica
	 * otvorila. Proveru izvrsiti na osnovu Title-a.
	 */

	@Test
	public void wdTitleTest() {
		System.setProperty("webdrivre.chrom.driver", "chromedriver.exe");

		WebDriver wd = new ChromeDriver();

		SoftAssert sa = new SoftAssert();

		wd.get("https://itbootcamp.rs/");

		String title = wd.getTitle();

		String exTitle = "ITBootcamp - Besplatna IT prekvalifikacija - Free IT Bootcamp in cooperation with the Divac Foundation";

		wd.close();

		sa.assertEquals(title, exTitle);

		sa.assertAll();

	}
}
