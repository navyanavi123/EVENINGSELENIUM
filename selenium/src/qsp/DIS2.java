

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DIS2 {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
 WebDriver driver=new FirefoxDriver();
 driver.get("https://www.amazon.in/");
 Thread.sleep(2000);
WebElement ele = driver.findElement(By.xpath("//a[.='Facebook']"));
      Point opt = ele.getLocation();
   int x = opt.getX();
        int y = opt.getY();
 Thread.sleep(2000);
 JavascriptExecutor js=(JavascriptExecutor) driver;
 Thread.sleep(2000);
 js.executeScript("window.scrollBy("+x+","+y+")");
 Thread.sleep(2000);
 ele.click();
 driver.close();
 
 

}
}