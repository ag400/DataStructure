import java.util.*;

public class TeamSplit {
	public int difference(int[] strengths) {
		   Arrays.sort(strengths);
		   int odd = 0;
		   int even = 0;
	       if(strengths.length==1) return strengths[0];
	       for(int i = 0; i<strengths.length; i++) {
	    	   if(i%2==0)
	    		   odd+=strengths[i];
	    	   else
	    		   even+=strengths[i];
	       }
	       
	       return Math.abs(odd-even);
	     }
}
