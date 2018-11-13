package MaximumSizeSubarraySumEqualsk;

import java.util.HashMap;

public class MaximumSizeSubarraySumEqualsk {

	 public int maxSubArrayLen(int[] nums, int k) {
		 HashMap<Integer,Integer> preSum=new HashMap<>();
		 int max=0;
		 int sum=0;
		 for(int i=0;i<nums.length;i++)
		 {
			 sum+=nums[i];
			 if(preSum.containsKey(sum-k))
				 max=Math.max(max,i-preSum.get(sum-k)+1);
		 }
		 return max;
	 }
}
