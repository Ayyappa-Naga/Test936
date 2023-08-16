package main_pkg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Data {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("src/main/resources/pppp.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh =book.getSheet("Sheet1");
		Row r = sh.getRow(0);
		Cell C = r.getCell(0);
		String s=C.getStringCellValue();
		System.out.println(s);

	}

}
