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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {

	public static void main(String[] args) throws Exception {
		
		
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);		
		
		//Web page
		d.get("https://www.goodmorninghdloveimages.com/wp-content/uploads/2021/11/Wallpaper-Vinayagar-Images.jpg");
		
		
		//Maximize the page
		d.manage().window().maximize();
		
		
		//Convert web driver to take screenshot
		TakesScreenshot ss = (TakesScreenshot) d;

		//Source file
		File source=ss.getScreenshotAs(OutputType.FILE);

		//destination file
		File destination = new File("C:\\Users\\rkche\\OneDrive\\Desktop\\vinayagaa.jpg");

		//Copy from source to destination profile.
		FileHandler.copy(source, destination);


		System.out.println("Screenshot taken");
		
		
//		//created object for Robot class
//		Robot robot=new Robot();
//		
//		//Get the screensize and store
//		//intha method system la therira antha screensize apdae eduthukum
//		Dimension screenSize =	Toolkit.getDefaultToolkit().getScreenSize();
//		
//		
//		//Laptop or computer screen rectangla irukarthala rectangle use panrom
//		Rectangle rectangle = new Rectangle(screenSize);
//		
//	
//		//getScreenshotAs ku bathil inga createScreenCapture use panrom
//		BufferedImage sourceFile =	robot.createScreenCapture(rectangle);
//		
//		
//		//Enga save aganum nu location kodukanum
//		File destinationFile = new File("C:\\Users\\rkche\\OneDrive\\Desktop\\.Fullscreenshot.png");
//		
//		
//				
//		
//		ImageIO.write(sourceFile, "png", destinationFile);
//		//file Handler or file utils ku bathil inga ImageIO use panrom.
//		
//		System.out.println("ScreenshotTaken....................");
		
		
		
		
		
		
		
		
		d.quit();
		
	}
}
