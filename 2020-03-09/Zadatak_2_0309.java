package Domaci7;

import java.io.File;
import java.util.logging.FileHandler;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import net.bytebuddy.jar.asm.Handle;

public class Zadatak_2_0309 {

	public static void main(String[] args) {
		/*
		 * Koristeci selenijum, napravi screenshot svog okacenog domaceg zadatka na
		 * drajvu. Okaciti ovaj zadatak i kao .java (kod sa selenijumom) i
		 * sliku(screenshot).
		 */
		
		System.setProperty("webdrivre.chrom.driver", "chromedriver.exe");

		WebDriver wd = new ChromeDriver();

		// pokrece se pretrazivac i otvara stranica IT Bootcamp

		wd.get("https://itbootcamp.rs/");
		
		File screenshot = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(screenshot, new File("C\\Selenium\\Screenshot.png"));
		

	}

}
