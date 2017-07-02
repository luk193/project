package typeM.Czerwoni;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class Excel {

	public void readXLS(String path_xls) throws Exception {

		HSSFSheet sheet;
<<<<<<< HEAD
		POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream("C:\\Users\\student\\Desktop\\gh2.xls"));
=======
		POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream("C:\\Users\\student\\Desktop\\Kowalski_Jan.xls"));
>>>>>>> 8c8f52a7aa869ab895b0fac88380b2e9b039ac35
		HSSFWorkbook wb = new HSSFWorkbook(fs);
		sheet = wb.getSheetAt(0);
		// HSSFRow row = sheet.getRow(0);

<<<<<<< HEAD
		int i = 0;

		while (sheet.getRow(i) != null) {

			try {
				System.out.println("" + sheet.getRow(i).getCell(0).toString());
				System.out.println("" + sheet.getRow(i).getCell(1).toString());
				System.out.println("" + sheet.getRow(i).getCell(2).toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
			}
			i++;
=======
	
	
		
			
			for (int u = 1; u < 200; u++) {
			
				
				
				if (sheet.getRow(u)!= null) {
				if(sheet.getRow(u).getCell(0) != null && sheet.getRow(u).getCell(1) != null && sheet.getRow(u).getCell(2) != null) {

			System.out.println("" + sheet.getRow(u).getCell(0).toString());
			System.out.println("" + sheet.getRow(u).getCell(1).toString());
			System.out.println("" + sheet.getRow(u).getCell(2).toString());
				}}}
>>>>>>> 8c8f52a7aa869ab895b0fac88380b2e9b039ac35
		}

	
}
