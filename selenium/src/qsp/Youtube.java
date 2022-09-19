package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ id='search']")).sendKeys("pwd exam");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[@aria-label='PWD Exam Scam : PWD ಕೇಸ್‌ನಲ್ಲಿ ವೀರಣ್ಣ ಗೌಡನೇ ಪ್ರಮುಖ ಆರೋಪಿ | Jabardasth | NewsFirst Kannada by NewsFirst Kannada 2 months ago 8 minutes, 52 seconds 5,273 views']")).click();
		}
}
