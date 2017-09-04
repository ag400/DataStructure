
public class CirclesCountry {

	public int leastBorders(int[] x, int[] y, int[] r, 
            int x1, int y1, int x2, int y2) {    
		int total = 0;
		double r1, r2, r3;
		for (int i=0; i<x.length; i++) {
			r1 = Math.pow(x1-x[i],2) + Math.pow(y1-y[i], 2);
			r2 = Math.pow(x2-x[i], 2) + Math.pow(y2-y[i], 2);
			r3 = Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2);
			if (r3!=0&!(r1<r[i]*r[i]&r2<r[i]*r[i])) {
				if(r1<r[i]*r[i]||r2<r[i]*r[i]) {
				total+=1;
				}
			}
		}
	return total;
  }
}
