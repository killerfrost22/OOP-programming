
public class Rational {

	 //DATA FIELDS SHOULD GO UP HERE
	private int numer;
	private int denom;

	
	//Constructor
	public Rational(int numerIn, int denomIn) {
		numer = numerIn;
		denom = denomIn;
	}
	//Getters
	public int getNumer() {
		return(numer);
	}
	
	public int getDenom() {
		return(denom);
	}
	
	public String toString() {
	return( numer+("/")+denom); 
	}

	public static Rational multiply(Rational a, Rational b) {
		int numer=a.numer*b.numer;
		int denom=a.denom*b.denom;
		Rational newRational= new Rational(numer,denom);
		return(newRational);	
	}
	
	public Rational reciprocal() {
		Rational newRational = new Rational(denom, numer);
	return(newRational);
	}
	
	public Rational divide(Rational a) {
		Rational newRational=new Rational (numer*a.denom, denom*a.numer);
		return newRational;
	}
	
	public Rational add(Rational a) {
		Rational newRational= new Rational(numer*a.denom+denom*a.numer, denom *a.denom);
		return newRational;
	}	
	//NOTE: We are not writing an equals method for this class at this time.
	//      For this reason, do not use assertEquals to try to test whether
	//      two Rational objects are equal in value.
	
}
