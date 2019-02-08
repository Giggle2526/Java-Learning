import java.util.Arrays;
import edu.princeton.cs.algs4.*;

public class BinarySearchPlus{
	public static int rank(int key ,int[] a)
	{
		int lo = 0;
		int hi = a.length - 1;
		while(lo<=hi){
			int mid = lo + (hi - lo)/2;
			if(key<a[mid]) hi = mid-1;
			else if(key>a[mid]) lo = mid+1;
			else return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] whitelist = In.readInts(args[0]);
		int[] whitelistPlus = new int[whitelist.length];
		Arrays.sort(whitelist);
		
		int i,j;
		i=j=0;
		whitelistPlus[j] = whitelist[i++];
		while(i<whitelist.length){
			if(whitelist[i] != whitelistPlus[j])
				whitelistPlus[++j] = whitelist[i++];
			else
				i++;
		}
		// for(int k=0;k<whitelist.length;k++)
		// 	StdOut.printf("%d ",whitelist[k]);
		// StdOut.println();
		// for(int k=0;k<j;k++)
		// 	StdOut.printf("%d ",whitelistPlus[k]);
		// StdOut.println();
		
		while(!StdIn.isEmpty()){
			int key = StdIn.readInt();
			if(rank(key,whitelist)<0)
				StdOut.println(key);
		}
	}
}