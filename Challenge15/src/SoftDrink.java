//Javier Reyna EG1305A
//OK. Ozgur Aktunc
import java.text.DecimalFormat;


public class SoftDrink {
	
	public static void main(String[] args) {
		
		double customers = 12467;
		
		double purchased = .14;
		
		double citrus = .64;
		
		DecimalFormat aFormatter = new DecimalFormat("##,###.");
		System.out.println("Total number of people surveyed "+ aFormatter.format(customers));
		
		double percentbuys = customers * purchased;
		
		DecimalFormat bFormatter = new DecimalFormat("####");
		
		System.out.println("Approximately " + bFormatter.format(percentbuys) + " bought at least one drink." );
		
		double prefercitrus = percentbuys * citrus;
		
		DecimalFormat cFormatter = new DecimalFormat("####");
		
		System.out.println(cFormatter.format (prefercitrus) + " of those who purchased a drink "
				+ "prefer citrus flavor drinks.");
		
		System.exit(0);
		
		
	}
}
