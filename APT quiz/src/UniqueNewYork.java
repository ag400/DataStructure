import java.util.*;

public class UniqueNewYork {
	public int seen(String[] records) {
		HashSet<String> rec = new HashSet<>();
		for (String a:records) {
			String[] temp = a.toLowerCase().split(",");
			  for (int i=0; i<temp.length; i++) {
				  rec.add(temp[i]);
			  }
		}
				
        return rec.size(); 
    }

}
