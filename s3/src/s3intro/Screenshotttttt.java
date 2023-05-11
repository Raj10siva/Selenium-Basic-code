package s3intro;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Screenshotttttt {

	public static void main(String[] args) throws Exception  {
		
		
		
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		
		//open web page
		d.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		
		//maximize
		d.manage().window().maximize();
		
		
		//first name
		d.findElement(By.id("RESULT_TextField-1")).sendKeys("Raj");
		
		//last name
		d.findElement(By.id("RESULT_TextField-2")).sendKeys("Kumar");
		
		//phone number
		d.findElement(By.name("RESULT_TextField-3")).sendKeys("7010795583");
		
		//country
		d.findElement(By.name("RESULT_TextField-4")).sendKeys("India");
		
		//city
		d.findElement(By.name("RESULT_TextField-5")).sendKeys("Chennai");
		
		//email address
		d.findElement(By.name("RESULT_TextField-6")).sendKeys("Geethraj143@gmail.com");
		
		//radiobox
		WebElement box = d.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label"));
		
		box.click();
		System.out.println("Radio clicked");
		
		//checkbox
		WebElement check=d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[2]/td/label"));
		check.click();
		System.out.println("Checkbox clicked");
		
		
		//drop down
		Select drop=new Select(d.findElement(By.xpath("//*[@id=\'RESULT_RadioButton-9\']")));
		drop.selectByVisibleText("Morning");
		System.out.println("Drop down selected");
		
		
		//upload a photo
		WebElement upload = d.findElement(By.name("RESULT_FileUpload-10"));
		upload.sendKeys("C:\\Users\\rkche\\OneDrive\\Desktop//Flo.jpg");
		System.out.println("Photo uploaded");
		
		
		//submit
		d.findElement(By.name("Submit"));
		System.out.println("Submitted....................");
		
		
		//How to take Screenshot...............
		//TakesScreenshot(selenium inbuilt interface name)
		//getScreenshotas(method name)
		//File handler or File utils use panalam - using this we can copy the file
 		//FileUtils use panalana vera ena method use panalam - file handler use panalam.
		//File utils use pananum na - comms jar file download pananum.
		//comms jar file lam use panama panalam na - File Handler use panalam
		
//TakesScreenshot sct = (TakesScreenshot) d;
//		//- driver a screenshot edukarom so is equal to d, but driver a straight a screenshot a eduka mudiyathu error kaatum.
//		//-antha error la click pana type cast agum so bracket la (TakesScreenshot) varum
//File sourceFile = sct.getScreenshotAs(OutputType.FILE);
////-File sourcefile = return type
//		File destinationFile = new File("C:\\Users\\rkche\\OneDrive\\Desktop\\Screenshot.png");
//
//FileUtils.copyFile(sourceFile, destinationFile);
//
//System.out.println("ScreenshotTaken....................");


		
		
		//Screenshot via Robot class steps
		
		//1. Create an object of robot class
		//2.Get the screen size and store
		//3. Use the rectangle class and pass the screensize
		//4.Use createScreenCapture(rectangle) of robot class and Capture Screenshot.(source)
		//5.Define Destination pathfile for Screenshot
		//6.Write temp file into desti9nation file. (ImageIO)
		
		
		//Robot use pani fullpage screenshot edukalam, Half screenshot venum na TakesScrenshot use panalam.
		//Robot not a selenium use panamatom, ithu java.awt java la use panta oru class
		//alert click panitathuku apram screenshot edukanum na Robot use pani screenshot edupom.
		//apdi edukalana "org.openqa.selenium.unhandledAlertException" error kaatum 
	
		
		
		//created object for Robot class
		Robot robot=new Robot();
		
		//Get the screensize and store
		//intha method system la therira antha screensize apdae eduthukum
		Dimension screenSize =	Toolkit.getDefaultToolkit().getScreenSize();
		
		
		//Laptop or computer screen rectangla irukarthala rectangle use panrom
		Rectangle rectangle = new Rectangle(screenSize);
		
	
		//getScreenshotAs ku bathil inga createScreenCapture use panrom
		BufferedImage sourceFile =	robot.createScreenCapture(rectangle);
		
		
		//Enga save aganum nu location kodukanum
		File destinationFile = new File("C:\\Users\\rkche\\OneDrive\\Desktop\\.Fullscreenshot.png");
		
		
				
		
		ImageIO.write(sourceFile, "png", destinationFile);
		//file Handler or file utils ku bathil inga ImageIO use panrom.
		
		System.out.println("ScreenshotTaken....................");
		
		d.quit();
		
		
			}
		}


