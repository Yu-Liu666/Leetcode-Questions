package WiggleSort;

import java.util.Arrays;

public class WiggleSort {

public void wiggleSort(int[] nums) {
     Arrays.sort(nums);
     int[] temp=nums.clone();
     int i=0,j=nums.length-1,pos=0;
     for(;pos<nums.length;pos++) {
    	 if(pos%2==0) {
    		nums[pos]=temp[i++]; 
    	 }
    	 else {
    		 nums[pos]=temp[j--];
    	 }
     }
    }
}
