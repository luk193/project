package typeM.Czerwoni;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Timesheets {


	public static void main( String[] args ) throws Exception
    {
		Timesheets timesheets = new Timesheets();
		
		ArrayList<String> items = timesheets.getListOfTimesheets("/home/stud/ebartosz/Documents/Timesheets");
		//System.out.print(items);
		for (String s : items){
			System.out.println(s);
		};
        //printList(timesheets.getListOfYears("/home/stud/ebartosz/Documents/Timesheets"));
    }

	private static void printList(ArrayList<String> collection) {
		for (String item : collection){
			System.out.println(item);
		}
		
	}
	
	public ArrayList<String> getListOfTimesheets(String folderPath){
		
		File folder = new File(folderPath);
		File[] listOfAllElements = folder.listFiles();
		ArrayList<String> listOfFiles = new ArrayList<String>();
		
		
		for (File file : listOfAllElements) {
			
			if (file.isFile() & file.getName().endsWith(".xls")) {
				//System.out.println("absol:" + file.getAbsolutePath());
		    	listOfFiles.add(file.getAbsolutePath());
		    	//System.out.println(listOfFiles);
		    	
		    } else if (file.isDirectory()) {		    	
		    	listOfFiles.addAll(getListOfTimesheets(file.getAbsolutePath()));
		    }
		}
//		System.out.print(listOfFiles);
		return listOfFiles;
	}
	
	
	public Set<String> getListOfYears(String folderPath){
		
		File folder = new File(folderPath);
		File[] listOfAllElements = folder.listFiles();
		Set<String> listOfYears = new HashSet();
		String currentYear;
		
		
		for (File file : listOfAllElements) {
			
			if (file.isFile() & file.getName().endsWith(".xls")) {
		    	
		    	currentYear = file.getAbsolutePath().replace(folderPath, "");
		    	currentYear = currentYear.substring(0, 4);
		    	listOfYears.add(currentYear);
		    	
		    } else if (file.isDirectory()) {		    	
		    	listOfYears.addAll(getListOfYears(file.getAbsolutePath()));
		    }
		}

		
		return listOfYears;
	}
}	

