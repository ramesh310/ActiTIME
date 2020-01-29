package ram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation 
{
  public static String readData(String SheetName,int rowNum,int cellNum) throws EncryptedDocumentException, InvalidFormatException, IOException
  {
	  try {
	  FileInputStream fis=new FileInputStream("C:\\testdata/userdata.xlsx");
	                  Workbook w1 = WorkbookFactory.create(fis);
					String s=w1.getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
					return s;
	  }
	  catch(Exception ref)
	  {
		  return "";
	  }
  }
  public static void writeData(String SheetName,int rowNum,int cellNum,String act) throws EncryptedDocumentException, InvalidFormatException, IOException
  {
	  try
	  {
	  FileInputStream fis=new FileInputStream("C:\\testdata/userdata.xlsx");
      Workbook w1 = WorkbookFactory.create(fis);
      w1.getSheet(SheetName).getRow(rowNum).createCell(cellNum).setCellValue(act);
      FileOutputStream fos=new FileOutputStream("C:\\testdata/userdata.xlsx");
      w1.write(fos);
	  }
	  catch(Exception ref) 
	  {
		  
	  }
  }
}
