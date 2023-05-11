package s3intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		
		//dropdown Handling?
		//It is nothing but handling the dropdowns during the test execution
		
		//How to handle dropdowns?
		//we can handle the dropdowns using select class.
		//Create object for select class
		//pass the web element as an argument
		
		
		//what are the methods to select the options in dropdown?
		//selectByIndex(0);
		//selectByValue(value);//value that is present in the dom
		//selectByVisibleText("option ena katutho atha type pananum");
		
		
		//how to print the selected option in dropdown?
		//get.firstSelectedOption().getText();
		
		//how to print the all options in the drop down?
		//getOptions();
		
		
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		//open web page
		d.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

		//maximize
		d.manage().window().maximize();

		//click the dropdown button
		WebElement dropdown = d.findElement(By.id("RESULT_RadioButton-9"));
		Select select=new Select(dropdown);
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByValue("Radio-1");
		Thread.sleep(3000);
		//select.selectByVisibleText("Afternoon");
		//Thread.sleep(3000);


		//drop down la select panra option a print panrathuku intha method, sopt object la store pani athula ena text iruku nu get panrom
		WebElement sopt = select.getFirstSelectedOption();
		String selectedoption = sopt.getText();
		System.out.println("Selected option is :" +selectedoption);

//To print all options in dropdown

		List<WebElement> list = select.getOptions();
		System.out.println("All options :");
		for(WebElement a : list)
		{
			System.out.println(a.getText());
		}


System.out.println("");
System.out.println("Project completed.............");
	}
}
