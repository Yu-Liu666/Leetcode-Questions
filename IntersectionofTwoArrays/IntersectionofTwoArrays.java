package IntersectionofTwoArrays;

import java.util.HashSet;

public class IntersectionofTwoArrays {

	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set1=new HashSet<>();
		HashSet<Integer> set2=new HashSet<>();
		for(int n:nums1) set1.add(n);
		for(int n:nums2) if(set1.contains(n)) set2.add(n);
		int[] ans=new int[set2.size()];
		int i=0;
		for(int x:set2) {ans[i]=x;i++;}
		return ans;
    }
}
