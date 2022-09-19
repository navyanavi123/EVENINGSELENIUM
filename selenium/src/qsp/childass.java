package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		String p_id = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
	  	 Set<String> allwh = driver.getWindowHandles();
	  	Thread.sleep(2000);
	  	 int count = allwh.size();
	  	 System.out.println(count);
	  	 for(String wh:allwh)
	  	 {
	  		 if(wh.equals(p_id))
	  		 {
	  		 driver.switchTo().window(wh);
	  		String title = driver.getTitle();
	  		 System.out.println(title);
	  		 driver.close();
	  	 }
	

	}
	}
}


