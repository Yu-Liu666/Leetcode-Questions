package FindPeakElement;

public class FindPeakElement {

	 public int findPeakElement(int[] nums) {
		 int i=0,j=nums.length-1;
	     while(i<=j) {
	    	 int mid=i+(j-i)/2;
	    	 if(mid-1>=0&&nums[mid-1]>nums[mid]) j=mid-1;
	    	 else if(mid+1<nums.length&&nums[mid+1]>nums[mid]) i=mid+1;
	    	 else return mid;
	     }
		 return -1;
	    }
}
