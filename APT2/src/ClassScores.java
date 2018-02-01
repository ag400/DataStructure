
import java.util.*; // for Scanner and ArrayList

public class ClassScores {
	
	
	
	 public int[] findMode(int[] scores) { 
		 ArrayList<Integer> score = new ArrayList<Integer>(); 
		 ArrayList<Integer> value = new ArrayList<Integer>();
		 ArrayList<Integer> mode = new ArrayList<Integer>();
		 
		 //add each element in scores into an array list
		 for (int i = 0; i<scores.length; i++) {
			 score.add(scores[i]);
			 }
         //get frequency of occurrence for each element in scores
		 for (int item:scores) {
			 value.add(Collections.frequency(score, item));
		 }
		 
		 
		 for (int i = 0; i<value.size(); i++) {
			 if (value.get(i) == Collections.max(value)&&!mode.contains(score.get(i))) {
				 mode.add(score.get(i));
			 }
		 }
		 
		 Collections.sort(mode);
		 int[] arr = mode.stream().mapToInt(i -> i).toArray(); 
		 return arr;
		 }
}

