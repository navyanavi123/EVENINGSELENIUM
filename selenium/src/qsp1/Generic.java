package qsp1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.xml.crypto.Data;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generic {

	public static void getphoto(WebDriver driver) throws IOException {
	String photo="./photos/";
	Data d=(Data) new Date();
	String d1 = d.toString();
     String d2 = d1.replaceAll(":", "-");
     TakesScreenshot ts=(TakesScreenshot) driver;
     File src = ts.getScreenshotAs(OutputType.FILE);
	File dst = new File(photo+d2+".jpeg");
	 FileUtils.copyFile(src, dst);

		


	}

}


