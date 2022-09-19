package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com");
		driver.findElement(By.xpath("//input[@ type='text']")).sendKeys("navyacb1396@yahoo.com");
		driver.findElement(By.xpath("//input[@ type='submit']")).click();
		driver.findElement(By.xpath("//input[@ type='password']")).sendKeys("navya@12345");
		driver.findElement(By.xpath("//button[@ type='submit']")).click();
		driver.findElement(By.xpath("//div[@ class='icon mail']")).click();
		driver.findElement(By.xpath("//a[@ data-test-id='compose-button']")).click();
		driver.findElement(By.xpath("//input[@ id='message-to-field']")).sendKeys("manuja0304@yahoo.com");
		driver.findElement(By.xpath("//input[@ data-test-id='compose-subject']")).sendKeys("navya resume");
		driver.findElement(By.xpath("//div[@ data-test-id='rte']")).sendKeys("hi dear");
		driver.findElement(By.xpath("//button [@type='button' and @ title='Send this email']")).click();

	}

}



