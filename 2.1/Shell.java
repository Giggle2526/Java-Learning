import edu.princeton.cs.algs4.*;

public class Shell{
	public static void sort(Comparable[] a)
	{
		int N = a.length;
		int h = 1;
		while(h < N/3) h = 3*h + 1;
		while(h >= 1)
		{
			for(int i = h; i < N; i++){
				for(int j = i; j >= h && less(a[j],a[j-h]); j -= h)
					exch(a,j,j-h);
			}
			h /= 3;
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
	// public static void main(String[] args) {
	// 	int N = Integer.parseInt(args[0]);
	// 	Double[] a = new Double[N];
	// 	for(int i = 0; i < N; i++)
	// 			a[i] = StdRandom.uniform();
	// 	sort(a);
	// }
}