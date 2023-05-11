package webgtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Sortable2 {

	public static void main(String[] args) throws InterruptedException {

		
		
		
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
		
		List<WebElement> boxes = d.findElements(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div"));
		

		WebElement from	= boxes.get(0);
	
		WebElement to = boxes.get(5);
		
		
		Actions actions = new Actions(d);
		//actions.dragAndDrop(from, to).build().perform();
		actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		
		System.out.println("1st element moved to 6th index");
		
		
		Thread.sleep(10000);
		
		d.quit();
		
		
		
		
		
	}

}
