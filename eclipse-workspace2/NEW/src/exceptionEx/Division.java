package exceptionEx;
import javax.swing.*;
	
public class Division {
	public static void main(String[] args) {
		String[] alternatives = { "Integer", "Float", "Double" };
		String selectedValue;
		
		selectedValue = (String)JOptionPane.showInputDialog(null, 
							   "Choose Division", "Input",
							   JOptionPane.INFORMATION_MESSAGE, null, 
							   alternatives, alternatives[0]);
		
		
		
		
		if (selectedValue.equals("Integer")) {
			System.out.println("Integer Division");
			int x = 1;
			int y = x / 0;
			System.out.println(y);
		} else if (selectedValue.equals("Float")) {
			System.out.println("Float Division");
			float fx = 1.0f;
			float fy = fx / 0.0f;
			System.out.println(fy); 
		} else {
			System.out.println("Double Division");
			double dx = 1.0;
			double dy = dx / 0.0;
			System.out.println(dy); 
		}
	}
}
