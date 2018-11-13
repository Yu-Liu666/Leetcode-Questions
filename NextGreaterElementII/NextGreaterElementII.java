package NextGreaterElementII;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {

public int[] nextGreaterElements(int[] nums) {
     int[] ans=new int[nums.length];
     Arrays.fill(ans,-1);
	 int[] copy=new int[nums.length*2];
     System.arraycopy(nums,0,copy,0,nums.length);
     System.arraycopy(nums,0,copy,nums.length,nums.length);
     Stack<int[]> stack=new Stack<>();
     for(int i=0;i<copy.length;i++)
     {
    	 while(!stack.isEmpty()&&stack.peek()[1]<copy[i]) ans[stack.pop()[0]]=copy[i];
    	 if(i<nums.length)
    		 stack.push(new int[] {i,nums[i]});
     }
     return ans;
    }
}
