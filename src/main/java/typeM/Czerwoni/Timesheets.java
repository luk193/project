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
		
		Set<String> items = timesheets.getListOfYears("/home/stud/ebartosz/Documents/Timesheets");
		//System.out.print(items);
		for (String s : items){
			System.out.println(s);
		};
        //printList(timesheets.getListOfYears("/home/stud/ebartosz/Documents/Timesheets"));
    }

	
	public ArrayList<String> getListOfPaths(String folderPath){
		
		File folder = new File(folderPath);
		File[] listOfAllElements = folder.listFiles();
		ArrayList<String> listOfPaths = new ArrayList<String>();
		
		
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
		return listOfPaths;
	}
	
	
	
	public Set<String> getListOfYears(String folderPath){
		
		File folder = new File(folderPath);
		File[] listOfAllElements = folder.listFiles();
		Set<String> listOfYears = new HashSet<String>();
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

		
		return listOfYears;
	}
	
	
	
}	

