package InorderSuccessorinBST;

import java.util.Stack;

public class InorderSuccessorinBST {

	 public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
	       	Stack<TreeNode> stack=new Stack<>();
	       	boolean flag=false;
	       	while(root!=null||!stack.isEmpty())
	       	{
	       		while(root!=null)
	       		{
	       			stack.push(root);
	       			root=root.left;
	       		}
	       		TreeNode temp=stack.pop();
	       		if(flag) return temp;
	       		if(temp==p) flag=true;
	       		root=temp.right;
	       	}
	       	return null;
	 }
	 
//	 public TreeNode dfs(TreeNode root, TreeNode p, boolean[] flag) {
//	        if(root==null) return null;
//	        if(flag[0]) return root;
//	        dfs(root.left,p,flag);
//	        if(flag[0]) return root;
//	        if(root==p)
//	        	flag[0]=true;
//	        dfs(root.right,p,flag);
//	        return null;
//	 }
}
