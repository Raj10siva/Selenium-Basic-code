package webgtables;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Photoupload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		//Question  - how to upload photo or file?
		//Answer is using sendkeys.
		//example - file to be uplodaded
		//upload.sendKeys("C:\\Users\\rkche\\OneDrive\\Desktop//vin.png");
		//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login - example website
		
		
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		
		
			//Web page
			d.get("https://demo.guru99.com/test/upload/");


			//Maximize the page
			d.manage().window().maximize();


			//click the choose file
			WebElement choosefile= d.findElement(By.name("uploadfile_0"));


			//Enter the file location name and file name by using sendKeys(copy and paste the file location)
			choosefile.sendKeys("C:\\Users\\rkche\\OneDrive\\Desktop\\vin.png");
			
			
			//clicking terms and agreements
			WebElement terms = d.findElement(By.id("terms"));
			terms.click();
			
			
			//clicking submit button
			WebElement sumit = d.findElement(By.id("submitbutton"));
			sumit.click();
			
			
			//Close the browser
			d.close();
			
			
			
//			
//			Robot robot = new Robot();
//			
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_V);
//			robot.keyRelease(KeyEvent.VK_V);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//			Thread.sleep(5000);
//			robot.keyPress(KeyEvent.VK_ENTER);






			
		//	WebElement download =	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("32 bit Windows IE")));
			
			//download.click();

			/*//method 2

	//select the upload button
	WebElement upload = wait.until(ExpectedConditions.elementToBeClickable(By.id("uploadfile_0")));
	upload.click();

	System.out.println("upload button clicked");

	//store the file name in string

	StringSelection selection = new StringSelection("C:\\Users\\rkche\\OneDrive\\Desktop//Flo.jpg");

	//copy the file name in to clipboard
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);


	//paste the file name in selection box

	Robot robot = new Robot();// mostly keyboard control pana use panrathu robot class. And intha operation namma application ula panala system la file open aguthu ena file select pananum, atha copy pana nama control + v press pananum keyboard la so robot class use pani namma control panrom.

robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(5000);
robot.keyPress(KeyEvent.VK_ENTER);


	//Click License agreement
	WebElement agreement = d.findElement(By.id("terms"));
	agreement.click();

	//Click submit file
	WebElement submit = d.findElement(By.id("submitbutton"));
	submit.click();

	Thread.sleep(5000);*/

	//System.out.println("file uploaded");

	//d.quit();

	}

}
