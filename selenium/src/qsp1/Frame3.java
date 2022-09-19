package qsp1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://snowcityblr.com/");
		driver.findElement(By.xpath("//a[@class='nav-top-link' and .='Contact Us']")).click();
		WebElement frame1 = driver.findElement(By.xpath("//div[@class='col-inner']/iframe"));
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//div[.='Directions']")).click();
		

	}

}
