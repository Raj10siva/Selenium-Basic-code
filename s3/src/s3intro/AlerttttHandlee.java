package s3intro;

import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlerttttHandlee {

	public static void main(String[] args) throws Exception {
		//Launh browser

		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);//open web page
		
		
d.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

//maximize
d.manage().window().maximize();


//Generate the simple alert
d.findElement(By.name("alert")).click();
//Move the main window to alert window
Alert alert=d.switchTo().alert();
//Get the alert message
String msg=alert.getText();
//Print the alert message
System.out.println("Simple alert is : "+msg);
//Accept the alert message
alert.accept();
System.out.println("Project 1 successfull");





//confirmation alert
d.findElement(By.name("confirmation")).click();
//move from main window to alert window
Alert alert1=d.switchTo().alert();
//Get the Alert message
String msg1=alert1.getText();
System.out.println("Confirmation alert is : "+msg1);
//Select the option cancel or dismiss the option. 
alert1.dismiss();
System.out.println("Project 2 successfull");





//prompt alert
d.findElement(By.name("prompt")).click();
Alert alt = d.switchTo().alert();
alt.getText();
System.out.println("prompt alert is : "+alt.getText());
alt.accept();
System.out.println("Project 3 successfull");


d.quit();

	}
}


//There are three types of alert 
//simple and confirmation and prompt alert.
//Alert is a interface
//interface is a Blue print of class
//class ku object create panalam, but interfcace ku  object create pana mudiyathu
//important notes ithutha


//Task
//1.Click the alert option.
//2. Move From main window to alert window
//3. Get the alert message and print it.
//4. Accept or Dismiss the alert.
//5. we can also set time limit to accept or dismiss the alert