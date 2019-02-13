import edu.princeton.cs.algs4.*;

public class Merge{
	private static Comparable[] aux;
	public static void sort(Comparable[] a)
	{//Botton to Up
		int N = a.length;
		aux = new Comparable[N];
		for(int sz = 1; sz < N; sz += sz)
			for(int lo = 0; lo < N-sz; lo += sz)
				merge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1,N-1));
	}
	// public static void sort(Comparable[] a)
	// {//Up to Botton
	// 	aux = new Comparable[a.length];
	// 	sort(a,0,a.length-1);
	// }
	public static void merge(Comparable[] a, int lo, int mid, int hi)
	{
		int i = lo, j = mid + 1;
		for(int k = lo; k <= hi; k++)
			aux[k] = a[k];
		for(int k = lo; k <= hi; k++)
			if (i > mid)		a[k] = aux[j++];
			else if (j > hi)	a[k] = aux[i++];
			else if (j > hi)	a[k] = aux[j++];
			else 				a[k] = aux[i++];
	}
	private static void sort(Comparable[] a, int lo, int hi)
	{
		if(hi < lo) return;
		int mid = lo + (hi - lo)/2;
		sort(a, lo, mid);
		sort(a, mid+1, hi);
		merge(a, lo, mid, hi);
	}
	public static void showOut(Comparable[] a, int lo, int hi)
	{
		int N = a.length;
		for(int i = lo; i <= hi; i++){
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
}