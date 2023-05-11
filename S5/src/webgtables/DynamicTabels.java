package webgtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicTabels {

	public static void main(String[] args) {
		//Launch browser

System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver d = new ChromeDriver(options);

//Web page
d.get("http://demo.guru99.com/test/web-table-element.php");

//Maximize the page
d.manage().window().maximize();

//finding the number of columns
List<WebElement> columns=d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
System.out.println("Number of coloumns in the table is :" +columns.size());



//finding the number of rows in the table
List rows=d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
System.out.println("Number of rows in the table is :" +rows.size());



//Find the table
WebElement Btable = d.findElement(By.xpath("//div[@id='leftcontainer']/table"));

//Find the specific row all datas and get the datas
WebElement row3 = Btable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
String row = row3.getText();
System.out.println("3rd row data is :" +row);





//Find the specific row specific data and get the data
WebElement cell = Btable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td[3]"));
String scell = cell.getText();
System.out.println("2nd row data cell or column value 3 is :" +scell);

d.quit();


	}

}
