package ThreeSumSmaller;

public class ThreeSumSmaller {

public int threeSumSmaller(int[] nums, int target) {
     int count=0;
     for(int i=0;i<nums.length;i++)
     {
    	 for(int j=i+1;j<nums.length;j++)
    	 {
    		 for(int k=j+1;k<nums.length;k++)
    		 {
    			 if(nums[i]+nums[j]+nums[k]<target)
    				 count++;
    			 else
    				 break;
    		 }
    	 }
     }
     return count;
    }
}
