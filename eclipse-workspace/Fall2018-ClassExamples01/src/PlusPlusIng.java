
public class PlusPlusIng {

	public static void main(String[] args) {

		int x; 

		x=1;
		System.out.print("Line 1: ");
		System.out.println(x++);
		System.out.print("Line 2: ");
		System.out.println(x);
		
		x=1;
		System.out.print("Line 3: ");
		System.out.println(++x);
		System.out.print("Line 4: ");
		System.out.println(x);
		
		x=1;
		System.out.print("Line 5: ");
		System.out.println(x++ + ++x);
		System.out.print("Line 6: ");
		System.out.println(x);

	}
}

//Copyright 2010-2018 : Evan Golub

