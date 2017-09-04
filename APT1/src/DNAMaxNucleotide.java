
public class DNAMaxNucleotide {

	public String max(String[] strands, String nuc) {
        // fill in code here
		int max = 1; //initialize count of maximum for nuc as 1
		String ele = "";//return element in strands
		int length = 0;
		for (int i=0; i<strands.length; i++) {
			String element = strands[i];
			int track = element.length();
			int count = 0;
			for (int j=0; j<element.length(); j++) {
				if(element.charAt(j) == nuc.charAt(0)) {
					count++;
				}
			}
		 
		 if(count>max||(count==max&&track>length)) {
			 max = count;
			 ele = strands[i];
			 length = ele.length();
		 }		 
	  }
		return ele;
  }
}
