package practice.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoi {

	public static void main(String... arg) throws IOException {
		// Path of the excel file
		String path = "C:\\Users\\User\\Desktop\\Book1.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastRow = sheet.getLastRowNum();
		System.out.println("Last row- " + lastRow);
		for (int i = 0; i <= lastRow; i++) {
			Row row = sheet.getRow(i);
			int lastCell = row.getLastCellNum();
			for (int j = 0; j < lastCell; j++) {
				Cell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
				Scanner sc = new Scanner(System.in);
				String s1 = sc.nextLine().toLowerCase();
				String s2 = sc.nextLine().toLowerCase();
				for (int k = 0; k < s1.length(); k++) {
					if (s1.charAt(i) == (s2.charAt(i))) {

					}
				}
			}
		}
	}
}
