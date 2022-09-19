

package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Childspecific {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		String p_id = driver.getWindowHandle();
	  	 Set<String> allwh = driver.getWindowHandles();
	  	Thread.sleep(2000);
	  	 int count = allwh.size();
	  	 System.out.println(count);
	  	 for(String wh:allwh)
	  	 {
	  		 driver.switchTo().window(wh);
	  		String title = driver.getTitle();
	  		 System.out.println(title);
	  		 if(title.equals("About me - qavalidation"))
	  		 {
	  			 driver.close();
	  	 }
	
		
		

	}

}




}


