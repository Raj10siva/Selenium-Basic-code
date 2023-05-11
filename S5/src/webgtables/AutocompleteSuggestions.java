package webgtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AutocompleteSuggestions {

	public static void main(String[] args) throws InterruptedException {

		
		//Task
		//Google search box la rajini word type panrom, athuku kizha vara suggestion la ethachu ona click panrom.
		
		
		
		
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		//Using implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicit wait
		WebDriverWait wait  = new WebDriverWait(d,Duration.ofSeconds(60));

		
		//Web page
		d.navigate().to("https://www.google.co.in/");


		//Maximize the page
		d.manage().window().maximize();
		
		//Inspecting the google serach box and entering the value using send keys
		WebElement google =	d.findElement(By.name("q"));
		google.sendKeys("rajini");
		
		
		//Finding the multiple webelements
		List<WebElement> alllist =	d.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div/ul/li"));
		
		int listsize = alllist.size();
		
		System.out.println("List size is :"+listsize);
		
		for (WebElement lists : alllist) {
			
			System.out.println(lists.getText());//click aga pora option list varaikum print aga intha line(antha list la iruka 10 words print aganum na if loop podama for loop la sysout this line mattum pota pothum.
			
			if(lists.getText().contains("movies"))
			{
				System.out.println("Clicked option is : "+lists.getText());
				lists.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		
		
		

		
		
		
		
		
		
		
		
		
		//Closing the browser
		//d.quit();
		
		
		
		
		
	}

}
