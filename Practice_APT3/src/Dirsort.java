import java.util.*;

public class Dirsort {
	public String[] sort(String[] dirs) {
		Comparator<String> comp = new Comparator<String>() {

	        @Override
	        public int compare(String s1, String s2) {
	        	String[] o1 = s1.split("/");
	        	String[] o2 = s2.split("/");
	        	
	            int res = o1.length-o2.length;
	            if (res == 0)
	                return s1.compareTo(s2);
	            else
	                return res;
	        }
	    };

        Arrays.sort(dirs, comp);
        return dirs;
   }

	
}

