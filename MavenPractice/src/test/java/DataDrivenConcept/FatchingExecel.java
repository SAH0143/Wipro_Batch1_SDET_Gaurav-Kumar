package DataDrivenConcept;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FatchingExecel {

	public static void main(String[] args) throws Exception {

		// Excel file path
		FileInputStream file = new FileInputStream("C:/Users/Sakshi Sneha/Desktop/DataDrivenBook.xlsx");

		// Open workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// Open sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		// Read data from row 1
		String username = sheet.getRow(1).getCell(0).getStringCellValue();

		String password = sheet.getRow(1).getCell(1).getStringCellValue();

		// Print data
		System.out.println("Username : " + username);

		System.out.println("Password : " + password);

		// Close workbook
		workbook.close();

		// Close file
		file.close();
	}
}