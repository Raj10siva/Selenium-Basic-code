package s3intro;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		//what is alert handling?
		//Alert is an interface
		//Alert handling is nothing but handling the alerts during the test execution.
		//If we will not handle the alerts, it will through run time exception.
		
		
		//Types of alert:
		//simple alert
		//confirmation alert
		//prompt alert
		
		
		//Launh browser

		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		//WebDriver d= new ChromeDriver();

		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		
		
		
		//Explicit wait syntax
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));

		//Web page
		d.get("https://demoqa.com/alerts");


		//Maximize the page
		d.manage().window().maximize();
		
		
		//Example for explicit wait
		
		//After clicks the alert, it will appear after 5 seconds, so we use explicit wait
		
		//inspect the alertbutton
		WebElement fivesecAlert = d.findElement(By.id("timerAlertButton"));
			
		//click the alert button
		fivesecAlert.click();
		
		//Command for(driver will wait for alert prompt)
		wait.until(ExpectedConditions.alertIsPresent());

		//Switch the driver to alert
		Alert alt =  d.switchTo().alert();
		
		//To accept the alert
		alt.accept();
		
		//Confirmation
		System.out.println("Program run successfully");
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		



//		//First alert handling
//		WebElement simplealert = d.findElement(By.id("alertButton"));
//		simplealert.click();
//		
//		
//		
//		//switch the driver to handle
//		Alert alert = d.switchTo().alert();
//
//		//get the alert text
//		String alertmessage = alert.getText();
//		
//		//print the alert text
//		System.out.println(alertmessage);
//		
//		//To accept the alert	
//		alert.accept();
//		
//		//second alert handling
//		WebElement alert2 = d.findElement(By.id("confirmButton"));
//		alert2.click();
//		
//		//Switch to alert 
//		Alert a =	d.switchTo().alert();
//		
//		//get the alert text
//		String amessage = a.getText();
//		
//		//print the alert text
//		System.out.println(amessage);
//		
//		//To cancel the alert
//		a.dismiss();
//		
//		
//		//third alert handling
//		WebElement alert3 = d.findElement(By.id("promtButton"));
//		alert3.click();
//		
//		//Switch to alert 
//		Alert b =	d.switchTo().alert();
//		
//		//get the alert text
//		String bmessage = b.getText();
//		
//		//print the alert text
//		System.out.println(bmessage);
//	
//		//To accept the alert
//		b.accept();
		
		
		
		
		
		
		
//		//Move main window to alert window
//		Alert alert=d.switchTo().alert();
//	
//	
//		//capture alert message
//		String msg=alert.getText();
//	
//	
//		System.out.println("Simple Alert : "  +msg  );
//  
//		//ok  button
//		alert.accept();
//  
//  
//  //Generation second alert, if we click that alert will show after 5 seconds
//  d.findElement(By.id("timerAlertButton")).click();
//  
//  
////syntaxt for explicit wait
////WebDriverWait objname = new WebDriverWait(Driver name, timeUnits);
////wait.until(ExpectedConditions.conditionname(locator(locator value)));
// wait.until(ExpectedConditions.alertIsPresent());//condition name potutu yen locator value podalana, antha alert vara waraikum web driver wait pana pothum so locator la ethuvum kodukala)
//  //so alert after 5 seconds la vangtha udanae driver a alert ku switch panrom.
//  Alert alert2 = d.switchTo().alert();
//  //antha alert la iruka text a edukarom
//  String msg2 = alert2.getText();
//  //antha text a print panrom
//  System.out.println("Simple Alert : "  +msg2);
//  //accept the second alert
//  alert2.accept();
//  
//  
//  
// //Generation third alert  and dismiss
//d.findElement(By.id("confirmButton")).click();
////driver a alert ku switch panrom.
//Alert alert3=d.switchTo().alert();
////antha alert 3 la iruka text a edukarom
//String msg3=alert.getText();
////antha alert 3 text a print panrom
//System.out.println("Simple Alert : "  +msg3  );
////dismiss the third alert
//alert3.dismiss();
//
//
//
//  
////Generation 4th alert  and dismiss
//d.findElement(By.id("promtButton")).click();
////driver a alert ku switch panrom.
// Alert alert4=d.switchTo().alert();
// //Alert ula iruka box la test enter pananum
// alert4.sendKeys("Text");
//Thread.sleep(10000);
//
//System.out.println("Name entered");
////dismiss the third alert
// alert4.dismiss();
//  
//  
//  
//  d.quit();
	}  	
}
