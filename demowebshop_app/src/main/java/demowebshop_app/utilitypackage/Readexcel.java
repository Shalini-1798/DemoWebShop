package demowebshop_app.utilitypackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Readexcel {
	FileInputStream fis;
	Workbook wb;
	public String fetchexcelvalue(String sheetName,int rowNum,int cellNum) {
	
	try {
		 fis=new FileInputStream("./src/test/resources/demosingleexcel.xlsx");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		 wb=WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Sheet sheet=wb.getSheet(sheetName);
	Row row=sheet.getRow(rowNum);
	Cell cell=row.getCell(cellNum);
	String data=cell.getStringCellValue();
	return data;
	
	}
	public static void main(String[] args) {
		Readexcel read=new Readexcel();
		System.out.println(read.fetchexcelvalue("Sheet1", 0, 0));
	}

}
