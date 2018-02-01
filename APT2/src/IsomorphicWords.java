import java.util.*;

public class IsomorphicWords {

	public int countPairs(String[] words) {
        //perform pairwise comparison
		LinkedHashMap<Character, Character> pairs = new LinkedHashMap<>();
    	LinkedHashMap<Character, Character> pairs2 = new LinkedHashMap<>();
    	LinkedHashSet<Character> temp = new LinkedHashSet<>();
    	LinkedHashSet<Character> temp2 = new LinkedHashSet<>();
		int count = 0;
		for (int i = 0; i<words.length; i++) {
			for (int j = i+1; j<words.length; j++) {
				for (int k = 0; k<words[i].toCharArray().length; k++) {
					temp.add(words[j].toCharArray()[k]);
					temp2.add(words[i].toCharArray()[k]);
					pairs.put(words[i].toCharArray()[k], words[j].toCharArray()[k]);
					pairs2.put(words[j].toCharArray()[k], words[i].toCharArray()[k]);
				}
			//add counts if hashmap contains all value in the second array
			if(Arrays.equals(pairs.keySet().toArray(),pairs2.values().toArray())&&
					Arrays.equals(pairs2.keySet().toArray(),pairs.values().toArray())&&
					pairs.values().containsAll(pairs2.keySet())&&
					pairs2.values().containsAll(pairs.keySet())) {
				count++;
			   }
			temp.clear();
			temp2.clear();
			pairs.clear();
			pairs2.clear();
			}
			
		}
		
		return count;
     }

}
