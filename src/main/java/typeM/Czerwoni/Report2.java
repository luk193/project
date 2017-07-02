package typeM.Czerwoni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import de.vandermeer.asciitable.AsciiTable;
import typeM.Czerwoni.model.Record;

public class Report2 {

	private ArrayList<Record> list;
	private HashMap<String, Double> map = new HashMap<>();
	private String year;

	public Report2(ArrayList<Record> list, String year) {
		super();
		this.list = list;
		this.year = year;
	}
	
	public void setMapValues() {
		for (Record record : list) {		
			if (record.getYear().equals(year)) {
				if (map.get(record.getProject()) != null) {
					Double currHours = map.get(record.getProject());
					map.put(record.getProject(), currHours + record.getHours());
				} else {
					map.put(record.getProject(), record.getHours());
				}		
			}
		}
	}
	
	public void printReport() {		
		AsciiTable at = new AsciiTable();
		at.addRule();
        at.addRow("Projekt", "Ilosc godzin");
		Iterator it = map.entrySet().iterator();
			
	    while (it.hasNext()) {
	    	at.addRule();
	        Map.Entry pair = (Map.Entry)it.next();
	        at.addRow(pair.getKey(), pair.getValue());
	        it.remove();
	    }
	    
	    String rend = at.render();
	    System.out.println(rend);
	}
	
}
