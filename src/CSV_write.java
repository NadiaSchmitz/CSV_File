import java.io.PrintWriter;

public class CSV_write {

	public static void main(String[] args) {
		
		try {
			
			PrintWriter writer = new PrintWriter("CSV_Ausgabe.csv");
			StringBuilder sb = new StringBuilder();
			sb.append("id_Lehrer");
			sb.append(";");
			sb.append("Vorname");
			sb.append(";");
			sb.append("Name");
			sb.append("\n");
			
			sb.append("1");
			sb.append(";");
			sb.append("Willi");
			sb.append(";");
			sb.append("Moll");
			sb.append("\n");
			
			sb.append("2");
			sb.append(";");
			sb.append("August");
			sb.append(";");
			sb.append("Kurp");
			sb.append("\n");
			
			System.out.println(sb);
			
			writer.write(sb.toString());
			writer.close();
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
