package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclnewtab {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
        WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
        Actions act=new Actions(driver);
         act.contextClick(ele).perform();
          Robot r =new Robot();
           r.keyPress(KeyEvent.VK_T);
           r.keyRelease(KeyEvent.VK_T);

	}

}
