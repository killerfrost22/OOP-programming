package studentCode;

public class CryptoCode {
	//Handles ASCII/UNICODE 32 through ASCII/UNICODE 91
	static final char LEFT_BOUNDARY = ' ';
	static final char RIGHT_BOUNDARY = '[';

	static final int RANGE = RIGHT_BOUNDARY-LEFT_BOUNDARY+1;
	
	
	
	//YOUR CODE WILL BE DOWN HERE
	//AS YOU WORK ON EACH METHOD, DELETE THE "throw" LINE AND
	//   ADD YOUR CODE TO IMPLEMENT THE METHOD
	//TEST AS YOU GO TASK BY TASK
	
	public static boolean safeToUse(String plaintext) {
		String word;
		word = plaintext.toUpperCase();
		boolean b = true;
		for (int i = 0; i< word.length();i++) {
			char originalChar = word.charAt(i);
		int oriNum = originalChar;
		if ((oriNum <= 91) && oriNum>=32) {
			b = true;
		}else {
			b = false; 
			break;	
		}
	} 
		return b;
	}
	
	
	public static String rot30(String message)
	{
		message = message.toUpperCase();
		int oriNum;
		String s = "";
		
		for (int i = 0; i < message.length(); i++) {
			char originalChar = message.charAt(i);
			oriNum = originalChar;
			
			String charostr;
			int x = oriNum + 30; 
					if (x > 91) {
						x = x-60;
					}
			originalChar = (char)(x);
			charostr = String.valueOf(originalChar);
			s = s + charostr;
		}
		return s;
		
	}

	
	public static String toCaesar(String plaintext, int shift)
	{
		if(shift > 60) {
			shift = shift % 60;
		}
		plaintext = plaintext.toUpperCase();
		String s ="";
		int oriNum;
		for (int i = 0; i<plaintext.length();i++) {
			char originalChar =plaintext.charAt(i);
			oriNum = originalChar;
			String charostr;
			int x = oriNum+ shift;
			if (x>91) {
				x= x - 60;
			}
			originalChar = (char)(x);
			charostr = String.valueOf(originalChar);
			s = s + charostr;
			}
		return s;
		
	}

	public static String fromCaesar(String ciphertext, int shift)
	{
		if (shift > 60) {
			shift = shift % 60;
		}
		ciphertext.toUpperCase();
		String s ="";
		int oriNum;
		for(int i = 0; i < ciphertext.length();i++) {
			char originalChar = ciphertext.charAt(i);
			oriNum = originalChar;
			String chartostr;
			int x = oriNum - shift;
			if (x < 32) {
				x= x + 60;
			}
			originalChar = (char)(x);
			chartostr = String.valueOf(originalChar);
			s = s + chartostr;
		}
		return s;
		
			
	}
	

	public static String toBellaso(String plaintext, String keyword){
		plaintext = plaintext.toUpperCase();
		keyword = keyword.toUpperCase();
		if (plaintext.length() > keyword.length()) {
			String y = "";
			for (int i = 0; i<plaintext.length(); i++) {
				int temp = i;
				if (i >=keyword.length()) {
				temp = temp % keyword.length();
				}
				else if(i > plaintext.length()) {
				break;
				}
				char key = keyword.charAt(temp);
				String w = String.valueOf(key);
				
				y = y + w;
			}
			keyword = y;}
			String s = "";
			int plaNum;
			int keyNum;
			for(int i = 0; i<plaintext.length();i++) {
				char plaChar = plaintext.charAt(i);
				plaNum = plaChar;
				char keyChar= keyword.charAt(i);
				keyNum = keyChar;
				String charostr;
				int x = plaNum + keyNum - 32;
			if (x>91) {
				x = x-60;
				plaChar = (char)(x);
				charostr = String.valueOf(plaChar);
				s = s + charostr;	
			}
			}
			return s;
	}
			
	
	

	public static String fromBellaso(String ciphertext, String keyword){
		
	}


}


