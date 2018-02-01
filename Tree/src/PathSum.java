
public class PathSum {
	public int hasPath(int target, TreeNode tree){
        // replace with working code
		if(tree == null) return 0;
		if(tree.left==null&&tree.right==null) return boolnum(tree.info==target);
		int leftCall = hasPath(target-tree.info, tree.left);
		int rightCall = hasPath(target-tree.info, tree.right);
		return boolnum(leftCall==1||rightCall==1);	
    }
	
	public int boolnum(boolean a) {
		if(a==true)
			return 1;
		else
			return 0;
	}
}
