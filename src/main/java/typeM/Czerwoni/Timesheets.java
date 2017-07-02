package typeM.Czerwoni;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Timesheets {

	
	// DEBUG
	public static void main( String[] args ) throws Exception
    {
		
		Timesheets timesheets = new Timesheets();
		
		Set<String> items = timesheets.getListOfYears(mainFolderPath);
		//System.out.print(items);
		for (String s : items){
			System.out.println(s);
		};
        //printList(timesheets.getListOfYears("/home/stud/ebartosz/Documents/Timesheets"));
    }

	
	public ArrayList<String> getListOfPaths(String folderPath){
		
		ArrayList<String> listOfPaths = new ArrayList<String>();
		try {
			File folder = new File(folderPath);
			File[] listOfAllElements = folder.listFiles();
		
		
			for (File file : listOfAllElements) {
				
				if (file.isFile() & file.getName().endsWith(".xls")) {
					//System.out.println("absol:" + file.getAbsolutePath());
			    	listOfPaths.add(file.getAbsolutePath());
			    	//System.out.println(listOfFiles);
			    	
			    } else if (file.isDirectory()) {		    	
			    	listOfPaths.addAll(getListOfPaths(file.getAbsolutePath()));
			    }
			}
	//		System.out.print(listOfFiles);
		} 
		catch (NullPointerException e) {
			System.out.println("Podana ścieżka jest nieprawidłowa");
		}
		
		return listOfPaths;
	}
	
	
	
	public Set<String> getListOfYears(String folderPath){

		Set<String> listOfYears = new HashSet<String>();
		try {
			File folder = new File(folderPath);
			File[] listOfAllElements = folder.listFiles();
			String currentYear;
			
			
			for (File file : listOfAllElements) {
				
				if (file.isFile() & file.getName().endsWith(".xls")) {
			    	
			    	currentYear = file.getAbsolutePath().replace(folderPath.substring(0, folderPath.length()-7), "");
			    	currentYear = currentYear.substring(0, 4);
			    	listOfYears.add(currentYear);
			    	
			    } else if (file.isDirectory()) {		    	
			    	listOfYears.addAll(getListOfYears(file.getAbsolutePath()));
			    }
			}
		}
		catch (NullPointerException e) {
			System.out.println("Podana ścieżka jest nieprawidłowa");
		}
		
		return listOfYears;
	}
	
	
	
}	

