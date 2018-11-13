package ClosestBinarySearchTreeValue;

public class ClosestBinarySearchTreeValue {

public int closestValue(TreeNode root, double target) {
     double closet=root.val;
     while(root!=null)
     {
    	 if(root.val==target) return root.val;
    	 else if(root.val>target) {
    		 if(Math.abs(closet-target)>Math.abs(root.val-target))
    			 closet=root.val;
    		 root=root.left;
    	 }
    	 else {
    		 root=root.right;
    	 }
     }
     return (int)closet;
    }
}
