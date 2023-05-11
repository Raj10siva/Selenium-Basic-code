package s3intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Example1 {

	public static void main(String[] args) {

		//Launh browser

		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");



ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver d = new ChromeDriver(options);



//open web page
d.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		//maximize
d.manage().window().maximize();
//first name
d.findElement(By.id("RESULT_TextField-1")).sendKeys("Raj");



//last name
d.findElement(By.id("RESULT_TextField-2")).sendKeys("Kumar");
//phone number
d.findElement(By.name("RESULT_TextField-3")).sendKeys("7010795583");
//country
d.findElement(By.name("RESULT_TextField-4")).sendKeys("India");
//city
d.findElement(By.name("RESULT_TextField-5")).sendKeys("Chennai");
//email address
d.findElement(By.name("RESULT_TextField-6")).sendKeys("Geethraj143@gmail.com");

//radiobox
WebElement box = d.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label"));
box.click();
System.out.println("Radio clicked");

//checkbox
WebElement check=d.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[2]/td/label"));
check.click();
System.out.println("Checkbox clicked");

//drop down
Select drop=new Select(d.findElement(By.xpath("//*[@id=\'RESULT_RadioButton-9\']")));
drop.selectByVisibleText("Morning");
System.out.println("Drop down selected");


//print the selected option
String selectedoption = drop.getFirstSelectedOption().getText();

System.out.println(selectedoption);

//print and count all the options


List<WebElement>alloptions = drop.getOptions();

int totaloptions = alloptions.size();
System.out.println(totaloptions);
for(WebElement allop : alloptions)
{
	System.out.println(allop.getText());
}






//upload a photo
WebElement upload = d.findElement(By.name("RESULT_FileUpload-10"));
upload.sendKeys("C:\\Users\\rkche\\OneDrive\\Desktop//Flo.jpg");
System.out.println("Photo uploaded");	


//submit
d.findElement(By.name("Submit"));
System.out.println("Submitted....................");


	}
}
