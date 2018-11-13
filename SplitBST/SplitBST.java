package SplitBST;

import java.util.ArrayList;

public class SplitBST {

public TreeNode[] splitBST(TreeNode root, int V) {
     if(root==null) return new TreeNode[] {null,null};
     TreeNode[] s;
     if(root.val<=V)
     {
    	 s=splitBST(root.right,V);
    	 root.right=s[0];
    	 s[0]=root;
     }
     else 
     {
    	 s=splitBST(root.left,V);
    	 root.left=s[1];
    	 s[1]=root;
     }
     return s;
    }
}
