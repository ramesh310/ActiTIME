package ramesh;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ram10 
{
  public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
  {
	  FileInputStream fis=new FileInputStream("C:\\testdata/userdata.xlsx");
	             Workbook w1 = WorkbookFactory.create(fis);
	                        Sheet s1 = w1.getSheet("Sheet1");
	                        Row r1 = s1.getRow(3);
	                        Cell c1 = r1.getCell(3);	
	                        String s = c1.getStringCellValue();
	                        System.out.println(s);
  }
}
