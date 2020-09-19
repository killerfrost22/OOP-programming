package src;
import java.text.NumberFormat;

public class CalculateInterest {
	
	/* Calculates Simple Interest
	 * Parameters: String of principal, String of Rate, Double of Number of Years
	 * Returns: String formatted to display table depicting 
	 * year numbers and simple interest amounts, along with
	 * provided principle and rate values.
	 */
	public static String calcSI(String pTextF, String rTextF, double sliderValue) {
		String calc = "";
		double principalNum = Double.parseDouble(pTextF);
		double rateNum = Double.parseDouble(rTextF);
		double yearNum = (int) Math.rint(sliderValue);
		
		calc += "Principal: " + NumberFormat.getCurrencyInstance().format(principalNum);
		calc += ", Rate: " + ( rateNum) + "\n";
		calc += "Year, Simple Interest Amount\n";
		
		for (int i = 1; i <= yearNum; i++) {
			calc += i + "-->";
			calc += NumberFormat.getCurrencyInstance().format((principalNum + ( principalNum * (rateNum/100) * i))) + "\n";
		}
		
		return calc;
	}
	
	
	/* Calculates Compound Interest
	 * Parameters: String of principal, String of Rate, Double of Number of Years
	 * Returns: String formatted to display table depicting 
	 * year numbers and compound interest amounts, along with
	 * provided principle and rate values.
	 */
	public static String calcCI(String pTextF, String rTextF, double sliderValue) {
		String calc = "";
		double principalNum = Double.parseDouble(pTextF);
		double rateNum = Double.parseDouble(rTextF);
		double yearNum = Math.rint(sliderValue);
		
		calc += "Principal: " + NumberFormat.getCurrencyInstance().format(principalNum);
		calc += ", Rate: " + ( rateNum) + "\n";
		calc += "Year, Compound Interest Amount\n";
		
		for (int i = 1; i <= yearNum; i++) {
			calc += i + "-->";
			calc += NumberFormat.getCurrencyInstance().format(principalNum * Math.pow(1 + ((rateNum)/100), i)) + "\n";
		}
		
		return calc;
	}
	
	
	/* Calculates Both Interests
	 * Parameters: String of principal, String of Rate, Double of Number of Years
	 * Returns: String formatted to display table depicting 
	 * year numbers, simple interest amounts, and compound
	 * interest amounts, along with provided principle and rate values.
	 */
	public static String calcBI(String pTextF, String rTextF, double sliderValue) {
		String calc = "";
		double principalNum = Double.parseDouble(pTextF);
		double rateNum = Double.parseDouble(rTextF);
		double yearNum = Math.rint(sliderValue);
		
		calc += "Principal: " + NumberFormat.getCurrencyInstance().format(principalNum);
		calc += ", Rate: " + ( rateNum) + "\n";
		calc += "Year, Simple Interest Amount, Compound Interest Amount\n";
		
		for (int i = 1; i <= yearNum; i++) {
			calc += i + "-->";
			calc += NumberFormat.getCurrencyInstance().format(( principalNum + ( principalNum * (rateNum/100) * i)));
			calc += "-->";
			calc += NumberFormat.getCurrencyInstance().format(principalNum * Math.pow(1 + ((rateNum)/100), i)) + "\n";
		}
		
		return calc;
	}
}