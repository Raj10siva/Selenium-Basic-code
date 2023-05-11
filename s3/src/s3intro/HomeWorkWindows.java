package s3intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkWindows {

	public static void main(String[] args) {
		//Home work
		//1. Open the new Window(It is a parent window)
		//2. Get the URL of Parent window.
		//3. Click the new Window(It is a child window)
		//4. Move the function from parent window to child window.
		//5. Get the child window URL
		//6. Go back to the parent window and Close the parent window
		//7. Go to the child window and  get the Child window URL again.
		//8.Navigate the child window to Google website
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		//Web page
		d.get("https://letcode.in/windows");
		//Maximize the page and Parent class opened.
		d.manage().window().maximize();
		//Getting parent class ID
		String windowhandle = d.getWindowHandle();
		//printing the parent class ID
		System.out.println("First parent Window ID is :" +windowhandle);
		//printing the parent class title
		System.out.println("Parent window title is :" +d.getTitle());
		//printing the parent class URL
		System.out.println("Parent window url is :" +d.getCurrentUrl());
		//1 and 2 completed.
		
		
		
		
		
		//3.CLicking the new window, so I'm inspecting the Open Home page.
		d.findElement(By.id("home")).click();
		//new window opened after clicked
		
		//Move the function from parent window to child window. So we using the getWindowdHandles method(Operating multiple windows)
		//So the return type of getWindowHandles is Set<String> ipo intha setstring la both parent and child id store agi irukum
		
		Set<String> windowhandles = d.getWindowHandles();
		//printing the child class ID
		System.out.println("Second Child window id is : " +windowhandles);
;

		
		
		
		
		//output la parent window ID and child Widnow ID both print agum like arrays, so now our task is to get child window URL
		//Set la return use panamudiyathanala Set la iruka all windows List la add panuvom
		//List <String> objname = new ArrayList<String>(Set Objname)
		
		//4. Move the function from parent window to child window.
		
		List<String> list = new ArrayList<String>(windowhandles);
		d.switchTo().window(list.get(1));
		
		//5. Get the child window URL
		
		System.out.println("Child second window URL is :" +d.getCurrentUrl());
		
		//printing the child window table
		System.out.println("Child second window title is :" +d.getTitle());
		
		// 6. Go back to the parent window and Close the parent window
		
		d.switchTo().window(list.get(0));
		System.out.println("Moved back to parent window");
		
		//7. closing the parent window only so using close method
		d.close();
		System.out.println("parent window closed successfully");


//7. Go to the child window and  get the Child window URL again.

Set<String> windowhandles2 = d.getWindowHandles();
list.clear();
list.addAll(windowhandles2);
d.switchTo().window(list.get(0));
String childwindow = d.getCurrentUrl();
System.out.println("Child second window URL is :" +childwindow);

//Navigate the child window to Google website

d.navigate().to("https://www.google.com/");
System.out.println("Google website opened in child tab.................");

d.quit();

//Task completed

//Doubt question : One doubt.. Iam not much pro in selenium code, knows basics. Can you clarify what if we go to driver. Switchto(). Windows(list.get(0)) ; after closing the parent window?? As the list takes the next one as index 0 automatically and can switch to the child window.. Why we need to define set string and list. Addall again?  Any exception comes?

//Doubt Answer : getWindowHandles return set (linkedhashset). 
//So we are storing in set. 
//In set we don't have an option to use get function ( I have explained in the set and list video why get function is not available). 
//So we are adding all the values from set to list, so that I can use the get function. 

//Now assume we have 2 windows. 
//So get window handles function will return 2.
//We are adding the same in list. So list will also have 2. 
//Now if you close any  of the window then still the list or set size will not change because the browser tab is only closed, the size is not updated.

	}

}
