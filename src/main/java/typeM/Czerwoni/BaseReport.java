package typeM.Czerwoni;

import java.util.ArrayList;
import java.util.List;

import de.vandermeer.asciitable.AsciiTable;
import typeM.Czerwoni.model.Row;

public class BaseReport {
	
//	Table tab = new Table();
//    tab.addRow(new Row("fdfas", "zz"));
//    tab.addRow(new Row("fdfas", "zz"));
//    tab.printTable();
	
	private AsciiTable at = new AsciiTable();
	private List<Row> rows = new ArrayList<Row>();
	
	public void addRow(Row row) {
		rows.add(row);
	}

	public void printTable() {
		for (Row row : rows) {
			at.addRule();
			if (row.getCol3() == null) {
				at.addRow(row.getCol1(), row.getCol2());
			} else {
				at.addRow(row.getCol1(), row.getCol2(), row.getCol3());
			}
		}
		String rend = at.render();
	    System.out.println(rend);
	}
	
}
