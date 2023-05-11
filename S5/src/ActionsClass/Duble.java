package ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Duble {

	public static void main(String[] args) throws InterruptedException {

		
		
		// Launch Browser(how will you automate browser)
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(co);
		System.out.println("Chrome opened successfully");
		
		//Open Amazon Web page
		d.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Maximize the page
		d.manage().window().maximize();
		
//		WebElement doubleclck = d.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
//		
//		
//		Actions actions = new Actions(d);
//		
//		
//		actions.doubleClick(doubleclck).build().perform();
//		
//		
//		
//		
//		Alert at = d.switchTo().alert();
//		
//		Thread.sleep(3000);
//		
//		at.accept();
		
//		Actions actions2 = new Actions(d);
//
//		
//		WebElement rtclick = d.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
//		
//		actions2.contextClick(rtclick).build().perform();
		
		
		
		WebElement selenium = d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a"));
		
		
		
		
		Actions act2 =  new Actions(d);
		
		act2.moveToElement(selenium).build().perform();
		
	}

}
