package webgtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtable {

	public static void main(String[] args) {
	
		//Launch browser

		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		
		//Go to the Web page
		d.get("http://demo.guru99.com/test/web-table-element.php");
		
		//Maximize the page
		d.manage().window().maximize();
		
		
//count the number of coloumns(table la 5 coloumns iruku so List use pani irukom and FindElements use pani irukom)
List cols = d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
System.out.println("Number of coloumns :" +cols.size());
// A B C D E (intha mari 5 column iruku na A la inspect pani athuku xpath eduthu ezuthanum last la th[1] irukartha th nu mathanum, th[1] na A mattum denote panum, namaku ela column venum so 1 eduthudanum)



//count the number of rows(table la neraya rows iruku so List use pani irukom and FindElements use pani irukom)
List rows = d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
System.out.println("Number of rows :" +rows.size());
//1 2 3 4 5 6 (intha mari neraya rows irukum athula 1 la vechu inspect pani athuku xpath ezuthuvom, then tr[1] a tr nu mathi last la iruka a va eduthutu irupom)


//Motha table a access panna ezuthura code, because athula irunthu specific row data and column data edukka 
WebElement basetable= d.findElement(By.tagName("Table"));


//to get the specific tablerow data 1 row la iruka ela data edukarom
WebElement tablerow = basetable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]"));
String rowdata= tablerow.getText();
System.out.println("Row data :" +rowdata);


//to get the specific column data - that means A la 10th row la ena iruku
WebElement tablecell = basetable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]/td"));
String celldata= tablecell.getText();
System.out.println("cell data :" +celldata);



//close the window
d.close();

	}
}
