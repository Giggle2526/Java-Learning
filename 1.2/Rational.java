import edu.princeton.cs.algs4.*;

public class Rational{
	long numerator,denominator;

	public Rational(int numerator,int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
		Euclidean(numerator,denominator);
	}
	//Euclid's algorithm removes the common factor between the numerator and denominator.
	public void Euclidean(long numerator,long denominator){
		long temp = 0;
		while(denominator!=0){
			temp = denominator;
			denominator = numerator%denominator;
			numerator = temp;
		}
		if(numerator!=1){
			this.numerator /= numerator;
			this.denominator /= numerator;
		}
	}
	public Rational plus(Rational b){
		this.numerator = this.numerator*b.denominator + this.denominator*b.numerator;
		this.denominator *= b.denominator;
		Euclidean(this.numerator,this.denominator);
		return this;
	} 
	public Rational minus(Rational b){
		this.numerator = b.denominator*this.numerator - b.numerator*this.denominator;	
		this.denominator *= b.denominator;
		Euclidean(this.numerator,this.denominator);
		return this;
	}
	public Rational times(Rational b){
		this.numerator *= b.numerator;
		this.denominator *= b.denominator;
		Euclidean(this.numerator,this.denominator);
		return this;
	}
	public Rational divides(Rational b){
		this.numerator *= b.denominator;
		this.denominator *= b.numerator;
		Euclidean(this.numerator,this.denominator);
		return this;
	} 
	public boolean equals(Rational b){
		return (this.numerator == numerator)&&(this.denominator == denominator);
	} 
	public String toString(){
		return this.numerator + "/" + this.denominator;
	}

	public static void main(String[] args) {
		int numerator,denominator;
		numerator = StdIn.readInt();
		denominator = StdIn.readInt();
		Rational R = new Rational(numerator,denominator);
		numerator = StdIn.readInt();
		denominator = StdIn.readInt();
		Rational b = new Rational(numerator,denominator);
		//StdOut.println(R.divides(b));
	}
}