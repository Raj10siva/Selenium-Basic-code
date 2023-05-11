package ActionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		
		
		//1. what is iframes?
		//one html page is embedded with another html page(ex- child html page is embedded inside the parent html page)
		
		//2. types of frames?
		//a. normal frames(parent - child)
		//b. nested frames(parent-child-subchild)
		
		
		
		

		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(co);
		System.out.println("Chrome opened successfully");
		
		
		//Web page
		d.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		//Maximize the page
		d.manage().window().maximize();
		
		//implicit wait
		//	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//program name - how to find the size(number) of frames in a web page.
		
		//counting the frames
		
		List<WebElement> framescount=	d.findElements(By.tagName("iframe"));
		
		int totalframes = framescount.size();
		
		System.out.println("Total number of frames :" +totalframes);
		
		
		
		//interacting or doing some task in frame1
		
		//1. moving from parentframe to frame1
		
		d.switchTo().frame("frm1");
		
		WebElement course = d.findElement(By.id("course"));
		
		Select s = new Select(course);
		
		s.selectByValue("java");
		
		System.out.println("course selected successfully");
		
		
		
		//2. moving from child frame 1 to parent frame
		//d.switchTo().parentFrame();
		d.switchTo().defaultContent();
		
		
		//3. moving from parentframe to frame2
		d.switchTo().frame("frm2");
		WebElement firstname = d.findElement(By.id("firstName"));
		firstname.sendKeys("Raj");
		System.out.println("first name entered successfully");


		//4. moving from child frame 2 to parent frame
		d.switchTo().defaultContent();
		
		
		
		
		//nested frames example
		//5. moving from parentframe to frame3

		d.switchTo().frame("frm3");
		d.switchTo().frame("frm1");
		
		
		WebElement menu = d.findElement(By.id("selectnav1"));
		
		Select s2 = new Select(menu);
		
		s2.selectByIndex(6);
		
		
		
		System.out.println("menu selected successfully");

		
		//4. moving from child frame 2 to parent frame
		d.switchTo().parentFrame();
		//d.switchTo().defaultContent();
		
		
		System.out.println("Program completed successfully");

		
		
		d.quit();
		
		
		
	}

}
