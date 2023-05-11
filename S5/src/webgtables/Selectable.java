package webgtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {

		
				//Task
				//4 boxes iruku athula first 3 boxes click pananum using selenium.
		
		
		
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
				d.navigate().to("https://demoqa.com/selectable");
				
				//maximize the page
				d.manage().window().maximize();
				
				Thread.sleep(2000);
		
		
		//click and fine the xpath to select all boxes 
				
		List<WebElement> allboxes =	d.findElements(By.xpath("//ul[@id='verticalListContainer']/li"));
		
		//C0unt the total available boxes
		int totalboxes = allboxes.size();
		
		//print the boxes count
		System.out.println("Total boxes in this page is :"+totalboxes);
		
		int count =0;
		
		for (WebElement totalbox : allboxes) {
			if(count<=3)
			{
				totalbox.click();
			}
			count++;	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
//		//Select first 3 boxes using Action class
//		Actions actions = new Actions(d);
//		
//		
//		//Robot class la Key press use panuvom press panna, actions class la KeyDown use panuvom press pana,
//		//Why click and hold? not click? - 3 options click pananum so control hold panitu tha matha 3 option click panamudiyum, apdi control press panama matha items select pana one by one itema the select agum.
//	
//		
//		
//		//Method 1 - control press pani irukarthala verum click option use pana pothum
//		 actions.keyDown(Keys.CONTROL)
//		.click(allboxes.get(0))
//		.click(allboxes.get(1))
//		.click(allboxes.get(2))
//		.build().perform();
//		
//		 
//		 
//		//Method 2 - inga keydown use pani control press panamatom, so click and hold use panalam.
//		/*actions.clickAndHold(allboxes.get(0));
//		actions.clickAndHold(allboxes.get(1));
//		actions.clickAndHold(allboxes.get(2));
//		actions.build().perform();*/
//
//				
//				
//		Thread.sleep(3000);
//				
//		System.out.println("First three items selected and test case passed");
//				
//		d.quit();
				
	}

}
