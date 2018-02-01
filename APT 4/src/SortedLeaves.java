import java.util.*;

public class SortedLeaves {
	public String[] values(TreeNode tree) {		
		ArrayList<Integer> list = new ArrayList<>();
		dowork(tree, list);
		String[] result = new String[list.size()];
		for(int i = 0; i<list.size(); i++) {
			result[i]=(char) (int) list.get(i)+"";
		}
		Arrays.sort(result);
        return result;	
       
    }
	
	
	private void dowork(TreeNode tree, ArrayList<Integer> list) {
		if(tree==null) return;
		if(tree.left==null&&tree.right==null) {
			list.add(tree.info);
			return;
		}
		dowork(tree.left, list);
		dowork(tree.right, list);
	}
}
