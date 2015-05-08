import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
		
		Excel ex = new Excel();
		
		
		
		HashMap<Integer, ArrayList<String>> table = ex.getFullTable();

		ex.printTable(table);
		
		
		System.out.println("Getting row");
		System.out.println(ex.getTableRow(2));
	
		System.out.println("Getting elem");
		System.out.println(ex.getElem(3, 1));
	}

}
