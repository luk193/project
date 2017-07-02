package typeM.Czerwoni;

import java.util.ArrayList;
import java.util.Date;
import de.vandermeer.asciitable.AsciiTable;
import typeM.Czerwoni.model.Record;
import typeM.Czerwoni.model.Row;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	Excel ss = new Excel();
        
        Timesheets timesheets = new Timesheets();
        ArrayList<String> paths = timesheets.getListOfPaths(args[0]);
        
        System.out.println("Witamy w systemie!");
        System.out.println("Wczytane raporty: ");
        for (String path : paths){
        	System.out.println(path);
        	//ss.readXLS(path);
        }
        
        ArrayList<Record> All_data = ss.readXLS(paths);
        
        System.out.println("Raporty z lat:");
        for (String year : timesheets.getListOfYears(args[0])){
        	System.out.println(year);
        }
        
        Menu menu = new Menu(args[0], All_data);
        menu.printMenu();
        
    }
     
}