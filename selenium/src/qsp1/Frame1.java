package qsp1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		WebElement text1 = driver.findElement(By.xpath("//body"));
		String t = text1.getText();
		System.out.println(t);
		driver.switchTo().frame(0);
		WebElement text2 = driver.findElement(By.id("//p[.='Child Iframe']"));
		String t2 = text2.getText();
		System.out.println(t2);
		driver.switchTo().defaultContent();
		driver.close();

	}

}
