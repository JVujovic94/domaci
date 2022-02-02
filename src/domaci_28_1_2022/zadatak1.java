package domaci_28_1_2022;


		import java.util.List;
		import java.util.Scanner;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class zadatak1 {

			public static void main(String[] args) throws InterruptedException {
//				1.Zadatak 
//				Maksimizirati prozor
//				Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
//				Od korisnika ucitati broj na koju zvezdicu je potrebno kliknuti (u rasponu od 1 do 5)
//				I izvrsite akciju klik na odgovarajuci element
//				Na kraju programa ugasite pretrazivac.

				Scanner s = new Scanner(System.in);

				System.setProperty("webdriver.chrome.driver", 
						"driver-lib/chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();
				driver.navigate().to("https://s.bootsnipp.com/iframe/WaXlr");

				List<WebElement> zvezda = driver.findElements(By.xpath("//*[contains(@id,'rating')]/button"));

				System.out.println("Unesite broj *:");
				int br = (s.nextInt()-1);

				zvezda.get(br).click();

				Thread.sleep(3000);
				
				System.out.println("Kraj.");

				driver.close();
			}
			
	}


