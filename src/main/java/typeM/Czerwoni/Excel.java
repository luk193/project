package typeM.Czerwoni;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import typeM.Czerwoni.model.Record;

public class Excel {

	public ArrayList<Record> readXLS(ArrayList<String> Sciezki_plikow_xls) throws Exception {
		
		ArrayList<Record> All_data = new ArrayList<>();
		

		for (String path : Sciezki_plikow_xls) {
			
			
			

			POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(path));
			HSSFWorkbook wb = new HSSFWorkbook(fs);

			HSSFSheet sheet;
			int i = 0;
			
			
			while (i<wb.getNumberOfSheets()) { //wb.getSheetAt(i) != null
				double h = 0;
				Record simple_record = new Record();
				
				
				
				
				
				sheet = wb.getSheetAt(i);
				// HSSFRow row = sheet.getRow(0);
				
				simple_record.setProject(sheet.getSheetName());
				
				

				for (int u = 1; u < 200; u++) {

					try {
						h=  h + sheet.getRow(u).getCell(2).getNumericCellValue();
						
					}
					catch(Exception e) {
						
					}
				}
					
					String[] roboczy = path.split(Pattern.quote(File.separator));
					
					simple_record.setYear(roboczy[roboczy.length-3]); 
					simple_record.setMonth(roboczy[roboczy.length-2]);
					simple_record.setEmployee(roboczy[roboczy.length-1].substring(0, roboczy[roboczy.length-1].length()-4));
					
					simple_record.setHours(h);
					
					
					
			
				
					
					All_data.add(simple_record);
				i++;
		/*		System.out.println(All_data.size());
				System.out.println(simple_record.getYear());
				System.out.println(simple_record.getMonth());
				System.out.println(simple_record.getEmployee());
				System.out.println(simple_record.getProject());
				System.out.println(simple_record.getHours());*/
			}
			
			
			
			
			
		}
		/*for(Record g : All_data) {
			System.out.println(g.getProject());
			System.out.println(g.getEmployee());
			System.out.println(g.getHours());
		}*/
		return All_data;
		
}

}
