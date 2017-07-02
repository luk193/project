package typeM.Czerwoni;

import java.util.ArrayList;
import java.util.Date;
import de.vandermeer.asciitable.AsciiTable;
import typeM.Czerwoni.model.Record;
import typeM.Czerwoni.model.Row;

/**
 * Hello world!
 *
 */
<<<<<<< HEAD
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	
//        Excel ss = new Excel();
//        ss.readXLS("sss");
//        Menu menu = new Menu(args[0]);
//        menu.printMenu();
        
    	BaseReport tab = new BaseReport();
        tab.addRow(new Row("fdfas", "zz"));
        tab.addRow(new Row("fdfas", "zz"));
        tab.printTable();
    }
    
=======
public class App {
	public static void main(String[] args) throws Exception {
		Excel ss = new Excel();

		Timesheets timesheets = new Timesheets();
		ArrayList<String> paths = timesheets.getListOfPaths(args[0]);

		System.out.println("Wczytane raporty: ");
		for (String path : paths) {
			System.out.println(path);
			
		}
		ss.readXLS(paths);

		System.out.println("Raporty z lat:");
		for (String year : timesheets.getListOfYears(args[0])) {
			System.out.println(year);
		}

		Menu menu = new Menu(args[0]);
		menu.printMenu();

	}

>>>>>>> 427d74d5a898f83d3f4599e0531498f1fbb9cdea
}
