package p5_cubicpoly;


import p5_utility.DoubleWithAppx;

/**
 * A general representation of a Cubic polynomial of the form:
 *     (a*x^3 + b*x^2 + c*x + d)
 * 
 * @author Yizhan (Joseph) Ao
 * @date November/1/2018
 */

public class CubicPoly {
	private final DoubleWithAppx a;
	private final DoubleWithAppx b;
	private final DoubleWithAppx c;
	private final DoubleWithAppx d;
	
	public CubicPoly() {
		a = DoubleWithAppx.ZERO;
		b = DoubleWithAppx.ZERO;
		c = DoubleWithAppx.ZERO;
		d = DoubleWithAppx.ZERO;
	}

	public CubicPoly(DoubleWithAppx dIn) {
		a = DoubleWithAppx.ZERO;
		b = DoubleWithAppx.ZERO;
		c = DoubleWithAppx.ZERO;
		d = dIn;
		
	}

	public CubicPoly(DoubleWithAppx cIn, DoubleWithAppx dIn) {
		a = DoubleWithAppx.ZERO;
		b = DoubleWithAppx.ZERO;
		c = cIn;
		d = dIn;
	}

	public CubicPoly(DoubleWithAppx bIn, DoubleWithAppx cIn, DoubleWithAppx dIn) {
		a = DoubleWithAppx.ZERO;
		b = bIn;
		c = cIn;
		d = dIn;
	}
	
	public CubicPoly(DoubleWithAppx aIn, DoubleWithAppx bIn, DoubleWithAppx cIn, DoubleWithAppx dIn) {
		a = aIn;
		b = bIn;
		c = cIn;
		d = dIn;
	}
	
	public CubicPoly(CubicPoly other) {
		a = other.a;
		b = other.b;
		c = other.c;
		d = other.d;
	}
	
	public DoubleWithAppx getA() {
		return a;
	}
	
	public DoubleWithAppx getB() {
		return b;
	}
	
	public DoubleWithAppx getC() {
		return c;
	}
	
	public DoubleWithAppx getD() {
		return d;
	}
	
	
	
	
	
	public DoubleWithAppx eval(DoubleWithAppx x) {
		DoubleWithAppx newa = new DoubleWithAppx(a.multiply((x.power(3))));
		DoubleWithAppx newb = new DoubleWithAppx(b.multiply((x.power(2))));
		DoubleWithAppx newc = new DoubleWithAppx(c.multiply((x.power(1))));
		DoubleWithAppx neweval = new DoubleWithAppx(newa.add(newb.add(newc.add(d))));
		return neweval;
		//HINT: Think about how to chain method calls to make this compact. 
	}
	
	
	public CubicPoly add(CubicPoly cubicPolyIn) {
		DoubleWithAppx newa = (a.add(cubicPolyIn.a));
		DoubleWithAppx newb = (b.add(cubicPolyIn.b));
		DoubleWithAppx newc = (c.add(cubicPolyIn.c));
		DoubleWithAppx newd = (d.add(cubicPolyIn.d));
		 
		return new CubicPoly(newa,newb,newc,newd);
		
	}

	public CubicPoly subtract(CubicPoly cubicPolyIn) {
		DoubleWithAppx newa = (a.subtract(cubicPolyIn.a));
		DoubleWithAppx newb = (b.subtract(cubicPolyIn.b));
		DoubleWithAppx newc = (c.subtract(cubicPolyIn.c));
		DoubleWithAppx newd = (d.subtract(cubicPolyIn.d));
		 
		return new CubicPoly(newa,newb,newc,newd);
	}
		//a*x^3 + b*x^2 + c*x + d
		// e*x^3 + f*x^2 + g*x + h 
		//(ae)x^6 + (af+be)x^5 + (ag+bf+ce)x^4 + (ad+bc+cb+da)x^3 + (bd+cc+db)x^2 + (cd+dc)x + dd

	public CubicPoly mult(CubicPoly cubicPolyIn) {
		
		
		DoubleWithAppx newa = (a.multiply(cubicPolyIn.a));
		DoubleWithAppx newb = (a.multiply(cubicPolyIn.b).add(b.multiply(cubicPolyIn.a)));
		DoubleWithAppx newc = (a.multiply(cubicPolyIn.c).add(b.multiply(cubicPolyIn.b).add(c.multiply(cubicPolyIn.a))));
		DoubleWithAppx newd = (a.multiply(cubicPolyIn.d).add(b.multiply(cubicPolyIn.c).add(c.multiply(cubicPolyIn.b).add(d.multiply(cubicPolyIn.a)))));
		DoubleWithAppx newe = (b.multiply(cubicPolyIn.d).add(c.multiply(cubicPolyIn.c).add(d.multiply(cubicPolyIn.b))));
		DoubleWithAppx newf = (c.multiply(cubicPolyIn.d).add(d.multiply(cubicPolyIn.c)));
		DoubleWithAppx newg = (d.multiply(cubicPolyIn.d));
		if (newa.isZero() && newb.isZero() && newc.isZero()) { 
			return new CubicPoly (newd,newe,newf,newg); 
		}else {
			return null;
			
		}


	}

	
	
	
	public CubicPoly deriv() {
	
		//ax^3 + bx^2 + cx + d is 
		//3ax^2 + 2bx + c 
		
		DoubleWithAppx newb = a.multiply(new DoubleWithAppx(3.0));
		DoubleWithAppx newc = b.multiply(new DoubleWithAppx(2.0));
		DoubleWithAppx newd = c;
		return new CubicPoly(DoubleWithAppx.ZERO,newb,newc,newd);
	}


	
	public int compareTo(CubicPoly cubicPolyIn) {
		//compareTo -- this method takes one parameter (CubicPoly) and returns an int. The client specs say that:
		//if all of the coefficients are equal, this method returns 0;
		//otherwise, we will look for the highest-order term whose coefficients differ and then if in that position the current object's coefficent is less than the corresponding coefficient of the parameter, 
		//this method returns -1 but if in that position the current object's coefficent is greater than the corresponding coefficient of the parameter, this method returns +1
		//Read the spec on how compareTo in DoubleWithAppx works to try to make your method here as simple to read and write as possible.
		if (a.compareTo(cubicPolyIn.a) !=0) {
			return a.compareTo(cubicPolyIn.a);
		}
		else if (b.compareTo(cubicPolyIn.b) !=0){
			return b.compareTo(cubicPolyIn.b);
		}
		else if (c.compareTo(cubicPolyIn.c) !=0){
			return c.compareTo(cubicPolyIn.c);
		}
		else if (d.compareTo(cubicPolyIn.d) !=0){
			return d.compareTo(cubicPolyIn.d);
		}
		return 0;
	}
	

	
	
	//Challenge Problem
    public String toString() { 
    	return "a:"+a+", b:"+b+", c:"+c+", d:"+d;
		//You only need to implement this for a challenge.
    } 
	

	
    
    
    
    
    
    
	
	
	
	
	//NOTE: THIS JAVA EQUALS METHOD IS WRITTEN FOR YOU - DO NOT CHANGE
	@Override
	public boolean equals (Object other) {
		if (other == null) {
			return false;
		}
		else if (this.getClass()!=other.getClass()) {
			return false;
		}
		else {
			CubicPoly casted = (CubicPoly)other;
			return (
					a.equals(casted.a) && 
					b.equals(casted.b) && 
					c.equals(casted.c) && 
					d.equals(casted.d)
			);
		}
	}
	
	
}