import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CounterAttack {
	
	public int[] analyze(String str, String[] words) {
		int[] store = new int[words.length];
		ArrayList<String> A = new ArrayList<String>(Arrays.asList(str.split(" ")));
		for (int i = 0; i<words.length; i++) {
			store[i] = Collections.frequency(A, words[i]);
		}
        return store;
    }
	

}
