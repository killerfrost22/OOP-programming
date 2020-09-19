package Questions;

public class findProblem {
	public static void check(double val, int x) {
		if (x > 0) {
			if (val == 4.5) {
				System.out.println("expected");
			}
		}
	}
	public static void main(String[] args) {
		double val = 4.5;
		int x = 100;
		check(val,x);
	}
}
