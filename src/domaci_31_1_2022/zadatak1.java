package domaci_31_1_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak1{

	public static void main(String[] args) throws InterruptedException {
//		Napisati program koji:
//			Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//			Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element obrisao sa stranice 
//			i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
//			POMOC: Brisite elemente odozdo.
//			(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo


		System.setProperty("webdriver.chrome.driver", 
						"driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://s.bootsnipp.com/iframe/Dq2X");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		
		boolean obavestenjeUgaseno;
		
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.className("close")).click();
		Thread.sleep(2000);
		try {
			 WebElement e = driver.findElement(By.className("alert alert-success-alt alert-dismissable"));
			 obavestenjeUgaseno = false;
		 } catch (Exception e2) {
			 obavestenjeUgaseno = true;
		 }
		 
		 if (obavestenjeUgaseno) {
			 System.out.println("Obavestenje je ugaseno.");
		 } else {
			 System.out.println("Obavestenje nije ugaseno.");
			 
		 }	
		}
		}
	}


