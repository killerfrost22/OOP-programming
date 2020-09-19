package preparefortheMidterm;
//Question 2 from worksheet
public class StartIndex {
	public int[] indicesTest(int [] a,int startIndex,int endIndex) {
		int [] b = new int [a.length];
		int position = 0;
		try {
		for(int i = 0; i<a.length;i++) {
			if(a[i]>=startIndex ||a[i]<=endIndex) {
				b[position]= a[i];
				position++;
			}
		}
		}catch (IllegalArgumentException e) {
			
		}
			//static method is not using the instance variable 
			//only calling other methods
		return b;
	
		}	
	
	}


