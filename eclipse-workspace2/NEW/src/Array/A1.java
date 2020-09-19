package Array;

import java.util.Arrays;

public class A1 {

	public static void main(String[] args) {
		int [] a;
		int [] b ;
		a = new int[3];
		b = new int[3];
		a[0] =1;
		a[1] =2;
		a[2] = 3;
		
		b[0] =1;
		b[1] =2;
		b[2] = 3;
		boolean c = false; 
		c = Arrays.equals(a, b);
		System.out.println(c);
	
	}

}
