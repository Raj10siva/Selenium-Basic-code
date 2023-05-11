package s3intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printSearchSuggestions {

	public static void main(String[] args) throws InterruptedException {

		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		
		d.get("https://www.google.co.in/");
		d.manage().window().maximize();
		
		WebElement word = 	d.findElement(By.name("q"));
		word.sendKeys("Rajni");
		
		Thread.sleep(5000);
		
		
		List<WebElement> searchsuggestions = d.findElements(By.xpath("//*[@role='listbox']//following::li"));
		
		
		/*for(WebElement searchlist : searchsuggestions)
		{
			System.out.println(searchlist.getText());
		}
		
		
		
		
		int posistion=0;
		for(WebElement searchlist : searchsuggestions)
		{
			
			System.out.println(searchlist.getText());
			posistion++;
			if(posistion==3)
			{
				searchlist.click();
				Thread.sleep(5000);
				break;
			}
		}*/
		
		for(WebElement searchlist : searchsuggestions)
		{
		String text =	searchlist.getText();
		System.out.println(text);
			
			if(text.contains("murugan"))
			{
				searchlist.click();
				Thread.sleep(5000);
				break;
			}
		}
		
		
		
		
		d.quit();
		
		
		
		
		
		
		
	}

}
