package s3intro;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class drop {

	public static void main(String[] args) {

		
		
		
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);



		//open web page
		d.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		
		//maximize
		d.manage().window().maximize();
		
		
		//Handling drop down
		WebElement drop = d.findElement(By.id("RESULT_RadioButton-9"));
		Select select = new Select(drop);
		select.selectByIndex(1);
		
		String selectedoption =	select.getFirstSelectedOption().getText();
		System.out.println(selectedoption);
		
		
		List <WebElement> alloptions = select.getOptions();
		
		
		//Print the numberm of options
		
		int optionscount = alloptions.size();
		
		System.out.println(optionscount);
		
		
		for(WebElement totaloptions : alloptions)
		{
		String optionValues =	totaloptions.getText();
		System.out.println(optionValues);
		}
		
		
	}

}
