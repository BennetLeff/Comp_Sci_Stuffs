public class GCD
{
	//instance variables - DO NOT ADD ANY MORE INSTANCE VARIABLES
	private int numerator;
	private int denominator;
	
	//default constructor
	public GCD() {
		
	}
	//initialization constructor
	public GCD(int a, int b){
		numerator = a;
		denominator = b;
	}
	//modifier method for numerator
	public void setNumerator(int a){
		numerator = a;
	}
	
	//modifier method for denominator
	public void setDenominator(int a){
		denominator = a;
	}
	
	//accessor method for numerator
	public int getNumerator(){
		return numerator;
	}
	
	//accessor method for denominator
	public int getDenominator(){
		return denominator;
	}
	
	//method to determine gcd
	public int gcd(){
		int t;
		int denomPlaceHold = denominator;
		int numeratorPlaceHold = numerator;
		while (denomPlaceHold != 0) {
			t = denomPlaceHold;
			denomPlaceHold = numeratorPlaceHold % t;
			numeratorPlaceHold = t;
		}			
		return numeratorPlaceHold;
	}
	
	//method to determine lowest term of numerator
	public int lowNumerator(){
		return numerator % gcd();
	}
	
	//method to determine lowest term of denominator
	public int lowDenominator(){
		return denominator % gcd();
	}
	
	//toString() method
	public String toString(){
		return "The GCD of " + numerator + " and " + denominator + " is " + gcd()
				+ " ::: the fraction in simplest terms is " + numerator/gcd() + " / " + denominator/gcd();
	}
}