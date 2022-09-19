package qsp;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DISABLED {

	public static void main(String[] args) {
 System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
 WebDriver driver=new FirefoxDriver();
 driver.get("file:///C:/Users/NAVYA%20C%20B/OneDrive/Desktop/dis.html");
 JavascriptExecutor js=(JavascriptExecutor) driver;
 js.executeScript("document.getElementById('t1').value='selenium'");

	}

}
