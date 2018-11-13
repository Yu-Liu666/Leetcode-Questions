package FindRightInterval;

import java.util.TreeMap;

public class FindRightInterval {

public int[] findRightInterval(Interval[] intervals) {
        int[] ans=new int[intervals.length];
        TreeMap<Integer, Integer> treemap=new TreeMap<>();
        for(int i=0;i<intervals.length;i++)
        	treemap.put(intervals[i].start,i);
        for(int i=0;i<intervals.length;i++)
        {
        	Integer index=treemap.ceilingKey(intervals[i].end);
        	if(index==null) ans[i]=-1;
        	else ans[i]=index;
        }
        return ans;
    }
}
