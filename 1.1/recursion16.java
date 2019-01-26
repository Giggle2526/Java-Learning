import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class recursion16
{
	public static void main(String[] args) {
		StdOut.printf("%s\n",exR1(6));
	}
	public static String exR1(int n)
	{
		if(n <= 0)return " ";
		return exR1(n-3) + n + exR1(n-2) + n;
	}
}