package main_pkg;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel_ent {

	public static void main(String[] args)throws Throwable {
		FileInputStream fis = new FileInputStream("src/main/resources/micro.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		
			Sheet sh =book.getSheet("Sheet1");
System.out.println(sh.getLastRowNum());
for(int i=0;i<=sh.getLastRowNum();i++) {
	 Row r = sh.getRow(i);
	 if(r==null) {
		 continue;
	 }
	 Cell c= r.getCell(0);
	 DataFormatter format = new DataFormatter();
	String s= format.formatCellValue(c);
	System.out.println(s);
 
			
	}}

}
