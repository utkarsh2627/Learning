package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant{

	public static String getCellValue(String path,String sheet,int row,int cell) throws IOException {
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook xs=new XSSFWorkbook(fis);
		String cellValue=xs.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
		
	}
}
