
package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Childswitch {

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
         Set<String> allwh = driver.getWindowHandles();
     int count = allwh.size();
     System.out.println(count);
     ArrayList<String> l=new ArrayList<String>(allwh);
    int count1 = l.size();
    System.out.println(count1);
 String count3 = l.get(1);
 driver.switchTo().window(count3);
    		 

	}

}
