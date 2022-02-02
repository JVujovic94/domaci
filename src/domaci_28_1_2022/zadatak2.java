package domaci_28_1_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak2 {

	public static void main(String[] args) {
//		Zadatak
//		Napisati program koji vrsi dodavanje 5 reda u tabelu. 
//		Maksimizirati prozor
//		Ucitati stranicu https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php
//		Dodati red podataka - jedan red u jednoj iteraciji 
//		Kliknite na dugme Add New
//		Unesite name,departmant i phone (mogu da budu uvek iste vrednost)
//		Kliknite na zeleno Add dugme
//		Na kraju programa ugasite pretrazivac.


			System.setProperty("webdriver.chrome.driver", 
					"driver-lib/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.navigate().to("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");

			for(int i=0; i<5; i++) {
			driver.findElement(By.xpath("//*[contains(@class,'btn')]")).click();
			driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Jovana");
			driver.findElement(By.xpath("//*[@id='department']")).sendKeys("Jovana");
			driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("0652525252525");
			driver.findElement(By.xpath("//a[@class='add'][contains(@style,'inline')]")).click();


			}

			driver.close();
	}

}
