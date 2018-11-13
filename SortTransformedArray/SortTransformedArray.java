package SortTransformedArray;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SortTransformedArray {

	public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
       
		int index=a>=0?nums.length-1:0;
		int i=0,j=nums.length-1;
		while(i<=j)
		{
			if(a>=0)
				nums[index--]=cal(nums[i],a,b,c)>=cal(nums[j],a,b,c)?cal(nums[i++],a,b,c):cal(nums[j--],a,b,c);
			else
				nums[index++]=cal(nums[i],a,b,c)>=cal(nums[j],a,b,c)?cal(nums[j--],a,b,c):cal(nums[i++],a,b,c);
		}
		return nums;

    }
	
	int cal(int val,int a,int b,int c) {
		return a*val*val+b*val+c;
	}
}
