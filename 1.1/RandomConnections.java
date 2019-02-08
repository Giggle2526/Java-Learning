import edu.princeton.cs.algs4.*;

public class RandomConnections{
	public static void main(String[] args) {
		int N;
		double p,x,y,cx,cy,cr;
		cx = cy = 0.5;
		cr = 0.4;
		N = StdIn.readInt();
		double[][] points = new double[N][2];
		points[0][0] = cx;
		points[0][1] = cy-cr;
		p = StdIn.readDouble();
		StdDraw.circle(cx,cy,cr);
		for(int i=1;i<N;i++){
			points[i][0] = cx+cr*Math.sin(2*i*Math.PI/N);
			points[i][1] = cy-cr*Math.cos(2*i*Math.PI/N);
		}
		StdDraw.setPenColor(StdDraw.GRAY);
		for(int i=0;i<N;i++)
			for(int j=i+1;j<N;j++)
				if(StdRandom.bernoulli(p)){
					StdDraw.line(points[i][0],points[i][1],points[j][0],points[j][1]);
				}
		StdDraw.setPenRadius(.05);
		StdDraw.setPenColor(StdDraw.BLACK);
		for(int i=0;i<N;i++)
			StdDraw.point(points[i][0],points[i][1]);	
	}
}