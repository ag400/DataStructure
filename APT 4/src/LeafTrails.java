import java.util.*;
public class LeafTrails {
	public String[] trails(TreeNode tree) {
		TreeMap<Integer, String> map = new TreeMap<>();
		doWork(tree, map, "");
		ArrayList<String> result = new ArrayList<>();
		for(int key:map.keySet()) {
			result.add(map.get(key));
		}
        return result.toArray(new String[result.size()]);
    }
	
	public void doWork(TreeNode tree, TreeMap<Integer, String> map, String path) {
		if(tree==null) return;
		if(tree.left==null&&tree.right==null) {
			map.put(tree.info, path);
			return;
		}
		doWork(tree.left, map, path+"0");
		doWork(tree.right, map, path+"1");
	}
}
