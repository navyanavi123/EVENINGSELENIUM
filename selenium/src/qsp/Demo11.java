package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NAVYA%20C%20B/OneDrive/Desktop/navi.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();
		}
}
