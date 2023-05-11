package s3intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dd {

	public static void main(String[] args) throws InterruptedException {
		//Launh browser

		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		//implicit wait
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(60));
		
		
		//Web page
		d.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		//Maximize the page
		d.manage().window().maximize();
		
		//enter first name
		WebElement Firstname = d.findElement(By.name("firstname"));
		Firstname.sendKeys("Raj");
		System.out.println("first name Entered");
		
		//enter last name
		WebElement Lasttname = d.findElement(By.name("lastname"));
		Lasttname.sendKeys("Kumar");
		System.out.println("Last name Entered");
	
		
		//Select male radio button
		//Using explicit wait
		Thread.sleep(10000);
		WebElement radio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='radio'][@value='Female']")));
		radio.click();
		System.out.println("Radio button selected");
		
		//radio button
		WebElement experience = d.findElement(By.xpath("//input[@name='exp'][@value='3']"));
		experience.click();
		System.out.println("Experience Radio button selected");

		//Entering date in textbox
		WebElement date = d.findElement(By.xpath("//*[@id=\"mainContent\"]/div[6]/div/form/table/tbody/tr[5]/td[2]/input"));
		date.sendKeys("19/11/2022");
		System.out.println("Date entered successfully");

		
		//checkbox 
		//Selecting the manual tester checkbox
		
	WebElement checkbox = d.findElement(By.xpath("  //input[@type='checkbox'][@value='Manual Tester']"));
	checkbox.click();
	System.out.println("Checkbox selected successfully");

		
	//selecting multiple check box example
	WebElement seleniumtoolsbox1 = d.findElement(By.xpath("//input[@type='checkbox'][@value='RC']"));
	seleniumtoolsbox1.click();
	System.out.println("Checkbox1 selected successfully");

		
	WebElement seleniumtoolsbox2 = d.findElement(By.xpath("//input[@type='checkbox'][@value='Selenium IDE']"));
	seleniumtoolsbox2.click();
	System.out.println("Checkbox2 selected successfully");

	
	//dropdownexample selecting one option in dropdown box , 2. Drop down naale select class use pani tha drop down option la oru value select pananum
	WebElement dropdown = d.findElement(By.name("continents"));
	Select select = new Select(dropdown);
	select.selectByVisibleText("Asia");
	System.out.println("Dropdown selected");
	
	
	
	//select.selectByIndex(0); (another method to select the option in the dropdown using by index)
	//select.selectByValue("1");  (another method to select the option in the dropdown using value)
	
	//we can also select the option using sendkeys.	
	//ex - dropdown.sendKeys("Asia");
		
		Thread.sleep(5000);
		
		d.quit();


		
	}

}

