package FindLeavesofBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class FindLeavesofBinaryTree {

public List<List<Integer>> findLeaves(TreeNode root) {
	
		List<List<Integer>> list=new ArrayList<>();
		dfs(list,root);
		return list;
    }

	int dfs(List<List<Integer>> list,TreeNode root) {
		if(root==null) return 0;
		int level=0;
		int left=dfs(list,root.left);
		int right=dfs(list,root.right);
		level=Math.max(left,right);
		if(list.size()==level) list.add(new ArrayList<Integer>());
		list.get(level).add(root.val);
		return level+1;
	}
}
