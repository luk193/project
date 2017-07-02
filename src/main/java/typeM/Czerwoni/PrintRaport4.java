package typeM.Czerwoni;

import java.util.ArrayList;
import java.util.HashMap;

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
				HashMap<String,Double> gg = new HashMap<>(); //.put(g.getEmployee(),g.getHours());
				
				WomboCombo.put(g.getProject(),gg.put(g.getEmployee(), g.getHours()));
			};
			
		}
		
		
	}

	
	
	
}
