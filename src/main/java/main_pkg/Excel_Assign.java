package main_pkg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Assign {

	public static void main(String[] args)throws Throwable {
		FileInputStream fis = new FileInputStream("./src/main/resources/macro.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		int y=sh.getLastRowNum();
		for(int i=0;i<=y;i++) {
			Row row =sh.getRow(i);
			if(row==null) {
				continue;
			}for(int j=0;j<=1;j++) {
			Cell c= row.getCell(j);
			if(c==null) {
				continue;
			}
			DataFormatter format= new DataFormatter();
			String s= format.formatCellValue(c);
			System.out.println(s);
			
		}
		}
		

	}

}
