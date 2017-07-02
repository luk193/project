package typeM.Czerwoni;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Excel ss = new Excel();
        
        Timesheets timesheets = new Timesheets();
        ArrayList<String> paths = timesheets.getListOfPaths("/home/stud/ebartosz/Documents/Timesheets");
        
        System.out.println("Wczytane raporty: ");
        for (String path : paths){
        	System.out.println(path);
        	ss.readXLS(path);
        }
        
        System.out.println("Raporty z lat:");
        for (String year : timesheets.getListOfYears("/home/stud/ebartosz/Documents/Timesheets")){
        	System.out.println(year);
        }
        
        Menu menu = new Menu(args[0]);
        menu.printMenu();
        
    }
        
}
