package Notes0415;

public class resursio01 {
	public boolean findx(int[]a, int x) {
		int k=0;
		if(a[k] == x) {
			return true;
		}else {
			return findx(a, x);
			
		}
	}
}
