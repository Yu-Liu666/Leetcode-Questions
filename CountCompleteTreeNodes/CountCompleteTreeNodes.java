package CountCompleteTreeNodes;

import java.util.LinkedList;
import java.util.Queue;

public class CountCompleteTreeNodes {

	public int countNodes(TreeNode root) {
		int left=leftDepth(root);
		int right=rightDepth(root);
		if(left==right)
			return (1<<left)-1;
		else
			return 1+countNodes(root.left)+countNodes(root.right);
		
    }
	
	int leftDepth(TreeNode root)
	{
		int depth=0;
		while(root!=null)
		{
			depth++;
			root=root.left;
		}
		return depth;
	}
	
	int rightDepth(TreeNode root)
	{
		int depth=0;
		while(root!=null)
		{
			depth++;
			root=root.right;
		}
		return depth;
	}
}
