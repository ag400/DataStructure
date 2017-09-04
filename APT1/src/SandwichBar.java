import java.util.Arrays;

public class SandwichBar {

	public int whichOrder(String[] available, String[] orders){
        // fill in code here
		int found=-1;
		for (int i=0; i<orders.length; i++) {
			 String[] b = orders[i].split("\\W");
			 if(Arrays.asList(available).containsAll(Arrays.asList(b))) {
				 found = i;
				 break;
			 }
		}
		return found;
     }
}
