import edu.princeton.cs.algs4.*;

public class Point2D{
	public static void main(String[] args) {
		int N = StdIn.readInt();
		double[][] point = new double[N][2];
		double mindis = 2;
		for(int i=0;i<N;i++){
			point[i][0] = Math.random();
			point[i][1] = Math.random();
			StdDraw.point(point[i][0],point[i][1]);
			for(int j=0;j<i;j++){
				double d = Math.sqrt(Math.pow(point[i][0]-point[j][0],2)+Math.pow(point[i][1]-point[j][0],2));
				if(d < mindis)
					mindis = d;
			}
		}
		StdOut.printf("The minest distance is:%f. \n",mindis);
	}	
}