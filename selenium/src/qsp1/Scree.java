package qsp1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scree {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		 TakesScreenshot ts=(TakesScreenshot) driver;
		      File src = ts.getScreenshotAs(OutputType.FILE);
		            File dst = new File("C:\\Users\\NAVYA C B\\OneDrive\\Pictures\\SELSShorts\\amz.jpeg");
		            FileUtils.copyFile(src, dst);

		


	}

}

