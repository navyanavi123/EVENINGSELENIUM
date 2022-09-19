package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Yahoonewscript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com");
		driver.findElement(By.xpath("//input[@ type='text']")).sendKeys("navyacb1396@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ type='password']")).sendKeys("navya@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ class='icon mail']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@ data-test-id='compose-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ id='message-to-field']")).sendKeys("manuja0304@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ data-test-id='compose-subject']")).sendKeys("navya resume");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ data-test-id='rte']")).sendKeys("hi dear");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button [@type='button' and @ title='Send this email']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//img[@class='_yb_qt22z']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='profile-signout-link']")).click();
			
	}

}
