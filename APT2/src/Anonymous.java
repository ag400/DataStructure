import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Anonymous {

	public int howMany(String[] headlines, String[] messages) {
		 int count = 0;
	     int t = 0;
	     HashMap<Character,Integer> frequencies = new HashMap<>();
	     HashMap<Character,Integer> msg = new HashMap<>();
	        
	     //get all elements in headlines
	     for (int i=0; i<headlines.length; i++) {
	    	 //get rid of blank space
	         headlines[i]=headlines[i].replaceAll(" ", "");
	         for (char ch : headlines[i].toCharArray()) {
	        	if(ch >= 'A' && ch <= 'Z')
			       ch += 'a' - 'A';
	           frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);        
	        }
	     }
	        
	     for (int i=0; i<messages.length; i++) {
	        messages[i] = messages[i].replaceAll(" ", "");
	        for (char ch : messages[i].toCharArray()) {
	           	if(ch >= 'A' && ch <= 'Z')
	   		       ch += 'a' - 'A';
	              msg.put(ch, msg.getOrDefault(ch, 0) + 1); 
	           }
	        	
	      //Store entry (Key/Value)of HashMap in set
	      Set mapSet = (Set) msg.entrySet();
	      //Create iterator on Set 
	      Iterator mapIterator = mapSet.iterator();
	      //compare frequency of each element  
	       if(frequencies.keySet().containsAll(msg.keySet())) {
	           while(mapIterator.hasNext()) {
	        	Map.Entry mapEntry = (Map.Entry) mapIterator.next();
	             // getKey Method of HashMap access a key of map
	               char keyValue = (char) mapEntry.getKey();
	               int value = (int) mapEntry.getValue();
	               if (value<=frequencies.get(keyValue)) {
	                	 t++;
	                 }
	        	 }
	        	 
	        	 if (t==msg.size()) {
	             count++;
	             }
	        }
	            t = 0;
	        	msg.clear();
	          
	    }
		return count;
   }

}
