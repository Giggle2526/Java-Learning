import edu.princeton.cs.algs4.*;

public class Selection{
	public static void sort(Comparable[] a)
	{
		int N = a.length;
		for(int i = 0; i < N; i++){
			int min = i;
			for(int j = i+1; j < N; j++)
				if(less(a[j],a[min])) min = j;
			exch(a,i,min);
			showOut(a);
		}
	}
	public static void showOut(Comparable[] a)
	{
		int N = a.length;
		for(int i = 0; i < N; i++){
			double num = (double)a[i];
			double x = 1.0*i/N;
			double y = num/2;
			double rw = 0.5/N;
			double rh = num/2;
			StdDraw.filledRectangle(x, y, rw, rh);
		}
		StdDraw.show(1);
		StdDraw.clear(StdDraw.WHITE);
	}
	private static boolean less(Comparable v,Comparable w)
	{ return v.compareTo(w) < 0; }
	private static void exch(Comparable[] a, int i, int j)
	{ Comparable t = a[i]; a[i] = a[j]; a[j] = t; }
	private static void show(Comparable[] a)
	{
		for(int i=0; i < a.length; i++)
			StdOut.print(a[i] + " ");
		StdOut.println();
	}
	public static boolean isSorted(Comparable[] a)
	{
		for(int i = 1; i < a.length; i++)
			if(less(a[i],a[i-1])) return false;
		return true;
	}
	public static void main(String[] args) {
 		int N = StdIn.readInt();
	 	Double[] a = new Double[N];
	 	for(int i = 0; i < N; i++)
	 		a[i] = StdRandom.random();
	 	sort(a);
	 }

}
