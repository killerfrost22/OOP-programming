package lab1;
public class BasicTypes {
	public static void main(String[] args) {
		int i1, i2, i3;
		double f1 = 7.3, f2 = 9.4;
		boolean b1, b2;
		char c;
		String s;
		
		i1 = 7;
		i2 = 3;
		i3 = i1 + i2 * 5 - 2;
		f1 = 3.1415927;
		b1 = true;	b2 = (f2 < f1);
		c = 'X';
		s = "Hello " + "there" + " my friend.";
		System.out.println("i3 = " + i3);
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("c = " + c);
		System.out.println("s = " + s);
	}
}
