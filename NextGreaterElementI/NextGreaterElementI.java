package NextGreaterElementI;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
	
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] ans=new int[nums1.length];
		HashMap<Integer,Integer> map=new HashMap<>();
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<nums2.length;i++)
		{
			while(!stack.isEmpty()&&nums2[i]>stack.peek()) map.put(stack.pop(),nums2[i]);
			stack.push(nums2[i]);
		}
		for(int i=0;i<nums1.length;i++)
			ans[i]=map.getOrDefault(nums1[i],-1);
		return ans;
    }
}
