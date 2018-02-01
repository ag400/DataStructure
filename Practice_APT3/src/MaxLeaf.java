import java.util.*;

public class MaxLeaf {
	public int max(TreeNode t) {
		ArrayList<Integer> list = new ArrayList<>();
		dowork(t, list);
		int[] result = new int[list.size()];
		for(int i = 0; i<list.size(); i++) {
			result[i]= (int) list.get(i);
		}
        return Collections.max(list);
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
