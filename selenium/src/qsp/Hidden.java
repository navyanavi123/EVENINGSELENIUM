package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hidden {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("(//div[.='Tue, Aug 16'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='18'])[4]")).click();
		

	}

}
