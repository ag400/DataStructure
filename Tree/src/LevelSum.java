
public class LevelSum {
	public int sum(TreeNode tree) {
        //suggested,not required
        return sumHelper(tree,1);
    }

    // suggested, not required
    private int sumHelper(TreeNode tree, int level){
        if(tree==null) return 0;
        if(tree.left==null&&tree.right==null) return 1;
        return level+count(tree.left)+count(tree.right)+sumHelper(tree.left, level)+sumHelper(tree.right, level);
    }
    
    public int count(TreeNode tree) {
	   	if (tree == null) return 0;		   	
	   	return 1 + count(tree.left) + count(tree.right);
    }
}
