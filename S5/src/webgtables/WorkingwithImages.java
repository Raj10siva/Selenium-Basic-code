package webgtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WorkingwithImages {

	public static void main(String[] args) throws InterruptedException {
	
		//Task 
		
		//1. Verify the image is broken or not(2 examples)
		//a. clicking and inspect the first image  and write xpath.
		//b. checking the first image is broken or not by checking the css property.
		//c.if natural width is zero in the css property it is broken image, otherwise image is not broken.

		
		//2 Verify the if you click the image, it goes to the correct page or not.
		//a. Image click pana home page pogum.
		//b. Antha open ana home page oda title and original home page oda title onna iruntha Test case is passed
		//c. Else failed.
		
		
		
		
		
		

		//Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);	
		
		
		
		//Using implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicit wait
		//WebDriverWait wait  = new WebDriverWait(d,Duration.ofSeconds(60));
		
		
		//fetch the url
		d.navigate().to("https://the-internet.herokuapp.com/broken_images");
		
		//maximize the page
		d.manage().window().maximize();
		
	//print the total images in the page and count of the broken images
	List <WebElement> allimages =	d.findElements(By.tagName("img"));
		
	int totalimages =	allimages.size();
	
	System.out.println(totalimages);
	
	int count =0;
	for(WebElement ti : allimages)
	{
		if(ti.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("Image is broken");
			count++;
		}
	}
		
		
	System.out.println("Boken images :"+count);

		
		
		
		
		//clicking and checking the first image is broken or not
		WebElement image1 = d.findElement(By.xpath("//*[@id='content']/div/img[1]"));
		
		//clicking and checking the thrid image is broken or not
		WebElement image3 = d.findElement(By.xpath("//*[@id='content']/div/img[3]"));

		
		//checking the image css property, if natural width is zero it is broken image, otherwise image is not broken.
		if(image1.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("Image 1 is broken");
		}
		else
		{
			System.out.println("Image 1 is not broken");
		}
		
		if(image3.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("Image 3 is broken");
		}
		else
		{
			System.out.println("Image 3 is not broken");
		}
		
		
		Thread.sleep(3000);
		
		d.quit();
		
		
		
		
		
	}

}
