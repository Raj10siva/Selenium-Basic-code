import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class IFrame {

	public static void main(String[] args) {

		// Launch Browser(how will you automate browser)
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(co);
		System.out.println("Chrome opened successfully");
		
		//Open Amazon Web page
		d.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		//Maximize the page
		d.manage().window().maximize();
		
		
		//Moving parent frame to child frame
		d.switchTo().frame("frm1");
		

		//selecting course using dropdown in frame1
		WebElement course = d.findElement(By.id("course"));
		
		//Select class syntax
		Select select = new Select(course);
		
		//selecting the value by visible text
		select.selectByVisibleText("Java");
		
		//moving the child frame to parent frame
		d.switchTo().defaultContent();
		
		
		//Moving the parentframe to child frame2
		d.switchTo().frame("frm2");
		
		//Giving the values to first name in Frame2
		WebElement name = d.findElement(By.id("firstName"));
		name.sendKeys("selvarasan");
		
		d.close();
		
		
		
	}

}
