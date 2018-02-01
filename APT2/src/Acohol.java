import java.util.*;

public class Acohol {
	public String punish(String[] schedule) {
		Map<String, Integer> counter = new HashMap<>();
		for (String element:schedule) {
			if(!counter.containsKey(element)) {
				counter.put(element, 0);
			}
			else {
				counter.put(element, counter.get(element)+1);
				if(counter.get(element)==3)
					return element;
			}
		}
		return "";
	}
}
