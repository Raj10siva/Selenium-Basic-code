package webgtables;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownload {

	
	//File download concept.
	//1. open the specific file download URL.
	//2. Inspect the download file by linkText and click it and write it using Explicit wait to avoid elementclickableIntercept exception
	//3. After downloaded the file, we have to save it in the specific location. So created File class and pass the location path into arguments. 
	//4. After that get all files from the saved location and save it into the File array type.
	//5. Then Create for each loop and check or validate the downloaded file name contains "xxx".
	//6. If it is downloaded print it downloaded and break function activated.
	//7. Then finally close the browser.
	
	
	public static void main(String[] args) throws InterruptedException {
		//Launch browser

		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);		

		//to load the Web page
		d.get("https://www.selenium.dev/downloads/");
		
		
		//Maximze the page
		d.manage().window().maximize();
		
		
		//file after 5 sec mela the download a click pana mudithu, so web driver
		//use pani irukan
		
		WebDriverWait wait  = new WebDriverWait(d,Duration.ofSeconds(60));
		
		//Inspect the file to download
		WebElement download =	d.findElement(By.linkText("32 bit Windows IE"));
		wait.until(ExpectedConditions.elementToBeClickable(download));
		download.click();
		
		
		//download aga sometime agum, so thread.sleep koduthu irukam
		Thread.sleep(5000);
		
		//file download agutha nu console la print aga
		System.out.println("File is downloading");
		
	
		//intha file location la namma download panna file iruka nu thedi paaka file class use panrom.
		File f = new File("C:\\Users\\rkche\\Downloads");//location passed
		
		
		//conseole la file search nu print agum
		System.out.println("File is searching");

		
		//intha file location la iruka ela files um paaka list file method use panrom.
		File [] totalfiles =	f.listFiles();
		
		
		//to count the number of files (for array la size use pana matom, length use panuvom)
		int count = totalfiles.length;
		
		//to print the count
		System.out.println(count);
			
		
		//download ana file iruntha files is founded code use pani irukom.
		for (File allfile : totalfiles)
		{
			String filename = allfile.getName();
			
			if(filename.contains("32"))
			{
				System.out.println("file is found ");
				break;
			}
		}
		
		//close the browser
		d.quit();	
			
			

		
	}
}
