package GUI;

import java.text.DecimalFormat;

public class SimpleInterest {
	
	public String SimpleInterest (double years, double principal, double rate) {
		String display = ""; 
	    display += "Principle $"+principal + ", Rate: " + rate + "\n";
	    display += "Year,    Simple Interest " + "\n";
	    double amount = 0;
	    for (int i = 1; i <= years; i++) {
	    	amount = principal + (principal * (rate/100) * i);
	    	display += i + "-->" + "$" + amount + "\n";
		}
		return display;		
	}

}
