package typeM.Czerwoni;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import typeM.Czerwoni.model.Record;

public class Excel {

	public void readXLS(ArrayList<String> Sciezki_plikow_xls) throws Exception {
		
		ArrayList<Record> All_data = new ArrayList<>();
		

		for (String path : Sciezki_plikow_xls) {
			
			
			

			POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(path));
			HSSFWorkbook wb = new HSSFWorkbook(fs);

			HSSFSheet sheet;
			int i = 0;
			while (wb.getSheetAt(i) != null) {
				double h = 0;
				String year;
				String month;
				
				
				Record simple_record = new Record();
				sheet = wb.getSheetAt(i);
				// HSSFRow row = sheet.getRow(0);
				
				simple_record.setProject(sheet.getSheetName());
				
				//nazwisko i imie do zaimplementowania

				for (int u = 1; u < 200; u++) {

					try {
						h=  h + sheet.getRow(u).getCell(2).getNumericCellValue();
						
					}
					catch(Exception e) {
						
					}
					
					simple_record.setHours(h);
					
					
					
				/*	if (sheet.getRow(u) != null) {
						if (sheet.getRow(u).getCell(0) != null && sheet.getRow(u).getCell(1) != null
								&& sheet.getRow(u).getCell(2) != null) {

							System.out.println("" + sheet.getRow(u).getCell(0).toString());
							System.out.println("" + sheet.getRow(u).getCell(1).toString());
							System.out.println("" + sheet.getRow(u).getCell(2).toString());
							
							
						}
					}*/
				}
				i++;
				All_data.add(simple_record);
			}
			
		}
	}

}
