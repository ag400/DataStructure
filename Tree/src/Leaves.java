
public class Leaves {
	public int[] getLeaves(TreeNode t) {
        if(t==null) return new int[0];
		int[] temp2 = new int[1];
		temp2[0]=t.info;
		if(t.left==null&&t.right==null) return temp2; 
		if(t.left==null) return getLeaves(t.right);
		if(t.right==null) return getLeaves(t.left);
		int[] right = getLeaves(t.right);
		int[] left = getLeaves(t.left);
		int[] result = combine(left, right);
        return result;
    }
	
	public int[] combine(int[] a, int[] b) {
			   int aLen = a.length;
			   int bLen = b.length;
			   int[] c= new int[aLen+bLen];
			   System.arraycopy(a, 0, c, 0, aLen);
			   System.arraycopy(b, 0, c, aLen, bLen);
			   return c;
			}

}
