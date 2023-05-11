package s3intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkboxadvance {

	public static void main(String[] args) throws InterruptedException {

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");



		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(options);

		
		
		d.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		
		WebElement box = d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td/label"));
		
		
		JavascriptExecutor executor = (JavascriptExecutor) d;
		executor.executeScript("scrollTo(0,document.body.scrollHeight)");
		box.click();
		executor.executeScript("scrollTo(0,0)");
		
		
		
		
		d.navigate().to("https://demoqa.com/buttons");
		
		
		
		//button 
		WebElement button = d.findElement(By.id("doubleClickBtn"));

		//find the xy point of the button
		Point xypoint = button.getLocation();
		int x = xypoint.getX();
		int y = xypoint.getY();
		
		System.out.println("X point is :"+x);
		System.out.println("Y point is :"+y);
		
		
		//find the color of the button
		String buttoncolor = button.getCssValue("background-color");
		System.out.println("box color is :"+buttoncolor);
		
		//Find the height and width (size)of the button
		int height = button.getSize().getHeight();
		int width = button.getSize().getWidth();
		
		System.out.println("height of the button is:"+height);
		System.out.println("width of the button is :"+width);
		
		
		d.quit();
		
		
	}

}
