package ActionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class iFrames2 {

	public static void main(String[] args) throws InterruptedException {

		
		
		
				//Launch the browser
				System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				WebDriver d = new ChromeDriver(co);
				
				
				
				//Web page
				d.get("https://demo.automationtesting.in/Frames.html");
								
				//Maximize the page
				d.manage().window().maximize();
				
				//implicit wait
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//program name - how to find the size(number) of frames in a web page.
				
				//counting the frames
				
				List<WebElement> framescount=	d.findElements(By.tagName("iframe"));
				
				int totalframes = framescount.size();
				
				System.out.println("Total number of frames :" +totalframes);
				
				
				
				//interacting or doing some task in frame1
				
				//1. moving from parentframe to frame1 - inga namaku frame id and name ila so index use pani irukom, first frame ku 0
				
				d.switchTo().frame(0);
				
				WebElement textbox = d.findElement(By.xpath("//input[@type=\"text\"]"));
				
				textbox.sendKeys("Rajkumar");
				
				System.out.println("name entered successfully");
				
				Thread.sleep(3000);
				
				//2. moving from child frame 1 to parent frame
				//d.switchTo().parentFrame();
				d.switchTo().defaultContent();
				
				//3. Click nested frames example link
				d.findElement(By.linkText("Iframe with in an Iframe")).click();
				
				
				//4. moving from parentframe to child frame and then switch to sub child frame ithulayum name and id ila frame ku so index use pani irukom
				d.switchTo().frame(1);
				
				WebElement iframe = d.findElement(By.xpath("/html/body/section/div/div/iframe"));

				d.switchTo().frame(iframe);
				
				System.out.println("Action moved to sub child nested loop ");

				
				WebElement textbox2 = d.findElement(By.xpath("//input[@type=\"text\"]"));
				
				textbox2.sendKeys("Rameshkumar");
				
				System.out.println("name 2 entered successfully");
				
				Thread.sleep(5000);				
				
				d.quit();
		
	
		
		
		
		
		
		
		
		
	}

}
