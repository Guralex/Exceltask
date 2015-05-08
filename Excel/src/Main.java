import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
		
		Excel ex = new Excel();
		
		
		HashMap<Integer, ArrayList<String>> table = ex.getFullTable();

		for (Map.Entry<Integer, ArrayList<String>> tableRow : table.entrySet()) {
			System.out.print(tableRow.getKey() + " ");
			for (int i = 0; i < tableRow.getValue().size(); i++) {
				System.out.print(tableRow.getValue().get(i) + " ");
			}
			System.out.println();
			}
		
	}

}
