import java.util.*;

public class StringSort {
	public String[] sort(String[] words) {
		Comparator<String> comp = Comparator.comparing(String::length).thenComparing(String::compareTo);
        Arrays.sort(words, comp);
        return words;
    }
}
