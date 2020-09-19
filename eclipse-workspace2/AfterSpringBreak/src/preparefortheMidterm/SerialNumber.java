package preparefortheMidterm;

public class SerialNumber {
	public static int getserialNumber(String value) {
		if(value != null) {
			if(value.length()==6 && value.charAt(0)== 'A') {
				try {
					return Integer.parseInt(value.substring(1, 5));
				}catch(NumberFormatException e){
					System.out.println("-1");
				}
			}
		}
		System.out.println("-1");
		return -1;
	
	}
}
	
