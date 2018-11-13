package IntersectionofTwoArrays;

import java.util.Arrays;
import java.util.HashSet;

public class Improve {

	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set=new HashSet<>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i=0, j=0;
		while(i<nums1.length&&j<nums2.length)
		{
			if(nums1[i]==nums2[j]) {set.add(nums1[i]);i++;j++;}
			else if(nums1[i]<nums2[j]) i++;
			else j++;
		}
		int[] ans=new int[set.size()]; 
		for(int x:set) {ans[i]=x;i++;}
		return ans;
    }
}
