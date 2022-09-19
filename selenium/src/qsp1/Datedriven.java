package qsp1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datedriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./excel/excel.xlsx");
Workbook book = WorkbookFactory.create(fis);
Sheet sh = book.getSheet("Sheet1");
Row ro = sh.getRow(0);
Cell cel = ro.getCell(0);
String value = cel.getStringCellValue();
System.out.println(value);

	}

}
