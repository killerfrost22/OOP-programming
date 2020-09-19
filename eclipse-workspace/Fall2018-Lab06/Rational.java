

//Don't forget to start off by copying the contents of any methods that
//   do not need to change from your Lab05 to this Lab06.


public class Rational {
    //Make sure the instance fields you add up here for numerator and denominator 
	//  are private and final.
	private final int numer;
	private final  int denom;

	
	public Rational(int numerIn, int denomIn) {
		numer = numerIn;
		denom = denomIn;
		if(denom == 0) {
			throw new ArithmeticException("Divide by Zero");
		}
	}
	
	//The new single-argument constructor.
	public Rational(int numerIn) {
		numer = numerIn;
		denom = 1;
	}

	//The new copy constructor.
	public Rational(Rational other) {
		numer=other.numer;
		denom=other.denom;
	}
	
	public int getNumer() {
		return(numer);
	}
	
	public int getDenom() {
		return(denom);
	}
	
	public String toString() {
		return( numer+("/")+denom); 
	}
	
	public Rational reciprocal() {
		Rational newRational = new Rational(denom, numer);
		return(newRational);
	}
	

	public static Rational multiply(Rational first, Rational second) {
		int numer=first.numer*second.numer;
		int denom=first.denom*second.denom;
		Rational newRational= new Rational(numer,denom);
		return(newRational);	
	}
	
	//The new instance multiply method.
	public Rational multiply(Rational otherRational) {
		int numer=this.numer*otherRational.numer;
		int denom=this.denom*otherRational.denom;
		Rational newRational= new Rational(numer,denom);
		return(newRational);	
	}
	
	public Rational divide(Rational otherRational) {
		Rational newRational=new Rational (numer*otherRational.denom, denom*otherRational.numer);
		return newRational;
	}
		
	public Rational add(Rational otherRational) {
		Rational newRational= new Rational(numer*otherRational.denom+denom*otherRational.numer, denom *otherRational.denom);
		return newRational;
	}
	
	//The new subtract method.
	public Rational subtract(Rational otherRational) {
		Rational newRational = new Rational(numer*otherRational.denom-denom*otherRational.numer,denom *otherRational.denom);
		return newRational;
	}
}
