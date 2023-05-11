package webgtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {

		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		String url = "https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker";

		
		//to open the maximized browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		
		//to open the weburl without using get and navigate
		JavascriptExecutor executor = ((JavascriptExecutor)d);
		executor.executeScript("location=\'"+url+"\'");
		
		//antha date namaku konja neram apram tha select panramari varuthu, so explicit wait use pani irukom.
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(20));
		Thread.sleep(5000);
		
		//Datepicker inoru frame ula iruku, athuku name and id ila, index also therila, so antha iFrame ku locator ku kandupidichu atha pass panapothum frames ku switch pana.
		
		WebElement iframefinder = d.findElement(By.xpath("//*[@id=\"post-2661\"]/div[2]/div/div/div[1]/p/iframe"));
		d.switchTo().frame(iframefinder);
		
		//inspecting the calendar
		WebElement datepicker=d.findElement(By.id("datepicker"));
		wait.until(ExpectedConditions.elementToBeClickable(datepicker));
		
		datepicker.sendKeys("03/10/2023", Keys.ENTER);
		
		Thread.sleep(5000);
		
		System.out.println("Date enetered successfully");
		
		d.quit();



		
//		WebElement DropDownDatePicker = d.findElement(By.id("DropDown DatePicker"));
//				
//		WebElement iframefinder2 = d.findElement(By.xpath("*[@id=\"post-2661\"]/div[2]/div/div/div[2]/p/iframe"));
//		
//		d.switchTo().frame(iframefinder2);
//		
//		WebElement datepicker2=d.findElement(By.id("datepicker"));
//
//		wait.until(ExpectedConditions.elementToBeClickable(datepicker2));
//		
//		datepicker2.click();
//		
//		Thread.sleep(5000);
//		
		
		
		
		
	}

}
