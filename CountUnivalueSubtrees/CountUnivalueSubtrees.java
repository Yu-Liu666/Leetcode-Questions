package CountUnivalueSubtrees;

public class CountUnivalueSubtrees {

int count=0;
public int countUnivalSubtrees(TreeNode root) {
	dfs(root);
	return count;
    }

boolean dfs(TreeNode root)
{
	if(root==null) return true;
	boolean left=dfs(root.left);
	boolean right=dfs(root.right);
	if(left&&right&&(root.left==null||root.val==root.left.val)&&(root.right==null||root.val==root.right.val))
	{
		count++;
		return true;
	}
	return false;
}

}
