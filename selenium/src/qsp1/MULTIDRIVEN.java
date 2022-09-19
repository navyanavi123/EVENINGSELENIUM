
package qsp1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MULTIDRIVEN {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
FileInputStream fis=new FileInputStream("./excel/excel.xlsx");
Workbook book = WorkbookFactory.create(fis);
Sheet sh = book.getSheet("Sheet3");
System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in");
Thread.sleep(2000);
List<WebElement> links = driver.findElements(By.xpath("//a"));
for(int i=0; i<links.size(); i++)
{
	Row ro = sh.createRow(i);
	Cell cel = ro.createCell(0);
	 cel.setCellValue(links.get(i).getAttribute("href"));	
}
 FileOutputStream fout=new FileOutputStream("./excel/excel.xlsx");
 book.write(fout);

	}

}

