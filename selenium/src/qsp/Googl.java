package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Bengaluru, Karnataka");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='sb_ifc52']/input[@class='tactile-searchbox-input'and@autocomplete='off']")).sendKeys("hubli");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='directions-searchbox-1']/button[@class='mL3xi']")).click();
}
	}



