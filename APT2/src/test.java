import java.util.*;

 
public class test {

	    public String[] findup(String[] s1) {
	    	Set<String> nodup = new HashSet<String>();
	    	Set<String> dup = new HashSet<String>();
	    	for (String element:s1) {
	    		if(!nodup.add(element)) {
	    			dup.add(element);
	    		}
	    	}
	    	
	    	ArrayList<String> dupp = new ArrayList<>(dup);
	    	Collections.sort(dupp, new scomparator());
	    	return dup.toArray(new String[dup.size()]);
	    }
	    
	    class scomparator implements Comparator<String>{
	    	@Override
	    	public int compare(String t1, String t2) {
	    		if(t1.length()==t2.length())
	    			return t1.compareTo(t2);
	    		else
	    			return t2.length()-t1.length();
	    	}
	    	
	    }

}
