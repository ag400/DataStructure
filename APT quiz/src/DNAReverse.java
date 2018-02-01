
public class DNAReverse {
	public static String reverse(String dna) {
        char[] temp = dna.toLowerCase().toCharArray();
        String result="";
        for (int i = temp.length-1; i>=0; i--) {
        	result+=temp[i];
        }
        return result;
    }
	
	public static void main(String[] args) {
		String dna = "AAGGTTCC";
		System.out.println(reverse(dna));

	}

}
