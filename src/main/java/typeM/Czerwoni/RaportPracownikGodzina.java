package typeM.Czerwoni;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import de.vandermeer.asciitable.AsciiTable;
import typeM.Czerwoni.model.Record;

public class RaportPracownikGodzina {
	
	private AsciiTable at = new AsciiTable();
	private String year;
	private ArrayList<Record> All_data;
	private HashMap<String, Double> reportMap ;
	
	public RaportPracownikGodzina(ArrayList<Record> All_data, String year) {
		this.All_data = All_data;
		this.year = year;	
	}
	
	private void setReportMap() {
		reportMap = new HashMap<String, Double>();
		for (Record record : All_data) {
			if(record.getYear().equals(year)) {
				if(reportMap.containsKey(record.getEmployee())) {
					reportMap.put(record.getEmployee(), reportMap.get(record.getEmployee()) + record.getHours());
				}
				else {
					reportMap.put(record.getEmployee(), record.getHours());
				}
			}
	
		}
	}
	
	public void printMap() {
		setReportMap();
		ArrayList<String> sortedKeys = new ArrayList<String>(reportMap.keySet());
		Collections.sort(sortedKeys);

		
		at.addRule();
		at.addRow("Imie", "Godziny pracy");
		
		//for(Map.Entry<String, Double> entry : reportMap.entrySet()) {
		for(String name : sortedKeys) {
			//String key = entry.getKey();
			
			Double value = reportMap.get(name);
		    //Double value = entry.getValue();
		    at.addRule();
		    at.addRow(name, value);
		}
		at.addRule();
		String rend = at.render();
	    System.out.println(rend);

}
}