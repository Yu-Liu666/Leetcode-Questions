package NextGreaterElementII;

import java.util.Arrays;
import java.util.Stack;

public class Improve {

	public int[] nextGreaterElements(int[] nums) {
		 int n=nums.length*2;
	     int[] ans=new int[nums.length];
	     Arrays.fill(ans,-1);
	     Stack<Integer> stack=new Stack<>();
	     for(int i=0;i<n;i++)
	     {
	    	 int num=nums[i%nums.length];
	    	 while(!stack.isEmpty()&&nums[stack.peek()]<num) ans[stack.pop()]=num;
	    	 if(i<nums.length)
	    		 stack.push(i);
	     }
	     return ans;
	    }
}
