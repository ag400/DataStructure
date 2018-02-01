import java.util.*;

public class SortedFreqs {
	public int[] freqs(String[] data) {
		List<Integer> count=new ArrayList<Integer>();
		TreeSet<String> word = new TreeSet();
		List<String> list=new ArrayList<String>();
		for(int i = 0; i<data.length; i++) {
			list.add(data[i]);
			word.add(data[i]);
		}
        
        for(String tm:word) {
        	count.add(Collections.frequency(list, tm));
        }
        
        int[] x = new int[count.size()];
        for(int i = 0; i<count.size(); i++) {
        	x[i]=count.get(i);
        }
        return x;
      }

	
}
