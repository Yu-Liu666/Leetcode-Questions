package MissingRanges;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

public List<String> findMissingRanges(int[] nums, int lower, int upper) {
	List<String> list=new ArrayList<>();
	int i=0;
	while(i<nums.length&&nums[i]<lower) i++;
	if(nums[i]>lower&&nums[i]<=upper) {
		if(nums[i]==lower+1)
			list.add(lower+"");
		else {
			list.add(lower+"->"+(nums[i]-1));
		}
	}
	int j=i==0?1:i;
	for(;j<nums.length;j++)
	{
		if(nums[j]>=upper) break;
		if(nums[j]-nums[j-1]==2)
			list.add(nums[j]-1+"");
		else if(nums[j]-nums[j-1]>2)
			list.add(nums[j]+1+"->"+(nums[j-1]-1));
	}
	if(upper>nums[j-1]) {
		if(nums[j]==upper-1)
			list.add(upper+"");
		else {
			list.add(nums[j]+1+"->"+upper);
		}
	}
	return list;
	
    }
}
