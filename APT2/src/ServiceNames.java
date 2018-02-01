import java.util.*;

public class ServiceNames {

	public String[] makeList(String[] services) {
        // fill in code here
		Map<String, TreeSet<String>> tm = new TreeMap<String, TreeSet<String>>();
		ArrayList<String> value = new ArrayList<String>();
		String temp;
		//convert string to words
		for (int i = 0; i<services.length; i++) {
			String [] words = services[i].split(" ");
			//add elements to multimap
			for (int j = 1; j<words.length; j++) {
			TreeSet<String> myClassList = tm.get(words[j]);
			if(myClassList == null) {
			  myClassList = new TreeSet<String>();
	          tm.put(words[j], myClassList);
	        }			
			myClassList.add(words[0]);
		}
}
		
    for (String wrd : tm.keySet()) {
			temp = String.join(" ==> ", wrd, tm.get(wrd).toString()).replace("[", "").replace("]", "");				
		    value.add(temp);
    }
    
       String[] strings = value.stream().toArray(String[]::new);
		return strings;
	}
	
}
