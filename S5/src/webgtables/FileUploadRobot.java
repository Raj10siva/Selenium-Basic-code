package webgtables;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUploadRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {


		
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);		

		//to load the Web page
		d.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		
		//Maximze the page
		d.manage().window().maximize();
		
		//Performing full scroll down option
		JavascriptExecutor executor = (JavascriptExecutor)d;
		executor.executeScript("scrollTo(0,document.body.scrollHeight)");
		

		//Inspect the upload file 
		WebElement uploadfile = 	d.findElement(By.xpath("//*[@id=\"q21\"]/label"));
		
		//click the uploadfile 
		uploadfile.click();
		
		//Give the location path here in the  StringSelection class
		StringSelection selection = new StringSelection("C:\\Users\\rkche\\OneDrive\\Desktop\\vin.png");
		
		//Copy the file name
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		//Pasthe the file name in the photoupload box.
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);



		System.out.println("Photo uploaded");








	}

}
