import java.util.*;

public class EqualCommon {
	public String[] matches(String[] a1, String[] a2) {
        ArrayList<String> A = new ArrayList<String>(Arrays.asList(a1)); 
        ArrayList<String> B = new ArrayList<String>(Arrays.asList(a2));
        TreeSet<String> temp = new TreeSet<>();
        for (int i = 0; i<A.size(); i++) {
        	if(B.contains(A.get(i))&&Collections.frequency(A, A.get(i))==Collections.frequency(B, A.get(i))) {
        		temp.add(A.get(i));
        	}
        		
        }
        return temp.toArray(new String[temp.size()]);
    }
	

}
