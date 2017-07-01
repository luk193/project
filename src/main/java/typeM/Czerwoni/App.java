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
        
        ArrayList<String> listOfTimesheets = Timesheets.getListOfTimesheets("/home/stud/ebartosz/Documents/Timesheets");
        
        for (String timesheet : listOfTimesheets){
        	ss.readXLS(timesheet);
        }
    }
        
}
