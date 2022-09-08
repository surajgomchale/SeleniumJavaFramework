
package handlingExcelFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataExcelSheet {

	
		

			public static void main(String[] args) throws EncryptedDocumentException, IOException {
				FileInputStream fis = new FileInputStream("./data/ActiTimeValidTestData.xlsx");
				Workbook wb = WorkbookFactory.create(fis); //make file ready to read operation
				Sheet sh = wb.getSheet("validcrds");  //go to specified sheet
				Row row = sh.getRow(5);  //go to specified row
				Cell cell = row.createCell(5);  //go to specified column
				cell.setCellValue("shiv");
				
				FileOutputStream fos = new FileOutputStream("./data/ActiTimeValidTestData.xlsx");
				wb.write(fos);
			}

		}

	


