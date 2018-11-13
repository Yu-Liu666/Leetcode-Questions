package FindRightInterval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class Improve {

	public int[] findRightInterval(Interval[] intervals) {
        int[] ans=new int[intervals.length];
        HashMap<Integer, Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<intervals.length;i++)
        {	
        	map.put(intervals[i].start,i);
        	list.add(intervals[i].start);
        }
        Collections.sort(list);
        for(int i=0;i<intervals.length;i++)
        {
        	int index=bs(list,intervals[i].end);
        	if(index==list.size()) ans[i]=-1;
        	else ans[i]=map.get(list.get(index));
        }
        return ans;
    }
	
	int bs(ArrayList<Integer> list,int target) {
		int i=0,j=list.size()-1;
		while(i<=j)
		{
			int mid=i+(j-i)/2;
			if(list.get(mid)==target) return mid;
			else if(list.get(mid)<target) i=mid+1;
			else j=mid;
		}
		return i;
	}
}
