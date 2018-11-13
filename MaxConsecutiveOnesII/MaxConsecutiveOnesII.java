package MaxConsecutiveOnesII;

public class MaxConsecutiveOnesII {

	 public int findMaxConsecutiveOnes(int[] nums) {
		 int max=0;
		 int s=0,e=0;
		 int length=0;
		 int count=0;
		 while(e<nums.length)
		 {
			 if(nums[e]==1)
				 length++;
			 else if(count==0)
			 {
				 length++;
				 count+=1;
			 }
			 else {
				 while(s<e)
				 {
					 length--;
					 if(nums[s]==0)
					 {	
						 s++;
						 break;
					 }
					 s++;
				 }
				 count=1;
				 length++;
			 }
		max=Math.max(max,length);
		e++;
		 }
	return max;
	 }
}
