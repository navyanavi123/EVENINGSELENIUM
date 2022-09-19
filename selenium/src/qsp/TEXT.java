

package qsp;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TEXT{

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/NAVYA%20C%20B/OneDrive/Desktop/text.html");
	Thread.sleep(2000);
  List<WebElement> abc=driver.findElements(By.xpath("//input"));
  int count =abc.size();
    System.out.println(count);
    for(WebElement we:abc)
    {
    	we.sendKeys("NAVAY");
    }
    for(int i=count-1;i>=0;i--)
    {
    	WebElement ee=abc.get(i);
         ee.clear
         ();
    
    }
}
}