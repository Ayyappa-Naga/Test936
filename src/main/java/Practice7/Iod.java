package Practice7;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Iod {
	protected static int k=5;
	public static void main(String[] args) 
		
	 throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

	
	FileInputStream fxcel =new  FileInputStream("C:\\Users\\Ayyappa$Naga\\Desktop\\cookie.xlsx");
	Workbook book = WorkbookFactory.create(fxcel);
	Sheet sheet=book.getSheet("Sheet1");
	Row row =sheet.getRow(1);
	Cell cell = row.getCell(0);
	DataFormatter dd=new DataFormatter();
	String value = dd.formatCellValue(cell);
int i =Integer.parseInt(value);
System.out.println(i+22+2);
}
}