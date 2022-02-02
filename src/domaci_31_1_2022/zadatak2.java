package domaci_31_1_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class zadatak2 {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", 
					"driver-lib/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.navigate().to("https://geodata.solutions/");
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			WebElement drzava = driver.findElement(By.xpath("//*[@id='countryId']"));
			Select selectObject = new Select(drzava);

			selectObject.selectByValue("Serbia");

			WebElement region = driver.findElement(By.xpath("//*[@id='stateId']"));
			Select selectObject2 = new Select(region);
			selectObject2.selectByValue("Central Serbia");

			WebElement grad = driver.findElement(By.xpath("//*[@id='cityId']"));
			Select selectObject3 = new Select(grad);
			selectObject3.selectByValue("Valjevo");

	}

}