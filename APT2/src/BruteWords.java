import java.util.*;

public class BruteWords {
    
	public int getScore(String str){
		 ArrayList<Character> chars = new ArrayList<Character>();
		 TreeSet<Character> list = new TreeSet<Character>();
		 for (char ele:str.toCharArray()) {
			 chars.add(ele);
			 list.add(ele);
		 }
		 
		 int[] freq = new int[list.size()];
		 Iterator<Character> itr = list.iterator();
		 for (int i = 0; i<list.size(); i++) {
			 freq[i] = Collections.frequency(chars, itr.next());
		 }
		
		int maxOne = 0;
        int maxTwo = 0;
        
        for (int i=0; i<freq.length;i++) {
        	if(maxOne<freq[i]) {
        		maxTwo = maxOne;
        		maxOne = freq[i];
        	} else if(maxTwo<freq[i]) {
        		maxTwo = freq[i];
        	}
        }
        
        int sum = 0;
        for (int i = 0; i<freq.length; i++) {
        	sum+=Math.pow(freq[i], 2);
        }
        int neww = (int) (sum-Math.pow(maxOne, 2)-Math.pow(maxTwo, 2));
        neww = (int) (neww+ Math.pow(maxOne+maxTwo, 2));
        return neww;
		 
     }
	


}
