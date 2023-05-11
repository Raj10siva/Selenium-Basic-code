package s3intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingggggg {
	
	//All the open window have a unique ID called window handle
	//Get window handle - To get the separate window ID - Return type is String
	//Get window handles - To get the list of Window IDS - Return type is Set<String>
	//Switch to command - move from one window to another window

	public static void main(String[] args) {
		
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);

		
		//Open Web page
		d.get("https://demoqa.com/browser-windows");
		
		//Maximize the page
		d.manage().window().maximize();
		
		//To get the main window or parent window ID in console
		String mainwindow= d.getWindowHandle();
		System.out.println("Main window = " +mainwindow);
		
		
		//to open other window we should inspect that window button
		
		//New Tab
		WebElement newtab = d.findElement(By.id("tabButton"));
		newtab.click();
		
		//New Window
		WebElement newwindow =	d.findElement(By.id("windowButton"));
		newwindow.click();
		
		//New window with message
		//WebElement messagewindow = d.findElement(By.id("messageWindowButton"));
		//messagewindow.click(); //intha line mattum google page open agamatangithu, website mistake pola

		//To get multiple selected clicked Window ID use Set string method.
		//Set<String> objname = driver.getWindowHandles();
		Set<String> allwindows = d.getWindowHandles();
		
		
//List<String> list = new ArrayList<String>(allwindows);  //intha line um potutu for loop la (String windows : list) num kodukalam

for(String windows : allwindows)
{
	d.switchTo().window(windows);

	//System.out.println("Opened windows ID :" +windows);
	if(!windows.equals(mainwindow))
	{
	d.navigate().to("https://www.google.com/");
	d.close();
	}
}

d.switchTo().window(mainwindow);


d.quit();







System.out.println("ALL windows switched to Google website");


}
}


//work
//1. First webpage open pani oru window open panrom
//2. GetWindowHandle() vechu antha main page id print panrom
//3. Tab and windows main page la iruka link a click pani multiple tab and windows open panrom
//4. getWindowHandles() method vechu open agi iruka ela windows id print panrom - athuku return type set string.
//5. For loop open panitu athula iruku window id print panrom, then windows switch panrom, then antha all windows la google home page open panrom
//6.final close panitu program mudikarom


