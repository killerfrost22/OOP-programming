import java.text.NumberFormat;

public class calculator {
	
	public static String simpInt(String pTextF, String rTextF, double sliderValue) {
		String simp = "";
		double principalNum = Double.parseDouble(pTextF);
		double rate = Double.parseDouble(rTextF);
		double year = (int) Math.rint(sliderValue);
		
		simp += "Principal: " + NumberFormat.getCurrencyInstance().format(principalNum)+ ", Rate: " + (rate) + "\n";
		simp += "Year, Simple Interest Amount"+ "\n";
		
		for (int i = 1; i <= year; i++) {
			simp += i + "-->";
			simp += NumberFormat.getCurrencyInstance().format((principalNum + ( principalNum * (rate/100) * i))) + "\n";
		}
		
		return simp;
	}
	
	public static String compInt(String pTextF, String rTextF, double Value) {
		String calc = "";
		double principal = Double.parseDouble(pTextF);
		double rate = Double.parseDouble(rTextF);
		double year = Math.rint(Value);
		
		calc += "Principal: " + NumberFormat.getCurrencyInstance().format(principal);
		calc += ", Rate: " + ( rate) + "\n";
		calc += "Year, Compound Interest Amount\n";
		
		for (int i = 1; i <= year; i++) {
			calc += i + "-->";
			calc += NumberFormat.getCurrencyInstance().format(principal * Math.pow(1 + ((rate)/100), i)) + "\n";
		}
		
		return calc;
	}
	
	public static String both(String pTextF, String rTextF, double sliderValue) {
		String calc = "";
		double principal = Double.parseDouble(pTextF);
		double rate = Double.parseDouble(rTextF);
		double year = Math.rint(sliderValue);
		
		calc += "Principal: " + NumberFormat.getCurrencyInstance().format(principal);
		calc += ", Rate: " + ( rate) + "\n";
		calc += "Year, Simple Interest Amount, Compound Interest Amount\n";
		
		for (int i = 1; i <= year; i++) {
			calc += i + "-->" + NumberFormat.getCurrencyInstance().format(( principal + ( principal * (rate/100) * i)));
			calc += "-->" + NumberFormat.getCurrencyInstance().format(principal * Math.pow(1 + ((rate)/100), i)) + "\n";
		}
		
		return calc;
	}
}