package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		
		//move to element means - mouse a oru eduthuku just move pani eduthu poi vekkurathu mattum
		//moveToElement(): Shifts the mouse pointer to the center of the element
		//Move to element is a action class
		//Amazon page a load pani athula mouse cursor a thookitu poi flag button mela vekanum and atha click pananum
		
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);
		
		//Fetch the Web page
		d.get("https://www.amazon.in/");
		
		//Maximize the page
		d.manage().window().maximize();
		
		//Click the element to hoverover the mouse to the Country selecting element
		WebElement move = d.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]"));
		
		 //Instantiate Action Class
		  Actions actions = new Actions(d);
		  actions.moveToElement(move).build().perform();//moveToElement() method is used to move the mouse coursor to the speicif element in the webpage   
		  
		  //Verification
		  System.out.println("Mouse cursor moved to the speceif element");
		   
		  //Click the move element
		   move.click();
		   
		   Thread.sleep(5000);
		   
		
		   
		   
		
		

	}

}
