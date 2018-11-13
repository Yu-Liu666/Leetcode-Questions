package SplitArraywithEqualSum;

import javax.print.attribute.standard.NumberUpSupported;

public class SplitArraywithEqualSum {

public boolean splitArray(int[] nums) {
        int[] s=new int[nums.length];
        s[0]=nums[0];
		for(int i=1;i<nums.length;i++)
        	s[i]+=s[i-1];
        return backtracking(nums,1,0,0,s);
        
    }
boolean backtracking(int[] nums,int pos,int n,int sum,int[] s) {
	if(n==3)
	{
		if(sum==nums[nums.length-1]-nums[pos-2])
			return true;
		else
			return false;
	}
	for(int i=pos;i<=nums.length-(6-n*2);i++)
	{
		if(pos==1&&backtracking(nums,i+2,n+1,s[i]-nums[i],s)) return true;
		else if(s[i]-s[pos-2]-nums[i]!=sum) continue;
		else if(backtracking(nums,i+2,n+1,sum,s)) return true;
	}
	return false;
}
}
