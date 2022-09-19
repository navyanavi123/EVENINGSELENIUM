package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facbook.com");
		driver.findElement(By.xpath("//input[@ id='email']")).sendKeys("navay");
		driver.findElement(By.xpath("//input[@ id='pass']")).sendKeys("na123");
		driver.findElement(By.xpath("//button[@ type='submit']")).click();

	}

}
