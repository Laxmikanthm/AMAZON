package com.cigniti.utilities;

import java.io.File;
import java.util.HashMap;

import com.sun.jna.StringArray;

import jxl.LabelCell;
import jxl.Sheet;
import jxl.Workbook;

import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Data_Provider {

	//public static Property configProps=new Property("config.properties");
	/**
	 * Read data from excel sheet using data provider
	 * 
	 * @param sheetName
	 * 
	 * @throws Exception
	 * @Date  19/02/2013
	 * @Revision History
	 * 
	 */

	public static String[][] getTableArray(String sheetName) throws Exception{
		try{
			
			Workbook workbook = Workbook.getWorkbook(new File("Data\\TestData.xls"));
			Sheet sheet = workbook.getSheet(sheetName);
			int rows = sheet.getRows();
			int cols = sheet.getColumns();
			
			String[][] tabArray=new String[rows-1][cols];
			
		
		
		

			for (int i=1;i<rows;i++){
				for (int j=0;j<cols;j++){
					tabArray[i-1][j]=sheet.getCell(j,i).getContents();
				}
			}

			workbook.close();
			return(tabArray);
		}
		catch (Exception e) {
			System.out.println(e+Thread.currentThread().getStackTrace()[1].getClassName()+" dataprovider");
			return null;
		}

	}
	
	public static HashMap<String, String> data() throws Exception {
		try {
			HashMap<String, String> a = new HashMap<String, String>();
			Workbook workbook = Workbook.getWorkbook(new File("Data\\TestData.xls"));
			Sheet sheet = workbook.getSheet(1);
			int rows = sheet.getRows();
			int cols = sheet.getColumns();
			
			for (int i=0;i<rows-1;i++){
				for (int j=0;j<cols;j++){
					a.put(sheet.getCell(0,j).getContents(),sheet.getCell(i+1,j).getContents());
				}
			}
			
			return a ;
		}
		catch (Exception e) {
			e.getStackTrace();
			return null;
		}	
		
	}
	
	public static void setTableData(String sheetName,String uname,String text,int offset) throws Exception
	{
		Workbook work = Workbook.getWorkbook(new File("Data\\TestData.xls"));
		WritableWorkbook writer = Workbook.createWorkbook(new File("TestData\\TestData.xls"),work);
		//Workbook workbook = Workbook.getWorkbook(new File("TestData\\TestData.xls"));
		WritableSheet sheet = writer.getSheet(sheetName);
		LabelCell cell = sheet.findLabelCell(uname);
		//Cell cell = sheet.findCell(uname, 0, 0, 1000, 1000, false);
		
		sheet.addCell(new jxl.write.Label(cell.getColumn()+offset,cell.getRow() ,text));
		
		writer.write();
		writer.close();
		work.close();
	}


}
