package generalUtilities;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class ReadXl
{
	FileInputStream myFile;
	Workbook myBook;
	Sheet mySheet;
	
	public Sheet bringMySheet(String sheetName)
	{
		try {
			myFile = new FileInputStream("TestData/TestData.xls");
			 myBook = Workbook.getWorkbook(myFile);
			 mySheet = myBook.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mySheet;
	}
	
	public int getRowCount(String sheetName)
	{
		mySheet = bringMySheet(sheetName);
		return mySheet.getRows();
	}
	public int getColumnCount(String sheetName)
	{
		mySheet = bringMySheet(sheetName);
		return mySheet.getColumns();
	}
	public String getCellData(String sheetName,int colNum,int rowNum)
	{
		mySheet = bringMySheet(sheetName);
		return mySheet.getCell(0, 1).getContents();
	}
	

}
