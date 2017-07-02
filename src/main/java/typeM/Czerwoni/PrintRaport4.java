package typeM.Czerwoni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import de.vandermeer.asciitable.AsciiTable;
import typeM.Czerwoni.model.Record;

public class PrintRaport4 {
	
	public static void printReport4(ArrayList <Record> All_data) {
		
		HashMap<String, HashMap<String,Double>> WomboCombo = new HashMap<>();
		
		for (Record g : All_data) {
			if(WomboCombo.containsKey(g.getProject())) {
				if(WomboCombo.get(g.getProject()).containsKey(g.getEmployee())) {
					WomboCombo.get(g.getProject()).put(g.getEmployee(), WomboCombo.get(g.getProject()).get(g.getEmployee())+g.getHours());
				}
				else {
					WomboCombo.get(g.getProject()).put(g.getEmployee(), g.getHours());
				};
			}
			else {
				HashMap<String,Double> gg = new HashMap<>();
				gg.put(g.getEmployee(), g.getHours());
				
				WomboCombo.put(g.getProject(), gg);
				
			};
			
			
			
			}
		
		
		
		for (String e : WomboCombo.keySet()) {
			
			System.out.println(e);
			for (String f : WomboCombo.get(e).keySet()) {
				
				System.out.println(f + " | " + WomboCombo.get(e).get(f));
				
			}
		}
			
			
	/*	
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
	    System.out.println(rend);*/
		
		
	}

	
	
	
	
	
}
