import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.support.ui.Select;
public class DropdownClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver webDriver=new ChromeDriver();
		
		webDriver.get("http://demo.guru99.com/test/newtours/register.php");
		//webDriver.get("http://jsbin.com/osebed/2");
		
		webDriver.manage().window().maximize();
		
		
		// Dropdown Single selection
		
		
		
	//	webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	//	Select countyDropdown=new Select(webDriver.findElement(By.name("country")));
		
		Select countyDropdown = new Select(webDriver.findElement(By.xpath("//select[@name=\"country\"]")));
	
		countyDropdown.selectByVisibleText("INDIA");
		//countyDropdown.selectByIndex(2);
		//countyDropdown.selectByIndex(3);
	
		
		//Dropdown multiple selection
		
		//webDriver.get("http://jsbin.com/osebed/2");
		
		
		//webDriver.manage().window().maximize();
		
		//Select multipleSelect=new Select(webDriver.findElement(By.id("fruits")));
		
		//multipleSelect.selectByVisibleText("Banana");
		//multipleSelect.selectByIndex(3);
		//multipleSelect.selectByIndex(2);
		
		
	}

	
	
}
