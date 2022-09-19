package qsp;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ass2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
    WebElement ele=driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
    Point loc=ele.getLocation();
    System.out.println(loc);
  int  X=loc.getX();
  System.out.println(X);
  int Y=loc.getY();
  System.out.println(Y);
  
    
	}

}


