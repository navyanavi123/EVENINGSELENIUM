package qsp1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Synchoronization{

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com");
		driver.findElement(By.xpath("//a[.='Best Sellers']")).click();
		driver.findElement(By.xpath("//a[.='Mobiles']")).click();
		driver.findElement(By.xpath("//a[.='Best Sellers']")).click();
		driver.findElement(By.xpath("//a[.='Best Sellers']")).click();
		driver.findElement(By.xpath("//a[.='Best Sellers']")).click();
		driver.findElement(By.xpath("//a[.='Best Sellers']")).click();
	}

}



