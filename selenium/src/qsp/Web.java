package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Computing and Internet']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ id='add-to-cart-button-13']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[.='Fiction'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
		
}

}
