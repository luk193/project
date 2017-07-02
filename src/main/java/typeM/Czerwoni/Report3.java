package typeM.Czerwoni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import de.vandermeer.asciitable.AsciiTable;
import typeM.Czerwoni.model.Record;

public class Report3 {

	/*
    public static void main( String[] args ) throws Exception
    {
    	ArrayList<Record> records = new ArrayList();
    	
    	Record record1 = new Record();
    	record1.setEmployee("Elmerych");
    	record1.setMonth("Styczeń");
    	record1.setYear("2017");
    	record1.setProject("Projekt1");
    	record1.setHours(10);
    	
    	Record record2 = new Record();
    	record2.setEmployee("Elmerych");
    	record2.setMonth("Styczeń");
    	record2.setYear("2017");
    	record2.setProject("Projekt2");
    	record2.setHours(2);
    	
    	Record record3 = new Record();
    	record3.setEmployee("Elmerych");
    	record3.setMonth("Luty");
    	record3.setYear("2017");
    	record3.setProject("Projekt1");
    	record3.setHours(5);
    	
    	Record record4 = new Record();
    	record4.setEmployee("Elmerych");
    	record4.setMonth("Styczeń");
    	record4.setYear("2017");
    	record4.setProject("Projekt1");
    	record4.setHours(5);
    	
    	records.add(record1);
    	records.add(record2);
    	records.add(record3);
    	records.add(record4);
    	
    	
    	Report3 report = new Report3(records, "Elmerych", "2017");
    	report.printReport();
        
    }
    */

	private ArrayList<Record> recordList;
	private String employee;
	private String year;
	
	public Report3(ArrayList<Record> recordList, String employee, String year) {
		this.recordList = recordList;
		this.employee = employee;
		this.year = year;
	}
	
	public void printReport() {
		HashMap<String, HashMap<String, Double>> monthsMap = new HashMap();
		
		for (Record r : recordList) {
			HashMap<String, Double> projectsMap;
			
			if(r.getEmployee().equals(employee) & r.getYear().equals(year)) {
			
				if (!monthsMap.containsKey(r.getMonth())) {
					projectsMap = new HashMap();
					monthsMap.put(r.getMonth(), projectsMap);
				}
				
				projectsMap = monthsMap.get(r.getMonth());
				
				if (!projectsMap.containsKey(r.getProject())) {
					projectsMap.put(r.getProject(), 0.0);
				}
				
				projectsMap.put(r.getProject(), projectsMap.get(r.getProject()) + r.getHours());
			}
		}
		
		System.out.println("Raport 3 dla pracownika: " + employee + " i roku: " + year);
		AsciiTable at = new AsciiTable();
		at.addRule();
		at.addRow("Miesiac", "Projekt", "Godziny");
		for (Entry<String, HashMap<String, Double>> m : monthsMap.entrySet()) {
		    String month = m.getKey();
		    HashMap<String, Double> projectMap= m.getValue();
		    
		    for (Entry<String, Double> p : projectMap.entrySet()) {
		    	String project = p.getKey();
		    	String hours = p.getValue().toString();
		    	
		    	at.addRule();
		    	at.addRow(month, project, hours);
//		    	System.out.println(month + " : " + project + " : " + hours);
		    }
			
		    String rend = at.render();
		    System.out.println(rend);
		}
	}
}
