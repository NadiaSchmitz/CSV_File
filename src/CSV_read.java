import java.io.File;
import java.util.Scanner;

public class CSV_read {

	public static void main(String[] args) {
		
		try {
			File  csv_file = new File("lehrer.csv");
			Scanner sc = new Scanner(csv_file);
			sc.useDelimiter(",");
			
			while (sc.hasNext()) {
				System.out.print(sc.next() + " ");
			}
			
			sc.close();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
