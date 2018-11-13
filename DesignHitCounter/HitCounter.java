package DesignHitCounter;

import java.util.TreeMap;

public class HitCounter {

    /** Initialize your data structure here. */
	TreeMap<Integer,Integer> treemap;
	int sum;
    public HitCounter() {
    	treemap=new TreeMap<>();
    	sum=0;
    }
    
    /** Record a hit.
        @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
    	sum++;
        treemap.put(timestamp,sum);
    }
    
    /** Return the number of hits in the past 5 minutes.
        @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
    	if(treemap.size()==0) return 0;
        Integer x=treemap.floorKey(timestamp-300);
        Integer y=treemap.floorKey(timestamp);
        if(y==null) return 0;
        if(timestamp<=300)
        	return treemap.get(y);
        else {
        	if(x==null) return treemap.get(y);
        	else return treemap.get(y)-treemap.get(x);
        }
    }
}
