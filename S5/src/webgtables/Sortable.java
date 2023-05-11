package webgtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {


		//This program is for sorting.
		
		
		
				//Launch browser
				System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver d = new ChromeDriver(options);
				
				
				//Using implicit wait
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Web page
				d.navigate().to("https://demoqa.com/sortable");


				//Maximize the page
				d.manage().window().maximize();
				
				WebElement grid = d.findElement(By.id("demo-tab-grid"));
				grid.click();
				
				Thread.sleep(3000);
		
				List<WebElement> elements = d.findElements(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div"));
		
				
				//1. //*[@id='demo-tabpane-list']/div[1]/div
				//2. //*[@id="demo-tabpane-grid"]/div/div/div
		
				//Test case is Move 6th box before the first box
		
				//Getting the from element to move it to the specific location
				WebElement fromelement = elements.get(5);
				WebElement toelement = elements.get(0);

			
		
				//Using action class we can perform drag and drop option. Number 6th box a drag pani 1st box munadi drop pananum.
		
				Actions actions = new Actions(d);
				
				//	actions.dragAndDrop(fromelement, toelement).build().perform();

				actions.clickAndHold(fromelement)
				.moveToElement(toelement)
				.release(toelement)
				.build().perform();
				
				
				
				Thread.sleep(1000);
				
				System.out.println("6th element moved to first element successfully");
							
				//d.quit();
				
			
				
	}

}
