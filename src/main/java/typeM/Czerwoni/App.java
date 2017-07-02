package typeM.Czerwoni;

import java.util.ArrayList;

import typeM.Czerwoni.model.Record;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		Excel ss = new Excel();

		Timesheets timesheets = new Timesheets();
		ArrayList<String> paths = timesheets.getListOfPaths(args[0]);

		System.out.println("Wczytane raporty: ");
		for (String path : paths) {
			System.out.println(path);
			
		}
		ArrayList<Record> All_data = ss.readXLS(paths);
		

		System.out.println("Raporty z lat:");
		for (String year : timesheets.getListOfYears(args[0])) {
			System.out.println(year);
		}

		Menu menu = new Menu(args[0]);
		menu.printMenu();

	}

}
