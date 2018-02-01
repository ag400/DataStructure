import java.util.Arrays;
import java.util.TreeSet;

public class Intersection {
	public String matches(String[] entries) {
        TreeSet<String> temp = new TreeSet<>(Arrays.asList(entries[0].split(" ")));
        for (String ele: entries) {
        	TreeSet<String> slist = new TreeSet<>(Arrays.asList(ele.split(" ")));
        	temp.retainAll(slist);
        }
        return String.join(" ", temp);
    }
	
}
