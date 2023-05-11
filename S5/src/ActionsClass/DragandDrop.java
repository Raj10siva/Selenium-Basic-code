package ActionsClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {

		//Drag and Drop - It is a Action class method, oru edathula iruka element a drag pani inoru place la drop panrathu
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(co);		
		
		
		//Web page
		d.get("https://demoqa.com/droppable/");
		
		
		//Maximize the page
		d.manage().window().maximize();
		
		
		//implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		//Source element inspection
		WebElement drag = d.findElement(By.id("draggable"));
		
		//Target element inspection
		WebElement drop = d.findElement(By.id("droppable"));
		
		//Giving Action class and passing the parameter driver
		Actions act = new Actions(d);
		
		//To perform drag and drop operation
		act.dragAndDrop(drag, drop).build().perform();
		
		
		
		
		
		
		//Performing the drag and drop operation
		//act.dragAndDrop(source, target).perform();
		//act.clickAndHold(source).moveToElement(target).release(target).build().perform();
				
				
				
//				
//		//act.dragAndDrop(source, target).build().perform(); - ipdiyum kodukalam(ithu olde version la use pananga.
//		//New version la peform nu kodutha pothum. Becuase athulayae build include pani irukanga nw version la
//
//		Thread.sleep(5000);
//		
//		//Verification
//		System.out.println("Drag and dropped and finished");
//		
//		//print the target element text
//		System.out.println(target.getText());
//		
//		//Store the target element text to string return type.
//		String a = target.getText();
//		
//		if(a.equals("Dropped!"))
//		{
//			System.out.println("Operation successfully done");
//		}
//		else
//		{
//			System.out.println("Operation failed");
//		}
//		
//		
//		//Close the browser
//		d.quit();	
	}

}
