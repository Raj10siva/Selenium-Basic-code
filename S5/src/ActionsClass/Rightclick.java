package ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws Exception {
		
		//Right click the element - It is a ction class.
		//Oru web page a load pani athula iruka oru element a right click pani athula iruka option a select panra program
		
		
			//Launch the browser
			System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
			WebDriver d= new ChromeDriver();
			
			//Web page
			d.get("http://demo.guru99.com/test/simple_context_menu.html");
			
			//Maximize the page
			d.manage().window().maximize();
		
		 	//Retrieve WebElement to perform right click(click right click button)
			WebElement rightclick = d.findElement(By.cssSelector(".context-menu-one"));		
		
			//Instantiate Action Class
		   Actions actions = new Actions(d);
			 
		   //Right Click the button to display Context Menu&nbsp;
		   actions.contextClick(rightclick).build().perform();//contectClick(0 is the method to perform right click the button
		   
		   //verification
		   System.out.println("Right click Context Menu displayed");
			 
		   //Right click pana udanae athula iruka option ena select pana poromo atha inspect pani code ezuthanum - edit inspect pani iruku 
		   d.findElement(By.xpath("//*[@id='authentication']/ul/li[1]")).click(); 

		   //Alert varum ethachu oru option click panna, so namma driver alert ku move panna code ezuthanum like switch
            Alert alrt = d.switchTo().alert();
            
            //Print the alert text
		   System.out.println(alrt.getText());
		   
		   //To accept the alert
		   alrt.accept();
		   
		   Thread.sleep(5000);
		   
		   //close the browser
		   d.quit();

	}

}
