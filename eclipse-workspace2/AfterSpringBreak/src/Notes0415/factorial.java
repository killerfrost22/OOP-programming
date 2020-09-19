package Notes0415;

public class factorial {
	public static int fact(int x) {
		if(x ==0) {
			return 1;
		}else {
			return x *fact(x-1);
		}	
	}
	
}
