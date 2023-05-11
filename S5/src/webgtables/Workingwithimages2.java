package webgtables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Workingwithimages2 {

	public static void main(String[] args) throws InterruptedException {

		
				//Task 2
				//2 Verify the if you click the image, it goes to the correct page or not.
				//a. Image click pana home page pogum.
				//b. Antha open ana home page oda title and original home page oda title onna iruntha Test case is passed
				//c. Else failed.
		
		
		
		
		
				//Launch browser
				System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver d = new ChromeDriver(options);		
				
				
				//Using implicit wait
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Explicit wait
				//WebDriverWait wait  = new WebDriverWait(d,Duration.ofSeconds(60));
				
				
				//fetch the url
				d.navigate().to("https://www.google.com/search?q=instagram&rlz=1C1JJTC_enIN1005IN1005&oq=instagram&aqs=chrome.0.69i59j0i13i19i512l4j69i60l3.7498j0j4&sourceid=chrome&ie=UTF-8");
				
				//maximize the page
				d.manage().window().maximize();
		
		
				//Find and Click the instagram image
		
				WebElement instaimage = d.findElement(By.xpath("//img[@id='dimg_1']"));
				instaimage.click();
				
				String instaname = d.getTitle();
				System.out.println("Opened webpage name is :"+instaname);
				
				
				if(instaname.contains("Google Search"))
				{
					System.out.println("Required insta page is opened and test case passed");
				}
				else
				{
					System.out.println("Required insta page is not opened and test case failed");
				}
				
				Thread.sleep(3000);
				
				d.quit();
	}

}
