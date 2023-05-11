package webgtables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedLinkconcept2 {

	public static void main(String[] args) throws InterruptedException {

		
		
		
		
		//Link remaining tasks
		//Task 3. verify the link is broken or not. We will peform in separate class
		//Task 4. Go to home page and interact with same first webelement link.
		
		
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		//Using implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicit wait
		//WebDriverWait wait  = new WebDriverWait(d,Duration.ofSeconds(60));
		
		
		//fetch the url
		d.navigate().to("https://www.zlti.com/");
		
		//maximize the page
		d.manage().window().maximize();
		
		
		Thread.sleep(2000);
		
		
		//namma click panapora link privacy, webpage open agi load agi irumumothu namaku privacy kannuku theriyathu athu kizha iruku.
		//So athu namaku theriya nama webpage a scroll pananum, athuku scroll operation code ezuthi irukom.
		
		
		// Java script use pani namma scroll panama program panna nammaku varapora exception = ElementClickInterceptedException or ElementNotVisibleExceoption
		
		JavascriptExecutor executor = (JavascriptExecutor)d;
		
		//Scroll to the specific link to click - namma click pana pora link privacy so athuvara scroll pananum

		WebElement scroll = d.findElement(By.linkText("Privacy"));
		
		executor.executeScript("arguments[0].scrollIntoView(true);",scroll);
		
		Thread.sleep(3000);
		
		
		
		
		//Task 3. verify the link is broken or not. We will peform in separate class

		WebElement privacy = d.findElement(By.linkText("Privacy"));
		privacy.click();
		
		String pageTitle =	d.getTitle();
		
		System.out.println("Page title after clicked privacy is" +pageTitle);
		
		if(pageTitle.contains("404"))
		{
			System.out.println("Link is broken");
		}
		else
		{
			System.out.println("Link is not broken");
		}
		
		
		//Task 4. Go to privacy page  again and interact with same first privacy webelement.

		//munadi link concept la sona mari inga again back vanthu privacy ya click pana try panrom, panumothu ena nadakuthu pakalam.

		d.navigate().back();
		
		Thread.sleep(3000);
		
		//privacy.click();//intha code exception adikum. exception name - StaleElementReferenceException
		
		//Atha overcome pana again weblemenet privacy ku find pani click operation perform pananum, athukapram namaku exception adikathu.
		
		
		WebElement privacy1 = d.findElement(By.linkText("Privacy"));
		privacy1.click();
		
		Thread.sleep(3000);
		
		System.out.println("All link task completed successfully");
		
		d.quit();
		
	}

}
