package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginscript {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
 WebDriver driver=new FirefoxDriver();
 driver.get("https://www.instagram.com");
 driver.findElement(By.cssSelector("input [name='username']")).sendKeys("navya");
 driver.findElement(By.cssSelector("input [type='password']")).sendKeys("navi@123");
 driver.findElement(By.cssSelector("button [type='submit']")).click();
	}

}
