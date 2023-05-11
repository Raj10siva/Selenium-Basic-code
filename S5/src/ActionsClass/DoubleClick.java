package ActionsClass;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class DoubleClick {

	public static void main(String[] args) throws Exception {
		//double click method - it is action Class method.
		//doubleClick(): Performs double click on the element
		
		
		

		//To create a blank or dummy html
		ExtentSparkReporter reporter = new ExtentSparkReporter("TestReport.html");//file name and file html la irukanum nu last a html koduthu irukom
		
		//To create a actual or original report
		ExtentReports extent = new ExtentReports();
		
		//original report kuda dummy report a attatch pananum. so original report la iruka elam dummy report la store panna
		extent.attachReporter(reporter);
		
		//create test
		ExtentTest test = extent.createTest("TC001 - Double clicked Operation");//chumma test case id and name ipdi koduthupom work la
		test.pass("Test case passed and double click Performed");
		
		//save the report
		extent.flush();

		
		
		
		
		
		
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d = new ChromeDriver(co);		
		
		
		
		//Fetch Web page
		d.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Maximize the page
		d.manage().window().maximize();
		
		//Implicitly wait
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Inspecting the double click button.
		WebElement Doubleclick = d.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		System.out.println("Inspected the double click button successfully");
		
		//performing action class for double click method
		Actions actions = new Actions(d);
		

		
		actions.doubleClick(Doubleclick).build().perform();//doubleClick()- is a method name to perform double click the button.
		
		//Verification
		System.out.println("Double click clicked double times");
		

		//Moving the driver to alert window
		Alert alt = d.switchTo().alert();
		

		//Getting the alrt text
		System.out.println(alt.getText());
		
		Thread.sleep(5000);
		
		//Accept the Alert message
		alt.accept();
		
		
		
		//screenshot code after alert appeared
		TakesScreenshot screenshot = (TakesScreenshot)d;
		
		File source =	screenshot.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\rkche\\OneDrive\\Desktop\\alert.jpg");
		
		FileHandler.copy(source, destination);
		
		System.out.println("Screenshot Taken");
		
		

		
		//close the all the browsers
		d.quit();
		
		
	
		
		
		
		


	}

}
