package DataDrivenFramework;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{

	public String readExcelData( String excelpath, String sheetName,	int rowCount,int cellCount  ) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis); 
		Sheet sh = wb.getSheet(sheetName);  
		Row row = sh.getRow(rowCount); 
		Cell cell = row.getCell(cellCount);  
		String data = cell.getStringCellValue(); 
		System.out.println(data);
		return data;
		
	}

	public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis); 
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;  
	}

	public String readPropertyData(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
	


