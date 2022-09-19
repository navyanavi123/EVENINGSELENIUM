package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ass {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
    WebElement ele=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
    String att=ele.getAttribute("href");
    System.out.println(att);
    
	}

}
