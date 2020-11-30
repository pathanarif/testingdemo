
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseEvenClass {

	
	public static void main(String[] args) {
		
		
		WebElement username,password,btnSubmit,house_keeping,master_data,departments,search_department;
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver webDriver=new ChromeDriver();
		
		webDriver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		webDriver.get("https://societywerx.com/societywerx/login/login");
		
	    webDriver.manage().window().maximize();
		
		username=webDriver.findElement(By.xpath("//*[@id=\"email\"]"));
		password=webDriver.findElement(By.xpath("//*[@id=\"password\"]"));
		btnSubmit=webDriver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input"));
		
		
		username.sendKeys("chairman@sangria.com");
		password.sendKeys("chai1234");
		btnSubmit.click();
		
		Actions action=new Actions(webDriver);
		
		house_keeping=webDriver.findElement(By.xpath("/html/body/div[3]/div[1]/section/div/div[3]/div/div/div[2]/div[1]/div/button"));
		
		String background_color=house_keeping.getCssValue("border-bottom-color");
		System.out.println("before BAckground color"+ background_color);
		
		Action mouse_over=action.moveToElement(house_keeping).build();
		mouse_over.perform();
		
		String background_color1=house_keeping.getCssValue("border-bottom-color");
		
		System.out.println("After BAckground color"+ background_color1);
		
	}
}
