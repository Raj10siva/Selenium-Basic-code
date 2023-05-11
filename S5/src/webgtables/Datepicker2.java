package webgtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Datepicker2 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selinium files\\\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		
		
		//fetch the url
		d.get("https://demo.automationtesting.in/Datepicker.html");
		
		//Maximize the page
		d.manage().window().maximize();
		
		WebElement datepicker = d.findElement(By.id("datepicker2"));
		datepicker.click();
		
		WebElement month = d.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[1]"));
		Select select = new Select(month);
		
		select.selectByVisibleText("June");

		WebElement year = d.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[2]"));
		Select select2 = new Select(year);
		select2.selectByVisibleText("2022");
		
		Thread.sleep(5000);
		
		WebElement date = d.findElement(By.linkText("10"));
		date.click();
//		
		Thread.sleep(5000);
		
		System.out.println("My birth date entered successfully");
		
		d.quit();
		

		
		
		
		
		
	}

}
