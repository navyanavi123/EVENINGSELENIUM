package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DD1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/NAVYA%20C%20B/OneDrive/Desktop/dd.html");
		Thread.sleep(2000);
	  WebElement abc=driver.findElement(By.id("empire"));
	  Select s=new Select(abc);
	  Thread.sleep(2000);
	  s.selectByIndex(1);
	  Thread.sleep(2000);
	  s.selectByValue("k");
	  Thread.sleep(2000);
	  s.deselectByVisibleText("fish fry");
	  Thread.sleep(2000);
	  s.deselectAll();
	  
	}  
}
