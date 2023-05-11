package s3intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		//Launh browser

		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		WebDriver d= new ChromeDriver();

		//Web page
		d.get("https://demoqa.com/select-menu");
		
		
		//OLD STYLE SLECT MENU drop down la iruka option select pani irukom.
		Select drp= new Select(d.findElement(By.id("oldSelectMenu")));
		
		//drp.selectByIndex(1);
		//drp.selectByValue("2");
		drp.selectByVisibleText("Blue");


		//to print selected option
		WebElement sopt=drp.getFirstSelectedOption();
		System.out.println("Selected option is : " +sopt.getText());


		//to print all options use getOptions() method
		System.out.println("All options :");
		List<WebElement> aopt= drp.getOptions();
		for(WebElement options : aopt)
		{
			System.out.println(options.getText());
		}

		//to print the number of options in the driop down
		int size = aopt.size();
		System.out.println("size is :" +size);
		
		d.quit();

	}

}
