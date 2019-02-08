import edu.princeton.cs.algs4.*;

public class ArrayExercise{
	public static boolean isMutualPrime(int i,int j)
	{
		int temp;
		while(j!=0){
			temp = j;
			j = i%j;
			i = temp;
		}
		if(i == 1) return true;
		else return false;
	}

	public static void main(String[] args) {
		int N = StdIn.readInt();
		boolean[][] a = new boolean[N][N];
		for(int i=0;i<N;i++)
			for(int j=i+1;j<N;j++)
				if(isMutualPrime(i,j)){
					a[i][j] = a[j][i] = true;
				}
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(a[i][j])
					StdOut.printf("1 ");
				else
					StdOut.printf("0 ");
			}				
			StdOut.println();
		}
	}
}