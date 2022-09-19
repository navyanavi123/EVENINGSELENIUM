package qsp1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datedriven2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./excel/excel.xlsx");
Workbook book = WorkbookFactory.create(fis);
Sheet sh = book.getSheet("Sheet2");
Row ro = sh.createRow(1);
Cell cel = ro.createCell(1);
 cel.setCellValue("navya");
 FileOutputStream fout=new FileOutputStream("./excel/excel.xlsx");
 book.write(fout);

	}

}

