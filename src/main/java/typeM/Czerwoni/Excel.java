package typeM.Czerwoni;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class Excel {

	public void readXLS(String path_xls) throws Exception {

		HSSFSheet sheet;
		POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream("C:\\Users\\student\\Desktop\\gh.xls"));
		HSSFWorkbook wb = new HSSFWorkbook(fs);
		sheet = wb.getSheetAt(0);
		// HSSFRow row = sheet.getRow(0);

		int i = 0;

		while (sheet.getRow(i) != null) {

			System.out.println("" + sheet.getRow(i).getCell(0).toString());
			System.out.println("" + sheet.getRow(i).getCell(1).toString());
			System.out.println("" + sheet.getRow(i).getCell(2).toString());
			i++;
		}

	}
}
