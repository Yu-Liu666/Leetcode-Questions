package IntersectionofTwoArrays;

import java.util.Arrays;
import java.util.HashSet;

public class BinarySearch {

	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set=new HashSet<>();
		Arrays.sort(nums2);
		for(int x:nums1)
		{
		 if(BS(nums2,x)) set.add(x);
		}
		int[] ans=new int[set.size()]; 
		int i=0;
		for(int x:set) {ans[i]=x;i++;}
		return ans;
	}
	
	boolean BS(int[] nums2,int target) {
		int lo=0,hi=nums2.length-1;
		while(lo<=hi)
		{
			int mid=lo+(hi-lo)/2;
			if(nums2[mid]==target) return true;
			else if(nums2[mid]>target) hi=mid-1;
			else lo=mid+1;
		}
		return false;
	}
}

