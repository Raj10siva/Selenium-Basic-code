package s3intro;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class windowshandle3 {

	public static void main(String[] args) throws InterruptedException {

		

				//Launch browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\rkche\\Videos\\Selinium files\\chromedriver.exe");
				WebDriver d= new ChromeDriver();
				
				//Web page
				d.get("https://demoqa.com/browser-windows");
				
				//Maximize the page
				d.manage().window().maximize();

				//Main window
				String mainwindow= d.getWindowHandle();
				System.out.println("Main window = " +mainwindow);

			/*	//other window
				WebElement newWindow = d.findElement(By.id("windowButton"));
				newWindow.click();

				Set<String> allwindows=d.getWindowHandles();

				
				for(String windows : allwindows)
				{
					//System.out.println("Opened windows = " +windows);
					d.switchTo().window(windows);
				}
				
				
			d.get("https://www.google.com/");//because inga namma get use pani website ula poi irukom, antha page vera website ku poganum na navigate use panuvom.
			Thread.sleep(5000);
			d.close();
			
			d.switchTo().window(mainwindow);
			
			WebElement newtab = d.findElement(By.id("tabButton"));
			newtab.click();
			
			Thread.sleep(5000);
			
			Set<String> alltabs=d.getWindowHandles();
			
			for(String tabs : alltabs)
			{
				d.switchTo().window(tabs);
			}
			
			d.get("https://www.google.com/");
			Thread.sleep(5000);
			d.close();
			
			d.switchTo().window(mainwindow);*/
			
			WebElement newWindow2 = d.findElement(By.id("windowButton"));
			newWindow2.click();
			
			WebElement newtab2 = d.findElement(By.id("tabButton"));
			newtab2.click();
			
		int openedwindowscount =	d.getWindowHandles().size();
			
		System.out.println("opened windows count is :" +openedwindowscount);
		
		Set<String> allwindows2 = d.getWindowHandles();
		
		for(String windows2 : allwindows2)
		{
			if(!windows2.equals(mainwindow))
			{
				d.switchTo().window(windows2);
				d.close();
			}
		}
		
		
			
			System.out.println("Multiple windows opened and closed successfully");

			

		}
	}


