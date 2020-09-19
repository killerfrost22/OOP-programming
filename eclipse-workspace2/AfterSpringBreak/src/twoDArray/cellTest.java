package twoDArray;

public class cellTest {
	private cellTest [] [] changing;
	public cellTest [] [] test1(){
		cellTest [] [] test1 = new cellTest [4] [3];
		for(int i = 0; i < test1.length; i++)
			for (int j = 0; j < test1[0].length; j++) {
				View[i][j] = shiftOverArray[i][j + stepCount];
			}
		return test1;
		
		
	}
	
}
