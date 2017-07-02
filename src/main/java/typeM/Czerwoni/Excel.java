package typeM.Czerwoni;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class Excel {

	public void readXLS(String path_xls) throws Exception {

		HSSFSheet sheet;
		POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream("C:\\Users\\student\\Desktop\\Kowalski_Jan.xls"));
		HSSFWorkbook wb = new HSSFWorkbook(fs);
		sheet = wb.getSheetAt(0);
		// HSSFRow row = sheet.getRow(0);

	
	
		
			
			for (int u = 1; u < 200; u++) {
			
				
				
				if (sheet.getRow(u)!= null) {
				if(sheet.getRow(u).getCell(0) != null && sheet.getRow(u).getCell(1) != null && sheet.getRow(u).getCell(2) != null) {

			System.out.println("" + sheet.getRow(u).getCell(0).toString());
			System.out.println("" + sheet.getRow(u).getCell(1).toString());
			System.out.println("" + sheet.getRow(u).getCell(2).toString());
				}}}
		}

	
}
