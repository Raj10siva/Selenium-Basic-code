package webgtables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetToolTipText {

	public static void main(String[] args) throws InterruptedException {

		
		
		//Task - How to print the tool tip text? Write a program and explain?
		
		//1. What is tool tip text?
		//oru input box iruku, antha box name is  your name.
		//Antha box la mouse vecha "Enter your name" nu user ku solum user purinjikirathukaga.
		//Apdi vara text the Tool tip text
		
		
		
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		//Using implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicit wait
		//WebDriverWait wait  = new WebDriverWait(d,Duration.ofSeconds(60));
		
		//fetch the url
		d.navigate().to("https://demoqa.com/tool-tips");
		
		//maximize the page
		d.manage().window().maximize();
		
		
		//Click and ispect the text box 
		WebElement tooltip = d.findElement(By.id("toolTipTextField"));
		
		//To get the Tooltip text - mostly tooltip text enga irukum? - Title or placeholder attribute la irukum
		String text = tooltip.getAttribute("placeholder");
		
		System.out.println("Tool tip text is :" +text);
		
		Thread.sleep(3000);
		
		d.quit();
		
	}

}
