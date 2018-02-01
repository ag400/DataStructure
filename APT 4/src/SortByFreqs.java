import java.util.*;

public class SortByFreqs {
	public String[] sort(String[] data) {
        TreeSet<String> temp = new TreeSet<>();
        ArrayList<String> temp2= new ArrayList<>();
        for(String ele:data) {
        	temp.add(ele);
        	temp2.add(ele);
        }
        //get frequency
        TreeMap<String, Integer> store = new TreeMap<>();
        for(String ele:temp) {
        	store.put(ele, Collections.frequency(temp2, ele));
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(store.entrySet());
		Collections.sort(list,Map.Entry.comparingByValue(Comparator.reverseOrder()));
		
		// extract strings from each map.entry
		
		String[] ret = new String[list.size()];
		for(int index = 0; index < list.size(); index++){
			ret[index] = list.get(index).getKey();
		}
		return ret;

    }
}
