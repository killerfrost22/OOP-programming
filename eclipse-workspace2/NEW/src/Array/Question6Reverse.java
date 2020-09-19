package Array;

public class Question6Reverse {
	public static int[] reverse(int[] a) {
		int [] tem= new int [a.length]; 
		int k =0;
		for(int i = a.length; i >0; i --) {
			tem[k] = a[i];
		}
		return tem;
		
	}
}
