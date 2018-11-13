package ValidateBinarySearchTree;

import java.util.Stack;

public class Iterative {

	public boolean isValidBST(TreeNode root) {
		Stack<TreeNode> stack=new Stack<>();
		TreeNode pre=null;
		while(root!=null||!stack.isEmpty())
		{
			while(root!=null)
			{
				stack.push(root);
				root=root.left;
			}
			TreeNode temp=stack.pop();
			if(pre!=null&&pre.val>=temp.val) 
				return false;
			pre=temp;
			root=temp.right;
		}
		return true;
	}
}
