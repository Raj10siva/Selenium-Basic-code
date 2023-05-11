package s3intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class box {

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
		
		
		
		
		
	WebElement	firstname = d.findElement(By.name("RESULT_TextField-1"));
	firstname.sendKeys("Raj");
	
	firstname.clear();
	
	firstname.sendKeys("Selvam");
	
	boolean box = firstname.isEnabled();
	System.out.println(box);
	firstname.getText();
		
		
		
		
		
		
		
		
		
		
	}

}
