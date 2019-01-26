import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class lnFactorial
{
	public static void main(String[] args) {
		In.readDouble()
		StdOut.println("%.3f",Math.log(factorial(n)));
	}
	public static double factorial(int n)
	{
		if(n == 1 || n == 0)
			return 1;
		else
			return n*factorial(n-1);
	}
}