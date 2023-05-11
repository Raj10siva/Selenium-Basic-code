package s3intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script3 {

	public static void main(String[] args) {
		
		//Launch browser

		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		WebDriver d= new ChromeDriver();		
		
		
		
		d.get("https://www.google.com/");
		d.navigate().to("https://www.facebook.com/");
		d.navigate().back();
		d.navigate().forward();
		
		
	String currenttitle =	d.getTitle(); //last a entha page open agi iruko antha webpage title print panrom theriyarathukaga
		
		System.out.println(currenttitle);
		
		System.out.println(d.getCurrentUrl());
		
		if(currenttitle.contains("Facebook"))
		{
			System.out.println("Test case passed");
		}
		
		d.quit();
		
	}

}
