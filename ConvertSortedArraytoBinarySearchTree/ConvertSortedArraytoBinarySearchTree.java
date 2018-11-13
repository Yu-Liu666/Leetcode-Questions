package ConvertSortedArraytoBinarySearchTree;

public class ConvertSortedArraytoBinarySearchTree {

public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null||nums.length==0)
        	return null;
        return dfs(nums,0,nums.length-1);
    }
	
	TreeNode dfs(int[] nums, int lo, int hi)
	{
		if(lo>hi) return null;
		int mid=lo+(hi-lo)/2;
		TreeNode root=new TreeNode(mid);
		root.left=dfs(nums,lo,mid-1);
		root.right=dfs(nums,mid+1,hi);
		return root;
	}

}
