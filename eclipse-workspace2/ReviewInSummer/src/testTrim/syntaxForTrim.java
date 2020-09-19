package testTrim;

public class syntaxForTrim {

	public static void main(String[] args) {
		String dsa = "  dasd   dada  ssa as  ";
		String outcome ="";
		outcome = dsa.trim();
		System.out.println(outcome);
	}
	//the usage of trim is to get rid of spaces intentionally left between the start and the end
	//However the trim method will not get rid of the blank spaces in the sentence
	
}
