package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileupload {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/NAVYA%20C%20B/OneDrive/Desktop/file.html");
	WebElement ele = driver.findElement(By.name("upload file"));
	ele.sendKeys("C:\\Users\\NAVYA C B\\OneDrive\\Desktop\\Screenshot 2022-06-04 231353.png");

	}

}
