package demowebshop_app.utilitypackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Readmultipleexcel {
	FileInputStream fis;
	Workbook wb;
	public Object[][] fetchexcelvalue(String sheetName) {
	
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
	int rowCount=sheet.getPhysicalNumberOfRows();
	int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
	Object[][] data=new Object[rowCount-1][cellCount];
	for(int i=1;i<rowCount;i++) {
		for(int j=0;j<cellCount;j++) {
			data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
		}
	}
    return data;
}
	public static void main(String[] args) {
		Readmultipleexcel read = new Readmultipleexcel();
		Object[][] data = read.fetchexcelvalue("Sheet1");
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(data[i][j]);
			}

}
	}
	}
