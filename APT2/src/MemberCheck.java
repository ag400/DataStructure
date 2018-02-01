import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MemberCheck {
	
    public List<String> intersection(List<String> list1, List<String> list2) {
             List<String> list = new ArrayList<String>(list1);
             list.retainAll(list2);
             return list;
         }
    
    
	public String[] whosDishonest(String[] club1, 
            String[] club2, 
            String[] club3) {
		 List<String> s1 = Arrays.asList(club1); 
		 List<String> s2 = Arrays.asList(club2); 
		 List<String> s3 = Arrays.asList(club3); 		 
         Set<String> result = new TreeSet<>();      
         result.addAll(intersection(s1, s2));
         result.addAll(intersection(s1, s3));
         result.addAll(intersection(s2, s3));
         return result.toArray(new String[0]);
         
        }
}
