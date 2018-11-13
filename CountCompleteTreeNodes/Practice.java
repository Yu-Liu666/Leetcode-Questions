package CountCompleteTreeNodes;

public class Practice {

	public int countNodes(TreeNode root) {
		if(root==null) return 0;
		int left=leftDepth(root.left);
		int right=rightDepth(root.right);
		if(left==right) return (int)Math.pow(2,left+1)-1;
		else return 1+countNodes(root.left)+countNodes(root.right);
		
	}
	
	int leftDepth(TreeNode root) {
		int depth=0;
		while(root!=null)
		{
			depth++;
			root=root.left;
		}
		return depth;
	}
	
	int rightDepth(TreeNode root) {
		int depth=0;
		while(root!=null)
		{
			depth++;
			root=root.right;
		}
		return depth;
	}
}
