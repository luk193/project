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
    
}
