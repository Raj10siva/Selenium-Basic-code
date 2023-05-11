package webgtables;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksAdvance {

	public static void main(String[] args) throws InterruptedException {

		
		
		//Task
		//1. Click a link to go to homepage(click operation)
		//2. Link click panamayae antha link enga pogum nu program adichu console la kaatu
		//3. verify the link is broken or not
		//4. Go to home page and interact with same first webelement link.
		//5. How many links are available in the home page?
		
		
		
		
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
				d.navigate().to("https://demoqa.com/links");
				
				//maximize the page
				d.manage().window().maximize();
				
				//Task 1
				WebElement homepage = d.findElement(By.linkText("Home"));
				homepage.click();
				
				Thread.sleep(3000);
				
				System.out.println("Home page opened in child tab");
				
				String mainwindow= d.getWindowHandle();
				System.out.println("Main window = " +mainwindow);
				
				Set<String> allwindows = d.getWindowHandles();
				
				
				for (String windows : allwindows) {
					if(!windows.equals(mainwindow))
					{
						d.switchTo().window(windows);
						Thread.sleep(3000);
						d.close();
					}
				}
				
				d.switchTo().window(mainwindow);
			
				System.out.println("Home page closed");
				
				
				//Task 2. Link click panamayae antha link enga pogum nu program adichu console la kaatu
				
				WebElement presentedlink = d.findElement(By.id("dynamicLink"));
				String Presentedwebsite = presentedlink.getAttribute("href");
				System.out.println("Presented link name is :" +Presentedwebsite);
				
				
				//Task 3. verify the link is broken or not. We will perform in separate class
				
				
				//Task 4. Go to home page and interact with same first webelement link.
				//Inga exception varum - exception name
				
				//homepage.click(); - again home page ku poga direct a homepage.click() koduka kudathu.
				//Apdi kodutha vara pora exception - StaleElementReferenceException
				//Atha overcome pana again weblemenet homepage ku find pani click operation perform pananum.
				
				//WebElement homepage1 = d.findElement(By.linkText("Home"));
				//homepage1.click();
				
				//Namma yen atha inga peform panalana inga oru link a click pana athae tab la antha link page open agama vera tab la open aguthu.
				//Vera tab la open agurathala homepage.click();  inga work agum.
				//Back use pani homepage.click(); kodutha work agathu exception adikum(navigate use pani irukarthala back operation inga work agum)


				//Task 5.How many links are available in the home page?
				
				
				List<WebElement> Totallinks =d.findElements(By.tagName("a"));
				
				int linkcounts =	Totallinks.size();
				
				System.out.println("Total links available in parent  window page is :" +linkcounts);
				
				
				for(WebElement totallinks : Totallinks)
				{
					System.out.println(totallinks.getAttribute("href"));//href means antha attribute la ena ena link iruku athu elam print agum. ela linkum href la tha irukum.
				}
				
				
				Thread.sleep(3000);
				
				d.quit();
		
	}

}
