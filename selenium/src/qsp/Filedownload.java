package qsp;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filedownload {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.selenium.dev/downloads/");
	driver.findElement(By.xpath("//a[.='4.4.0]'")).click();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_LEFT);

	}

}
