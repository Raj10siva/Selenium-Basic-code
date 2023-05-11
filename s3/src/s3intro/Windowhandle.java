package s3intro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);

		
		
//Web page
d.get("https://demoqa.com/browser-windows");


//Maximize the page
d.manage().window().maximize();


//Get Parent window id
String parentwindow = d.getWindowHandle();
System.out.println(parentwindow);


//clicking 1st windiow
WebElement child1 = d.findElement(By.id("tabButton"));
child1.click();

//clicking 2nd window
WebElement child2 = d.findElement(By.id("windowButton"));
child2.click();


//Store all window Id in one object- so we using Set class
Set<String> multiplewindows = d.getWindowHandles();

//To count the opened windows
int openedwindows = multiplewindows.size();

//To print the opened windows
System.out.println(openedwindows);



//Printing all the window id one by one
//Task - Open google only in child windows 
for (String allwindows : multiplewindows) {
	System.out.println(allwindows);
	if(!allwindows.equals(parentwindow))
	{
		d.switchTo().window(allwindows);
		d.get("https://www.google.co.in/");
		d.close();
	}	
}


//click the third window in parent window, so we switching the windows from child to parent 
d.switchTo().window(parentwindow);

//Click the 3rd window 
WebElement child3 = d.findElement(By.id("messageWindowButton"));
child3.click();


//close all opened windows
d.quit();







////Main window
//String mainwindow= d.getWindowHandle();
//System.out.println("Main window = " +mainwindow);
//
//
////other window
//WebElement newwindow = d.findElement(By.id("windowButton"));
//newwindow .click();
//
//
////d.findElement(By.id("messageWindowButton")).click();
//Set<String> allwindows=d.getWindowHandles();
//
//for(String windows : allwindows)
//{
//	
//	//System.out.println("Opened windows = " +windows);
//	d.switchTo().window(windows);
//	d.navigate().to("https://www.google.com/");//because inga namma get use pani website ula poi irukom, antha page vera website ku poganum na navigate use panuvom.
//}
//d.quit();
//System.out.println("Multiple windows opened and closed successfully");

	}

}

//All the open window have a unique ID called window handle
//Get window handle - To get the separate window ID
//Get window handles - To get the list of Window IDS - set command use pani all windows Id print panuvom intha method ku mattum
//Switch to command - move from one window to another window