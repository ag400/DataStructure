import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SyllableSorting {
	public String[] sortWords(String[] words) {
		Comparator<String> comp = new Comparator<String>() {

	        @Override
	        public int compare(String s1, String s2) {
	        	String pattern = "([^aeiou])-([aeiou])";
	        	String[] o1 = s1.split("/");
	        	String[] o2 = s2.split("/");
	        	
	            int res = o1.length-o2.length;
	            if (res == 0)
	                return s1.compareTo(s2);
	            else
	                return res;
	        }
	    };
		Arrays.sort(words, comp);
		return words;
     }
	
	public static void main( String args[] ) {
	      // String to be scanned to find the pattern.
	      String line = "zcdbadaerfe";
	      System.out.print(Arrays.toString(line.split("[^aeiou]")));
	   }
}
