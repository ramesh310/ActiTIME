package Datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BaseClass
{
public static int getRowCount(String SheetName) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Datadriven\\userdata.xlsx");
	Workbook w1 = WorkbookFactory.create(fis);
	return w1.getSheet(SheetName).getPhysicalNumberOfRows();
}
public static int getCellCount(String SheetName,int RowNumber) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Datadriven\\userdata.xlsx");
	Workbook w1 = WorkbookFactory.create(fis);
	return w1.getSheet(SheetName).getRow(RowNumber).getPhysicalNumberOfCells();
}
public static String readData(String SheetName,int rowNumber,int cellNumber) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	try
	{
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Datadriven\\userdata.xlsx");
	Workbook w1 = WorkbookFactory.create(fis);
	Cell c=w1.getSheet(SheetName).getRow(rowNumber).getCell(cellNumber);
	DataFormatter rv=new DataFormatter();
	String s=rv.formatCellValue(c);
	return s;
	}
	catch(Exception ref)
	{
		return "";
	}
}
public static void writeData(String SheetName,int rowNumber,int cellNumber,String data) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	try
	{
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Datadriven\\userdata.xlsx");
	Workbook w1 = WorkbookFactory.create(fis);
	w1.getSheet(SheetName).getRow(rowNumber).createCell(cellNumber).setCellValue(data);
	FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"\\userdata.xlsx");
	w1.write(fos);
	}
	catch(Exception ref)
	{
	   
	}
}
	
}

